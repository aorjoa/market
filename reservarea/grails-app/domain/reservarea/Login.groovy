package reservarea

class Login {

	String username
	String password

	static belongsTo = [contract:Contract]
	static hasMany = [maintenances:Maintenance]
    static constraints = {
    }
}
