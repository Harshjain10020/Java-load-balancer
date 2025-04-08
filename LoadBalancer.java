import java.util.ArrayList;
import java.util.List;

// Server class representing an individual server
class Server {
    private String ipAddress;
    private int currentLoad;

    public Server(String ipAddress, int currentLoad) {
        this.ipAddress = ipAddress;
        this.currentLoad = currentLoad;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void incrementLoad() {
        currentLoad++;
    }
}

// LoadBalancer class implementing minimum-load strategy
public class LoadBalancer {
    private List<Server> servers;

    public LoadBalancer() {
        servers = new ArrayList<>();
    }

    // Adds a server to the load balancer
    public void addServer(String ipAddress, int currentLoad) {
        servers.add(new Server(ipAddress, currentLoad));
    }

    // Returns the IP address of the server with the minimum load
    public String getNextServer() {
        if (servers.isEmpty()) {
            throw new IllegalStateException("No servers available in the load balancer.");
        }

        Server minLoadServer = servers.get(0);

        for (Server server : servers) {
            if (server.getCurrentLoad() < minLoadServer.getCurrentLoad()) {
                minLoadServer = server;
            }
        }

        // Simulate handling the request by incrementing the load
        minLoadServer.incrementLoad();

        return minLoadServer.getIpAddress();
    }

    // Main method to demonstrate load balancing
    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();

        // Add some dummy server IP addresses and loads
        loadBalancer.addServer("192.168.1.10", 10);
        loadBalancer.addServer("192.168.1.11", 10);
        loadBalancer.addServer("192.168.1.12", 10);

        // Route requests and print the server IPs handling them
        System.out.println("Request routed to server: " + loadBalancer.getNextServer());
        System.out.println("Request routed to server: " + loadBalancer.getNextServer());
        System.out.println("Request routed to server: " + loadBalancer.getNextServer());
    }
}
