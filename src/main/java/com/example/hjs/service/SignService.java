package com.example.hjs.service;

import com.example.hjs.dto.SignInResultDto;
import com.example.hjs.dto.SignUpResultDto;

public interface SignService {

    SignUpResultDto signUp(String id, String password, String name, String email, String role);

    SignInResultDto signIn(String id, String password) throws RuntimeException;

}