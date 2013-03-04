package reservarea

class Register {

	String name
	String lastname
	String age
	String phone
	String email
	String address
	String birthday


	Login login
	static belongsTo = [login:Login]
		static constraints = {
    }
}
