package org.rohan.graphql.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private static final String USER = "USER";
    private static final String ADMIN = "ADMIN";
    private static final String GRAPHQL_USER = "GRAPHQL_USER";

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user1 = configureUserDetails("user1", "user1", USER);
        UserDetails user2 = configureUserDetails("user2", "user2", USER);
        UserDetails admin = configureUserDetails("admin", "admin", USER, ADMIN);
        UserDetails graphqlUser = configureUserDetails("graphql", "password", GRAPHQL_USER);

        return new InMemoryUserDetailsManager(user1, user2, admin, graphqlUser);
    }

    private UserDetails configureUserDetails(String username, String password, String... roles) {
        return User
//                .builder()
                .withDefaultPasswordEncoder()   // login does not work without this
                .username(username)
                .password(password)
                .roles(roles)
                .build();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)  // graphql path in graphiql endpoint forbidden without this
                .authorizeHttpRequests(requests -> requests
                    .requestMatchers("/admin").hasRole(ADMIN)
                    .requestMatchers("/user").hasAnyRole(USER, ADMIN)
                    .requestMatchers("/graphiql").hasRole(GRAPHQL_USER)
                    .requestMatchers("/**").permitAll())
                .formLogin(FormLoginConfigurer::permitAll)
                .logout(LogoutConfigurer::permitAll)
                .build();
    }
}
