# Java Practice Questions

A structured repository dedicated to mastering core and advanced Java concepts through hands-on code implementations. This project covers essential topics required for building robust applications, including multi-threaded programming, type-safe generics, efficient file operations, and web development basics.

## 🚀 Topics & Features Covered

### 1. Multithreading & Concurrency
- **Thread Creation:** Demonstrates different ways to spin up and manage multiple threads of execution.
- **Inter-Thread Communication:** Showcases synchronization, thread coordination, and signaling using `wait()` and `notify()`.

### 2. Generics
- **Type Safety:** Code examples highlighting how to design reusable, type-safe classes and methods to eliminate runtime `ClassCastException` errors.

### 3. File Handling (I/O Streams)
- **Text File Handling:** Utilizing character streams (`FileReader`, `FileWriter`) to read and write plain text files.
- **Binary File Handling:** Utilizing byte streams (`FileInputStream`, `FileOutputStream`) to read and write binary data efficiently.

### 4. Collections & Iteration
- **Custom Iterators:** Explores the implementation and usage of the Iterator pattern in Java to traverse collections.

### 5. Java Servlets & Web Basics
- **Cookies:** Explores how to read, create, and manage cookies using Java Servlets.
- **Response Redirection:** Demonstrates client-side redirection using `sendRedirect` in web applications.

---

## 📂 Repository Structure

The repository contains the following standalone Java programs:

| File Name | Description | Topic |
| :--- | :--- | :--- |
| `Multiple_thread_Creation.java` | Demonstrates spawning and running multiple independent threads. | Multithreading |
| `Inter_Thread_Communication.java` | Coordinates thread execution paths via synchronization boundaries. | Multithreading |
| `Generic.java` | Implements generic structures to enforce compile-time type checking. | Generics |
| `Text_filehandling.java` | Explores character stream operations for text files. | File I/O |
| `binary_file_handling.java` | Explores byte stream operations for non-text/binary files. | File I/O |
| `itertor.java` | Demonstrates collection traversal using custom or built-in Iterators. | Collections |
| `Cookies.java` | Explores how to read cookies using Java Servlets. | Servlets / Web |
| `sendRedirect.java` | Demonstrates how to redirect a client request to another URL using Servlets. | Servlets / Web |

---

## 🛠️ Getting Started & How to Run

### Prerequisites
- **Java Development Kit (JDK):** Ensure you have JDK 8 or higher installed on your system. You can verify this by running:
  ```bash
  java -version
