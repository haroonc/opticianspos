class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/index"(view:"/index")
		"/"(controller:"/index")
        "500"(view:'/error')
	}
}
