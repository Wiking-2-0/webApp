package com.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Mail")
public class Mail implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Mail_id")
    private int mailId;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "mail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Inbox> inboxSet;
    @OneToMany(mappedBy = "mail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Outbox> outboxSet;
    @OneToMany(mappedBy = "mail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Folder> folderSet;
    @OneToMany(mappedBy = "mail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Contacts> contactsSet;

    public int getMailId() {
        return mailId;
    }

    public void setMailId(int mailId) {
        this.mailId = mailId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Inbox> getInboxSet() {
        return inboxSet;
    }

    public void setInboxSet(Set<Inbox> inboxSet) {
        this.inboxSet = inboxSet;
    }

    public Set<Outbox> getOutboxSet() {
        return outboxSet;
    }

    public void setOutboxSet(Set<Outbox> outboxSet) {
        this.outboxSet = outboxSet;
    }

    public Set<Folder> getFolderSet() {
        return folderSet;
    }

    public void setFolderSet(Set<Folder> folderSet) {
        this.folderSet = folderSet;
    }

    public Set<Contacts> getContactsSet() {
        return contactsSet;
    }

    public void setContactsSet(Set<Contacts> contactsSet) {
        this.contactsSet = contactsSet;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailId=" + mailId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}