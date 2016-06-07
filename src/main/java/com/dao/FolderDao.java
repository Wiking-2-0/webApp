package com.dao;

import com.entity.Folder;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface FolderDao {

    public List<Folder> getAllFolder();

    public void addFolder(Folder folder);

    public Folder getById(int id);

    public void deleteFolder(Folder folder);

    //public void updateFolder(Folder Folder);
}