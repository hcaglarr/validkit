
# Validkit - Javax & Jakarta Validation

ValidKit is a library that simplifies object validation in your Java applications. It provides fast and effective validation on objects using Javax and Jakarta Bean Validation APIs.

Before you start using this library, make sure that the Java Development Kit (JDK) is installed on your system. ValidKit is compatible with JDK 8 and above.



## Installation
To analyze the dependencies of your project, you need to add the following repository information to your Maven pom.xml file. This repository provides the necessary packages via Packagecloud:
```xml
<repositories>
    <repository>
        <id>hcaglar-release</id>
        <url>https://packagecloud.io/hcaglar/release/maven2</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

You should also add the following Maven dependency to your pom.xml file to add the core functionality of ValidKit when launching your project:
```xml
<dependency>
    <groupId>com.hcaglar</groupId>
    <artifactId>validkit-core</artifactId>
    <version>1.1.0</version>
</dependency>
```
#### Usage with Javax
If your project uses Javax validation, add the following dependency to your pom.xml file to use the Javax compatible version of ValidKit:
```xml
<dependency>
    <groupId>com.hcaglar</groupId>
    <artifactId>validkit-javax</artifactId>
    <version>1.1.0</version>
</dependency>
```

#### Usage with Jakarta
If you prefer to use Jakarta Bean Validation in the project, add the following dependency to your pom.xml file to add the Jakarta-compatible version of Valid Kit to your project:
```xml
<dependency>
    <groupId>com.hcaglar</groupId>
    <artifactId>validkit-jakarta</artifactId>
    <version>1.1.0</version>
</dependency>
```

## Module Status Table

This table provides an overview of the current status of the various verification modules within our software. Each line represents a verification type and indicates that the implementation of this type has been completed or is still in progress.

#### Completed:
Indicates that the authentication module is fully implemented and operational.
#### Pending:
Indicates that the authentication module is still in development and not yet ready for use.
The rows marked "..." in the table indicate that there are many more verification modules to be added in the future.

This means that the modules are constantly extensible and the development process is ongoing.

| Validation name | Status| 
|-----------------|------------|
| Md5             | Complated |
| Integer         | Pending   |
| Float           | Pending   |
| Double          | Pending  |
| Bool            | Complated |
| Port            | Pending  |
| Json            | Pending   |
| Xml             | Pending   |
| Jwt             | Pending   |
| UUID            | Pending   |
| Url             | Pending   |
| Alpha           | Pending   |
| Alphanumeric    | Pending   |
| Iban            | Pending   |
| CreditCard      | Pending   |
| ...             | ...   |
| ...             | ...   |







