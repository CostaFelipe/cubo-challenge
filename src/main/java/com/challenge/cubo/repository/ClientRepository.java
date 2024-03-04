package com.challenge.cubo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.cubo.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
