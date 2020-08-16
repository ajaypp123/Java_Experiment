# Java_Experiment
Java Example

<hr>

# Java

## Install and Set Env in Vs Code

1. https://code.visualstudio.com/docs/java/java-tutorial
2. From plugin get `Java Extension Pack`
3. command platter: `java: overview`
4. command platter: `java: configure java Runtime`
    - Download jdk from java overview
    - `$ mkdir /usr/lib/jvm; cd /usr/lib/jvm`
    - `$ tar -xvzf /root/OpenJDK11U-jdk_x64_linux_hotspot_11.0.8_10.tar.gz`

5. Java Path Set
```
$ update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk-11.0.8+10/bin/java" 0
$ update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/jvm/jdk-11.0.8+10/bin/javac" 0
$ update-alternatives --set java "/usr/lib/jvm/jdk-11.0.8+10/bin/java"
$ update-alternatives --set javac "/usr/lib/jvm/jdk-11.0.8+10/bin/javac"
```
6. `/etc/environment`
```
PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/root/bin:/usr/lib/jvm/jdk-11.0.8+10/bin"
JAVA_HOME="/usr/lib/jvm/jdk-11.0.8+10"
```
7. Restart system
8. In command platter: `java: configure java Runtime` set `java.home = /usr/lib/jvm/jdk-14.0.1`
9. command platter: Java: Getting Started

## Java Project Structure
http://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html