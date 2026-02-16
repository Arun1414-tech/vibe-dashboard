# ✨ The Vibe Dashboard

A mini full-stack assignment built to demonstrate clean backend architecture and a modern, polished frontend UI with strong “vibe coding” principles.

---

## 🚀 Tech Stack

### Backend
- Java 17
- Spring Boot 3
- REST API (in-memory data)
- Maven

### Frontend
- Next.js (App Router)
- TypeScript
- Tailwind CSS
- Glassmorphism UI
- Skeleton loaders & debounced search

---

## 📁 Project Structure

vibe-dashboard/
├── backend/    # Spring Boot REST API
├── frontend/   # Next.js + Tailwind UI
└── README.md   # Project documentation
---

## ▶️ Running the Project Locally

### 1️⃣ Run Backend (Spring Boot)

- cd backend
- ./mvnw spring-boot:run

Backend runs on:

http://localhost:8080

### 2️⃣ Run Frontend (Next.js)

- cd frontend
- npm install
- npm run dev

Frontend runs on:

http://localhost:3000


### ⚙️ Configuration

The frontend uses an environment variable for the backend API URL.

Create the following file in frontend/:

.env.local

NEXT_PUBLIC_API_URL=http://localhost:8080


### 🔍 Features Summary

- Single REST API with search support

- Clean backend layering (Controller, Service, Model)

- Modern responsive frontend

- Glassmorphism UI style

- Subtle animations and transitions

- Debounced search for performance

- Skeleton loading states

- Clear separation of backend and frontend concerns


### 🧠 Design Decisions

- Focused on simplicity and clarity over feature bloat

- Used in-memory data to keep the task lightweight

- Prioritized UI polish and interaction quality

- Avoided unnecessary frameworks and complexity

- Ensured the project can be understood and run quickly by reviewers


### 📌 Notes

This project was built as a technical bridge task to demonstrate
full-stack thinking, clean code, and attention to UI/UX details.