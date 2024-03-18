package com.jona.almaximoti.wsapp.springbootproducts;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * <h2>CorsConfig</h2>
 * 
 * Clase de configuracion de Cross-Origin Resource Sharing (CORS)
 * Las configuraciones para agregar metodos validos, agregar
 * origenes o todo lo relacionado a CORS. Hacerlo desde esta
 * clase.
 * 
 * @author Jonathan Sanchez
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("http://localhost:4200");
        configuration.addAllowedOrigin("http://127.0.0.1:4200");
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(source);
    }
}
