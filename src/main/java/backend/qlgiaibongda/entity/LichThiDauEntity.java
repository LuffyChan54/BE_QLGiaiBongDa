//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package backend.qlgiaibongda.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "lichthidau")
@EntityListeners({AuditingEntityListener.class})
public class LichThiDauEntity extends BaseEntity {
    @Column(name = "thoigiantao")
    @CreatedDate
    private Date ThoiGianTao;
    @OneToMany(mappedBy = "lichThiDau")
    private List<TranDauEntity> listTranDauCuaLichThiDau = new ArrayList();
    @ManyToOne
    @JoinColumn(name = "id_nguoitao")
    private QuanLyEntity QuanLyTaoLich;

    public Date getThoiGianTao() {
        return ThoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        ThoiGianTao = thoiGianTao;
    }

    public List<TranDauEntity> getListTranDauCuaLichThiDau() {
        return listTranDauCuaLichThiDau;
    }

    public void setListTranDauCuaLichThiDau(List<TranDauEntity> listTranDauCuaLichThiDau) {
        this.listTranDauCuaLichThiDau = listTranDauCuaLichThiDau;
    }

    public QuanLyEntity getQuanLyTaoLich() {
        return QuanLyTaoLich;
    }

    public void setQuanLyTaoLich(QuanLyEntity quanLyTaoLich) {
        QuanLyTaoLich = quanLyTaoLich;
    }
}
