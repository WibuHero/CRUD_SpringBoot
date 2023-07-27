package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.MauSacVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "MauSac")
@Table(name = "MauSac")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "ms")
    private List<ChiTietSP> ctsp;

    public void vmToEntity(MauSacVM ms){
        this.setMa(ms.getMa());
        this.setTen(ms.getTen());
    }
}
