package fdlhn.sof3021.sd17321.respositories;

import fdlhn.sof3021.sd17321.entities.GioHangChiTiet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GioHangChiTietRepo extends JpaRepository<GioHangChiTiet, UUID> {
//    @Query("SELECT ghct FROM GioHangChiTiet ghct where ghct.id.idGioHang = ?1")
//    public Page<GioHangChiTiet> findAllByIdGH(Pageable pageable);
}
