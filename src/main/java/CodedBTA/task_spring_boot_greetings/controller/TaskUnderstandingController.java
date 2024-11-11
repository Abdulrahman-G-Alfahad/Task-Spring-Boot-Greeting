package CodedBTA.task_spring_boot_greetings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskUnderstandingController {

    @Autowired
    ContactBook repository;

    @PostMapping("/addContact")
    String addContact(@RequestBody Contact contact){
        for (Contact Econtact: repository.getContactList()){
            if (contact.getEmail().equals(Econtact.getEmail())){
                return "Contact already exists with this email!";
            }
        }
        repository.getContactList().add(contact);
        return "Contact added successfully!";
    }

    @GetMapping("/getContact")
    Response getContact(@RequestParam(name = "") String name){
        for (Contact contact :repository.getContactList()){
            if (contact.name.equals(name)) return contact;
        }
        return new MyError("Contact not found!");
    }
}
