package com.service.realization;

import com.dao.ContactsDao;
import com.entity.Contacts;
import com.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactsServiceImpl implements ContactsService{

    @Autowired
    ContactsDao contactsDao;

    @Override
    public List<Contacts> getAllContacts() {
        return contactsDao.getAllContacts();
    }

    @Override
    public void addContacts(Contacts contacts) {
        contactsDao.addContacts(contacts);
    }

    @Override
    public Contacts getById(int id) {
        return contactsDao.getById(id);
    }

    @Override
    public void deleteContacts(Contacts contacts) {
        contactsDao.deleteContacts(contacts);
    }

    @Override
    public void updateContacts(Contacts contacts) {

    }

 /*   @Override
    public void updateContacts(Contacts contacts) {
        contactsDao.updateContacts(contacts);
    }*/
}
