package com.example.bikerent;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


interface  BikeRepository extends CrudRepository<Bike, Long> {
    Optional<Bike> findBySerialNoIgnoreCase(String serialNo);
    int countAllByBorrowerIdIsNotNull();
    List<Bike> findAllByBorrowerIdIsNullOrderByDayPrice();
}
