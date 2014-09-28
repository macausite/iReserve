package com.macausite.iReserve;

import java.io.IOException;
import java.io.*;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

public class ReadiPhoneJson {

	public static void main(String[] args) throws Throwable {

		String url = "https://reserve.cdn-apple.com/HK/zh_HK/reserve/iPhone/availability.json";
		final String username = "xxx";//Gmail login email	
		final String password = "yyy";//Gmail login password
		final String receiverEmail = "zzz";//Receiver email

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		try {
			while (true) {
				BufferedReader input = new BufferedReader(
						new InputStreamReader(new URL(url).openStream(),
								"UTF-8"));

				String jsonText = readAll(input);
				JSONParser jsonParser = new JSONParser();

				JSONObject json = (JSONObject) jsonParser.parse(jsonText);
				JSONObject shop1 = (JSONObject) json.get("R485");
				JSONObject shop2 = (JSONObject) json.get("R409");
				JSONObject shop3 = (JSONObject) json.get("R428");
				// shop1
				Boolean shop1gold16 = (Boolean) shop1.get("MG492ZP/A");
				Boolean shop1silver16 = (Boolean) shop1.get("MG4H2ZP/A");
				Boolean shop1black16 = (Boolean) shop1.get("MG472ZP/A");
				Boolean shop1gold64 = (Boolean) shop1.get("MG4J2ZP/A");
				Boolean shop1silver64 = (Boolean) shop1.get("MG482ZP/A");
				Boolean shop1black64 = (Boolean) shop1.get("MG4F2ZP/A");
				Boolean shop1gold128 = (Boolean) shop1.get("MG4E2ZP/A");
				Boolean shop1silver128 = (Boolean) shop1.get("MG4C2ZP/A");
				Boolean shop1black128 = (Boolean) shop1.get("MG4A2ZP/A");
				Boolean shop1plusgold16 = (Boolean) shop1.get("MGAA2ZP/A");
				Boolean shop1plussilver16 = (Boolean) shop1.get("MGA92ZP/A");
				Boolean shop1plusblack16 = (Boolean) shop1.get("MGA82ZP/A");
				Boolean shop1plusgold64 = (Boolean) shop1.get("MG482ZP/A");
				Boolean shop1plussilver64 = (Boolean) shop1.get("MG482ZP/A");
				Boolean shop1plusblack64 = (Boolean) shop1.get("MGAH2ZP/A");
				Boolean shop1plusgold128 = (Boolean) shop1.get("MGAF2ZP/A");
				Boolean shop1plussilver128 = (Boolean) shop1.get("MGA92ZP/A");
				Boolean shop1plusblack128 = (Boolean) shop1.get("MGAC2ZP/A");
				// shop2
				Boolean shop2gold16 = (Boolean) shop2.get("MG492ZP/A");
				Boolean shop2silver16 = (Boolean) shop2.get("MG4H2ZP/A");
				Boolean shop2black16 = (Boolean) shop2.get("MG472ZP/A");
				Boolean shop2gold64 = (Boolean) shop2.get("MG4J2ZP/A");
				Boolean shop2silver64 = (Boolean) shop2.get("MG482ZP/A");
				Boolean shop2black64 = (Boolean) shop2.get("MG4F2ZP/A");
				Boolean shop2gold128 = (Boolean) shop2.get("MG4E2ZP/A");
				Boolean shop2silver128 = (Boolean) shop2.get("MG4C2ZP/A");
				Boolean shop2black128 = (Boolean) shop2.get("MG4A2ZP/A");
				Boolean shop2plusgold16 = (Boolean) shop2.get("MGAA2ZP/A");
				Boolean shop2plussilver16 = (Boolean) shop2.get("MGA92ZP/A");
				Boolean shop2plusblack16 = (Boolean) shop2.get("MGA82ZP/A");
				Boolean shop2plusgold64 = (Boolean) shop2.get("MG482ZP/A");
				Boolean shop2plussilver64 = (Boolean) shop2.get("MG482ZP/A");
				Boolean shop2plusblack64 = (Boolean) shop2.get("MGAH2ZP/A");
				Boolean shop2plusgold128 = (Boolean) shop2.get("MGAF2ZP/A");
				Boolean shop2plussilver128 = (Boolean) shop2.get("MGA92ZP/A");
				Boolean shop2plusblack128 = (Boolean) shop2.get("MGAC2ZP/A");
				// shop3
				Boolean shop3gold16 = (Boolean) shop3.get("MG492ZP/A");
				Boolean shop3silver16 = (Boolean) shop3.get("MG4H2ZP/A");
				Boolean shop3black16 = (Boolean) shop3.get("MG472ZP/A");
				Boolean shop3gold64 = (Boolean) shop3.get("MG4J2ZP/A");
				Boolean shop3silver64 = (Boolean) shop3.get("MG482ZP/A");
				Boolean shop3black64 = (Boolean) shop3.get("MG4F2ZP/A");
				Boolean shop3gold128 = (Boolean) shop3.get("MG4E2ZP/A");
				Boolean shop3silver128 = (Boolean) shop3.get("MG4C2ZP/A");
				Boolean shop3black128 = (Boolean) shop3.get("MG4A2ZP/A");
				Boolean shop3plusgold16 = (Boolean) shop3.get("MGAA2ZP/A");
				Boolean shop3plussilver16 = (Boolean) shop3.get("MGA92ZP/A");
				Boolean shop3plusblack16 = (Boolean) shop3.get("MGA82ZP/A");
				Boolean shop3plusgold64 = (Boolean) shop3.get("MG482ZP/A");
				Boolean shop3plussilver64 = (Boolean) shop3.get("MG482ZP/A");
				Boolean shop3plusblack64 = (Boolean) shop3.get("MGAH2ZP/A");
				Boolean shop3plusgold128 = (Boolean) shop3.get("MGAF2ZP/A");
				Boolean shop3plussilver128 = (Boolean) shop3.get("MGA92ZP/A");
				Boolean shop3plusblack128 = (Boolean) shop3.get("MGAC2ZP/A");

				if ((shop1gold16 == true) || (shop1silver16 == true)
						|| (shop1black16 == true) || (shop1gold64 == true)
						|| (shop1silver64 == true) || (shop1black64 == true)
						|| (shop1gold128 == true) || (shop1silver128 == true)
						|| (shop1black128 == true) || (shop1plusgold16 == true)
						|| (shop1plussilver16 == true)
						|| (shop1plusblack16 == true)
						|| (shop1plusgold64 == true)
						|| (shop1plussilver64 == true)
						|| (shop1plusblack64 == true)
						|| (shop1plusgold128 == true)
						|| (shop1plussilver128 == true)
						|| (shop1plusblack128 == true) || (shop2gold16 == true)
						|| (shop2silver16 == true) || (shop2black16 == true)
						|| (shop2gold64 == true) || (shop2silver64 == true)
						|| (shop2black64 == true) || (shop2gold128 == true)
						|| (shop2silver128 == true) || (shop2black128 == true)
						|| (shop2plusgold16 == true)
						|| (shop2plussilver16 == true)
						|| (shop2plusblack16 == true)
						|| (shop2plusgold64 == true)
						|| (shop2plussilver64 == true)
						|| (shop2plusblack64 == true)
						|| (shop2plusgold128 == true)
						|| (shop2plussilver128 == true)
						|| (shop2plusblack128 == true) || (shop3gold16 == true)
						|| (shop3silver16 == true) || (shop3black16 == true)
						|| (shop3gold64 == true) || (shop3silver64 == true)
						|| (shop3black64 == true) || (shop3gold128 == true)
						|| (shop3silver128 == true) || (shop3black128 == true)
						|| (shop3plusgold16 == true)
						|| (shop3plussilver16 == true)
						|| (shop3plusblack16 == true)
						|| (shop3plusgold64 == true)
						|| (shop3plussilver64 == true)
						|| (shop3plusblack64 == true)
						|| (shop3plusgold128 == true)
						|| (shop3plussilver128 == true)
						|| (shop3plusblack128 == true)) {
					try {

						Message message = new MimeMessage(session);
						message.setFrom(new InternetAddress(receiverEmail));
						message.setRecipients(Message.RecipientType.TO,
								InternetAddress.parse(receiverEmail));
						message.setSubject("iPhone available");
						message.setText("Dear Apple farmer,"
								+ "\n\n Act fast now!");

						Transport.send(message);

						System.out.println("Email Sent");
						Date now = new Date();
						System.out.println(now);
					} catch (MessagingException e) {
						throw new RuntimeException(e);
					}

				}

				input.close();
				Thread.sleep(30 * 1000);
				Date current = new Date();
				System.out.println("No Phone @ " + current);
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
}