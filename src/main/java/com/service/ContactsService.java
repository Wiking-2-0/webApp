package com.service;

import com.entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactsService {

    public List<Contacts> getAllContacts();

    public void addContacts(Contacts contacts);

    public Contacts getById(int id);

    public void deleteContacts(Contacts contacts);

    public void updateContacts(Contacts contacts);
}