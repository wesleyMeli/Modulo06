/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula01.exercicio01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula01.exercicio01.business.MorseCodeBusiness;

@RestController()
@RequestMapping("/morse")
public class MorseCodeController {
	
	@Autowired
	private MorseCodeBusiness morseCodeBusiness;
	
	@RequestMapping("parseDecode/{code}")
	public String parseMorse(@PathVariable String code) {
		return morseCodeBusiness.parseCodeOrDecode(code,false);
	}
	
	@RequestMapping("parseCode/{code}")
	public String codeMorse(@PathVariable String code) {
		return morseCodeBusiness.parseCodeOrDecode(code,true);
	}

}
