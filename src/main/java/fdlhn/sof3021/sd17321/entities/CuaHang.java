package fdlhn.sof3021.sd17321.entities;


import fdlhn.sof3021.sd17321.viewModel.CuaHangVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Entity(name="CuaHang")
@Table(name="CuaHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name="Ma")
    private String ma;
    @Column(name="Ten")
    private String ten;
    @Column(name="DiaChi")
    private String diaChi;
    @Column(name="ThanhPho")
    private String thanhPho;
    @Column(name="QuocGia")
    private String quocGia;

    @OneToMany(mappedBy = "ch")
    private List<NhanVien> nv;

    public void vmToEntity(CuaHangVM vm)
    {
        this.setMa( vm.getMa() );
        this.setTen( vm.getTen() );
        this.setThanhPho( vm.getThanhPho() );
        this.setQuocGia( vm.getQuocGia() );
        this.setDiaChi( vm.getDiaChi() );
    }
}
