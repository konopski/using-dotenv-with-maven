# Using dotenv file with maven

Dotfiles are quite popular in ruby and js ecosystem. 
Having other ways to configure app provided by eg. spring boot it may be still useful for java dev. 
You can use .env file to inject variables into your maven build, 
then it can get picked by spring boot and passed to configuration eg. while running tests.
Use case is to avoid putting the secrets into version control, 
while letting local integration tests to run.


## Running the example

    mvn clean package && java -jar -Dspring.profiles.active=dev target/*.jar


### Reference Documentation
For further reference, please consider the following sections:

* [Dotenv for java](https://medium.com/@cdimascio/dotenv-for-java-and-jvm-languages-43ee0e683549)
* [Maven plugin site](https://github.com/mjourard/env-file-maven-plugin)
* [Why use dotenv](https://dev.to/wiseai/continue-using-env-files-as-usual-2am5)
