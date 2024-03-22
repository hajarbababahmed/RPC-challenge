import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MonServiceRPCClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: MonServiceRPCClient <nbr>");
            System.exit(1);
        }

        try {
            String serverAddress = args[0]; // L'adresse IP du serveur
            int nbr = Integer.parseInt(args[1]);

            Registry registry = LocateRegistry.getRegistry(serverAddress, 1099);
            MonServiceRPCInterface monService = (MonServiceRPCInterface) registry.lookup("MonServiceRPC");


            int ID = monService.incrementID(nbr);
            System.out.println("ID : " + ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

