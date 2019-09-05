# spring-boot-test
Test to connect springboot to mysql 

1. Make sure a local mysql instance is running & the application.properties file has the right credentials
* cd usr/local/mysql/bin

* ./mysql -u root -p 

* db name: db_example

2. ./gradlew clean
3. ./gradlew build
4. ./gradlew bootRun


You should now be able to access the endpoints
