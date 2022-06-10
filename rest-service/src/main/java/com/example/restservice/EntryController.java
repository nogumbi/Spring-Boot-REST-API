package com.example.restservice;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EntryController {

    @Autowired
    EntryServiceImpl entryServiceImpl;

    @PostMapping("/")
    public void addBook(@RequestBody Entry entry) {
        entryServiceImpl.addEntry(entry);
    }

    @GetMapping("/findall")
    public HashSet<Entry> getAllEntries() {
        return entryServiceImpl.findAllEntries();
    }

    @GetMapping("/findbyid/{id}")
    public Entry geEntryById(@PathVariable long id) {
        return entryServiceImpl.findEntryByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteBook() {
        entryServiceImpl.deleteAllData();
    }
}