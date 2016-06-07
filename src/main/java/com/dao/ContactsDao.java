package com.dao;

import com.entity.Contacts;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ContactsDao {

    public List<Contacts> getAllContacts();

    public void addContacts(Contacts contacts);

    public Contacts getById(int id);

    public void deleteContacts(Contacts contacts);

//public void updateContacts(Contacts Contacts);
}