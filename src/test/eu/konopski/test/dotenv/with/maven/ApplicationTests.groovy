package eu.konopski.test.dotenv.with.maven

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {

    @Autowired TheBean bean
	
	@Test
	void contextLoads() {
	}

    @Test
    void shouldReadFromDotEnv() {
            bean.pass == "t3st_s3cr3t"
    }

}
