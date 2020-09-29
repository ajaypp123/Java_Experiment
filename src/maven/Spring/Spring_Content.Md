### Web Framework
- Struts Jsp

### Spring Introduction
- Spring framework support all type of application.
- Stand alone, Distributed, Web, Database Applications.
- It support multiple application as it is modularized(layered) support.

## Basic Content

1. Introduction
    - Framework
    - Type of Framework

2. Core Module
    - Spring Framework
    - IOC (Inversion of container)
    - Bean Creation
    - Bean Life Cycle
    - Wire Bean
    - Container Module
        - Bean Factory
        - ApplicationControl

3. JDBC/DAO (Inexact with Database)
    - Spring framework abstracted Some DB Operation and provided Template
        ```
        jdbcTemplate.execute("select * from table")
        ```
    - It abstract Boiler(common) plane code

4. Spring ORM Module
    - For Hibernet we need to do
        - POJO class, mapping, configuration, test application
    - For Hibenet need to do much for perfrom operation
        ```
        # Create Configuration Object
        Configuration cfg = new Configuration()
        cfg.configure()

        # Create Session Factory
        SessionFactory sf = cfg.buildSessionFactory()

        # Create Session object
        Session s = sf.openSession()

        # Create Transition Object
        Transaction tx = s.begin.Transaction()

        # Perform DB Operation
        k_val = s.save(emp);

        # commit
        tx.commit()
        ```
    - Spring Provide HibernateTemplate
        ```
        hibernateTemplate.save(emp)
        ```

5. Spring AOP (Aspect Oriented Programing)
    - Inject Some service with bushiness logic
        ```
        # Bushiness Logic Application
            m1()
            m2()
            m3()
            m4()

        # Suppose m1, m2 service need auth and m3, m4 need traction
        AOP help to inject auth and other module in service
        ```

6. Spring Transaction
    - It provide DB and Hipernete Trasection with multiple check

7. Spring Web Module
    - Plane Web (Generic Web)
        - Integrate Other framework with spring framework
    - Web MVC
        - Similar to Struts, JSP

8. Spring Security Module

#  Tools
MAVEN
LOG4J
JUNIT

# Advance Content
1. Spring Boot
2. Spring JPA
3. Spring Data-JPA
4. Spring Cloud
5. Spring Micro Service
6. Spring Social
