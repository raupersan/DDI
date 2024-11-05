package EmailSimple;

import java.util.*;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class Main {

	public static void enviarEmail(String destinatario, String asunto, String cuerpo) {
		final String fromEmail= "raulps1798@gmail.com";
		final String password="";
		String toEmail = destinatario;
		
		System.out.println("Configurando datos de conexión SSL");
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getDefaultInstance(props, auth);
		System.out.println("Sesión creada");
		EmailUtil.sendEmail(session, toEmail, asunto, cuerpo);

	}

}
