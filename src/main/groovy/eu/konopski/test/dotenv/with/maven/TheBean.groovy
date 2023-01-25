package eu.konopski.test.dotenv.with.maven

import groovy.transform.ToString
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

@ToString
@Component
class TheBean {

    @Value('${spring.datasource.username}')
    String username

    @Value('${spring.datasource.password}')
    String pass


    @PostConstruct
    def runMe() {
        println("runnig me " + this)
    }
}
