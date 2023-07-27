package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.DongSPVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "DongSP")
@Table(name = "DongSP")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class DongSP {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "dsp")
    private List<ChiTietSP> ctsp;

    public void vmToEntity(DongSPVM dsp){
        this.setMa(dsp.getMa());
        this.setTen(dsp.getTen());
    }
}
