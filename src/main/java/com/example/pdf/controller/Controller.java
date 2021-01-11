package com.example.pdf.controller;

import com.example.pdf.email.SendEmail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdf.criador.Pdf;
import com.example.pdf.dados.DadosCarteira;

@RestController
public class Controller {
	
	@PostMapping(path = "/api", consumes = "application/json")
	void api(@RequestBody DadosCarteira dados) throws Exception {
		Pdf pdf = new Pdf();
		SendEmail sendEmail = new SendEmail();
		pdf.pdf(dados.getNome(), dados.getSobrenome(), dados.getIdade(), dados.getTurma());
		sendEmail.Email(dados.getPara(), dados.getNome());
	}
}
