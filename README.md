# Employee-CRUD

__Description__
* Main objective of this project was to programm a web application for employees data management, including all CRUD features, stylized with Bootstrap
* It was created based on the Spring REST architecture using the Spring Boot Initializer for quick project setup
* Spring REST automatically supports data conversion from the Database to the JSON format, with the help of Jackson
* Spring Security was added to the application to simulate logging into the system, the data is encrypted with the bCrypt function
* Statistics logging was added based on the AOP paradigm for selected methods, both before and after execution

## Important files

* ThymeleafdemoApplication.java -> main class to launch app with help of Spring Boot  
    _src/main/java/com/luv2code/springboot/thymeleafdemo/ThymeleafdemoApplication.java_
* EmployeeController.java -> main controller, maps all apps features  
    _src/main/java/com/luv2code/springboot/thymeleafdemo/controller/EmployeeController.java_
* EmployeeRepository.java -> class which extends JPA Repo, replace standard DAO class
    _src/main/java/com/luv2code/springboot/thymeleafdemo/dao/EmployeeRepository.java_
* Employee.java -> main entity class, mapps DB columns to fields by annotating them
    _src/main/java/com/luv2code/springboot/thymeleafdemo/entity/Employee.java_
* EmployeeService.java -> service interface, declares methods which later will become apps features
    _src/main/java/com/luv2code/springboot/thymeleafdemo/service/EmployeeService.java_
* EmployeeServiceImpl.java -> service implementation class, it uses JPA Repo methods to perform operations on DB
    _src/main/java/com/luv2code/springboot/thymeleafdemo/service/EmployeeServiceImpl.java_
* employee-form.html -> thymeleaf template for adding new employee  
    _target/classes/templates/employees/employee-form.html_
* list-employees.html -> thymeleaf template for main page, table and action buttons  
    _target/classes/templates/employees/list-employees.html_
* application.properties -> properties for SQL connection  
    _target/classes/application.properties_
* pom.xml -> POM file for Maven Repo  
    _pom.xml_

### Other files are vendors data, supplied or found for this project purpose
