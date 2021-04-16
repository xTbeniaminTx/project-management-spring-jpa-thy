package tolan.me.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tolan.me.projectmanagement.dao.ProjectRepository;
import tolan.me.projectmanagement.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

  @Autowired
  ProjectRepository proRepo;

  @GetMapping("/new")
  public String displayProjectForm(Model model) {
    model.addAttribute("project", new Project());

    return "new-project";
  }

  @PostMapping("/save")
  public String createProject(Model model, Project project) {
    proRepo.save(project);
    // use a redirect to prevent duplicate submissions
    return "redirect:/projects/new";
  }

}
