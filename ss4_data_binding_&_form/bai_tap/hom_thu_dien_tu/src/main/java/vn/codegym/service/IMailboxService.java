package vn.codegym.service;

import vn.codegym.models.Mailbox;

import java.util.List;

public interface IMailboxService {
    List<Mailbox> list();
    void update(Mailbox mailbox);
    Mailbox findOne(String email);
}
