# 🚀 Hibernate Image Persistence Utility

A simple and efficient Java Maven project that utilizes Hibernate ORM to persist local disk images directly into a database as binary data (`LONGBLOB`) and export them back to the local file system when needed.

---

## ✨ Features

* 📁 **Bulk Image Upload:** Reads all images from any specified local folder simultaneously and stores them in the database.
* 💾 **Secure Byte Storage:** Maps image binaries into the database using the secure `LONGBLOB` data type via Jakarta Persistence annotations.
* 📤 **Automated Export:** Fetches byte data from the database and reconstructs it back into original `.png` image files on the local disk.
* 🛡️ **Session Management:** Implements precise Hibernate session boundaries and atomic transactions to prevent any memory or resource leaks.

---

## 🛠️ Tech Stack & Prerequisites

* **Language:** Java (JDK 17 or higher)
* **Framework:** Hibernate ORM (Jakarta Persistence API)
* **Build Tool:** Maven
* **Database:** MySQL / MariaDB (or any SQL relational database that supports binary large objects)

---

## 📂 Project Structure

```text
├── 📁 src
│   └── 📁 main
│       ├── 📁 java
│       │   └── 📁 org
│       │       └── 📁 example
│       │           ├── 📄 BackendForImage.java  # Core Logic (Upload/Download)
│       │           ├── 📄 HibernateUtil.java    # SessionFactory Configuration
│       │           ├── 📄 Image.java            # Entity Model (@Lob mapping)
│       │   └── 📁 resources
│       │       └── 📄 hibernate.cfg.xml            # Database Connection Setup
├── 📄 pom.xml                                   # Dependencies Configuration
└── 📄 README.md                                 # Project Documentation
