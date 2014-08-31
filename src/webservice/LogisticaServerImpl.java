//SERVER IMPLEMENTATION BEAN (SEB)
package webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.LogisticaServer", targetNamespace="logistica")
// CLASSE SEI
public class LogisticaServerImpl implements LogisticaServer {

	public String metodo(float num1, float num2) {
		return "A soma é " + (num1 + num2);
	}

}