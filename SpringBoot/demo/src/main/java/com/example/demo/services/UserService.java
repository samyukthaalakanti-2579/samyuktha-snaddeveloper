package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
  
@Component
public class UserService {
    
    @Autowired
    UserRepository ur;

 

    public void saveMyData(UserDto userdto) {
        UserModel um = new UserModel();
        um.setUser_id(userdto.getUser_id());
        um.setFirst_name(userdto.getFirst_name());
        um.setLast_name(userdto.getLast_name());
        um.setUsername(userdto.getUsername());
        um.setPassword(userdto.getPassword());
        ur.save(um);
        
    }
    public List<UserDto> getEmployeeRecords() {
        Iterable<UserModel> um = ur.findAll();   //1( 2 to 100
        List<UserDto> udto = new ArrayList<UserDto>();
        for(UserModel i:um)
        {
            udto.add(UserDto.getDto(i));
        }
        return udto;
    }
    public List<UserDto> getEmployeeRecordsByname(String name) {
        Iterable<UserModel> um = ur.findByEmployyeName(name);   //1( 2 to 100
        List<UserDto> udto = new ArrayList<UserDto>();
        for(UserModel i:um)
        {
            udto.add(UserDto.getDto(i));
        }
        return udto;
    }
	
    public void updateUserdata(UserDto userdto) {
        UserModel um = new UserModel();
        um.setUser_id(userdto.getUser_id());
        um.setFirst_name(userdto.getFirst_name());
        um.setLast_name(userdto.getLast_name());
        um.setUsername(userdto.getUsername());
        um.setPassword(userdto.getPassword());
        ur.save(um);
}
	public void deleteRecordById(long user_id) {
		// TODO Auto-generated method stub
		
	}

}

