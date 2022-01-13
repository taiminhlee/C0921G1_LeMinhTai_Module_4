package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.ToKhaiYTe;
import vn.codegym.repository.IToKhaiYTeRepository;

import java.util.List;

@Service
public class ToKhaiYTeService implements IToKhaiYTeService{

    @Autowired
    IToKhaiYTeRepository toKhaiYTeRepository;

    @Override
    public void create(ToKhaiYTe toKhaiYTe) {
        toKhaiYTeRepository.create(toKhaiYTe);
    }

    @Override
    public List<ToKhaiYTe> list() {
        return toKhaiYTeRepository.list();
    }
}
