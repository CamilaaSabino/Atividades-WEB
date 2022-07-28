package br.edu.uepb.projetoweb.repositories;

import br.edu.uepb.projetoweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    
}