package demo.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
