package tolan.me.projectmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.projectmanagement.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
