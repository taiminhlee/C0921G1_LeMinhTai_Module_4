package vn.codegym.models;

import java.util.Objects;

public class Mailbox {
    private String email;
   private String language;
   private String pageSize;
   private Boolean spamFilter;
   private String signature;

    public Mailbox() {
    }

    public Mailbox(String email,String language, String pageSize, Boolean spamFilter, String signature) {
        this.email = email;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mailbox)) return false;
        Mailbox mailbox = (Mailbox) o;
        return Objects.equals(email, mailbox.email);
    }

    @Override
    public String toString() {
        return "Mailbox{" +
                "email='" + email + '\'' +
                ", language='" + language + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", spamFilter='" + spamFilter + '\'' +
                ", Signature='" + signature + '\'' +
                '}';
    }
}
