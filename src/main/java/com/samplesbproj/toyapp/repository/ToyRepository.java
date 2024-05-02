package com.samplesbproj.toyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samplesbproj.toyapp.entity.Toy;
@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer> {
//JPARepository extends Paging&SortingRepository that extends the CRUDRepository
//It performs CRUD operation and additional operations like flush(), saveandFlush() etc.
}
