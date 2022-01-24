package vn.codegym.ung_dung_muon_sach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_muon_sach.model.CodeBook;
import vn.codegym.ung_dung_muon_sach.repository.ICodeBookRepository;

@Service
public class CodeBookService implements ICodeBookService{
    @Autowired
    ICodeBookRepository codeBookRepository;

    @Override
    public void save(CodeBook codeBook) {
        codeBookRepository.save(codeBook);
    }

    @Override
    public void delete(Long codeBook) {
        codeBookRepository.deleteByCodeBook(codeBook);
    }

    @Override
    public CodeBook findByCodeBook(Long codeBook) {
        return codeBookRepository.findByCodeBook(codeBook);
    }
}
