Steps to Run
Clone or Download this Repository

Compile the Code

bash
Copy
Edit
javac LoadBalancer.java
Run the Program

bash
Copy
Edit
java LoadBalancer
📂 Project Structure
graphql
Copy
Edit
├── LoadBalancer.java    # Main Java class containing Server and LoadBalancer logic
├── README.md            # Documentation and usage instructions
📘 Documentation
Server Class
Method	Description
Server(String ip, int load)	Constructor to create a new server instance
getIpAddress()	Returns the server's IP address
getCurrentLoad()	Returns the server's current load
incrementLoad()	Simulates a new request by incrementing the load
LoadBalancer Class
Method	Description
addServer(String ip, int load)	Adds a new server to the load balancer
getNextServer()	Returns the IP address of the server with the least load and increments its load
main(String[] args)	Demonstrates the usage of the LoadBalancer
📈 Example Output
pgsql
Copy
Edit
Request routed to server: 192.168.1.10
Request routed to server: 192.168.1.11
Request routed to server: 192.168.1.12
🧠 Future Improvements
Implement a load decrement method after request completion.

Add a health check mechanism for servers.

Support multiple load balancing strategies (e.g., Round Robin).

Provide a CLI or GUI interface for interaction.
