package com.poll.service;

import com.poll.dto.IdDto;
import com.poll.dto.user.UserCreateRequestDto;
import com.poll.mapper.UserMapper;
import com.poll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public IdDto add(UserCreateRequestDto userDto) {
        return IdDto.of(
                userRepository.save(
                        UserMapper.fromDto(userDto)));
    }
}
