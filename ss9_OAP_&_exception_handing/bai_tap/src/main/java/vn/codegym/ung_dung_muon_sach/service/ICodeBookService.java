package vn.codegym.ung_dung_muon_sach.service;


import vn.codegym.ung_dung_muon_sach.model.Book;
import vn.codegym.ung_dung_muon_sach.model.CodeBook;

public interface ICodeBookService {
    public int save(Book book);
    void delete(Long codeBook);
    CodeBook findByCodeBook(Long codeBook);
}
