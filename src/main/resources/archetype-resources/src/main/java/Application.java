package ${package};

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tw.com.softleader.boot.SoftleaderBootApplication;

/**
 * Boot class
 */
@Slf4j
@SpringBootApplication
public class Application {

	/**
	 * Application entry point
	 */
	public static void main(String[] args) {
		SoftleaderBootApplication.run(Application.class, args);
	}
}
