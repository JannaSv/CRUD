package demo.springbootcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.springbootcrud.model.User;
import demo.springbootcrud.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
		
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
		
	}
	
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}
	
	
	
	
}
