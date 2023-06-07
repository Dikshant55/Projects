package com.baeldung.multipledb.model;

import com.iats.model.request.AddUserRequest;
import com.iats.model.response.AddUserResponse;

public interface UserService {

    public AddUserResponse addUsers(AddUserRequest addUserRequest);
}
