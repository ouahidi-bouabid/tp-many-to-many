package com.ouahidi.tpmanytomany.repository;

import com.ouahidi.tpmanytomany.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {
}
