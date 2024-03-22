import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MonServiceRPCInterface extends Remote {
    int incrementID(int nbr) throws RemoteException;
}
