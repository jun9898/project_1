package com.example.project.repository;

import com.example.project.dto.request.user.CreateUserDTO;
import com.example.project.dto.request.user.FollowDTO;
import com.example.project.dto.request.user.LoginUserDTO;
import com.example.project.dto.response.user.LoginResultDTO;
import com.example.project.dto.response.user.ProfileDTO;
import com.example.project.dto.response.user.UserDTO;
import com.example.project.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository{

    private final UserMapper mapper;

    @Override
    public void join(CreateUserDTO dto) {
        mapper.insertUser(dto);
    }

    @Override
    public LoginResultDTO findById(String id) {
        return mapper.findById(id);
    }

    @Override
    public UserDTO findByEmail(String email) {
        return null;
    }

    @Override
    public String login(LoginUserDTO dto) {
        return mapper.loginUser(dto);
    }

    @Override
    public void deleteUser(Long user_seq) {
        mapper.deleteUser(user_seq);
    }

    @Override
    public int findFollow(FollowDTO dto) {
        return mapper.findFollow(dto);
    }

    @Override
    public void insertFollow(FollowDTO dto) {
        mapper.insertFollow(dto);
    }

    @Override
    public void deleteFollow(FollowDTO dto) {
        mapper.deleteFollow(dto);
    }

    @Override
    public ProfileDTO findProfile(String id) {
        return mapper.findProfile(id);
    }

}
