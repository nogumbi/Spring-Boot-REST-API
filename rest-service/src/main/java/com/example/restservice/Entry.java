package com.example.restservice;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Entry {
    
    private @Id @GeneratedValue Long id;
    private String title;
    private String description;

    public Entry() {
        super();
    }
 
    public Entry(String title, String description) {

        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Override
//    public boolean equals(Object o) {
//
//      if (this == o)
//        return true;
//      if (!(o instanceof Entry))
//        return false;
//      Entry entry = (Entry) o;
//      return Objects.equals(this.id, entry.id) && Objects.equals(this.title, entry.title) && Objects.equals(this.description, entry.description)
//          && Objects.equals(this.description, entry.description);
//    }
//
//    @Override
//    public int hashCode() {
//      return Objects.hash(this.id, this.title, this.description);
//    }
//
//    @Override
//    public String toString() {
//        return "entries {" +
//        "id=" + id +
//        ", title=" + title + "\"" +
//        ", description=" + description + "\"" +
//        "}";
//    }
//
}