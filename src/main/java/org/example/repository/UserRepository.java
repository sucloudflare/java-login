package org.example.repository;

import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username); // Método para buscar usuário pelo nome
}
