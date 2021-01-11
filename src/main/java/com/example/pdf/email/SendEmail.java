package com.example.pdf.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendEmail {
    public void Email(String para, String nome) throws EmailException {
        //anexa arquivo
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("pdf.pdf"); //caminho da imagem
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Pdf");
        attachment.setName("pdf.pdf");

        //dados do email
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("<SEUEMAIL>", "<SUASENHA>"));
        email.setSSLOnConnect(true);

        //mensagem
        email.addTo(para, nome);
        email.setFrom("eduardomachadorezende1@gmail.com", "Pdf");
        email.setSubject("Segue o anexo do pdf");
        email.setMsg("Seu pdf esta pronto!");
        email.attach(attachment);


        email.send();// voala
    }
}