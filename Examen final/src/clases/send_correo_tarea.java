package clases;

import static clases.enviar_Correo.FROM;
import static clases.enviar_Correo.FROMNAME;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import static ventana.Registro.apellidos;
import static ventana.Registro.correo;
import static ventana.Registro.nombre;
import static ventana.Tareas.descrip;
import static ventana.Tareas.encargado;
import static ventana.Tareas.fecha;
import static ventana.Tareas.nombre_tarea;

public class send_correo_tarea {

    static final String FROM = "pruebasprograuni@gmail.com";
    static final String FROMNAME = "Verificación de Registro";
    private String TO = correo;

    public send_correo_tarea(String TO) {

    }

    static final String SMTP_USERNAME = "pruebasprograuni@gmail.com";
    static final String SMTP_PASSWORD = "JDVRlmcq001";

    static final String CONFIGSET = "ConfigSet";

    static final String HOST = "smtp.gmail.com";

    static final int PORT = 587;

    static final String SUBJECT = "Confirmación de tarea realizada";

    static final String BODY = "Estimado usuario." + nombre + apellidos
            + "Le informamos que la tarea ha sido completada, por lo tanto se marco como tarea completada.";

    public void enviarcorreo_completa() throws UnsupportedEncodingException, MessagingException {

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
            JOptionPane.showMessageDialog(null, "Correo de confirmación enviado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el proceso");
            System.out.println(e.getMessage());
        } finally {
            transport.close();
        }

    }
}
