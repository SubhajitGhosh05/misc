package com.ibm.rest.webServices.restfulwebServices.User;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
public class UserJPAResource {
	@Autowired
	private UserDaoService service;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	//GET //users
	//retrieveAllUsers
@GetMapping("/jpa/users")	
	public List<User> retreiveAllUsers(){
		return userRepository.findAll();
	}
	
	//GET/users/{id}
	//retreiveUser(int id)

@GetMapping("/jpa/users/{id}")	
/*public User retreiveUser(@PathVariable int id){
	User user= service.findOne(id);
	if(user==null)throw new UserNotFoundExcption("id-"+id);
	return user;
}*/

//HATEOAS//

public EntityModel<Optional<User>> retreiveUser(@PathVariable int id){
	Optional<User> user= userRepository.findById(id);
	if(user.isPresent())throw new UserNotFoundExcption("id-"+id);
	
	EntityModel<Optional<User>>model=EntityModel.of(user);
	
	WebMvcLinkBuilder linkToUsers=
			linkTo(methodOn(this.getClass()).retreiveAllUsers());
	
	model.add(linkToUsers.withRel("all-users"));
	return model;
}

// input - Details of user
// output - Created and Return the created URI

@PostMapping("/jpa/users")
/*public void createUser(@RequestBody User user) {
User savedUser=service.save(user);	
}*/

public ResponseEntity<Object> createUser(@Valid@RequestBody User user) {
User savedUser=userRepository.save(user);

//CREATED 
// /user/{id}  savedUser.getId()

URI location=ServletUriComponentsBuilder
               .fromCurrentRequest()
               .path("/{id}")
               .buildAndExpand(savedUser.getId()).toUri();

return ResponseEntity.created(location).build();
}


@DeleteMapping("/jpa/users/{id}")
public void deleteUser(@PathVariable int id){
	userRepository.deleteById(id);
	 
}

@GetMapping("/jpa/users/{id}/posts")
public List<Post> retreiveAllUserDetailPosts(@PathVariable int id){
	Optional<User> userOptional=userRepository.findById(id);
	if(!userOptional.isPresent()) {
		throw new UserNotFoundExcption("id-"+id);
	
	}
	
	return userOptional.get().getPosts();
	
}

@PostMapping("/jpa/users/{id}/posts")
public ResponseEntity<Object> createUserPost(@PathVariable int id, @RequestBody Post post) {
	Optional<User> userOptional=userRepository.findById(id);
	if(!userOptional.isPresent()) {
		throw new UserNotFoundExcption("id-"+id);
	
	}
	
User user=userOptional.get();	
post.setUser(user);
postRepository.save(post);
//CREATED 
// /user/{id}  savedUser.getId()

URI location=ServletUriComponentsBuilder
               .fromCurrentRequest()
               .path("/{id}")
               .buildAndExpand(post.getId()).toUri();

return ResponseEntity.created(location).build();
}

}



