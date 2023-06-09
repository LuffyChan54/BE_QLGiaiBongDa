package backend.qlgiaibongda.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quydinhcauthu")
public class QuyDinhCauThuEntity extends  BaseEntity{

    @Column(name = "soluongcauthutoida")
    private int soLuongCauThuToiDa;

    @Column(name = "soluongcauthutoithieu")
    private int soLuongCauThuToiThieu;

    @Column(name = "soluongcauthunuocngoaitoida")
    private int soLuongCauThuNuocNgoaiToiDa;

    @Column(name = "tuoitoithieu")
    private int tuoiToiThieu;

    @Column(name = "tuoitoida")
    private int tuoiToiDa;

    @OneToMany(mappedBy = "QuyDinhCauThu")
    private List<QuyDinhMuaGiaiEntity> listQuyDinhMuaGiai = new ArrayList<>();

    public QuyDinhCauThuEntity() {
    }

    public int getSoLuongCauThuToiDa() {
        return soLuongCauThuToiDa;
    }

    public void setSoLuongCauThuToiDa(int soLuongCauThuToiDa) {
        this.soLuongCauThuToiDa = soLuongCauThuToiDa;
    }

    public int getSoLuongCauThuToiThieu() {
        return soLuongCauThuToiThieu;
    }

    public void setSoLuongCauThuToiThieu(int soLuongCauThuToiThieu) {
        this.soLuongCauThuToiThieu = soLuongCauThuToiThieu;
    }

    public int getSoLuongCauThuNuocNgoaiToiDa() {
        return soLuongCauThuNuocNgoaiToiDa;
    }

    public void setSoLuongCauThuNuocNgoaiToiDa(int soLuongCauThuNuocNgoaiToiDa) {
        this.soLuongCauThuNuocNgoaiToiDa = soLuongCauThuNuocNgoaiToiDa;
    }

    public int getTuoiToiThieu() {
        return tuoiToiThieu;
    }

    public void setTuoiToiThieu(int tuoiToiThieu) {
        this.tuoiToiThieu = tuoiToiThieu;
    }

    public int getTuoiToiDa() {
        return tuoiToiDa;
    }

    public void setTuoiToiDa(int tuoiToiDa) {
        this.tuoiToiDa = tuoiToiDa;
    }

    public List<QuyDinhMuaGiaiEntity> getListQuyDinhMuaGiai() {
        return listQuyDinhMuaGiai;
    }

    public void setListQuyDinhMuaGiai(List<QuyDinhMuaGiaiEntity> listQuyDinhMuaGiai) {
        this.listQuyDinhMuaGiai = listQuyDinhMuaGiai;
    }
}
