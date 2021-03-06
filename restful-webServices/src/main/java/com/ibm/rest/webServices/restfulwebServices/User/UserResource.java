package com.ibm.rest.webServices.restfulwebServices.User;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	
	//GET //users
	//retrieveAllUsers
@GetMapping("/users")	
	public List<User> retreiveAllUsers(){
		return service.findAll();
	}
	
	//GET/users/{id}
	//retreiveUser(int id)

@GetMapping("/users/{id}")	
/*public User retreiveUser(@PathVariable int id){
	User user= service.findOne(id);
	if(user==null)throw new UserNotFoundExcption("id-"+id);
	return user;
}*/

//HATEOAS//

public EntityModel <User> retreiveUser(@PathVariable int id){
	User user= service.findOne(id);
	if(user==null)throw new UserNotFoundExcption("id-"+id);
	
	EntityModel<User>model=EntityModel.of(user);
	
	WebMvcLinkBuilder linkToUsers=
			linkTo(methodOn(this.getClass()).retreiveAllUsers());
	
	model.add(linkToUsers.withRel("all-users"));
	return model;
}

// input - Details of user
// output - Created and Return the created URI

@PostMapping("/users")
/*public void createUser(@RequestBody User user) {
User savedUser=service.save(user);	
}*/

public ResponseEntity<Object> createUser(@Valid@RequestBody User user) {
User savedUser=service.save(user);

//CREATED 
// /user/{id}  savedUser.getId()

URI location=ServletUriComponentsBuilder
               .fromCurrentRequest()
               .path("/{id}")
               .buildAndExpand(savedUser.getId()).toUri();

return ResponseEntity.created(location).build();
}


@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable int id){
	User user= service.deleteById(id);
	if(user==null)
		throw new UserNotFoundExcption("id-"+ id);
}


}



