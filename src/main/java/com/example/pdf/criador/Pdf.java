package com.example.pdf.criador;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

public class Pdf {
	
	public void pdf(String nome, String sobrenome,Integer idade, Integer turma) throws Exception{
		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML");
		 
		TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		 
		Context context = new Context();
		context.setVariable("name", nome);
		context.setVariable("sobrenome", sobrenome);
		context.setVariable("idade", idade);
		context.setVariable("turma", turma);
		 
		// Get the plain HTML with the resolved ${name} variable!
		String html = templateEngine.process("template", context);

		OutputStream outputStream = new FileOutputStream("pdf.pdf");
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocumentFromString(html);
		renderer.layout();
		renderer.createPDF(outputStream);
		outputStream.close();
	}
}
