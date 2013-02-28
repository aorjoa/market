package reservarea

class Reservarea {
    
	String areacode
	
	Boolean staus=false
	
	Integer cost

static constraints = {
   
	areacode unique:true
 }
}
