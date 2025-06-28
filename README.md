# Restaurant Queue Management System

A Java-based queue management system for restaurants using Single Linked List data structure.

## Overview

This project implements a FIFO (First In First Out) queue system to manage customer waiting lists in a restaurant. It demonstrates Object-Oriented Programming concepts and efficient data structure usage.

## Features

- **Add Customer to Queue** - New customers are added to the end of the queue
- **Serve Customer** - Customers are served from the front of the queue (FIFO)
- **Display Queue** - View all customers currently waiting with their details
- **Automatic Queue Numbering** - Each customer gets a unique queue number
- **Arrival Time Tracking** - Records when each customer joined the queue

## Project Structure

```
Restaurant/
├── src/
│   ├── Main.java              # Main program with interactive menu
│   ├── Customer.java          # Customer entity class
│   ├── Node.java              # Generic node for linked list
│   └── SingleLinkedList.java  # Queue implementation
└── README.md
```

## Classes Description

### Customer
- Stores customer information (name, queue number, arrival time)
- Auto-generates unique queue numbers using static counter
- Formats arrival time for display

### Node
- Generic node implementation for the linked list
- Stores Customer objects and reference to next node

### SingleLinkedList
- Implements queue operations using linked list
- Methods:
  - `push()` - Add customer to queue end
  - `pop()` - Remove and serve customer from queue front
  - `display()` - Show formatted queue with all customers
  - `isEmpty()` - Check if queue is empty
  - `getSize()` - Get number of customers in queue

### Main
- Interactive menu-driven interface
- Options to add customers, serve customers, display queue, and exit

## How to Run

1. Compile all Java files:
   ```bash
   javac src/*.java
   ```

2. Run the main program:
   ```bash
   java -cp src Main
   ```

## Usage Example

```
===== MENU ANTRIAN RESTORAN =====
1. Tambah Pelanggan ke Antrian
2. Layani Pelanggan
3. Tampilkan Antrian
4. Keluar
Pilih menu (1-4): 1

Masukkan nama pelanggan: Ahmad
Pelanggan Ahmad berhasil ditambahkan ke antrian!

===== ANTRIAN RESTORAN =====
[1] Ahmad - Waktu kedatangan: 10:30:45
=============================
Total pelanggan dalam antrian: 1
```

## Implementation Details

- **Data Structure**: Single Linked List with head and tail pointers
- **Time Complexity**:
  - Push (enqueue): O(1)
  - Pop (dequeue): O(1)
  - Display: O(n)
- **Space Complexity**: O(n) where n is number of customers

## Requirements

- Java 8 or higher
- No external dependencies required