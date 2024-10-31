# Advantis Dental Surgeries (ADS) System

## Overview

Advantis Dental Surgeries (ADS) is a comprehensive web-based application designed to streamline dental surgery operations. The system provides a centralized platform for office managers to efficiently manage dentists, patients, and appointments across multiple dental surgeries. Built with modern technologies and best practices, ADS ensures reliable and secure management of dental practice operations.

## Core Features

### User Management
- **Office Manager Portal**
  - Complete administrative control over the system
  - Management of dentists, patients, and surgeries
  - Comprehensive appointment scheduling and oversight
  - Access to billing and financial reports

- **Dentist Management**
  - Registration and profile management for dental professionals
  - Unique ID assignment for each dentist
  - Specialization and qualification tracking
  - Contact information management (phone, email)
  - Weekly appointment limit enforcement (max 5 appointments)

- **Patient Management**
  - Detailed patient enrollment system
  - Personal information tracking (name, DOB, contact details)
  - Medical history records
  - Billing status monitoring
  - Appointment history tracking

### Appointment System
- **Scheduling Features**
  - Real-time availability checking
  - Conflict prevention
  - Automated validation of:
    - Patient billing status
    - Dentist weekly appointment limits
    - Surgery operating hours
  - Appointment modification and cancellation
  - Email notifications for appointments

### Surgery Management
- **Location Management**
  - Multiple surgery location support
  - Surgery details tracking (address, contact information)
  - Operating hours management
  - Resource allocation

## Technical Stack

### Backend Technologies
- **Java 17**
  - Latest LTS version
  - Modern language features
  - Enhanced security and performance

- **Spring Boot 3.0.0**
  - REST API implementation
  - Dependency injection
  - Security framework
  - Database integration

### Development Tools
- **Maven**
  - Dependency management
  - Build automation
  - Project lifecycle management

- **Lombok**
  - Boilerplate code reduction
  - Clean code maintenance
  - Enhanced developer productivity

### Testing Framework
- **JUnit**
  - Unit testing
  - Integration testing
  - Test automation

## Installation Guide

### System Requirements
- JDK 17 or higher
- Maven 3.6+ 
- Minimum 4GB RAM
- 2GB available disk space

### Development Setup

1. **Install Prerequisites**
   ```bash
   # Verify Java installation
   java -version
   
   # Verify Maven installation
   mvn -version
   ```

2. **Clone Repository**
   ```bash
   git clone https://github.com/mucahitkayadan/Advantis_Dental_Surgeries.git
   cd ads-dental-system
   ```

3. **Build Project**
   ```bash
   mvn clean install
   ```

4. **Run Application**
   ```bash
   mvn spring-boot:run
   ```

### IDE Setup (IntelliJ IDEA Recommended)
1. Install Lombok plugin
2. Enable annotation processing
3. Import as Maven project
4. Configure Java 17 SDK

## Project Structure

- **src/main/java/com/ads**: Contains the main application and service classes.
- **src/main/java/com/ads/entities**: Contains entity classes for Dentist, Patient, Appointment, and Surgery.
- **src/main/resources**: Contains application configuration files.
- **pom.xml**: Maven configuration file.

## Usage

1. **Register a Dentist**: Use the `OfficeManagerService` to register a new dentist.
2. **Enroll a Patient**: Use the `OfficeManagerService` to enroll a new patient.
3. **Book an Appointment**: Use the `OfficeManagerService` to book an appointment for a patient with a dentist.
4. **View Appointments**: Dentists and patients can view their scheduled appointments.
5. **Cancel an Appointment**: Use the `OfficeManagerService` to cancel an appointment.

## Class Diagram

[![](https://mermaid.ink/img/pako:eNrNVE1vwyAM_SuI06a1f4DDpFa9rp3UHXOh4CSoBDI-NnVV__ugJRUZyXYdhwT8nmz8bHPGTHPABDNJrd0I2hjaVQqFdbWgXV0LBi9U0QYMOt-guJ4MNMI6MBtQLmweHjMMlNFSvlInAjhCDlofV32vhXJdhl0qlUdNPkfx9s4I1SDBS1stjHVb2kEJBXczSN9qBVvfHcCUIHRUyNJse2CCSvEVMtMqwz8EfGZp2Zm8kiL_Lq9oDf8V5waszfANdYB4-OzqtTCuHdX_3YN1E8X8VZEryKhiIP_ug4wx0ux-rcz2JjpATowkYVoFDbsZ73tvQlOfpqqhJqWlhT5zmv-ItBYy6juKxFpgx5131lHFAxg5xUXH47dcPt9Hg6BhAO0cdeg2gm7zOEvMZSYojmiiDh5KUqr-BG_IlaBrhokxXLv0FBslkXIgEocCESQ1SyOHF7gDExqWh1frqmeFXQuhXJiELYeaeukqXKlLoFLv9P6kGCbOeFhgo33TYlJTacPJ97GH0qt3o1y-AdoZlug?type=png)](https://mermaid.live/edit#pako:eNrNVE1vwyAM_SuI06a1f4DDpFa9rp3UHXOh4CSoBDI-NnVV__ugJRUZyXYdhwT8nmz8bHPGTHPABDNJrd0I2hjaVQqFdbWgXV0LBi9U0QYMOt-guJ4MNMI6MBtQLmweHjMMlNFSvlInAjhCDlofV32vhXJdhl0qlUdNPkfx9s4I1SDBS1stjHVb2kEJBXczSN9qBVvfHcCUIHRUyNJse2CCSvEVMtMqwz8EfGZp2Zm8kiL_Lq9oDf8V5waszfANdYB4-OzqtTCuHdX_3YN1E8X8VZEryKhiIP_ug4wx0ux-rcz2JjpATowkYVoFDbsZ73tvQlOfpqqhJqWlhT5zmv-ItBYy6juKxFpgx5131lHFAxg5xUXH47dcPt9Hg6BhAO0cdeg2gm7zOEvMZSYojmiiDh5KUqr-BG_IlaBrhokxXLv0FBslkXIgEocCESQ1SyOHF7gDExqWh1frqmeFXQuhXJiELYeaeukqXKlLoFLv9P6kGCbOeFhgo33TYlJTacPJ97GH0qt3o1y-AdoZlug)

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or support, please contact [mujakayadan@outlook.com](mailto:mujakayadan@outlook.com).
