package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.ToKhaiYTe;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToKhaiYTeRepository implements IToKhaiYTeRepository {
 private static final List<ToKhaiYTe> toKhaiYTeList=new ArrayList<>();

 static{
     toKhaiYTeList.add(new ToKhaiYTe("NGUYEN VAN A","1999","0","Việt Nam","0483688574","Tàu bay","92-C13532","12","1/12/2021",
             "15/12/2021","TP.HCM","TP.Đà Nẵng","Sơn Trà","An Hải Bắc","11 Hùng Vương","09385387","aa@gmail.com",
             false,false,true,true,false,true,false,false,false,false));
 }

    @Override
    public void create(ToKhaiYTe toKhaiYTe) {
        toKhaiYTeList.add(toKhaiYTe);
    }

    @Override
    public List<ToKhaiYTe> list() {
        return toKhaiYTeList;
    }
}
