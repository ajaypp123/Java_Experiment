## Servlet/JSP Java vscode

- Follow maven tutorial to install maven.
- In `java overview` implement simple webapp project.

- Vscode not have inbuilt library to run web application.
- There are third party tool available to run web/war application.
    - Tomcat
    - Jetty
    - Open Liberty
- You need to install them on system and then related plugin from vscode.
- On vscode sidebar you will see add server for given plugin.

## Install tomcat in linux

- Install RPM.
```
$ yum install tomcat
$ yum install tomcat-webapps tomcat-admin-webapps
$ yum install tomcat-docs-webapp tomcat-javadoc
```
- Edit config file below field. `/usr/share/tomcat/conf/tomcat.conf`

```
JAVA_HOME="/usr/lib/jvm/jdk-11.0.8+10"
JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom -Djava.awt.headless=true -Xmx512m -XX:MaxPermSize=256m -XX:+UseConcMarkSweepGC"
```

- Edit tomcat user file. `/usr/share/tomcat/conf/tomcat-users.xml`

```
<tomcat-users>
    <user username="admin" password="password" roles="manager-gui,admin-gui"/>
</tomcat-users>
```

- Start service

```
$ systemctl start tomcat
$ systemctl enable tomcat
```

## Start Tomcat server to vscode

- Stop tomcat server from linux
```
$ systemctl stop tomcat
$ systemctl disable tomcat
```

- Attach Tomcat to vscode.
    - Install `Tomcat for java` in vscode.
    - On vscode sidebar click `TOMCAT SERVER`
    - Click `+` and add tomcat path `/usr/share/tomcat`
    - Install `Java Server Pages (JSP)` Extension in Vscode.
    - Disable `Java Language Support` as conflict with vs-java.
- Dependency pom.xml
```
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
    </dependency>

```
- On tomcat server click right > start


## Start application on web

- Vscode sidebar > Maven > project > package (It will create war file in target dir.)
- Vscode sidebar > Project/target/war > Run on tomcat
- Vscode sidebar > TOMCAT SERVER > app > open in browser