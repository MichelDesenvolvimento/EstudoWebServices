package publication;

import javax.xml.ws.Endpoint;

import webservice.LogisticaServerImpl;

public class LogisticaServerPublisher {

	public static void main(String[] args) {
		// PUBLICA O WEB SERVICE
		Endpoint.publish("http://127.0.0.1:9876/logistica",
				new LogisticaServerImpl());
	}
}