import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MonServiceRPCServeur extends UnicastRemoteObject implements MonSe>
    protected MonServiceRPCServeur() throws RemoteException {
        super();
    }

   
    int a=1;
@Override
    public int incrementID(int nbr) throws RemoteException {
        return a++;
    }

    

    public static void main(String[] args) {
        try {
            MonServiceRPCServeur monService = new MonServiceRPCServeur();
            java.rmi.registry.LocateRegistry.createRegistry(1099).rebind("MonS>
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
       }
    }
}

