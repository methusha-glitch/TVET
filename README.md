# TVET Guide Management System

A desktop application built with **Java Swing**, **NetBeans**, and **MySQL** to manage TVET (Technical and Vocational Education and Training) information. The current implementation provides a login screen and management modules for training centres, courses, teachers, teacher-course assignments, and course training plans.
//...........
## Features

- **Login**
  - Username and password verification against the MySQL `admin` table.
  - The `VTA` institution option is implemented. Other institution options (`DIET`, `NAITA`, and `NYCS`) currently display a message that their management systems are not available yet.
- **Training Centre Management**
  - Register, view, update, search, and delete training-centre records.
  - Stores registration number, centre name, address, contact number, GPS location, and district.
- **Course Management**
  - Add, view, update, search, and delete courses.
  - Course details include course name/code, sector, entry qualification, type, mode, language, duration, and fee.
- **Teacher Management**
  - Add, view, update, search, and delete teacher records.
  - Stores teacher ID, name, NIC, and associated training centre.
- **Teacher-Course Registration**
  - Assign courses to teachers and manage those assignments.
- **Training Plan Management**
  - Create, view, search, and delete planned course batches by training centre, course, year, start month, and intake capacity.
- **Dashboard**
  - Displays summary counts for training centres, courses, teachers, and training plans.

## Technology Stack

- **Language:** Java
- **GUI:** Java Swing (NetBeans GUI Builder forms)
- **Database:** MySQL
- **Database connectivity:** MySQL Connector/J
- **IDE/build system:** Apache NetBeans project with Ant
- **Main class:** `Frames.Login`

## Project Structure

```text
TVETMain/
├── src/
│   ├── Classes/
│   │   ├── CenterController.java
│   │   ├── Courseregister.java
│   │   ├── DbConnection.java
│   │   ├── TeacherCourse.java
│   │   ├── TeacherManegement.java
│   │   └── TrainingPlane.java
│   ├── Frames/
│   │   ├── Login.java
│   │   ├── Login.form
│   │   ├── TVET.java
│   │   └── TVET.form
│   └── Images/
│       └── OIP.webp
├── nbproject/
├── build.xml
└── manifest.mf
```

## Requirements

- Apache NetBeans
- A compatible JDK. The current NetBeans project properties specify Java source/target level **25**, so use a JDK that supports Java 25 or update the project language level to match your installed JDK.
- MySQL Server
- MySQL Connector/J
- A MySQL database named `tvet` with the tables and columns described below

## Database Setup

The application connects to a local MySQL database using this JDBC URL:

```text
jdbc:mysql://localhost:3306/tvet?useSSL=false
```

The connection settings are currently defined in `src/Classes/DbConnection.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/tvet?useSSL=false";
private static final String USER = "root";
private static final String PASSWORD = "";
```

Update these values to match your local MySQL configuration. **Do not use real passwords or publish database credentials in a public repository.** Prefer environment variables or a configuration file excluded from version control.

The source code expects these tables and fields:

- `admin`: `user_name`, `password`
- `training_centers`: `Registration_No`, `Center_Name`, `Address`, `Contact_No`, `GPS_Location`, `District`
- `courses`: `id`, `course_name`, `course_code`, `sector`, `entry_qualification`, `type`, `mode`, `language`, `duration`, `course_fee`
- `teachers`: `id`, `teacher_id`, `teacher_name`, `nic`, `center_name`
- `teacher_course`: `id`, `teacher_id`, `course_code`
- `course_planner`: `center_name`, `course_name`, `year`, `start_month`, `intake_capacity`

The ZIP currently does **not** include a database export or SQL schema file. Create/import the `tvet` database and these tables before running the application. Make sure the column names match the source code exactly.

## MySQL Connector/J Setup

The project currently references MySQL Connector/J through absolute Windows paths in `nbproject/project.properties`. These paths point to locations on the original development computer and will not work on another computer as-is.

1. Download/install MySQL Connector/J.
2. In NetBeans, open the project properties.
3. Add the Connector/J JAR to the project's Libraries/classpath.
4. Remove or replace the old absolute JAR references if NetBeans still reports a missing library.

## Run the Application

1. Clone or download this repository.
2. Open the project folder `TVETMain` in Apache NetBeans.
3. Configure the MySQL database and create the required tables.
4. Add MySQL Connector/J to the project classpath.
5. Update the database connection settings in `DbConnection.java`.
6. Build the project and run `Frames.Login`.

A valid account must exist in the `admin` table. The login code compares the entered password with the value stored in that table; the current implementation does not hash passwords.

## Notes / Current Limitations

- The repository does not currently contain a database creation script or sample database.
- MySQL Connector/J is referenced using machine-specific absolute paths and should be configured locally.
- Only the `VTA` institution option currently proceeds to the TVET management window.
- Passwords are currently checked as plain text. For a real deployment, use password hashing and stronger authentication practices.
- Review and test database validation and CRUD operations before using the application with important data.

## Contributing

Suggestions, bug reports, and improvements are welcome. For significant changes, create a branch and submit a pull request.

## License

No license file is currently included. Unless a license is added, reuse and redistribution permissions are not explicitly granted.
