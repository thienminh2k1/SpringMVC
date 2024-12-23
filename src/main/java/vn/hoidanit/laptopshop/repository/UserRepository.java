package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hoidanit);

    void deleteById (long id);

    List<User> findOneByEmail(String email);    // define a query to data

    List<User> findAll();

    User findById(long id);

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
