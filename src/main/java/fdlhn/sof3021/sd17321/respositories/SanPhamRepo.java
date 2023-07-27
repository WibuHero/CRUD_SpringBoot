package fdlhn.sof3021.sd17321.respositories;

import fdlhn.sof3021.sd17321.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SanPhamRepo extends JpaRepository<SanPham, UUID> {
}
