package org.ajaxer;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

/**
 * @author Shakir
 * @version 2022-09-14
 */
@Log4j2
public class HelloWorldTest
{
	@Test
	void helloWorld()
	{
		log.info("hello world from test");
	}
}
