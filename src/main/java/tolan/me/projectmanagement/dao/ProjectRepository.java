package tolan.me.projectmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.projectmanagement.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
