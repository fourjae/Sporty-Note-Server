package com.sportynote.server.controller;

import com.sportynote.server.repository.UserBasicRepository;
import com.sportynote.server.security.JwtTokenProvider;
import com.sportynote.server.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {

    private final UserBasicRepository userBasicRepository;
    private final UserService userService;
    private final JwtTokenProvider jwtTokenProvider;

    @GetMapping("/")
    public ResponseEntity<?> getUsers() throws URISyntaxException {
        return ResponseEntity.ok(userBasicRepository.findAll());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteUsers(HttpServletRequest request) throws URISyntaxException {
        String jwtToken = jwtTokenProvider.getTokenFromHeader(request);
        return ResponseEntity.ok(userService.deleteUsers(jwtToken));
    }

}
