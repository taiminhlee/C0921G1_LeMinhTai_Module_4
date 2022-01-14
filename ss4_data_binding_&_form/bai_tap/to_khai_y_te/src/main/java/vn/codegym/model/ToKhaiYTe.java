package vn.codegym.model;

public class ToKhaiYTe {
    private String ten;
    private String namSinh;
    private String gioiTinh;
    private String quocTinh;
    private String cmnd;
    private String thongTinDiLai;
    private String soHieu;
    private String soGhe;
    private String ngayKhoiHanh;
    private String ngayKetThuc;
    private String diaDiemDaDen;
    private String tinhThanhLienLac;
    private String quanHuyenLienLac;
    private String phuongXaLienLac;
    private String diaChiNoiO;
    private String sdt;
    private String email;
    private Boolean sot;
    private Boolean ho;
    private Boolean khoTho;
    private Boolean dauHong;
    private Boolean buonNon;
    private Boolean tieuChay;
    private Boolean xuatHuyetNgoaiDa;
    private Boolean noiBanNgoaiDa;
    private Boolean denTrangTrai;
    private Boolean tiepXucGan;

    public ToKhaiYTe() {
    }

    public ToKhaiYTe(String ten, String namSinh, String gioiTinh, String quocTinh, String cmnd,
                     String thongTinDiLai, String soHieu, String soGhe, String ngayKhoiHanh,
                     String ngayKetThuc, String diaDiemDaDen, String tinhThanhLienLac, String quanHuyenLienLac,
                     String phuongXaLienLac, String diaChiNoiO, String sdt, String email, Boolean sot,
                     Boolean ho, Boolean khoTho, Boolean dauHong, Boolean buonNon, Boolean tieuChay,
                     Boolean xuatHuyetNgoaiDa, Boolean noiBanNgoaiDa, Boolean denTrangTrai, Boolean tiepXucGan) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTinh = quocTinh;
        this.cmnd = cmnd;
        this.thongTinDiLai = thongTinDiLai;
        this.soHieu = soHieu;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.diaDiemDaDen = diaDiemDaDen;
        this.tinhThanhLienLac = tinhThanhLienLac;
        this.quanHuyenLienLac = quanHuyenLienLac;
        this.phuongXaLienLac = phuongXaLienLac;
        this.diaChiNoiO = diaChiNoiO;
        this.sdt = sdt;
        this.email = email;
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.buonNon = buonNon;
        this.tieuChay = tieuChay;
        this.xuatHuyetNgoaiDa = xuatHuyetNgoaiDa;
        this.noiBanNgoaiDa = noiBanNgoaiDa;
        this.denTrangTrai = denTrangTrai;
        this.tiepXucGan = tiepXucGan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTinh() {
        return quocTinh;
    }

    public void setQuocTinh(String quocTinh) {
        this.quocTinh = quocTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getThongTinDiLai() {
        return thongTinDiLai;
    }

    public void setThongTinDiLai(String thongTinDiLai) {
        this.thongTinDiLai = thongTinDiLai;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getDiaDiemDaDen() {
        return diaDiemDaDen;
    }

    public void setDiaDiemDaDen(String diaDiemDaDen) {
        this.diaDiemDaDen = diaDiemDaDen;
    }

    public String getTinhThanhLienLac() {
        return tinhThanhLienLac;
    }

    public void setTinhThanhLienLac(String tinhThanhLienLac) {
        this.tinhThanhLienLac = tinhThanhLienLac;
    }

    public String getQuanHuyenLienLac() {
        return quanHuyenLienLac;
    }

    public void setQuanHuyenLienLac(String quanHuyenLienLac) {
        this.quanHuyenLienLac = quanHuyenLienLac;
    }

    public String getPhuongXaLienLac() {
        return phuongXaLienLac;
    }

    public void setPhuongXaLienLac(String phuongXaLienLac) {
        this.phuongXaLienLac = phuongXaLienLac;
    }

    public String getDiaChiNoiO() {
        return diaChiNoiO;
    }

    public void setDiaChiNoiO(String diaChiNoiO) {
        this.diaChiNoiO = diaChiNoiO;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSot() {
        return sot;
    }

    public void setSot(Boolean sot) {
        this.sot = sot;
    }

    public Boolean getHo() {
        return ho;
    }

    public void setHo(Boolean ho) {
        this.ho = ho;
    }

    public Boolean getKhoTho() {
        return khoTho;
    }

    public void setKhoTho(Boolean khoTho) {
        this.khoTho = khoTho;
    }

    public Boolean getDauHong() {
        return dauHong;
    }

    public void setDauHong(Boolean dauHong) {
        this.dauHong = dauHong;
    }

    public Boolean getBuonNon() {
        return buonNon;
    }

    public void setBuonNon(Boolean buonNon) {
        this.buonNon = buonNon;
    }

    public Boolean getTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(Boolean tieuChay) {
        this.tieuChay = tieuChay;
    }

    public Boolean getXuatHuyetNgoaiDa() {
        return xuatHuyetNgoaiDa;
    }

    public void setXuatHuyetNgoaiDa(Boolean xuatHuyetNgoaiDa) {
        this.xuatHuyetNgoaiDa = xuatHuyetNgoaiDa;
    }

    public Boolean getNoiBanNgoaiDa() {
        return noiBanNgoaiDa;
    }

    public void setNoiBanNgoaiDa(Boolean noiBanNgoaiDa) {
        this.noiBanNgoaiDa = noiBanNgoaiDa;
    }

    public Boolean getDenTrangTrai() {
        return denTrangTrai;
    }

    public void setDenTrangTrai(Boolean denTrangTrai) {
        this.denTrangTrai = denTrangTrai;
    }

    public Boolean getTiepXucGan() {
        return tiepXucGan;
    }

    public void setTiepXucGan(Boolean tiepXucGan) {
        this.tiepXucGan = tiepXucGan;
    }
}
