package backend.qlgiaibongda.converter;

import backend.qlgiaibongda.dto.CauThuDTO;
import backend.qlgiaibongda.entity.CauThuEntity;
import org.springframework.stereotype.Component;

@Component
public class CauThuConverter {

    public CauThuEntity toEntity(CauThuDTO dto){
        CauThuEntity entity = new CauThuEntity();

        entity.setHoTen(dto.getHoTen());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setQuocTich(dto.getQuocTich());
        entity.setHinhAnh(dto.getHinhAnh());
        entity.setQueQuan(dto.getQueQuan());
        entity.setTrangThai(dto.getTrangThai());
        entity.setLoaiCauThu(dto.getLoaiCauThu());

        return entity;
    }

    public CauThuEntity toEntity(CauThuDTO dto, CauThuEntity entity){
        entity.setHoTen(dto.getHoTen());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setQuocTich(dto.getQuocTich());
        entity.setHinhAnh(dto.getHinhAnh());
        entity.setQueQuan(dto.getQueQuan());
        entity.setTrangThai(dto.getTrangThai());
        entity.setLoaiCauThu(dto.getLoaiCauThu());
        return entity;
    }

    public CauThuDTO toDTO(CauThuEntity entity){
        CauThuDTO dto = new CauThuDTO();
        if(entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setHoTen(entity.getHoTen());
        dto.setNgaySinh(entity.getNgaySinh());
        dto.setQuocTich(entity.getQuocTich());
        dto.setHinhAnh(entity.getHinhAnh());
        dto.setQueQuan(entity.getQueQuan());
        dto.setTrangThai(entity.getTrangThai());
        dto.setLoaiCauThu(entity.getLoaiCauThu());


        return dto;
    }
}
