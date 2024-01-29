package com.example.completebackendspringboot.users.services;

import com.example.completebackendspringboot.users.dtos.AddressDto;
import com.example.completebackendspringboot.users.dtos.GeoLocationDto;
import com.example.completebackendspringboot.users.dtos.NameDto;
import com.example.completebackendspringboot.users.dtos.UserDto;
import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.Address;
import com.example.completebackendspringboot.users.models.GeoLocation;
import com.example.completebackendspringboot.users.models.Name;
import com.example.completebackendspringboot.users.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreUserService implements UserService{

    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreUserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public User get(Long id) throws UserNotExistExceptoin {
        UserDto userDto = restTemplate.getForObject("https://fakestoreapi.com/users/"+id,UserDto.class);
        if(userDto == null)
            throw new UserNotExistExceptoin("User with id "+id+" not found");

        return convertUserDtoIntoUser(userDto);
    }

    @Override
    public List<User> getAll() throws UserNotExistExceptoin {
        UserDto[] userDtos = restTemplate.getForObject("https://fakestoreapi.com/users",UserDto[].class);
        if(userDtos == null)
            throw new UserNotExistExceptoin("No users found");

        List<User> users = new ArrayList<>();
        for (UserDto userDto : userDtos) {
            users.add(convertUserDtoIntoUser(userDto));
        }

        return users;
    }

    @Override
    public User create(User user) {

        UserDto userDto = restTemplate.postForObject("https://fakestoreapi.com/users",convertUserIntoUserDto(user),UserDto.class);
        return convertUserDtoIntoUser(userDto);
    }

    @Override
    public User update(Long id,User user) {
        return null;
    }

    @Override
    public User replace(Long id,User user) {
        return null;
    }

    @Override
    public User delete(Long id) {
        return null;
    }

    public User convertUserDtoIntoUser(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());


        user.setAddress(new Address());
        user.getAddress().setCity(userDto.getAddress().getCity());
        user.getAddress().setStreet(userDto.getAddress().getStreet());
        user.getAddress().setNumber(userDto.getAddress().getNumber());
        user.getAddress().setZipcode(userDto.getAddress().getZipcode());

        user.getAddress().setGeolocation(new GeoLocation());
        user.getAddress().getGeolocation().setLat(userDto.getAddress().getGeolocation().getLat());
        user.getAddress().getGeolocation().setLng(userDto.getAddress().getGeolocation().getLng());

        user.setName(new Name());
        user.getName().setFirstName(userDto.getName().getFirstName());
        user.getName().setLastName(userDto.getName().getLastName());

        return user;
    }


    public UserDto convertUserIntoUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setPhone(user.getPhone());


        userDto.setAddress(new AddressDto());
        userDto.getAddress().setCity(user.getAddress().getCity());
        userDto.getAddress().setStreet(user.getAddress().getStreet());
        userDto.getAddress().setNumber(user.getAddress().getNumber());
        userDto.getAddress().setZipcode(user.getAddress().getZipcode());

        userDto.getAddress().setGeolocation(new GeoLocationDto());
        userDto.getAddress().getGeolocation().setLat(user.getAddress().getGeolocation().getLat());
        userDto.getAddress().getGeolocation().setLng(user.getAddress().getGeolocation().getLng());

        userDto.setName(new NameDto());
        userDto.getName().setFirstName(user.getName().getFirstName());
        userDto.getName().setLastName(user.getName().getLastName());

        return userDto;
    }

}
