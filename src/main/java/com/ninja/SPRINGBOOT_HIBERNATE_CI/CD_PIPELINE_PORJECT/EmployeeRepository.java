package com.ninja.SPRINGBOOT_HIBERNATE_CI.CD_PIPELINE_PORJECT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	

}
