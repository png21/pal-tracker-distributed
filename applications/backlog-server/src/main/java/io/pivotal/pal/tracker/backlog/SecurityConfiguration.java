package io.pivotal.pal.tracker.backlog;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
<<<<<<< HEAD
<<<<<<< HEAD
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .csrf().disable();
    }

}
=======
=======
>>>>>>> fb52d71... Enable service discovery
            .authorizeRequests()
            .anyRequest().permitAll()
            .and()
            .csrf().disable();
    }

}
<<<<<<< HEAD
>>>>>>> fb52d71... Enable service discovery
=======
>>>>>>> fb52d71... Enable service discovery
