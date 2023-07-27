package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.ChucVuVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "ChucVu")
@Table(name = "ChucVu")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "cv")
    private List<NhanVien> nv;

    public void vmToEntity(ChucVuVM vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }
}
