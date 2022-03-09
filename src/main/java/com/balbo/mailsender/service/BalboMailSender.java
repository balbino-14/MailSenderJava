package com.balbo.mailsender.service;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.activation.MimeType;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.balbo.mailsender.util.PlantillasMail;

public class BalboMailSender {

	public static void enviarConGMail(String destinatario, String asunto, String cuerpo, String clave) throws UnsupportedEncodingException {
	    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
	    String remitente = "jbalbino.gc@gmail.com";  //Para la dirección nomcuenta@gmail.com

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", clave);    //La clave de la cuenta
	    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
	    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

	    Session session = Session.getDefaultInstance(props);
	    session.setDebug(Boolean.TRUE);
	    MimeMessage message = new MimeMessage(session);
	    

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
	        //message.addRecipient(Message.RecipientType.CC, new InternetAddress("jbalbino_gc@live.com"));
	        //message.addRecipient(Message.RecipientType.BCC, new InternetAddress("frank_yut10@hotmail.com", "Balbino_Apple"));
	        message.setSubject(asunto);
	        message.setText( new PlantillasMail().plantillaGlamNotificaciones3(),
	        		"UTF-8",
	        		"html");
	        /*"Mensajito con Java Mail<br>" + "<b>de</b> los <i>buenos</i>." + "poque si",
    		"ISO-8859-1",
    		"html"*/
	        //message.setText(cuerpo);
	        
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, clave);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   //Si se produce un error
	    }
	}
}
