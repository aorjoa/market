package reservarea

class Login {

	String user_name
	String password

	static hasMany = [maintenances:Maintenance]
    static constraints = {
    }
}
