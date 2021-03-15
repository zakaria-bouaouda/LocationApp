package org.sid.entities;

import javax.validation.Valid;

import org.sid.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class UserController {
	@Autowired
 private UserRepository userRepository;
 
	
	  @RequestMapping(value="/index") 
	  public String Index() {
		  return "index";
	  
	  }
	 
 @RequestMapping(value="/form1",method=RequestMethod.GET)
 public String FormUser(Model model) {
	 model.addAttribute("user",new User());
 return "inscription";
 }
	
	  @RequestMapping(value="/saveUser",method=RequestMethod.POST)
	  public String save(@Valid User user,BindingResult bindingResult) {
	  if(bindingResult.hasErrors()) {
		  return "inscription"; }
	  userRepository.save(user);
	  return "redirect:/index"; }
	 
 
}
