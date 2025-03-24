## Vikhram S
## 212222060295

## **🔐 User Authentication System (OOP in Python)**  

### **📌 Problem Statement**  
You are building a **User Authentication System** where users can log in based on their roles. Implement the following classes:  

### **⚡ Difficulty Level: HARD**


### **🛠 Class Definitions**  

1. **`User` (Base Class)**  
   - Attributes:  
     - `username` (str)  
     - `password` (str, private)  
   - Methods:  
     - `login(password: str) -> bool`: Returns `True` if the password matches, else `False`.  

2. **`Admin` (Derived Class of `User`)**  
   - Additional Method:  
     - `delete_user(user: User) -> str`: Returns `"User <username> deleted"` if the admin successfully deletes a user.  

3. **`Guest` (Derived Class of `User`)**  
   - Overrides `login()` to **always return `False`**, since guests cannot log in.  

---

### **🚀 Example 1: Successful Admin Login and User Deletion**  
#### **Input:**  
```python
admin = Admin("admin123", "securePass")
print(admin.login("securePass"))  

user1 = User("john_doe", "pass123")
print(admin.delete_user(user1))  
```
#### **Output:**  
```
True  
User john_doe deleted  
```

---

### **🚀 Example 2: Guest Login Attempt**  
#### **Input:**  
```python
guest = Guest("guest1", "guestPass")
print(guest.login("guestPass"))  
```
#### **Output:**  
```
False  
```

---

### **📝 Constraints**  
- `username` is a non-empty string (1 ≤ len(username) ≤ 100).  
- `password` is a non-empty string (1 ≤ len(password) ≤ 100).  
- `delete_user()` should only be available for `Admin` users.  

---


### **🎯 OOP Concepts Used**
✅ **Inheritance** → `Admin` and `Guest` inherit from `User`.  
✅ **Encapsulation** → `password` is private (`__password`).  
✅ **Polymorphism** → `Guest` overrides `login()` with different behavior.  

---

### **📌 How to Run?**
1. Clone this repository:  
   ```sh
   git clone https://github.com/your-username/auth-system.git
   ```
2. Navigate to the directory:  
   ```sh
   cd auth-system
   ```
3. Run the script:  
   ```sh
   python auth_system.py
   ```

---



---


