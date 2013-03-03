package reservarea

class Login {

	String username
	String password



	//static hasOne = [register:Register]
	static belongsTo = [contract:Contract]
	static hasMany = [maintenances:Maintenance]
    static constraints = {
    }
}
