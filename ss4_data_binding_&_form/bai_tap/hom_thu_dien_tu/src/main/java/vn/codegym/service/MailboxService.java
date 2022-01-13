package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.models.Mailbox;
import vn.codegym.repository.IMailboxRepository;
import vn.codegym.repository.MailboxRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MailboxService implements IMailboxService{

   @Autowired
   IMailboxRepository mailboxRepository;


   @Override
   public List<Mailbox> list() {
      return mailboxRepository.list();
   }

   @Override
   public void update(Mailbox mailbox) {
      mailboxRepository.update(mailbox);
   }

   @Override
   public Mailbox findOne(int index) {
      return mailboxRepository.findOne(index);
   }

}
