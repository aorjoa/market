package reservarea

class Contract {
	String	no
	String	date
	String	area
	String 	name
	String	address
	String	tel
	Login	login

	static hasOne = [login:Login]
    static constraints = {

    }
}
