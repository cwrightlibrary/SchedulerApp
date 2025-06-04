# Scheduler App

📚 An app developed to automatically generate a daily schedule for use at the library

## Features

### 📅 Schedule Management
- **Time-based scheduling** across 6 time slots (9-11, 11-1, 1-2, 2-4, 4-6, 6-8)
- **Multiple service points** including pick-up window, floor lead, and service points 1 & 2
- **Template-based scheduling** that automatically populates based on selected date
- **Real-time schedule adjustments** for programs and meetings

### 🔧 Smart Automation
- **CSV template integration** for automatic daily schedule generation
- **Employee data management** with work hours and lunch schedules
- **Intelligent conflict resolution** that moves employees and adjusts lunch times
- **Dynamic staff reallocation** when employees are removed for meetings/programs

### 📊 Data Management
- Import employee information from CSV files
- Template-based schedule generation
- Persistent schedule storage and retrieval

## Technology Stack

- **Language**: Java
- **GUI Framework**: Swing
- **Data Format**: CSV files
- **Build Tool**: Maven (recommended) or Gradle

## Installation

### Prerequisites
- Java 8 or higher
- Maven or Gradle (for building)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/daily-scheduling-app.git
   cd daily-scheduling-app
   ```

2. Build the project:
   ```bash
   # Using Maven
   mvn clean compile

   # Using Gradle
   gradle build
   ```

3. Run the application:
   ```bash
   # Using Maven
   mvn exec:java -Dexec.mainClass="com.yourcompany.scheduler.SchedulerApp"

   # Using Gradle
   gradle run
   ```

## Usage

### Setting Up Templates
1. Create a CSV file with your schedule template in the `templates/` directory
2. Format: `Position,9-11,11-1,1-2,2-4,4-6,6-8`
3. Load the template through the application menu

### Managing Employee Data
1. Create an `employees.csv` file with the following format:
   ```csv
   Name,Position,Monday_Start,Monday_End,Monday_Lunch_Start,Monday_Lunch_End,Tuesday_Start,...
   John Doe,Floor Lead,09:00,17:00,12:00,13:00,09:00,17:00,12:00,13:00,...
   ```
2. Import through **File > Import Employee Data**

### Creating Daily Schedules
1. **Select Date**: Choose the date for scheduling
2. **Load Template**: The app automatically applies the appropriate template
3. **Add Programs/Meetings**: Use the "Add Event" button to input special events
4. **Auto-Adjust**: The system will automatically:
   - Remove affected employees from their positions
   - Reassign lunch times to avoid conflicts
   - Suggest alternative staff arrangements

### Schedule Layout
The application manages a 6-column, 6-row schedule grid:

| Time Slot | 9-11 | 11-1 | 1-2 | 2-4 | 4-6 | 6-8 |
|-----------|------|------|-----|-----|-----|-----|
| Pick-up window | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |
| Floor lead | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |
| Service point 1 | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |
| Service point 1 | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |
| Service point 2 | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |
| Service point 2 | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned | Auto-assigned |

## File Structure

```
daily-scheduling-app/
├── src/
│   └── main/
│       └── java/
│           └── com/yourcompany/scheduler/
│               ├── SchedulerApp.java
│               ├── ui/
│               │   ├── MainFrame.java
│               │   ├── SchedulePanel.java
│               │   └── EventDialog.java
│               ├── model/
│               │   ├── Employee.java
│               │   ├── Schedule.java
│               │   └── TimeSlot.java
│               └── util/
│                   ├── CSVReader.java
│                   └── ScheduleManager.java
├── templates/
│   ├── monday_template.csv
│   ├── tuesday_template.csv
│   └── ...
├── data/
│   └── employees.csv
├── README.md
└── pom.xml (or build.gradle)
```

## Configuration

### Template CSV Format
```csv
Position,9-11,11-1,1-2,2-4,4-6,6-8
Pick-up window,John Doe,Jane Smith,Mike Johnson,Sarah Wilson,Tom Brown,Lisa Davis
Floor lead,Manager1,Manager2,Manager1,Manager2,Manager1,Manager2
...
```

### Employee CSV Format
```csv
Name,Position,Mon_Start,Mon_End,Mon_Lunch_Start,Mon_Lunch_End,Tue_Start,Tue_End,Tue_Lunch_Start,Tue_Lunch_End,...
John Doe,Service Rep,09:00,17:00,12:00,13:00,09:00,17:00,12:30,13:30,...
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Roadmap

- [ ] Multi-location support
- [ ] Export to PDF functionality
- [ ] Integration with calendar systems
- [ ] Mobile companion app
- [ ] Advanced reporting and analytics
- [ ] Shift swap request system

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

For support, email support@yourcompany.com or create an issue in the GitHub repository.

## Acknowledgments

- Built with Java Swing for cross-platform compatibility
- CSV parsing for flexible data management
- Inspired by modern workforce scheduling needs