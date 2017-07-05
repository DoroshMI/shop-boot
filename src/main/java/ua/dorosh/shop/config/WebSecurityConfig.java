package ua.dorosh.shop.config;

/**
 * Created by User on 30.06.2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import ua.dorosh.shop.config.CustomAuthenticationProvider;
import ua.dorosh.shop.service.UserService;
import ua.dorosh.shop.serviceImpl.UserServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private AccessDeniedHandler accessDeniedHandler;

	@Autowired
	private CustomAuthenticationProvider customAuthenticationProvider;

	@Autowired
	UserService userDetailsService;



//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//
//		System.out.println("check 1!!!");
//		auth
//				.userDetailsService(userDetailsService())
////				.and()
////				.authenticationProvider(authenticationProvider())
//		;
//// ...
//
//	}



	@Override
	protected UserDetailsService userDetailsService() {
		return userDetailsService;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/", "/home", "/signup", "/user/**").permitAll()
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
				//.antMatchers("/user/**").hasAnyRole("USER")
				//.anyRequest().authenticated()
				.and().formLogin().loginPage("/login").permitAll()
				.and().logout().permitAll()

				//.and().exceptionHandling().accessDeniedHandler(accessDeniedHandler)

				;
	}

	// create two users, admin and user
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		System.out.println("check admin!!!");
		auth.inMemoryAuthentication()
				.withUser("user").password("user").roles("USER")
				.and()
				.withUser("admin").password("admin").roles("ADMIN")

		;
	}





//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authProvider
//				= new DaoAuthenticationProvider();
//		authProvider.setUserDetailsService(userDetailsService);
//		authProvider.setPasswordEncoder(encoder());
//		return authProvider;
//	}
//
//	@Bean
//	public PasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
//


}


