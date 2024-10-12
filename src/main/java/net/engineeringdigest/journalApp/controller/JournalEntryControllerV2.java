package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2
{

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @GetMapping("/id/{myID}")
    public JournalEntry getEntryByID(@PathVariable Integer myID){
        return null;
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myentry){
        myentry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myentry);
        return myentry;
    }

    @DeleteMapping("id/{myID}")
    public boolean deleteEntryByID(@PathVariable Integer myID){
        return false;
    }

    @PutMapping("id/{myID}")
    public boolean updateJournalByID(@PathVariable Integer myID,@RequestBody JournalEntry myEntry){
        return false;
    }


}
