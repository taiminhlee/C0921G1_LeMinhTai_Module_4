package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.models.Mailbox;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailboxRepository implements IMailboxRepository{
  static List<Mailbox> mailboxList =new ArrayList<>();

   static {
        mailboxList.add(new Mailbox("minh@codegym.vn","Vietnamese","10",true,"abc"));
        mailboxList.add(new Mailbox("john@codegym.vn","English","25",false,"abc"));
        mailboxList.add(new Mailbox("bill@codegym.vn","Vietnamese","10",true,"abc"));
        mailboxList.add(new Mailbox("mike@codegym.vn","Japanese","5",false,"abc"));
    }

    @Override
    public  List<Mailbox> list() {
        return mailboxList;
    }

    @Override
    public void update(Mailbox mailbox) {
       int index=mailboxList.indexOf(mailbox);
       mailboxList.set(index,mailbox);
    }

    @Override
    public Mailbox findOne(int index) {
      return mailboxList.get(index);
   }
}

