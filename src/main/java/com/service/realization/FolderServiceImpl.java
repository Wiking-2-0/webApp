package com.service.realization;

import com.dao.FolderDao;
import com.entity.Folder;
import com.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FolderServiceImpl implements FolderService{

    @Autowired
    FolderDao folderDao;

    @Override
    public List<Folder> getAllFolder() {
        return folderDao.getAllFolder();
    }

    @Override
    public void addFolder(Folder folder) {
        folderDao.addFolder(folder);
    }

    @Override
    public Folder getById(int id) {
        return folderDao.getById(id);
    }

    @Override
    public void deleteFolder(Folder folder) {
        folderDao.deleteFolder(folder);
    }

    @Override
    public void updateFolder(Folder folder) {

    }

    /*@Override
    public void updateFolder(Folder folder) {
        folderDao.updateFolder(folder);
    }*/
}