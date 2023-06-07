package com.baeldung.multipledb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iats.model.request.AddUserRequest;
import com.iats.model.request.UserRequest;
import com.iats.model.response.AddUserResponse;
import com.iats.model.response.UserResponseList;
import com.iats.model.response.UserSPDetail;
import com.iats.repository.AddUserRepository;
import com.iats.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AddUserRepository addUserRepository;

    @Override
    public AddUserResponse addUsers(AddUserRequest addUserRequest) {
        return addUsers(addUserRequest.getEmail(), addUserRequest.getFirstName(), addUserRequest.getMiddleName(),
                addUserRequest.getLastName(), addUserRequest.getGender(), addUserRequest.getPhoneNumber(),
                addUserRequest.getSummary(), addUserRequest.getProfileImg(), addUserRequest.getExperience());
    }

    private AddUserResponse addUsers(String email, String firstName, String middleName, String lastName, String gender,
            String phoneNumber, String summary, String profileImg, int experience) {

        AddUserResponse spResp = null;
        UserSPDetail userSPDetail = new UserSPDetail();
        userSPDetail.setEmail(email);
        userSPDetail.setFirstName(firstName);
        userSPDetail.setMiddleName(middleName);
        userSPDetail.setLastName(lastName);
        userSPDetail.setGender(gender);
        userSPDetail.setPhoneNumber(phoneNumber);
        userSPDetail.setSummary(summary);
        userSPDetail.setProfileImg(profileImg);
        userSPDetail.setExperience(experience);
        spResp = addUserRepository.addUsers(userSPDetail);
        return spResp;
    }

	@Override
	public com.baeldung.multipledb.model.AddUserResponse addUsers(
			com.baeldung.multipledb.model.AddUserRequest addUserRequest) {
		// TODO Auto-generated method stub
		return null;
	}
}
