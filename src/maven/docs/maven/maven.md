# Maven
1. Introduction
2. POM File
3. Arche Type
4. Step

# Introduction
  - Maven is Build project management tool.
  - Maven write/read configuration from pom.xml and provide output on console.
  - Perform
    - Dir Structure
    - Download Required jar library
    - Compile Source code
    - Compile/Unit Test
    - Packaging Application (jar or war files)
    - Run Application
    - Start Server
    - Deploy Application
    - Prepare Reports and Document
    - Undeployment of application
    - Stop Server

# POM (Project Object Model) (pom.xml)
  - Project Configuration detail are existed here like dependencies, repositories.
  - pom.xml keep configuration of project which read/write by maven to perform operation.
  - Content
    1. Project Description
      - description, version, jar/war
      ```
      <project...>
        <!-- Project Description -->
        <modelVersion>3.0.0</modelVersion> // maven version
        <groupID>com.pkg.banking</groupID> // unique id (package name) for orgenization
        <artifactId>icici.account</artifactId> // application name
        <description> ... </description>
        <packaging>jar/war/ear</packaging>
        ....
      </project>
      ```
    2. Repository
      - Repository is place from where it get jar files
      - Locations of repository are in:
        - Local (In system)
        - Central (Default repository in maven provided on internet. https://repo.maven.apache.org/maven2/)
        - Remote (Third party like JBoss nexus, mvnrepository)
      - We can create Repository using cli.
      ```
      <project>
        ....
        <repositories>
          <repository>
            <id>jboss</id>
            <name>jboss</name>
            <url>https://....</url>
          <repositories>
        <repository>
        ....
      <project>
      ```

    3. Dependency Management
      - Maven download jar and keep in project, Here we can specify dependencies for jar files.
      - Maven also download internal dependency.
      - Scope:
        1. compile: compile and execute time
        2. provided: compilation, testing but not in runtime
        3. runtime: runtime and test cases but not during compilation
        4. test: only for test case
        5. system: it will not install dependency of dependency
        6. import: for some parent/child pom.xml we can have multiple pom.
      ```
      <project>
        ....
        # hibernet-core-2.4.6-Final.jar
        <dependencies>
          <dependency>
            <groupID>org.hibernet</groupID>
            <artifactId>hebernet-core</artifactId>
            <version>2.4.6</version>
            <scope>provided</scope>
          </dependency>
        </dependencies>
        ....
      </project>
      ```

    4. Project Inheritance
      - It used to extend pom.xml mean get detail from one pom to other pom.
      - we can make hierarchy of pom files.
      - Maven first fetch for parent form if not available it pick for child pom.xml
      - child pom available in module dir.
      - Effective POM = parent pom + current application pom.
      ```
      # Parent pom
      <project...>
        <modelVersion>3.0.0</modelVersion>
        <groupID>com.pkg.banking</groupID>
        <artifactId>parent</artifactId>
        <description> ... </description>
        <packaging>jar/war/ear</packaging>
      </project>

      # Child pom
      <project...>
        <parent>
          <groupID>com.pkg.banking</groupID>
          <artifactId>parent</artifactId>
          <version>1.0.0</version>
        </parent>
      </project>
      ```

    5. Build Configuration
      - Plugin Configuration (Each action is plugin)
        - Two type of plugin
          1. Build Plugin
            - cleanup: remove .class files
            - compiler
            - deploy: deploy application on server.
            - install: create jar and install in local repository
            - resources: keep all .xml and resource files
            - ear/jar/war
          2. Reporting Plugin
            - javadoc
            - project-info-project
            - surfire-reports (test case)

          ```
            <project>
              <build>
                <plugin>
                  <groupID></>
                  <artifactID></>
                  <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                  </configuration>
                </plugin>
          ```
      - Resources Configuration
        ```
        <project>
              <build>
                <resources>
                  <resource>
                    <directory>src/main/resource</>
                  </resource>
                 ...
          ```
    6. Build Profiles
      - Development mode
      - Testing Mode
      - Production Mode
      ```
      # db.properties
      jdbc.connection.url = ${jdbc.connection.url}

      # pom
      <project>
        <profile>
          <id>development</id>
          <activation>
            <activeByDefault>true</>
          </>
          <properties>
            <jdbc.connection.url>url</jdbc.connection.url>
          </properties>
        </profile>
      ```

# Arch type
```
# Get all arch type
> mvn archetype:generate
```