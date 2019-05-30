package it.sincrono.corso.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComuneUtil extends CrudRepository<Comune, Integer> {

List<Comune> findById();



}
