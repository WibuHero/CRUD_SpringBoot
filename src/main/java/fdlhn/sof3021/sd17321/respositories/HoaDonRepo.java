package fdlhn.sof3021.sd17321.respositories;

import fdlhn.sof3021.sd17321.entities.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon, UUID> {
}
