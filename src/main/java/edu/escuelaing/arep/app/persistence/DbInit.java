package edu.escuelaing.arep.app.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.app.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserPersistence userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserPersistence userRepository,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder =passwordEncoder;
    }   

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Create users
        User andrea = new User("andrea",passwordEncoder.encode("123"),"admin");
        User jonatan = new User("jonatan",passwordEncoder.encode("123"),"admin");
        List<User> users = Arrays.asList(andrea,jonatan);

        // Save to db
        this.userRepository.saveAll(users);
    }
}