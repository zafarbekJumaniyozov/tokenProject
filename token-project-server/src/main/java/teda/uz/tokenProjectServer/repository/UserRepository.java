package teda.uz.tokenProjectServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teda.uz.tokenProjectServer.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByPhoneNumber(String phoneNumber);

    Optional<User> findByPhoneNumber(String phoneNumber);

}
