package com.example.restservice;

import java.util.HashSet;

public interface EntryService {
    HashSet<Entry> findAllEntries();
    Entry findEntryByID(long id);
    void addEntry(Entry e);
    void deleteAllData();
}
