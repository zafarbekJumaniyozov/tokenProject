package teda.uz.tokenProjectServer.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import teda.uz.tokenProjectServer.entity.User;
import teda.uz.tokenProjectServer.repository.UserRepository;
import teda.uz.tokenProjectServer.repository.rest.RoleRepository;

@Component
public class DataLoader implements CommandLineRunner {
    final
    UserRepository userRepository;
    final
    RoleRepository roleRepository;

    final
    PasswordEncoder passwordEncoder;

    @Value("${spring.datasource.initialization-mode}")
    private String ketmon;

    public DataLoader(UserRepository userRepository, RoleRepository roleRepository, @Lazy PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void run(String... args) throws Exception {
        if (ketmon.equals("always")) {
            userRepository.save(new User(
                    "Zafarbek",
                    "Jumaniyozov",
                    "",
                    "+998944233342",
                    passwordEncoder.encode("123"),
                    roleRepository.findAll()
            ));
        }
    }
}
