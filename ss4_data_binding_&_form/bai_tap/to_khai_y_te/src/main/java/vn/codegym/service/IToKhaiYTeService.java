package vn.codegym.service;

import vn.codegym.model.ToKhaiYTe;

import java.util.List;

public interface IToKhaiYTeService {

    void create(ToKhaiYTe toKhaiYTe);
    List<ToKhaiYTe> list();
}
