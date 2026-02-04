# WM-Finals Datenbankprojekt

Dieses Projekt ist ein **Java-Maven-Projekt** das alle FIFA-Weltmeisterschafts-Finals von 1930 bis 2022 verwaltet.  
Es verwendet eine **MariaDB-Datenbank** in **3. Normalform**.

---

## Features
- Datenbank mit allen WM-Finals (Datum, Ort, Teams, Ergebnis, Elfmeterschießen)
- Struktur in **3NF**:
    - `country` (Länder)
    - `match` (Spiele)
    - `match_team` (Teams pro Spiel)
- CRUD-Operationen über Repository
- Service-Schicht für komplexe Abfragen


---


## Technologien
- **Java 23**
- **Maven**
- **MariaDB** (über HeidiSQL verwaltet)
- **JDBC**
- **Spring**

---