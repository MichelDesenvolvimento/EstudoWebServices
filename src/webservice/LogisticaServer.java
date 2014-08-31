//SERVER ENDPOINT INTERFACE (SEI)
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
// RPC - REMOTE PROCEDURE CALL
public interface LogisticaServer {
	@WebMethod
	String metodo(float num1, float num2);
}