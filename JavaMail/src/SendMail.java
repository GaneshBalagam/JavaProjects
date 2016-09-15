import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 //create properties object
		Properties p=new Properties();
		//adding protocol,mailserver address&the port number of the mail server
		p.put("mail.transport.protocol", "smtp");
		p.put("mail.smtp.host", "localhost");
		p.put("mail.smtp.port","25");
		//creating the session object
		Session session=Session.getInstance(p);
		//creating and conifguring the message object
		Message msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress("modi"));
		InternetAddress address[]={new InternetAddress("venkiah")};
		msg.setRecipients(Message.RecipientType.TO,address);
		msg.setSentDate(new Date());
		msg.setSubject("open it to know it");
		msg.setText("hello ! this is the first e-mail!! from modi using java mail api on satuday");
		//sending the mail
		Transport.send(msg);
		System.out.println("mail has been delivered");
		}//main
	}//class
		
		