package com.ninja.SPRINGBOOT_HIBERNATE_CI.CD_PIPELINE_PORJECT;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	List<Employee> findByName(String name);

}
