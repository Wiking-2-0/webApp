package com.dao.realisation;

import com.dao.FolderDao;
import com.entity.Folder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FolderDaoImpl implements FolderDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Folder> getAllFolder() {
        return getSession().createQuery("from Folder").list();
    }

    @Override
    public void addFolder(Folder folder) {
        getSession().save(folder);
    }

    @Override
    public Folder getById(int id) {
        return (Folder) getSession().get(Folder.class, id);
    }

    @Override
    public void deleteFolder(Folder folder) {
        getSession().delete(folder);
    }
}