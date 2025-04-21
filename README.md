# Mini Paint 🎨

A simple Java Swing-based painting application developed as part of **Lab 6 - Programming II (Fall 2024/2025)** at Alexandria University, Faculty of Engineering.

## 📋 Overview

Mini Paint is a basic drawing tool that allows users to create and manipulate geometric shapes. This application demonstrates Object-Oriented Programming principles such as **inheritance** and **polymorphism**, and includes a graphical user interface (GUI) built using **Java Swing**.

## 💡 Features

- Draw basic shapes:
  - Circle
  - Rectangle
  - Square
  - Line Segment
- Colorize any shape.
- Delete any drawn shape.
- Use a drop-down menu to select and manipulate shapes by unique IDs (e.g., `circle01`, `square04`).
- Dialog boxes for inputting shape properties (position, radius, length, etc.).
- Button-based shape creation (no cursor drawing required).

## 🧱 Object-Oriented Design

The project follows OOP principles and includes:
- An interface-based structure to support different shape types.
- Use of inheritance and polymorphism for extensibility and maintainability.
- A UML class diagram describing the system design (included in the repository).

## 🖥 GUI

Built with **Java Swing**, the GUI allows for intuitive shape selection, creation, and modification. The design focuses on ease of use without relying on cursor-based drawing.

## 🗂 Project Structure

```
MiniPaint/
├── src/
│   ├── shapes/                # Shape classes and interfaces
│   ├── gui/                   # GUI components
│   └── main/                  # Main application launcher
├── UML_Diagram.png            # UML class diagram
└── README.md                  # Project documentation
```
