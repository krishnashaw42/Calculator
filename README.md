# Calculator
# 🧮 Java Calculator (Swing GUI)

## Project Overview

This project is a desktop calculator application.
It performs basic arithmetic operations and provides a clean graphical user interface similar to a real calculator.
<br>
The goal of this project was to understand:
<br>
* GUI development in Java
<br>
* Event handling
<br>
* State management in applications
<br>
---
<br>
##  Features
<br>
* Basic operations: `+`, `-`, `*`, `/`
<br>
* Percentage calculation
<br>
* Decimal number support
<br>
* Clear (`C`) and All Clear (`AC`) functionality
<br>
* Error handling (e.g., division by zero)
<br>
* Clean and responsive UI using GridLayout
<br>
* Continuous (chained) calculations
<br>
---
<br>
## 🛠️ Technologies Used
<br>
<br>

* Java
<br>
* Swing (GUI framework)
<br>
* AWT (for layouts and styling)
<br>

---
<br>

## ⚙️ How It Works
<br>

### 1. UI Design
<br>

* Used `JFrame` as the main window
<br>
* `JTextField` as the display
<br>
* `JPanel` with `GridLayout` to arrange buttons in a calculator format
<br>
---
<br>
### 2. Event Handling
<br>
Each button is connected using `ActionListener`.
<br>
<br>Instead of writing separate logic for every button, a **central method (`handleInput`)** is used to process all inputs.
<br>
---
<br>
### 3. State Management
<br>
The calculator maintains internal state using:
<br>
* `result` → stores current calculated value
<br>
* `operator` → stores the selected operation
<br>
* `startNewNumber` → controls whether to overwrite or append input
<br>
This allows smooth chained calculations like:
<br>
```
2 + 3 * 4
```
<br>
---
<br>

### 4. Calculation Logic
<br>

A separate method handles all operations:
<br>

* Addition
<br>
* Subtraction
<br>

* Multiplication
<br>
* Division (with zero check)
<br>
* Percentage

---

##  Challenges Faced
<br>

### 1. Handling Continuous Calculations
<br>

* Problem: Managing multiple operations step-by-step
<br>
* Solution: Introduced `result` and `operator` to store intermediate states
<br>
---
<br>

### 2. Input Validation
<br>
<br>

* Problem: App crashes on invalid input (e.g., multiple decimals)
<br>
* Solution:
<br>
<br>

  * Prevent multiple `.` in a number
    <br>
  * Use `try-catch` for safe parsing
<br>
<br><br>

### 3. UI Styling Issues
<br>
* Problem: Button colors not appearing correctly
<br>
* Solution:
<br>
<br>
  * Used `setOpaque(true)`
  <br>
  * Disabled border painting
<br>
<br>
<br>

### 4. Differentiating `C` and `AC`
<br>
* Problem: Both initially performed the same function
<br>
* Solution:
<br>
  * `C` clears current input
  <br>
  * `AC` resets entire calculator state
<br>
<br>
<br>

### 5. Division by Zero
<br>
* Problem: Application crash or invalid result
<br>
* <br>
<br>
* Solution:
<br>
<br>

  * Added check to display `"Error"`
  <br>
<br>
<br>

## 📈 Future Improvements
<br>
<br>
<br>
* Add keyboard input support
<br>
* Implement operator precedence (BODMAS)
<br>
* Add calculation history panel
<br>
* Improve UI design (modern styling)
<br>
* Extend to scientific calculator functions
<br>
<br>
---
<br>
<br>
##  Conclusion
<br>
<br>
This project helped in understanding how real-world applications manage:
<br>
<br>

* User input
<br>
* Internal state
<br>
* Error handling
<br>
* UI interactions
<br>
<br>
It serves as a strong foundation for building more advanced GUI applications in Java.

