package fdlhn.sof3021.sd17321.respositories;

import fdlhn.sof3021.sd17321.entities.ChiTietSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChiTietSPRepo extends JpaRepository<ChiTietSP, UUID> {
}
