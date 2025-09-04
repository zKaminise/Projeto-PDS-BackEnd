package com.example.ManagerProjectPDS.Repositorys;

import com.example.ManagerProjectPDS.Entitys.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByCpf(String cpf);
    Client findByEmail(String email);
    boolean existsByCpf(String cpf);
}
