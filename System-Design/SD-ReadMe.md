# System Design Key Concepts - 18 System Design Interview Concepts Every Engineer Must Know

## 1. Domain Name System (DNS)
## 2. Load Balancer
## 3. API Gateway
## 4. CDN
## 5. Forward Proxy vs. Reverse Proxy
## 6. Caching: A Foundational System Design Concept


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

![image](https://github.com/user-attachments/assets/727e2465-7c6b-4936-af08-44d42ea72b9d)

* -> load balancing algorithms => https://www.designgurus.io/course-play/grokking-system-design-fundamentals/doc/load-balancing-algorithms
*  Read All the **Pros & Corns** of each algorithm from above link

![image](https://github.com/user-attachments/assets/a0d05dc8-3bb7-462b-aaf6-fee1b7ca633b)

  ![image](https://github.com/user-attachments/assets/c9100b10-c8aa-4bba-8c7a-26038aaafa66)

  ![image](https://github.com/user-attachments/assets/25aa85f4-5f41-42bd-bc22-2d55ad9a4b7f)
   
#### 3. API Gateway

* API Gateway is pivotal in system design - it serves as a server or service that functions as an intermediary between external clients and the internal microservices or API-based backend services of an application.

* **The primary functions of an API Gateway encompass**
    * **Request Routing:** The API Gateway directs incoming API requests from clients to the appropriate backend service or microservice, based on predefined rules and configurations.
    * **Authentication and Authorization:** The API Gateway manages user authentication and authorization, ensuring that only authorized clients can access the services. It verifies API keys, tokens, or other credentials before routing requests to the backend services.
    * **Rate Limiting and Throttling:** To safeguard backend services from excessive load or abuse, the API Gateway enforces rate limits or throttles requests from clients according to predefined policies.
    * **Caching:** In order to minimize latency and backend load, the API Gateway caches frequently-used responses, serving them directly to clients without the need to query the backend services.
    * **Request and Response Transformation:** The API Gateway can modify requests and responses, such as converting data formats, adding or removing headers, or altering query parameters, to ensure compatibility between clients and services.

![image](https://github.com/user-attachments/assets/56c09ef6-4993-4ab8-8675-1172a201cd94)

* Read **Introduction to API Gateway** And Diff Between Load Balancer and API Gate Way -> https://www.designgurus.io/course-play/grokking-system-design-fundamentals/doc/introduction-to-api-gateway


#### 4. CDN

* A **Content Delivery Network (CDN)** is a distributed network of servers that store and deliver content, such as images, videos, stylesheets, and scripts, to users from locations that are geographically closer to them.
* CDNs are designed to enhance the performance, speed, and reliability of content delivery to end-users, irrespective of their location relative to the origin server.

* **Here's how CDN operates:**
    * When a user requests content from a website or application, the request is directed to the nearest CDN server, also known as an **edge server**.
    * If the edge server has the requested content cached, it directly serves the content to the user. This process reduces latency and improves the user experience, as the content travels a shorter distance.
    * If the content is not cached on the edge server, the CDN retrieves it from the origin server or another nearby CDN server. Once the content is fetched, it is cached on the edge server and served to the user.
    * **To ensure the content stays up-to-date, the CDN periodically checks the origin server for changes and updates its cache accordingly**.

  ![image](https://github.com/user-attachments/assets/71b78374-a082-4a16-880b-8a22e309860c)

#### 5. Forward Proxy vs. Reverse Proxy

* A **forward proxy**, also referred to as a "proxy server" or simply "proxy," is a server positioned in front of one or more client machines, acting as an intermediary between the clients and the internet. When a client machine requests a resource on the internet, the request is initially sent to the forward proxy. The forward proxy then forwards the request to the internet on behalf of the client machine and returns the response to the client machine.
* On the other hand, a **reverse proxy** is a server that sits in front of one or more web servers, serving as an intermediary between the web servers and the internet. When a client requests a resource on the internet, the request is first sent to the reverse proxy. The reverse proxy then forwards the request to one of the web servers, which returns the response to the reverse proxy. Finally, the reverse proxy returns the response to the client.

![image](https://github.com/user-attachments/assets/81a74236-014c-4047-985f-ec45013ea778)

* **What is the difference between proxy and reverse proxy?** -> https://www.designgurus.io/answers/detail/what-is-the-difference-between-proxy-and-reverse-proxy

![image](https://github.com/user-attachments/assets/f581009f-e582-47a2-b035-ceddab9d0b0b)


![image](https://github.com/user-attachments/assets/88c3afaf-0565-4c00-b570-3cf0567ee81b)

![image](https://github.com/user-attachments/assets/65cf4b3d-2735-49db-8cfb-9d50e95996ac)


![image](https://github.com/user-attachments/assets/b1ec4419-4849-4a39-ac2d-05a6c1c888d3)

#### 6. Caching: A Foundational System Design Concept
* Cache is a high-speed storage layer positioned between the application and the original data source, such as a database, file system, or remote web service.
* When an application requests data, the cache is checked first. If the data is present in the cache, it is returned to the application. If the data is not found in the cache, it is retrieved from its original source, stored in the cache for future use, and then returned to the application.
*  In a distributed system, caching can occur in multiple locations, including the client, DNS, CDN, load balancer, API gateway, server, database, and more.

![image](https://github.com/user-attachments/assets/40c03d74-8d95-42d6-a5e5-d769dc7ac152)


# System Design Concepts


![image](https://github.com/user-attachments/assets/869bcf25-6ca6-4d96-9241-488d6d0c9e5d)


* Refer -> https://github.com/ashishps1/awesome-system-design-resources

![image](https://github.com/user-attachments/assets/8eb36198-e4a6-460e-9761-c7c9d62e889e)

#### System Design Interview Questions on

* Refer -> https://blog.algomaster.io/p/how-to-answer-a-system-design-interview-problem





