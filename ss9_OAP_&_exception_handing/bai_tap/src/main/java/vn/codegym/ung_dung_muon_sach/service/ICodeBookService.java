package vn.codegym.ung_dung_muon_sach.service;


import vn.codegym.ung_dung_muon_sach.model.CodeBook;

public interface ICodeBookService {
    void save(CodeBook codeBook);
    void delete(Long codeBook);
    CodeBook findByCodeBook(Long codeBook);
}
