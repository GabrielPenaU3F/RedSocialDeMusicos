package untref.lp4.redsocialdemusicos.redsocialdemusicos;

import java.net.Socket;


public class TesterConexion {

	/*Crea un socket que intenta conectarse
	 * a una ip por un puerto. Si la conexion
	 * se establece bien, cierra la conexion
	 * y devuelve true. Si hay algun problema, 
	 * devuelve false.
	 *  */
	public static boolean testear(String ip, int puerto) {
	
		try {
			Socket s = new Socket(ip, puerto);
			if (s.isConnected()) {
				s.close();
				return true;
			} 
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
}
