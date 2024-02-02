package com.example.Ejercicio_0_clase_7.Repository;

import com.example.Ejercicio_0_clase_7.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    List<User> listaUsers = Arrays.asList(
            new User(1L, "Juan"),
            new User(2L, "Pedro"),
            new User(3L, "Maria")
    );
    public Optional<User> findById(Long id) {

        return listaUsers.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();


    }
}
