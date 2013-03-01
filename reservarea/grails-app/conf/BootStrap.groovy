import reservarea.*

class BootStrap {

    def init = { servletContext ->
    	def area 

    	area = new Reservarea(areacode:"a01",status:false,cost:1000)
    	    if (area.validate()) {
          area.save()
      }else println area.errors
    }

    def destroy = {

    }
}
