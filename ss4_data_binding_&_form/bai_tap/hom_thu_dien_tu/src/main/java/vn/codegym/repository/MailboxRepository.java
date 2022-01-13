package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.models.Mailbox;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailboxRepository implements IMailboxRepository{
  static List<Mailbox> mailboxList =new ArrayList<>();

   static {
        mailboxList.add(new Mailbox("minh@codegym.vn","Vietnamese","10","1","abc"));
        mailboxList.add(new Mailbox("john@codegym.vn","English","25","0","abc"));
        mailboxList.add(new Mailbox("bill@codegym.vn","Vietnamese","10","1","abc"));
        mailboxList.add(new Mailbox("mike@codegym.vn","Japanese","5","0","abc"));
    }

    @Override
    public  List<Mailbox> list() {
        return mailboxList;
    }

    @Override
    public void update(Mailbox mailbox) {
        Mailbox mailbox1 =findOne(mailbox.getEmail());
        mailbox1.setLanguage(mailbox.getLanguage());
        mailbox1.setPageSize(mailbox.getPageSize());
        mailbox1.setSpamFilter(mailbox.getSpamFilter());
        mailbox1.setSignature(mailbox.getSignature());
    }

    @Override
    public Mailbox findOne(String email) {
        for (Mailbox mailbox:mailboxList) {
            if (email.equals(mailbox.getEmail())){
                return mailbox;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MailboxRepository mailboxRepository=new MailboxRepository();
        System.out.println(mailboxRepository.findOne("minh@codegym.vn"));
    }
}

