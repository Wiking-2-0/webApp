package com.mailWork;
import com.GetMulti;
import com.dao.InboxDao;
import com.dao.realisation.InboxDaoImpl;
import com.entity.Inbox;
import com.service.*;
import com.service.realization.InboxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UkrnetMail {
    private static String host = "imap.ukr.net";// change accordingly
    private static String mailStoreType = "imap";

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

    public List<String> getInboxYandex = new ArrayList<String>();

    public void check( String user, String password)
    {
        GetMulti gmulti = new GetMulti();
        try {

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.imap.host", host);
            properties.put("mail.imap.port", "993");
            properties.put("mail.imap.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("imaps");

            store.connect(host, user, password);

            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
            Message[] messages = emailFolder.getMessages();

            System.out.println("messages.length---" + messages.length);

            for (int i = messages.length-1, n = messages.length-2; i > n; i--) {
                Message message = messages[i];
                Inbox inbox = new Inbox();
                inbox.setSubject(message.getSubject());
                inbox.setContent(gmulti.getText(message));
                inboxService.addInbox(inbox);
            }


            emailFolder.close(false);
            store.close();


        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
