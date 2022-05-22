package springboot.feguti.springboot2.service;

import springboot.feguti.springboot2.repository.FeGutiUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FeGutiUserDetailsService implements UserDetailsService {
    private final FeGutiUserRepository feGutiUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        return Optional.ofNullable(feGutiUserRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("FeGuti User not found"));
    }
}