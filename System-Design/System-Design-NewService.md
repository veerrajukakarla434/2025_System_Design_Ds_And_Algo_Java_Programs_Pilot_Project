# Service Design With SpringBoot + Kafka + MongoDB

![image](https://github.com/user-attachments/assets/2e000e5a-4171-4d7e-84e0-95e54987a542)

![image](https://github.com/user-attachments/assets/312f48c1-a172-4804-9393-f68faa7c2e7f)

![image](https://github.com/user-attachments/assets/3a6c7311-8140-4f7a-9c1a-dc0a2b7185f7)


![image](https://github.com/user-attachments/assets/36d4e18a-df11-4000-a1ea-8c8f60f8e6cb)


![image](https://github.com/user-attachments/assets/a7e69958-9542-4535-8b7e-37260d7c8bfa)

![image](https://github.com/user-attachments/assets/d755cb49-b513-4c55-b2a7-5331d6b5aeb3)



![image](https://github.com/user-attachments/assets/87e6f702-0737-4896-910d-abf82c077938)

![image](https://github.com/user-attachments/assets/ad203fa8-a6bd-4f9b-bd8c-a880a075577b)

![image](https://github.com/user-attachments/assets/79866646-49c1-42f1-b63a-22422b4170c3)

![image](https://github.com/user-attachments/assets/4e2b9c91-7b7f-4f39-9142-a5de77fe5dcf)


#### --------------------------------------------------------------------------------


Ref: -> https://chat.deepseek.com/a/chat/s/9896ddce-59ad-4686-aba1-31f0f8bed299

```text
I have one external service called "SDP"
I am getting daily 10M records/documents to kafka topic1
I am consuming from topic1 to spring boot microservice called M1 servie and saving int MongoDB.
Now I am reading documents from MongoDB and sending to rule engine.
Now rule engine will give eligible documents to process, and updating MongoDB
Now I am reading documents from MongoDB and publishing documents topic2 in spring boot microservice called M2 Service
Now I am consuming from topic2 to spring boot microservice called M3

For This I need MongoDB Design and Springboot code in optimized/best way
  What I am expecting
  
   1) Code for reading documents from topic1 to M1 service and saving into MongoDB
   2) Code for reading documents from Mongodb to M2 service and publishing to topic2
   3) Generate Proper Sequentinal diagrams for eatch Level
   Need MongoDB clooection design
   Proper batch process design with configurations  Using Spring Boot , Kafka and MongoDB
```
