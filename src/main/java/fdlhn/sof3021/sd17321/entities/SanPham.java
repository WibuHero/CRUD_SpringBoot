package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.SanPhamVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "SanPham")
@Table(name = "SanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "sp")
    private List<ChiTietSP> ctsp;

    public void vmToEntity(SanPhamVM sp){
        this.setMa(sp.getMa());
        this.setTen(sp.getTen());
    }
}
