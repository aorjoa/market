package reservarea

class Contract {
	String	no
	String	date
	String	area
	String 	name
	String	address
	String	tel
	Integer price
	Login	login

	static hasOne = [login:Login]
    static constraints = {

    }
}
