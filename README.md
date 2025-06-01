# Java
Java Projects


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Project 1

Bus Reservation system

# 🚌 Bus Booking System (Java + MySQL Backend)

## 📄 Description
This is a **console-based Java application** for managing passenger bus bookings, developed as a backend project. It connects to a **MySQL database** using **JDBC** to store and retrieve data related to buses and passenger bookings.

Ideal for small travel agencies or as a learning project for understanding Java + SQL integration without any frontend interface.

---

## ✨ Features
- Add and view bus details
- Book seats on a bus with availability checks
- Retrieve and display booking records
- Implements database connectivity using JDBC
- Clean code structure following object-oriented principles

---

## 🛠️ Technologies Used
- Java (JDK 8 or above)
- MySQL (backend database)
- JDBC (Java Database Connectivity)
- IDE: Visual Studio Code / Code::Blocks

---

## 💾 Database Schema

### Database Name: `busresv`

#### Table: `bus`
| Column          | Type        | Description               |
|-----------------|-------------|---------------------------|
| id              | INT         | Primary key, auto-increment |
| bus_number      | VARCHAR     | Unique bus number         |
| source          | VARCHAR     | Source location           |
| destination     | VARCHAR     | Destination location      |
| total_seats     | INT         | Total number of seats     |
| available_seats | INT         | Remaining seats to book   |

#### Table: `booking`
| Column          | Type        | Description                  |
|-----------------|-------------|------------------------------|
| id              | INT         | Primary key, auto-increment |
| passenger_name  | VARCHAR     | Name of the passenger       |
| bus_id          | INT         | Foreign key referencing buses |
| seats_booked    | INT         | Number of seats booked      |
| booking_date    | DATE        | Date of booking             |

---

## 🚀 How to Run

1. **Set up the database**:
   - Create a MySQL database named `busresv`
   - Execute SQL to create `bus` and `booking` tables (see schema above)

2. **Configure DB credentials**:
   - Edit `DatabaseConnection.java`:
     ```java
     String url = "jdbc:mysql://localhost:3306/bus_booking_system";
     String user = "your_username";
     String password = "your_password";
     ```

3. **Compile and Run**:
   ```bash
   javac *.java
   java BusDemo


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
