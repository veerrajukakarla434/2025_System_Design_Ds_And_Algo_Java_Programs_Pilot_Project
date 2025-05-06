# System Design Key Concepts - 18 System Design Interview Concepts Every Engineer Must Know

## 1. Domain Name System (DNS)
## 2. Load Balancer





#### 1. Domain Name System (DNS)
* -> https://www.designgurus.io/blog/system-design-interview-fundamentals
    * The **Domain Name System (DNS)** serves as a fundamental component of the internet infrastructure, translating user-friendly domain names into their corresponding IP addresses.
    * When you input a domain name into your web browser, the DNS is responsible for finding the associated IP address and directing your request to the appropriate server.
    * This process commences with your computer sending a query to a **recursive resolver**, which then searches a series of DNS servers, beginning with the root server, followed by the **Top-Level Domain (TLD)** server, and ultimately the **authoritative name server**.
    * Once the IP address is located, the recursive resolver returns it to your computer, allowing your browser to establish a connection with the target server and access the desired content.
 
      ![image](https://github.com/user-attachments/assets/261ebb04-00cb-4972-8e4b-3f89720bb1c4)

#### 2. Load Balancer 
* A load balancer is a networking device or software designed to distribute incoming network traffic across multiple servers, ensuring optimal resource utilization, reduced latency, and maintained high availability.
* It plays a crucial role in scaling applications and efficiently managing server workloads, particularly in situations where there is a sudden surge in traffic or uneven distribution of requests among servers.
* Load balancers employ various **load balancing algorithms** to determine the distribution of incoming traffic. Some common algorithms include
    * **Round Robin:** Requests are sequentially and evenly distributed across all available servers in a cyclical ( recurrent) manner.
    * **Least Connections:** The load balancer assigns requests to the server with the fewest active connections, giving priority to less-busy servers.
    * **IP Hash:** The client's IP address is hashed, and the resulting value is used to determine which server the request should be directed to. This method ensures that a specific client's requests are consistently routed to the same server, helping maintain session persistence.

* -> load balancing algorithms => https://www.designgurus.io/course-play/grokking-system-design-fundamentals/doc/load-balancing-algorithms
*  Read All the **Pros & Corns** of each algorithm from above link

![image](https://github.com/user-attachments/assets/a0d05dc8-3bb7-462b-aaf6-fee1b7ca633b)

  ![image](https://github.com/user-attachments/assets/c9100b10-c8aa-4bba-8c7a-26038aaafa66)

  ![image](https://github.com/user-attachments/assets/25aa85f4-5f41-42bd-bc22-2d55ad9a4b7f)
   

# System Design Concepts


![image](https://github.com/user-attachments/assets/869bcf25-6ca6-4d96-9241-488d6d0c9e5d)


* Refer -> https://github.com/ashishps1/awesome-system-design-resources

![image](https://github.com/user-attachments/assets/8eb36198-e4a6-460e-9761-c7c9d62e889e)

#### System Design Interview Questions on

* Refer -> https://blog.algomaster.io/p/how-to-answer-a-system-design-interview-problem





