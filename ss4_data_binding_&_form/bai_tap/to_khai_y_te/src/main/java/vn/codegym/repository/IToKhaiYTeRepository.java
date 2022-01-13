package vn.codegym.repository;

import vn.codegym.model.ToKhaiYTe;

import java.util.List;

public interface IToKhaiYTeRepository {
    void create(ToKhaiYTe toKhaiYTe);
    List<ToKhaiYTe> list();
}
