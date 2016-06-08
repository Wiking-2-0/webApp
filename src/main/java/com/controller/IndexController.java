package com.controller;

import com.entity.*;
import com.mailWork.GmailMail;
import com.mailWork.YandexMail;
import com.service.*;
import com.service.realization.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

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
    @Autowired
    private GmailMail gmailMail;

    @RequestMapping(value = "/")
    public String getIndex() {

        /*Mail mail = new Mail();
        mail.setName("John");
        mail.setLogin("User");
        mail.setPassword("12345");
        mailService.addMail(mail);*/

       /* Folder folder = new Folder();
        folder.setName("Work");
        folder.setMail(mailService.getAllMails().get(0));
        folderService.addFolder(folder);*/

       /* Contacts contacts = new Contacts();
        contacts.setName("Hodor");
        contacts.setAdress("aaa@mail.ru");
        contacts.setMail(mailService.getAllMails().get(0));
        contactsService.addContacts(contacts);*/

        /*Inbox inbox = new Inbox();
        inbox.setSubject("Tema");
        inbox.setContent(" Alienware Arena Logo\n" +
                "Latest Alienware Arena Giveaways!\n" +
                "Black Desert Online 7-Day Guest Pass Key Giveaway\n" +
                "\n" +
                "Black Desert Online is giving away free 7-day guest passes to its MMORPG. Get your hands on one now before they're gone.\n" +
                "\n");
        inbox.setReaded(true);
        inbox.setMail(mailService.getAllMails().get(0));
        inbox.setContacts(contactsService.getAllContacts().get(0));
        inboxService.addInbox(inbox);

       Outbox outbox = new Outbox();
        outbox.setSubject("aaa");
        outbox.setContent("Пиши диплом!!!");
        outbox.setMail(mailService.getAllMails().get(0));
        outbox.setContacts(contactsService.getAllContacts().get(1));
        outbox.setFolder(folderService.getAllFolder().get(0));
        outboxService.addOutbox(outbox);*/

        /*Outbox delOutbox = outboxService.getAllOutbox().get(0);
        outboxService.deleteOutbox(delOutbox);*/


       /* System.out.println(mailService.getAllMails().toString());*/

        //Mail delMail = mailService.getAllMails().get(0);
        //mailService.deleteMail(delMail);

        //System.out.println(mailService.getById(3));
        //System.out.println(mailService.getAllMails().toString());
        //System.out.println(folderService.getAllFolder().toString());
        //System.out.println(folderService.getById(2));


        //String host = "imap.yandex.ru";// change accordingly
        //String host = "imap.gmail.com";// change accordingly
        //String host = "imap.ukr.net";// change accordingly
        //String host = "imap.mail.ru";// change accordingly
//        String mailStoreType = "imap";

        /*String username = "twink6666@yandex.ua";// change accordingly
        String password = "123654789";// change accordingly*/

        String username = "forsitezero@gmail.com";// change accordingly
        String password = "WG4wm10x";// change accordingly

       /* String username = "eugeneavtuhov@ukr.net";// change accordingly
        String password = "123654789";// change accordingly*/

        /*String username = "avtuhov94@mail.ru";// change accordingly
        String password = "WG4wm10x";// change accordingly*/

        /*YandexMail yandexMail = new YandexMail();
        yandexMail.check(username, password);*/
        //GmailMail gmailMail = new GmailMail();
        gmailMail.check(username, password);
        /*UkrnetMail ukrnetMail = new UkrnetMail();
        ukrnetMail.check(username, password);*/
        //check(host, mailStoreType, username, password);


        return "index";
    }



}
