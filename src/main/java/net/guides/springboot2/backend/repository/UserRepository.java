package net.guides.springboot2.backend.repository;

import net.guides.springboot2.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(
            value= "SELECT * FROM account u WHERE u.username=?1", nativeQuery=true
            //value="SELECT * FROM account a, role r, user_role u WHERE a.id = u.id AND r.id_role = u.id_role AND  r.nom=?1",nativeQuery = true
    )

    User findByUsername(String username);
}
