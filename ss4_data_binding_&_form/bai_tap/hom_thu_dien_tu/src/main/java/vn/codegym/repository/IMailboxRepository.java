package vn.codegym.repository;

import vn.codegym.models.Mailbox;

import java.util.List;

public interface IMailboxRepository {
    List<Mailbox> list();
    void update(Mailbox mailbox);
    Mailbox findOne(String email);
}
