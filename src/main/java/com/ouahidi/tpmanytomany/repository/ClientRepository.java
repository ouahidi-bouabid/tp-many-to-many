package com.ouahidi.tpmanytomany.repository;

import com.ouahidi.tpmanytomany.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
