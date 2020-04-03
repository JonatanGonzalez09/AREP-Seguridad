package edu.escuelaing.arep.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.app.persistence.UserPersistence;
import edu.escuelaing.arep.app.model.User;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {
	
    private UserPersistence userPersistence;

    public UserPrincipalDetailsService(UserPersistence userRepository) {
        this.userPersistence = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userPersistence.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}