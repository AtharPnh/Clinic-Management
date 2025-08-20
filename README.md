# Clinic Management System

A comprehensive Java-based desktop application for managing clinic operations, including patient records, doctor management, staff administration, and appointment scheduling.

## Overview

The Clinic Management System is a desktop application built with Java Swing that provides a complete solution for managing a medical clinic. The system handles various aspects of clinic operations including user management, patient records, doctor information, staff administration, and section management.

## Features

### User Management
- **User Registration & Login**: Secure authentication system
- **Role-based Access**: Different interfaces for Managers, Doctors, Secretaries, and Patients
- **User Profile Management**: Add, edit, and manage user information

### Staff Management
- **Manager Management**: Add, edit, and manage clinic managers
- **Doctor Management**: Comprehensive doctor profiles and information
- **Secretary Management**: Administrative staff management
- **Salary Management**: Track and manage staff salaries

### Patient Management
- **Patient Registration**: Complete patient information management
- **Patient Records**: Store and retrieve patient medical information
- **Patient Search**: Quick access to patient records

### Section Management
- **Department Management**: Organize clinic into different sections/departments
- **Section Assignment**: Assign staff to specific sections

### Data Management
- **File-based Storage**: Uses text files for data persistence
- **CRUD Operations**: Complete Create, Read, Update, Delete functionality
- **Data Backup**: Automatic file creation and data management

## Technology Stack

- **Language**: Java 17
- **GUI Framework**: Java Swing
- **Build Tool**: Maven
- **IDE**: NetBeans (compatible)
- **Data Storage**: Text files (.txt)

## Prerequisites

Before running this application, make sure you have the following installed:

- **Java Development Kit (JDK) 17** or higher
- **Maven** (for building the project)
- **NetBeans IDE** (optional, for development)

## Installation & Setup

### Method 1: Using Maven

1. **Clone or download the project**
   ```bash
   git clone https://github.com/AtharPnh/Clinic-Management
   cd Clinic-Management
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the application**
   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.clinicmanagement.ClinicManagement"
   ```

### Method 2: Using NetBeans IDE

1. **Open NetBeans IDE**
2. **Open Project**: File → Open Project → Select the project folder
3. **Build Project**: Right-click project → Clean and Build
4. **Run Project**: Right-click project → Run

### Method 3: Direct Java Execution

1. **Navigate to the project directory**
2. **Compile the project**
   ```bash
   javac -cp "src/main/java" src/main/java/clinicmanagement/*.java src/main/java/clinicmanagement/*/*.java
   ```
3. **Run the application**
   ```bash
   java -cp "src/main/java" clinicmanagement.ClinicManagement
   ```

## Project Structure

```
Clinic-Management/
├── src/
│   └── main/
│       └── java/
│           └── clinicmanagement/
│               ├── GUI/                    # User interface components
│               │   ├── StartPage.java      # Main entry point UI
│               │   ├── LogInPage.java      # Login interface
│               │   ├── RegisterForm.java   # Registration interface
│               │   ├── ManagerForm.java    # Manager dashboard
│               │   ├── DoctorForm.java     # Doctor interface
│               │   ├── PatientForm.java    # Patient interface
│               │   └── MenuPage.java       # Navigation menu
│               ├── add/                    # Add new records forms
│               │   ├── AddNewManager.java
│               │   ├── AddNewDoctor.java
│               │   ├── AddNewSecretary.java
│               │   ├── AddNewPatient.java
│               │   └── AddNewSection.java
│               ├── manage/                 # Data management classes
│               │   ├── ManageUsers.java
│               │   ├── ManageDoctors.java
│               │   ├── ManagePatients.java
│               │   ├── ManageManagers.java
│               │   ├── ManageSecretarys.java
│               │   ├── ManageSections.java
│               │   └── ManageSalaries.java
│               ├── identities/             # Data model classes
│               │   ├── User.java
│               │   ├── Doctor.java
│               │   ├── Patient.java
│               │   ├── Manager.java
│               │   ├── Secretary.java
│               │   ├── Section.java
│               │   └── Clinic.java
│               ├── commons/                # Utility classes
│               │   ├── TxtFileManager.java # File operations
│               │   └── Commons.java        # Common utilities
│               ├── ClinicManagement.java   # Main application class
│               └── Services.java           # Service layer
├── Images/                                 # Application images
├── target/                                 # Compiled classes
├── pom.xml                                 # Maven configuration
└── README.md                               # This file
```

## Usage

### Starting the Application

1. **Launch the application** using any of the installation methods above
2. **Start Page** appears with two options:
   - **ثبت نام** (Register): For new user registration
   - **ورود** (Login): For existing user login

### User Registration

1. Click **ثبت نام** (Register) button
2. Fill in the required information:
   - Personal details
   - Contact information
   - Role selection (Manager/Doctor/Secretary/Patient)
3. Submit the registration form

### User Login

1. Click **ورود** (Login) button
2. Enter your credentials
3. Select your role
4. Access your personalized dashboard

### Role-based Features

#### Manager Dashboard
- Manage all clinic operations
- Add/Edit staff members
- View reports and statistics
- Manage sections and departments

#### Doctor Interface
- View assigned patients
- Access patient records
- Manage appointments

#### Secretary Interface
- Patient registration
- Appointment scheduling
- Administrative tasks

#### Patient Interface
- View personal information
- Access medical records
- Schedule appointments

## Data Files

The application uses the following text files for data storage:

- `Managers.txt` - Manager information
- `Doctors.txt` - Doctor records
- `Secretarys.txt` - Secretary data
- `Users.txt` - User accounts
- `Patients.txt` - Patient records
- `Sections.txt` - Department/section data
- `Salaries.txt` - Salary information

## 🔧 Configuration

### Java Version
The project is configured to use Java 17. You can modify the Java version in `pom.xml`:

```xml
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>
```

### Main Class
The main class is configured in `pom.xml`:

```xml
<exec.mainClass>com.mycompany.clinicmanagement.ClinicManagement</exec.mainClass>
```


### Common Issues

1. **Java Version Error**
   - Ensure you have Java 17 or higher installed
   - Check your JAVA_HOME environment variable

2. **Maven Build Errors**
   - Clean the project: `mvn clean`
   - Update Maven dependencies: `mvn dependency:resolve`

3. **File Permission Errors**
   - Ensure the application has write permissions in the project directory
   - Check if data files are not locked by other processes

4. **GUI Display Issues**
   - Ensure your system supports Java Swing
   - Check display resolution and scaling settings

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request


## Development

### Adding New Features

1. **Create new GUI forms** in the `GUI` package
2. **Add data models** in the `identities` package
3. **Implement management logic** in the `manage` package
4. **Update file operations** in `TxtFileManager` if needed

### Code Style

- Follow Java naming conventions
- Use meaningful variable and method names
- Add comments for complex logic
- Maintain consistent indentation

---

**Note**: This application is designed for Persian/Farsi language support and includes right-to-left (RTL) text display capabilities. 
