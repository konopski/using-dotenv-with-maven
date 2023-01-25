package eu.konopski.test.dotenv.with.maven

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest(
    properties = ['spring.datasource.password=${OVERRIDE_DB_PASS}'] )
class PropsOverrideTest {

    @Autowired TheBean bean

    @Test
    void contextLoads() {
    }

    @Test
    void shouldOverride() {
        bean.pass == "password_override1"
    }

}
