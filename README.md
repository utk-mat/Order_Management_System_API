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
