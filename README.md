# Calculator
#  Java Calculator (Swing GUI)

 Project Overview

This project is a desktop calculator application.
It performs basic arithmetic operations and provides a clean graphical user interface similar to a real calculator.
<br>
The goal of this project was to understand:
<br>
* GUI development in Java
* Event handling
* State management in applications

---
<br>
 Features
<br>
* Basic operations: `+`, `-`, `*`, `/`

* Percentage calculation

* Decimal number support

* Clear (`C`) and All Clear (`AC`) functionality

* Error handling (e.g., division by zero)

* Clean and responsive UI using GridLayout

* Continuous (chained) calculations

---
<br>
 🛠️ Technologies Used
<br>
<br>

* Java

* Swing (GUI framework)

* AWT (for layouts and styling)


---
<br>

⚙️ How It Works
<br>

### 1. UI Design
<br>

* Used `JFrame` as the main window

* `JTextField` as the display

* `JPanel` with `GridLayout` to arrange buttons in a calculator format

---
<br>
2. Event Handling
<br>
Each button is connected using `ActionListener`.
<br>
<br>Instead of writing separate logic for every button, a **central method (`handleInput`)** is used to process all inputs.

---
<br>
3. State Management
<br>
The calculator maintains internal state using:
<br>
* `result` → stores current calculated value

* `operator` → stores the selected operation

* `startNewNumber` → controls whether to overwrite or append input

This allows smooth chained calculations like:

```
2 + 3 * 4
```

---
<br>

4. Calculation Logic
<br>

A separate method handles all operations:
<br>

* Addition

* Subtraction


* Multiplication

* Division (with zero check)

* Percentage

---

##  Challenges Faced
<br>

### 1. Handling Continuous Calculations
<br>

* Problem: Managing multiple operations step-by-step

* Solution: Introduced `result` and `operator` to store intermediate states

---
<br>

### 2. Input Validation
<br>
<br>

* Problem: App crashes on invalid input (e.g., multiple decimals)

* Solution:


  * Prevent multiple `.` in a number
   
  * Use `try-catch` for safe parsing

<br><br>

### 3. UI Styling Issues
<br>
* Problem: Button colors not appearing correctly

* Solution:
  * Used `setOpaque(true)`

  * Disabled border painting
<br>
<br>
<br>

### 4. Differentiating `C` and `AC`
<br>
* Problem: Both initially performed the same function

* Solution:

  * `C` clears current input

  * `AC` resets entire calculator state

<br>
<br>

### 5. Division by Zero
<br>
* Problem: Application crash or invalid result

* Solution:

  * Added check to display `"Error"`

<br>
<br>

# Future Improvements
<br>
<br>
<br>
* Add keyboard input support

* Implement operator precedence (BODMAS)

* Add calculation history panel

* Improve UI design (modern styling)

* Extend to scientific calculator functions


---
<br>
<br>
#  Conclusion
<br>
<br>
This project helped in understanding how real-world applications manage:
<br>
<br>

* User input

* Internal state

* Error handling

* UI interactions

<br>
It serves as a strong foundation for building more advanced GUI applications in Java.

