package com.baeldung.multipledb.model;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iats.constant.Constant;
import com.iats.model.request.AddUserRequest;
import com.iats.model.response.AddUserResponse;
import com.iats.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUsers")
    public ResponseEntity<Object> addUser(@Valid @RequestBody AddUserRequest addUserRequest,
            HttpServletRequest httpServletRequest) throws Exception {
        AddUserResponse addUserResponse = new AddUserResponse(Constant.STATUS_TRUE, Constant.SUCCESS);
        addUserResponse = userService.addUsers(addUserRequest);
        return ResponseEntity.ok(addUserResponse);
    }
}
