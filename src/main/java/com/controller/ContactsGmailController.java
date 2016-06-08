package com.controller;
import com.entity.*;
import com.service.*;
import com.service.realization.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsGmailController {
    @Autowired
    private MailService mailService;
    @Autowired
    private FolderService folderService;
    @Autowired
    private ContactsService contactsService;
    @Autowired
    private InboxService inboxService;
    @Autowired
    private OutboxService outboxService;

    @RequestMapping(value = "/contacts-gmail")
    public String getIndex() {


        return "contacts-gmail";
    }
}

