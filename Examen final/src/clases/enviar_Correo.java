package clases;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class enviar_Correo {

    static final String FROM = "pruebasprograuni@gmail.com";
    static final String FROMNAME = "Verificación del registro";
    private String TO;

    public enviar_Correo(String TO) {
        this.TO = TO;
    }

    static final String SMTP_USERNAME = "pruebasprograuni@gmail.com";
    static final String SMTP_PASSWORD = "JDVRlmcq001";

    static final String CONFIGSET = "ConfigSet";

    static final String HOST = "smtp.gmail.com";

    static final int PORT = 587;

    static final String SUBJECT = "Verificacion de registro";

    static final String BODY = "Estimado usuario, bienvenido al sistema de control y supervisión de tareas"
            + ""
            + "Le adjuntamos su información personal."
            + ""
            + "Nombre: "
            + ""
            + "Apellido"
            + ""
            + "Correo electrónico: "
            + ""
            + "Usuario: "
            + ""
            + "Contraseña: "
            + "";

    public void enviarcorreo() throws UnsupportedEncodingException, MessagingException {

        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        MimeMessage mg = new MimeMessage(session);
        mg.setFrom(new InternetAddress(FROM, FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        mg.setSubject(SUBJECT);
        mg.setContent(BODY, "text/html");

        mg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);

        Transport transport = session.getTransport();

        try {
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transport.sendMessage(mg, mg.getAllRecipients());
            JOptionPane.showMessageDialog(null, "Correo de verificacion enviado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println(e.getMessage());
        } finally {
            transport.close();
        }

    }
}
