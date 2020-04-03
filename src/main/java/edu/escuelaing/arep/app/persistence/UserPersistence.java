package edu.escuelaing.arep.app.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.escuelaing.arep.app.model.User;

@Repository
public interface UserPersistence extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
