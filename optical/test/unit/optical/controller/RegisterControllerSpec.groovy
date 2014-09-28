
package optical.controller

import grails.plugin.springsecurity.ui.RegisterCommand;
import grails.plugin.springsecurity.ui.RegisterController
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(RegisterController)
class RegisterControllerSpec extends Specification {

	
    def setup() {
    }

    def cleanup() {
    }

    void "Register admin user"() {
		
		//def controller = new RegisterController()
		
		when:
		controller.params.username='admin'
		controller.params.password='admin123'
		controller.params.password2='admin123'
		controller.params.email='admin@email.com'
		def cmd = new RegisterCommand();
		cmd.username='admin'
		cmd.password='admin123'
		cmd.password2='!Admin123'
		cmd.email='admin@email.com'

		controller.register(cmd)
		
		then:
		assertFalse  ommand.hasErrors()

		def response = response.contentAsString		
		response != null
		
    }
}
