package com.unir.main;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.BDDMockito.will;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unir.main.controller.AntecedentesController;
import com.unir.main.model.Antecedentes;
import com.unir.main.model.AntecedentesRequest;
import com.unir.main.model.States;
import com.unir.main.service.AntecedentesService;
import com.unir.main.service.AntecedentesService;

//@SpringBootTest
//@ExtendWith(SpringExtension.class)

@ExtendWith(MockitoExtension.class)
class OdontogramaTesting2 {

	
	@Mock
    AntecedentesService servicios;
	
    @InjectMocks
    AntecedentesController antecedenteController;
    
	/*@Test
	public void  testAddOdontograma() throws JsonProcessingException, Exception
	{
		
		//given
		AntecedentesRequest antecedente=new AntecedentesRequest(States.NO,States.NO,States.NO,
				States.NO,States.NO,States.NO,States.NO,States.NO,States.NO,States.NO,"ddd");
		given(servicios.insertarAntecedentes(any(AntecedentesRequest.class)))
		.willAnswer((invocation)->invocation.getArgument(0));//--(invocation)->invocation.getArgument(0)
		//when
		ResultActions response= mockMvc.perform(post("/consultario/Antecedentes")
				.contentType(MediaType.APPLICATION_JSON)
	         .content(objectMapper.writeValueAsString(antecedente)));
				
		//then
	    response.andDo(print()).andExpect(status().isCreated())
	    ;
	}*/
    
	 
    @Test
    public void testAddEmployee()
    {
    	MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        Antecedentes antecedente=new Antecedentes();
        when(servicios.insertarAntecedentes(any(AntecedentesRequest.class))).thenReturn(antecedente);
        AntecedentesRequest antecedentes=new AntecedentesRequest(States.NO,States.NO,States.NO,
				States.NO,States.NO,States.NO,States.NO,States.NO,States.NO,States.NO,"ddd");

        ResponseEntity<Antecedentes> responseEntity = antecedenteController.insertar(antecedentes);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(203);
    }

}
