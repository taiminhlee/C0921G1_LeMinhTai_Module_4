package vn.codegym.models;

public class Mailbox {
    private String email;
   private String language;
   private String pageSize;
   private String spamFilter;
   private String Signature;

    public Mailbox() {
    }

    public Mailbox(String email,String language, String pageSize, String spamFilter, String signature) {
        this.email = email;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        Signature = signature;
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

    public String getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(String spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
