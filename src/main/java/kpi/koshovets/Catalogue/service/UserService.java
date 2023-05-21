package kpi.koshovets.Catalogue.service;

import kpi.koshovets.Catalogue.entity.Role;
import kpi.koshovets.Catalogue.entity.Tool;
import kpi.koshovets.Catalogue.entity.User;
import kpi.koshovets.Catalogue.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void requestRole(Long id) {
        final User user = userRepository.findById(id).get();
        user.setRoleRequested(true);
        userRepository.save(user);
    }

    public void acceptRole(Long id) {
        final User user = userRepository.findById(id).get();
        user.getAuthorities().add(Role.MODERATOR);
        userRepository.save(user);
    }

    public List<User> getCandidates() {
        return userRepository.findAllByIsRoleRequestedIsTrue();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByLogin(username);
        return user.orElseThrow(() -> new UsernameNotFoundException("user not found: " + user));
    }

    public void createUser(User user) {
        user.setAuthorities(Collections.singleton(Role.USER));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
