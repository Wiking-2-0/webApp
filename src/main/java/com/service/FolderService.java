package com.service;

import com.entity.Folder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FolderService {

    public List<Folder> getAllFolder();

    public void addFolder(Folder folder);

    public Folder getById(int id);

    public void deleteFolder(Folder folder);

    public void updateFolder(Folder folder);
}
