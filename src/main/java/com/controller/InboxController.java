package com.controller;

import com.entity.*;
import com.service.*;
import com.service.realization.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InboxController {

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

    @RequestMapping(value = "/inbox")
    public String getIndex() {


        return "inbox";
    }



}

