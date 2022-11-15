/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Nov 14, 2022
*/
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

/**
 * @author krazy
 *
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		return bean;
	}
}
