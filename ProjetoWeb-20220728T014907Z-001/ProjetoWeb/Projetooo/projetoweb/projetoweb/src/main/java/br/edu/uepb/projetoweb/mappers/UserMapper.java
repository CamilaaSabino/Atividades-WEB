package br.edu.uepb.projetoweb.mappers;

import br.edu.uepb.projetoweb.domain.User;
import br.edu.uepb.projetoweb.dto.UserDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;
    
    public UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    public User convertFromUserDTO(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }
}
