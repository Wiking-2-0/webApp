package com.entity;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Inbox")
public class Inbox implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Inbox_id")
    private int inboxId;

    @Column(name = "Subject")
    @Pattern(regexp = "[A-Z][a-z]{1,32}")
    private String subject;

    @Column(name = "Content",  columnDefinition="LONGTEXT")
    private String content;

    @Column(name = "Is_readed")
    private boolean isReaded;

    @ManyToOne
    @JoinColumn(name = "Mail_id")
    private Mail mail;

    @ManyToOne
    @JoinColumn(name = "Adress")
    private Contacts contacts;

    @ManyToOne
    @JoinColumn(name = "Folder_id")
    private Folder folder;

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public int getInboxId() {
        return inboxId;
    }

    public void setInboxId(int inboxId) {
        this.inboxId = inboxId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReaded() {
        return isReaded;
    }

    public void setReaded(boolean readed) {
        this.isReaded = readed;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Inbox{" +
                "inboxId=" + inboxId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", isReaded=" + isReaded +
                ", mail=" + mail +
                ", contacts=" + contacts +
                ", folder=" + folder +
                '}';
    }
}