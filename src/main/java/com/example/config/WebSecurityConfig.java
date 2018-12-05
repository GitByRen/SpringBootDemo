package com.example.config;

//@Configuration
// 开启Spring Security的web安全支持
//@EnableWebSecurity
// 使方法拦截生效
//@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig {// extends WebSecurityConfigurerAdapter {
	
//	/**
//	 * 定义URL的各种细节
//	 */
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			// 该方法所返回的对象的方法来配置请求级别的安全细节
//			.authorizeRequests()
//				.antMatchers("/", "/home")
//				// 对于上面的路径不进行拦截
//				.permitAll()
//				// 以/demo开头的URL只能由拥有 "ROLE_ADMIN"角色的用户访问
//				.antMatchers("/demo").access("hasRole('ROLE_ADMIN')")
//				// 尚未匹配的任何URL要求用户进行身份验证
//				.anyRequest().authenticated()
//				.and()
//			//允许用户进行基于表单的认证
//			.formLogin()
//				// 登录页面的访问路径
//				.loginPage("/login")
//				// 登录成功后默认跳转到"/hello"
//				.defaultSuccessUrl("/hello")
//				// 允许基于表单登录的所有的URL的所有用户的访问
//				.permitAll()
//				.and()
//			// 允许所有用户进行登出操作
//			.logout()
//				.permitAll();
//	}
//
//	/**
//	 * 定义权限的各种细节
//	 */
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//    	/**
//		 * Spring Security中密码的存储格式是“{id}…………”。前面的id是加密方式，id可以是bcrypt、sha256等，后面跟着的是加密后的密码。
//		 * 也就是说，程序拿到传过来的密码的时候，会首先查找被“{”和“}”包括起来的id，来确定后面的密码是被怎么样加密的，如果找不到就认为id是null。
//		 * 这也就是为什么我们的程序会报错：There is no PasswordEncoder mapped for the id “null”
//		 */
//		// auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
//    	
//    	//基于内存的用户存储
//    	auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("aaa")
//		.password(new BCryptPasswordEncoder().encode("bbb")).roles("USER");
//    	
//    	// 基于数据库
//    	auth
//        .userDetailsService(customUserDetailsService())
//        .passwordEncoder(new BCryptPasswordEncoder());
//    }
//    
//    /**
//     * 自定义UserDetailsService，从数据库中读取用户信息
//     */
//    @Bean
//    public CustomUserDetailsService customUserDetailsService(){
//        return new CustomUserDetailsService();
//    }

    
}
