package br.edu.uepb.projetoweb.components.authentication;

import java.util.Collections;

import br.edu.uepb.projetoweb.domain.User;
import br.edu.uepb.projetoweb.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username + "nao foi encontrado no banco de dados");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getAuthority(), Collections.emptyList());
    }
    
}

