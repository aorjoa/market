package reservarea

class Reservarea {

    
	String areacode
	
	String zone
	
	Integer cost

static constraints = {
   
	areacode unique:true
 }
}
