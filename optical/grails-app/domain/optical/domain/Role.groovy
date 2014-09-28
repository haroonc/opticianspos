package optical.domain

class Role {

   String roleName

   static mapping = {
      cache true
   }

   static constraints = {
      roleName blank: false, unique: true
   }
}
