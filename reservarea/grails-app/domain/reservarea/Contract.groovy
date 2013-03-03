package reservarea

class Contract {
	String	no
	String	date
	String	area
	String 	name
	String	address
	String	tel
	String price
	Login	login

	static hasOne = [login:Login]
    static constraints = {

    }
}
