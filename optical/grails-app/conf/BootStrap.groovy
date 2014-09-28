import grails.plugin.springsecurity.ui.RegisterCommand;
import optical.domain.User

class BootStrap {

    def init = { servletContext ->
    
		registerAdminUser();
	
	}
    def destroy = {
    }
	
	
	def registerAdminUser(){
		def user = new User (email: 'admin@email.com', username: 'admin',
			accountLocked: false, enabled: true);
		user.setPassword("admin123");
		user.save(flush: true)
		
		def users = User.getAll();
		log.error(new Exception('User created!'+users.toString()));
	}
}
