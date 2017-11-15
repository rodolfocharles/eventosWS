package com.eventos.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.ws.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

}
