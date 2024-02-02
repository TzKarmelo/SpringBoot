package com.example.Ejercicio_0_clase_7.Service;

import com.example.Ejercicio_0_clase_7.Model.User;
import com.example.Ejercicio_0_clase_7.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserById(Long id) {

        return userRepository.findById(id).orElse(null);
    }
}
