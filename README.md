**A Simple SpringBoot Application for Crud operations with Java and MySQL.**

start with creating a schema in MySQL with any name of your choice. query: Create schema schema_name;


`visit [https://start.spring.io](url)

select java as language

Project as Maven

select any springboot version(Avoid snapshot version)

Enter approprite project metadata as per your choice.

select the packaging type of your choice(Jar/War)

Select the java version that you want to use.

On the right side, click on add dependencies. On the top type the "spring web" and select it to add spring web dependency, repeat it for spring data jpa and MySQL Driver

Click on "Generate", a zip file would be downloaded, extract that zip file in your desired folder and then open it with your favourite IDE.

Now, configure the application.properties file in resources folder with the following details

server.port= enter the port you want to run your application on, Default is 8080 for Apache Tomcat server.

spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://localhost:3306/emp

spring.datasource.username= "your database username"

spring.datasource.password= "your database password"

spring.datasource.driver-class-name=com.mysql.jdbc.Driver

spring.jpa.show-sql= true

![image](https://github.com/akhil755/AkhilReddy-java/assets/67901532/6f558abb-bafc-4f3d-b691-35cb4a1f087e)


Right click on main package and create subpackages as Entity, Service, Repository and Controller.
![image](https://github.com/akhil755/AkhilReddy-java/assets/67901532/dbc587b8-7001-4885-bad1-7cb51fcd2e6c)



Inside these subpackages create Interfaces and/or classes as per your requirement. 
