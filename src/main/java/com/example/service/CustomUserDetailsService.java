package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService { //implements UserDetailsService {

//	@Override
//	public UserDetails loadUserByUsername(String username) {
//		// 模拟到数据库中查询用户名，密码，权限。。。
//		String password = selectByUserName(username);
//
//		// 添加权限
//		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
//		if (username.equals("123")) {
//			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		} else if (username.equals("admin")) {
//			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		}
//
//		return new User(username, new BCryptPasswordEncoder().encode(password), authorities);
//	}
//
//	public String selectByUserName(String username) {
//		Map<String, Object> maps = new HashMap<>();
//		maps.put("123", "123");
//		maps.put("admin", "admin");
//
//		if (maps.containsKey(username)) {
//			return (String) maps.get(username);
//		} else {
//			throw new UsernameNotFoundException(username + "not found!");
//		}
//	}
}
