# kotlin-boot-repo
spring boot, spring data, postgres

## Techstack
1. Kotlin
2. Spring Boot
3. Spring Data
4. PostgreSQL

### plugins needed
1. To use spring boot annotations (@SpringBootApplication, @Service etc)
2. To use JPA (For JPA persistence)
```
<plugin>
  <groupId>org.jetbrains.kotlin</groupId>
  <artifactId>kotlin-maven-plugin</artifactId>
  <configuration>
    <args>
      <arg>-Xjsr305=strict</arg>
    </args>
    <compilerPlugins>
      <plugin>spring</plugin>
      <plugin>jpa</plugin>
    </compilerPlugins>
  </configuration>
  <dependencies>
    <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-maven-allopen</artifactId>
      <version>${kotlin.version}</version>
    </dependency>
    <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-maven-noarg</artifactId>
      <version>${kotlin.version}</version>
    </dependency>
  </dependencies>
</plugin>
```
