
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><g:message code="springSecurity.login.header"/></h3>
                    </div>
						<g:if test='${flash.message}'>
							<div class='login_message'>${flash.message}</div>
						</g:if>
                    <div class="panel-body">
                        <form role="form" action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>

                            <fieldset>
                                <div class="form-group">
									<label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
									<input type='text' class="form-control" placeholder='<g:message code="springSecurity.login.username.label"/>' name='j_username' id='username'/>
                                </div>
                                <div class="form-group">
									<label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
                                    <input type="password" class="form-control" placeholder='<g:message code="springSecurity.login.password.label"/>' name='j_password' id='password' value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
								<input type='submit' class="btn btn-lg btn-primary btn-block" id="submit" value='${message(code: "springSecurity.login.button")}'/>
                            </fieldset>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

