# 🛒 Order Management System API (Spring Boot)

Welcome to the **Order Management System API** – a RESTful microservice built using **Spring Boot** that provides CRUD operations for managing product orders. This project is designed for learning, prototyping, and building scalable backend services with modern Java frameworks.

[🔗 Live Repository on GitHub](https://github.com/utk-mat/Order_Management_System_API)

---

## 📚 Table of Contents

- [🔧 Technologies Used](#-technologies-used)
- [📁 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [📫 API Endpoints](#-api-endpoints)
- [🔄 Sample API Usage (via Postman)](#-sample-api-usage-via-postman)
- [🧪 Testing](#-testing)
- [📌 Future Improvements](#-future-improvements)
- [🤝 Contribution Guidelines](#-contribution-guidelines)
- [📃 License](#-license)

---

## 🔧 Technologies Used

| Technology           | Version     | Purpose                          |
|----------------------|-------------|----------------------------------|
| Java                 | 17          | Core language                    |
| Spring Boot          | 3.5.0       | RESTful API framework            |
| Maven                | —           | Dependency & build management   |
| Lombok (optional)    | —           | Boilerplate reduction            |
| Postman              | —           | API testing                      |

---

## 📁 Project Structure

```shell
Order_Management_System_API/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/paynearbyOrderAPI/OrderAPI/
│   │   │       ├── controller/       # REST controllers
│   │   │       ├── service/          # Business logic
│   │   │       ├── model/            # Entity classes
│   │   │       ├── dtos/             # DTOs (Request/Response)
│   │   │       └── repository/       # Data access interfaces
│   │   └── resources/
│   │       └── application.properties
│   └── test/                         # Unit tests (optional)
├── pom.xml                           # Project metadata and dependencies
└── README.md

---

## 🚀 Getting Started

Follow these steps to run the project locally:

### ✅ Prerequisites
- Java 17+
- Maven installed
- IntelliJ IDEA or any Java IDE

### 🔨 Setup Instructions

```bash
# Clone the repository
git clone https://github.com/utk-mat/Order_Management_System_API.git
cd Order_Management_System_API

# Start Spring Boot
mvn spring-boot:run


📫 API Endpoints
Method	Endpoint	Description
POST	/orders	Create a new order
GET	/orders	Retrieve all orders
GET	/orders/{id}	Retrieve a single order
PUT	/orders/{id}	Update an existing order
DELETE	/orders/{id}	Delete an order

🔄 Sample API Usage (via Postman)
1️⃣ Create Order
Endpoint: POST http://localhost:8080/orders

Body:
{
  "productName": "Wireless Mouse",
  "quantity": 3,
  "price": 799.99
}

2️⃣ Get All Orders
Endpoint: GET http://localhost:8080/orders

3️⃣ Get Order by ID
Endpoint: GET http://localhost:8080/orders/1

4️⃣ Update Order
Endpoint: PUT http://localhost:8080/orders/1

Body:
{
  "productName": "Gaming Keyboard",
  "quantity": 2,
  "price": 1299.00
}

5️⃣ Delete Order
Endpoint: DELETE http://localhost:8080/orders/1

🧪 Testing
You can test this API using:

🧪 Postman (Recommended)

🔁 cURL

🧼 Swagger/OpenAPI (to be added in future)

📌 Future Improvements
Here are some planned enhancements:

🗃 Switch from in-memory storage to a real database (e.g., MySQL, PostgreSQL)

✅ Add validations using @Valid annotations

⚠️ Centralized error handling with @ControllerAdvice

📑 Swagger integration for live API documentation

🔬 JUnit tests for service/controller layers

🚀 CI/CD & deployment to cloud (AWS/GCP)

🤝 Contribution Guidelines
We welcome all contributors! Here's how to get started:

Fork the repository

Create a new branch (git checkout -b feature/your-feature-name)

Commit your changes (git commit -m 'Add your feature')

Push to your branch (git push origin feature/your-feature-name)

Open a Pull Request 🚀

📃 License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it.

