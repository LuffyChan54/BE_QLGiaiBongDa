package backend.qlgiaibongda.dto;

import backend.qlgiaibongda.dto.QuyDinhDTO.QuyDinhCauThuDTO;
import backend.qlgiaibongda.dto.QuyDinhDTO.QuyDinhSoLuongDoiDTO;
import backend.qlgiaibongda.dto.QuyDinhDTO.QuyDinhTinhDiemDTO;
import jakarta.persistence.Column;

import java.sql.Date;

public class MuaGiaiDTO {
    private Long id;
    private String ten;
    private Long id_nguoitao;
    private Date thoiDiemBatDau;
    private Date thoiDiemKetThuc;
    private String hinhAnh;
    private Integer trangThai;
    private Long id_quydinh;
    private QuyDinhCauThuDTO quyDinhCauThu;
    private QuyDinhTinhDiemDTO quyDinhTinhDiem;
    private QuyDinhSoLuongDoiDTO quyDinhSoLuongDoi;


    public Boolean checkValidInfo_CreateLeague(){
        Boolean check = true;
        if(id_nguoitao == null || ten == null || quyDinhCauThu == null || quyDinhTinhDiem == null || quyDinhSoLuongDoi==null
        || thoiDiemBatDau == null || thoiDiemKetThuc == null
        )
        {
            check = false;
        }
        return check;
    }

    public Boolean checkValidInfo_CreateLeagueWithOldRule(){
        Boolean check = true;
        if(id_nguoitao == null || ten == null || id_quydinh==null
                || thoiDiemBatDau == null || thoiDiemKetThuc == null
        )
        {
            check = false;
        }
        return check;
    }
    public Boolean checkValidInfo_UpdateLeague(){
        Boolean check = true;
        if(id == null || ten == null || quyDinhCauThu == null || quyDinhTinhDiem == null || quyDinhSoLuongDoi==null ||thoiDiemKetThuc == null || thoiDiemBatDau == null)
        {
            check = false;
        }
        return check;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Long getId_quydinh() {
        return id_quydinh;
    }

    public void setId_quydinh(Long id_quydinh) {
        this.id_quydinh = id_quydinh;
    }

    public Long getId_nguoitao() {
        return id_nguoitao;
    }

    public void setId_nguoitao(Long id_nguoitao) {
        this.id_nguoitao = id_nguoitao;
    }

    public Date getThoiDiemBatDau() {
        return thoiDiemBatDau;
    }

    public void setThoiDiemBatDau(Date thoiDiemBatDau) {
        this.thoiDiemBatDau = thoiDiemBatDau;
    }

    public Date getThoiDiemKetThuc() {
        return thoiDiemKetThuc;
    }

    public void setThoiDiemKetThuc(Date thoiDiemKetThuc) {
        this.thoiDiemKetThuc = thoiDiemKetThuc;
    }

    public QuyDinhCauThuDTO getQuyDinhCauThu() {
        return quyDinhCauThu;
    }

    public void setQuyDinhCauThu(QuyDinhCauThuDTO quyDinhCauThu) {
        this.quyDinhCauThu = quyDinhCauThu;
    }

    public QuyDinhTinhDiemDTO getQuyDinhTinhDiem() {
        return quyDinhTinhDiem;
    }

    public void setQuyDinhTinhDiem(QuyDinhTinhDiemDTO quyDinhTinhDiem) {
        this.quyDinhTinhDiem = quyDinhTinhDiem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuyDinhSoLuongDoiDTO getQuyDinhSoLuongDoi() {
        return quyDinhSoLuongDoi;
    }

    public void setQuyDinhSoLuongDoi(QuyDinhSoLuongDoiDTO quyDinhSoLuongDoi) {
        this.quyDinhSoLuongDoi = quyDinhSoLuongDoi;
    }
}
