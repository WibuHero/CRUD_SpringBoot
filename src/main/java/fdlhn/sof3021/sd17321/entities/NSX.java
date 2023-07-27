package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.NSXVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "NSX")
@Table(name = "NSX")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NSX {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "nsx")
    private List<ChiTietSP> ctsp;

    public void vmToEntity(NSXVM nsx){
        this.setMa(nsx.getMa());
        this.setTen(nsx.getTen());
    }
}
