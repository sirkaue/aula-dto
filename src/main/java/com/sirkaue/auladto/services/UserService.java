package com.sirkaue.auladto.services;

import com.sirkaue.auladto.dto.UserDTO;
import com.sirkaue.auladto.entities.User;
import com.sirkaue.auladto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
       User entity = userRepository.findById(id).get();
       UserDTO dto = new UserDTO(entity);
       return dto;
    }
}
