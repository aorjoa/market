package reservarea

class Reservarea {
    
	String areacode
	Boolean status
	Integer cost

static constraints = {
	areacode unique:true
 }
}
