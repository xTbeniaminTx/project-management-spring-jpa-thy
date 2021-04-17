package tolan.me.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tolan.me.projectmanagement.dao.EmployeeRepository;
import tolan.me.projectmanagement.entities.Employee;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  EmployeeRepository empRepo;

  @GetMapping("/new")
  public String displayEmployeeForm(Model model) {
    model.addAttribute("employee", new Employee());

    return "new-employee";
  }

  @PostMapping("/save")
  public String createEmployee(Model model, Employee employee) {
    empRepo.save(employee);
    // use a redirect to prevent duplicate submissions
    return "redirect:/employees/new";
  }

}
