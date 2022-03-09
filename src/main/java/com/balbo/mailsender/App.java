package com.balbo.mailsender;

import java.io.UnsupportedEncodingException;

import com.balbo.mailsender.service.BalboMailSender;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String destinatario =  "contacto@glamgiftscosmetics.com"; //A quien le quieres escribir.
	    String asunto = "Notificacion Glam GiftsCosmetics";
	    String cuerpo = "Esta es una prueba de correo...";
	    
		BalboMailSender.enviarConGMail(destinatario, asunto, cuerpo, "password");
	}
}
