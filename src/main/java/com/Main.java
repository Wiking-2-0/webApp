package com;

import com.mailWork.GmailMail;
import com.mailWork.UkrnetMail;
import com.mailWork.YandexMail;

import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class Main {

    public void check(String host, String storeType, String user,
                             String password)
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

            //create the folder object and open it
            /*Folder[] folderList = store.getFolder("[Maildir]").list();
            for (int i = 0; i < folderList.length; i++) {
                System.out.println(folderList[i].getFullName());
            }*/
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = messages.length-1, n = messages.length-2; i > n; i--){
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                //System.out.println("Text: " + message.getContent().toString());
                System.out.println("Text: " + gmulti.getText(message));

           }

            //close the store and folder objects
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

    public static void main(String[] args) {

//        String host = "imap.yandex.ru";// change accordingly
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

        //YandexMail.check(username, password);
        GmailMail gmailMail = new GmailMail();
        gmailMail.check(username, password);
        /*UkrnetMail ukrnetMail = new UkrnetMail();
        ukrnetMail.check(username, password);*/
        //check(host, mailStoreType, username, password);

    }

}
