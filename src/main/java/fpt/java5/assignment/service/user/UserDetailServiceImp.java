package fpt.java5.assignment.service.user;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.staff.StaffRepository;

@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    StaffRepository staffRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Staff staff = staffRepository.findByUserName(username);
        CustomUserDetails userDetails = null;
        if (staff != null) {
            userDetails = new CustomUserDetails();
            userDetails.setStaff(staff);
        } else {
            throw new UsernameNotFoundException("User not exist with name : " + username);
        }
        return userDetails;

//		Staff staff = staffRepository.findByUserName(username);
//		if(staff == null) {
//			throw new UsernameNotFoundException("User not found");
//		}
//
//		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//		Set<Role> roles = staff.getRoles();
//		for(Role role : roles) {
//			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//		}
//
//		return new org.springframework.security.core.userdetails.User
//				(staff.getUserName(), staff.getPassword(), grantedAuthorities);
    }

}
