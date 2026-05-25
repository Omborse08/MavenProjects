# 🚀 Hibernate Image Persistence Utility

Ek simple aur efficient Java Maven project jo Hibernate ORM ka use karke local directory se images ko database (LONGBLOB) mein save karta hai aur zaroorat padne par unhe wapas local system mein export karta hai.

---

## ✨ Features

* 📁 **Bulk Image Upload:** Kisi bhi local folder se saari images ko ek sath read karke database mein store karta hai.
* 💾 **Secure Byte Storage:** Images ko database mein secure `LONGBLOB` data type ke roop mein map karta hai.
* 📤 **Automated Export:** Database se image data ko fetch karke wapas `.png` files ke roop mein local disk par write karta hai.
* 🛡️ **Session Management:** Proper Hibernate session aur transaction boundaries ka use karta hai taaki data leak na ho.

---

## 🛠️ Tech Stack & Prerequisites

* **Language:** Java (JDK 17 ya higher)
* **Framework:** Hibernate ORM (Jakarta Persistence API)
* **Build Tool:** Maven
* **Database:** MySQL / MariaDB (ya koi bhi SQL DB jo BLOB support kare)

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
│       │           └── 📄 Image.java            # Entity Model (@Lob mapping)
│       └── 📁 resources
│           └── 📄 hibernate.cfg.xml            # Database Connection Setup
├── 📄 pom.xml                                  # Dependencies Configuration
└── 📄 README.md                                # Project Documentation
```

---

## 🚀 Setup & Configuration

### 1. Database Configuration
Sabse pehle `src/main/resources/hibernate.cfg.xml` file kholein aur apne local database ki details update karein:

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME</property>
<property name="hibernate.connection.username">YOUR_USERNAME</property>
<property name="hibernate.connection.password">YOUR_PASSWORD</property>
```

> ⚠️ **Security Note:** GitHub par push karne se pehle apna asli database password config file se zaroor hata dein!

### 2. How to Use

Project mein do main functions hain jo `BackendForImage` class mein handles hote hain:

* **Images DB mein bhejne ke liye:**
  ```java
  BackendForImage backend = new BackendForImage();
  backend.transerFileLogic("C:\\Aapka\\Source\\Folder\\Path");
  ```

* **Images DB se wapas nikalne ke liye:**
  ```java
  backend.takeFileLogic("C:\\Aapka\\Destination\\Folder\\Path");
  ```

---

## 📝 License

This project is open-source and free to use for educational purposes.
