package client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webservice.LogisticaServer;

import java.net.URL;

//http://fabriciosanchez.com.br/2/wsdl-o-que-e-pra-que-serve-onde-utilizo/

class LogisticaClient {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/logistica?wsdl");
		QName qname = new QName("logistica", "LogisticaServerImplService");
		Service ws = Service.create(url, qname);
		LogisticaServer logistica = ws.getPort(LogisticaServer.class);

		System.out.println("Retorno do metodo: " + logistica.metodo(5, 1));

	}
}