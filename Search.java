// Creating a Search interface (Search.java)
import java.rmi.*;
public interface Search extends Remote {
// Declaring the method prototype
public String query(String search) throws
RemoteException;
}
