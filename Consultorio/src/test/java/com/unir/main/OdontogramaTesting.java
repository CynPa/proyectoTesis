package com.unir.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unir.main.controller.AntecedentesController;
import com.unir.main.model.Antecedentes;
import com.unir.main.model.AntecedentesRequest;
import com.unir.main.model.States;
import com.unir.main.service.AntecedentesService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(value=AntecedentesController.class)

public class OdontogramaTesting {

	//@Test
		void contextLoads() {
		}
		@Autowired
		private MockMvc mockMvc;
		
		@MockBean
		private AntecedentesService servicios;
		
	    @InjectMocks
	    AntecedentesController antecedenteController;
		
	
		public static String asJsonString(final Object obj) {
		    try {
		        return new ObjectMapper().writeValueAsString(obj);
		    } catch (Exception e) {
		        throw new RuntimeException(e);
		    }
		}
}
