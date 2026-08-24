# 🏬 CityShop Retail Management System

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Microsoft Access](https://img.shields.io/badge/Microsoft_Access-A4373A?style=for-the-badge&logo=microsoft-access&logoColor=white)](https://www.microsoft.com/)

## 📖 Overview
CityShop is a Java-based desktop application designed for retail and inventory management. Built as an assessment project, it features a complete graphical user interface and a relational database backend. The system supports role-based access, allowing staff to manage inventory while customers browse products, manage their shopping baskets, and track orders.

## ✨ Key Features
* **Role-Based Portals:** Provides dedicated login systems and navigation dashboards for both `Customer` and `Staff` users.
* **Inventory Management:** Allows staff to add, edit, and view products, with specialized models for `Clothing` and `FootWear`.
* **Order Processing:** Supports full order lifecycle management, including shopping basket management (`ViewBasket`), order history tracking (`CustomerViewOrders`), and detailed order lines.
* **Database Integration:** Connects to a local Microsoft Access database (`ShopDB.accdb`) using the UCanAccess JDBC driver architecture.

## 🛠️ Tech Stack
* **Language:** Java
* **GUI Framework:** Java Swing / AWT (NetBeans GUI Builder)
* **Database:** Microsoft Access (`.accdb`)
* **Database Driver:** UCanAccess 2.0.9.3 (with HSQLDB and Jackcess dependencies)
* **UML / Design:** Visual Paradigm (`CityShop-master.vpp`)

## 📂 Repository Structure
```text
📦 Assessment-CityShop
 ┣ 📂 UCanAccess-2.0.9.3-bin/ # JDBC driver dependencies for MS Access
 ┣ 📂 nbproject/              # NetBeans IDE project configuration files
 ┣ 📂 src/
 ┃ ┣ 📂 Forms/                # GUI screens (AddProduct, CustomerLogin, ViewBasket, etc.)
 ┃ ┣ 📂 db/
 ┃ ┃ ┗ 📜 ShopDB.accdb        # Core Microsoft Access database
 ┃ ┗ 📂 models/               # OOP class models (Customer, Product, Order, DBHandler)
 ┗ 📂 vpproject/              # Visual Paradigm UML diagrams
