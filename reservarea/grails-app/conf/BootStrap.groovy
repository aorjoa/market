import reservarea.*

class BootStrap {

    def init = { servletContext ->

    	def a01 = new Reservarea(areacode:"a01",status:false,cost:1000)
    	    if (a01.validate()) {
          a01.save()
      }else println a01.errors
    

    def a02 = new Reservarea(areacode:"a02",status:true,cost:1000)
     a02.save()
    
    def a03 = new Reservarea(areacode:"a03",status:false,cost:1000)
     a03.save()
    
     def a04 = new Reservarea(areacode:"a04",status:true,cost:1000)
     a04.save()
    }

    def destroy = {

    }
}
