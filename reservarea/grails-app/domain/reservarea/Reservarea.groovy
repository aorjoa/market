package reservarea

class Reservarea {
    
	String areacode
	Boolean status=true
	Integer cost

static constraints = {
   
	areacode unique:true
 }
}
