package fm.spring.security.concepts.SpringSecurityConcepts.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //FM: Here we are saying that we will
        http
                .authorizeRequests() // Authorize request
                .anyRequest() // All of them
                .authenticated()//must be authorized
                .and() // and with the following way
                .httpBasic(); // basic authentication
    }
}
