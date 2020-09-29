# Maven for java

## Install apache maven

- Follow Basic README to install java
- Go to `https://maven.apache.org/`
- Download maven .tar.gz
```
$ wget http://apachemirror.wuchna.com/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz .

$ mkdir -p /usr/local/apache-maven/

$ tar xzvf apache-maven-3.6.3-bin.tar.gz -C /usr/local/apache-maven/
```
- Set Maven Path add PATH and M2_HOME in `/etc/environment`
```
PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/root/bin:/usr/lib/jvm/jdk-11.0.8+10/bin:/usr/local/apache-maven/apache-maven-3.6.3/bin"
JAVA_HOME="/usr/lib/jvm/jdk-11.0.8+10"
M2_HOME="/usr/local/apache-maven/apache-maven-3.6.3"
```
- Restart system
- check mvn
```
$ mvn --version
```

## Create Maven simple project in vscode

- Open command platter: `java: overview`
- create maven project
    - simple project: `maven-archetype-quickstart`
- Fill config
```
Define value for property 'groupId': com.myproject
Define value for property 'artifactId': curd-db
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' com.myproject: :
```
- Project is created under dir having pom.xml file

## Maven Plugin
- clean:
    - clean up after build.
- compiler:
    - compiles java source code.
- deploy:
    - deploys the artifact to the remote repository.
- failsafe:
    - runs the JUnit integration tests in an isolated classloader.
- install:
    - installs the built artifact into the local repository.
- resources:
    - copies the resources to the output directory for including in the JAR.
- site:
    - generates a site for the current project.
- surefire:
    - runs the JUnit unit tests in an isolated classloader.
- verifier:
    - verifies the existence of certain conditions. It is useful for integration tests.

# Run maven code

- In Left bar -> maven
- left click -> package
- Then Run using jar with package.className having main
```
$ java -classpath target/curd-db-1.0-SNAPSHOT.jar com.myproject.App
```

## Project Structure
```
curd-db/
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       ├── myproject
│   │   │       │   └── App.java
│   │   │       └── utility
│   │   │           ├── CustomLogFormatter.java
│   │   │           ├── CustomStreamHandler.java
│   │   │           └── Log.java
│   │   └── resources
│   │       └── log.properties
│   └── test
│       └── java
│           └── com
│               └── myproject
│                   └── AppTest.java
└── target
    ├── classes
    │   └── log.properties
    └── test-classes
```
