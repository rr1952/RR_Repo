package com.syntel.iot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Inspired by the ForExchange tutorial.
 * Where is findByFromAndTo defined? It's not an arbitrary name, as the application does not function
 * if the method name is changed.
 * 
 * - Richard
 */

public interface IotRepository extends 
    JpaRepository<IotDistance, Long>{
  IotDistance findByFromAndTo(String from, String to);
}
