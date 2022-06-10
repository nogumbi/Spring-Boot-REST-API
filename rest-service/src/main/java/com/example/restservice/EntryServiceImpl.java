package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class EntryServiceImpl implements EntryService {

    HashSet<Entry> entry = new HashSet<Entry>();

    @Override
    public HashSet<Entry> findAllEntries() {
        if(entry.isEmpty()){
            return null;
        }
        else {
            return entry;
        }
    }

    @Override
    public Entry findEntryByID(long id) {
        Entry entries = entry.stream().filter(e -> e.getId() == id).findAny().orElse(null);
        return entries;
    }

    @Override
    public void addEntry(Entry e) {
        entry.add(e);
    }

    @Override
    public void deleteAllData() {
        entry.clear();
    }
}
