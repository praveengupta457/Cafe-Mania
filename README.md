# Cafe-Mania
**Cafe Mania** is a Java-based application with JDBC and MySQL, offering seamless management of cafe operations, including order processing, item rate management, and user-administrator functionalities.

Cafe Mania - Java-based Cafe Management System

Cafe Mania is a Java-based console application designed for managing cafe operations, including order processing, item rate management, and user-administrator functionalities. The system uses JDBC and MySQL for database connectivity and allows cafe owners and staff to manage items, orders, and customer interactions effectively.

---

Features

-User Module:
  - User Registration and Login
  - View Menu and Add Items to Cart
  - Place Orders and View Order History
- Admin Module:
  - Manage Item List (Add, Update, Delete Items)
  - Set Item Prices
  - View All Orders and Update Order Status

---

Technologies Used

- Java: For the core application and business logic.
- JDBC (Java Database Connectivity): To connect and interact with the MySQL database.
- MySQL: Database for storing user data, menu items, and order information.

---


Follow these steps to set up the Cafe Mania project on your local machine:

 Prerequisites
- Java (version 8 or higher)
- MySQL Database
- JDBC MySQL Connector (Driver)

Steps

1. Clone the Repository:
   Clone the repository to your local machine:
   ```bash
   git clone https://github.com/praveengupta457/Cafe-Mania.git
   ```

2. Database Setup:
   - Create a new database in MySQL (e.g., `cafe_mania`).
   - Create the necessary tables (refer to the `schema.sql` file in the project, if available).
   - Import or configure the tables for menu items, orders, and user data.

3. Configure Database Connection:
   - Edit the database connection settings in the `Credential` class or configuration file to match your local MySQL setup (host, username, password).
   - Example:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/cafe_mania";
     private static final String USER = "root";
     private static final String PASSWORD = "yourpassword";
     ```

4. Run the Application:
   - Compile and run the `Main.java` class to start the application.
   - Follow the on-screen instructions for using the cafe management system.

---

Usage

- Admin Login: Log in as an admin to manage the menu, view orders, and set prices.
- User Login: Log in as a user to browse the menu, place orders, and view order history.

---
