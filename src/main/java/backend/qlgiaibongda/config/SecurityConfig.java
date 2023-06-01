package backend.qlgiaibongda.config;

import backend.qlgiaibongda.config.Jwt.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private  final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authenticationProvider;
    private final LogoutHandler logoutHandler;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(
                        authCustomizer -> authCustomizer
                                .requestMatchers("/**").permitAll()
//                        .requestMatchers("/api/auth/**").permitAll()
//                        .requestMatchers("/api/test").hasAnyAuthority("QLDB")
//                        .anyRequest().authenticated()
                )

                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//                .logout(
//                        logout -> logout.logoutUrl("/api/auth/logout")
//                                .addLogoutHandler(logoutHandler)
//                                .logoutSuccessHandler(((request, response, authentication) ->
//                                        SecurityContextHolder.clearContext()))
//                );


        return http.build();
    }
}
