
Setting Up the Backend with MySQL (XAMPP) and Running the Web App

Step 1: Start XAMPP Services
Open XAMPP Control Panel.
Start the following services:
Apache (must run on port 80).
MySQL (must run on port 3306).

Step 2: Create the Database
Click Admin on MySQL in XAMPP, which opens phpMyAdmin in your browser.
In phpMyAdmin, create a new database named: testuser

Step 3: Run the Backend (Spring Boot)
Start the Spring Boot backend application.
The application will automatically create a User table in the testuser database.
Open phpMyAdmin to confirm that the User table has been created successfully.

Step 4: Run the Angular Frontend
Navigate to the CRUD-WEB-APP folder in the terminal.
Install dependencies (if not installed yet run npm install)
Start the Angular application: ng serve

Step 5: Access the Web App
Open a browser and go to: http://localhost:4200

The system is now ready for use. 
