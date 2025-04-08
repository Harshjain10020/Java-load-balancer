# Load Balancer (Minimum-Load Strategy)

A simple Java implementation of a Load Balancer that distributes incoming requests to the server with the **lowest current load**. This simulates how real-world load balancers distribute traffic efficiently among multiple backend servers.

---

## 📌 Features

- Add multiple servers with custom initial loads.
- Automatically selects the server with the minimum load.
- Increments load on each request to simulate processing.

---

## 🛠️ Technologies Used

- Java (OOP Concepts)
- Java Collections (`List`, `ArrayList`)

---

## 🚀 Steps to Run

### 1. Clone or Download this Repository

```bash
git clone https://github.com/your-username/load-balancer-java.git
cd load-balancer-java
```

```markdown
# 🚀 Steps to Run

## 1. Clone or Download this Repository

## 2. Compile the Code
```
```bash
javac LoadBalancer.java
```

## 3. Run the Program

```bash
java LoadBalancer
```

---

# 📂 Project Structure

```graphql
├── LoadBalancer.java    # Main Java class containing Server and LoadBalancer logic
├── README.md            # Documentation and usage instructions
```

---

# 📘 Documentation

## Server Class

| Method                      | Description                                       |
|----------------------------|---------------------------------------------------|
| `Server(String ip, int load)` | Constructor to create a new server instance       |
| `getIpAddress()`           | Returns the server's IP address                   |
| `getCurrentLoad()`         | Returns the server's current load                 |
| `incrementLoad()`          | Simulates a new request by incrementing the load  |

## LoadBalancer Class

| Method                     | Description                                                             |
|---------------------------|-------------------------------------------------------------------------|
| `addServer(String ip, int load)` | Adds a new server to the load balancer                         |
| `getNextServer()`         | Returns the IP address of the server with the least load and increments its load |
| `main(String[] args)`     | Demonstrates the usage of the LoadBalancer                              |

---

# 📈 Example Output

```pgsql
Request routed to server: 192.168.1.10
Request routed to server: 192.168.1.11
Request routed to server: 192.168.1.12
```

---
