package teda.uz.tokenProjectServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import teda.uz.tokenProjectServer.entity.User;
import teda.uz.tokenProjectServer.entity.enums.RoleName;
import teda.uz.tokenProjectServer.payload.ApiResponse;
import teda.uz.tokenProjectServer.payload.ReqRegister;
import teda.uz.tokenProjectServer.repository.UserRepository;
import teda.uz.tokenProjectServer.repository.rest.RoleRepository;

import java.util.Collections;
import java.util.UUID;

@Service
public class AuthService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    public ApiResponse register(ReqRegister request) {
        if (request.getPassword().equals(request.getPrePassword())) {
            boolean exists = userRepository.existsByPhoneNumber(request.getPhoneNumber());
            if (!exists) {

                User user = new User(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getMiddleName(),
                        request.getBirthDate(),
                        request.getGender(),
                        request.getPhoneNumber(),
                        passwordEncoder.encode(request.getPassword()),
                        Collections.singletonList(roleRepository.findByName(RoleName.ROLE_USER))
                );
                userRepository.save(user);
                return new ApiResponse("Ro'yxatdan o'tdi", true);
            }
            return new ApiResponse("Bunday tel raqamli user mavjud", false);
        }
        return new ApiResponse("Parol va takroriy parol mutanosib emas", false);
    }

    @Override
    public UserDetails loadUserByUsername(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber).orElseThrow(() -> new UsernameNotFoundException("phoneNumber"));
    }

    public User loadUserById(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("Id"));
    }

}
