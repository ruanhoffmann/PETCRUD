//package com.example.APIPETCRUD.security;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //Mostrar para o SpringSecurity quais páginas o usuário vai poder acessar com e sem autenticação.

    @Autowired
    private ImplementsUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/").permitAll() // permissão total de acesso só para a página/
                .anyRequest().authenticated()
                .and().formLogin().permitAll() //usuario ao fazer o login entra na autenticação
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    //DEFINE A AUTENTICAÇÃO

    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService);

    }

    //O SPRING SECURITY NÃO BLOQUEIA AS PÁGS ESTÁTICAS DE ACESSO

   /* @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/teste/**", "/style/**"); //mostrar quais as pastar que o spring security deve ignorar essa autenticação,
        // e deixa o browser acessar essas pastas e construa o layout de acordo com o que a gente definiu.
    }


}
*/