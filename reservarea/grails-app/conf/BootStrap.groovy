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
    
    def a05 = new Reservarea(areacode:"a05",status:true,cost:1000)
     a05.save()
    
    def a06 = new Reservarea(areacode:"a06",status:false,cost:1000)
    a06.save()
    
    def a07 = new Reservarea(areacode:"a07",status:true,cost:1000)
     a07.save()
    
    def a08 = new Reservarea(areacode:"a08",status:true,cost:1000)
     a08.save()
    

        def a11 = new Reservarea(areacode:"a11",status:false,cost:1000)
            if (a11.validate()) {
          a11.save()
      }else println a11.errors
    

    def a12 = new Reservarea(areacode:"a12",status:true,cost:1000)
     a12.save()
    
    def a13 = new Reservarea(areacode:"a13",status:false,cost:1000)
     a13.save()
    
     def a14 = new Reservarea(areacode:"a14",status:true,cost:1000)
     a14.save()
    
    def a15 = new Reservarea(areacode:"a15",status:true,cost:2000)
     a15.save()
    
    def a16 = new Reservarea(areacode:"a16",status:false,cost:1000)
    a16.save()
    
    def a17 = new Reservarea(areacode:"a17",status:true,cost:1000)
     a17.save()
    
    def a18 = new Reservarea(areacode:"a18",status:true,cost:1000)
     a18.save()
    

        def a21 = new Reservarea(areacode:"a21",status:false,cost:1000)
            if (a21.validate()) {
          a21.save()
     } else println a21.errors
    

    def a22 = new Reservarea(areacode:"a22",status:true,cost:1000)
     a22.save()
    
    def a23 = new Reservarea(areacode:"a23",status:false,cost:1000)
     a23.save()
    
     def a24 = new Reservarea(areacode:"a24",status:true,cost:1000)
     a24.save()
    
    def a25 = new Reservarea(areacode:"a25",status:true,cost:2000)
     a25.save()
    
    def a26 = new Reservarea(areacode:"a26",status:false,cost:1000)
    a26.save()
    
    def a27 = new Reservarea(areacode:"a27",status:true,cost:1000)
     a27.save()
    
    def a28 = new Reservarea(areacode:"a28",status:true,cost:1000)
     a28.save()
    

        def a31 = new Reservarea(areacode:"a31",status:false,cost:1000)
            if (a31.validate()) {
          a31.save()
      }else println a31.errors
    

    def a32 = new Reservarea(areacode:"a32",status:true,cost:1000)
     a32.save()
    
    def a33 = new Reservarea(areacode:"a33",status:false,cost:1000)
     a33.save()
    
     def a34 = new Reservarea(areacode:"a34",status:true,cost:1000)
     a34.save()
    
    def a35 = new Reservarea(areacode:"a35",status:true,cost:2000)
     a35.save()
    
    def a36 = new Reservarea(areacode:"a36",status:false,cost:1000)
    a36.save()
    
    def a37 = new Reservarea(areacode:"a37",status:true,cost:1000)
     a37.save()
    
    def a38 = new Reservarea(areacode:"a38",status:true,cost:1000)
     a38.save()

          def b01 = new Reservarea(areacode:"b01",status:false,cost:1000)
            if (b01.validate()) {
          b01.save()
      }else println b01.errors
    

    def b02 = new Reservarea(areacode:"b02",status:true,cost:1000)
     b02.save()
    
    def b03 = new Reservarea(areacode:"b03",status:false,cost:1000)
     b03.save()
    
     def b04 = new Reservarea(areacode:"b04",status:true,cost:1000)
     b04.save()
    
    def b05 = new Reservarea(areacode:"b05",status:true,cost:2000)
     b05.save()
    
    def b06 = new Reservarea(areacode:"b06",status:false,cost:1000)
    b06.save()
    
    def b07 = new Reservarea(areacode:"b07",status:true,cost:1000)
     b07.save()
    
    def b08 = new Reservarea(areacode:"b08",status:true,cost:10000)
     b08.save()

    def b09 = new Reservarea(areacode:"b09",status:true,cost:10000)
     b09.save()
    def b10 = new Reservarea(areacode:"b10",status:true,cost:10000)
     b10.save()

 def b11 = new Reservarea(areacode:"b11",status:true,cost:1000)
     b11.save()

    def b12 = new Reservarea(areacode:"b12",status:true,cost:1000)
     b12.save()
              def c01 = new Reservarea(areacode:"c01",status:false,cost:1000)
            if (c01.validate()) {
          c01.save()
      }else println c01.errors
    

    def c02 = new Reservarea(areacode:"c02",status:true,cost:1000)
     c02.save()
    
    def c03 = new Reservarea(areacode:"c03",status:false,cost:1000)
     c03.save()
    
     def c04 = new Reservarea(areacode:"c04",status:true,cost:1000)
     c04.save()
    
    def c05 = new Reservarea(areacode:"c05",status:true,cost:2000)
     c05.save()
    
    def c06 = new Reservarea(areacode:"c06",status:false,cost:1000)
    c06.save()
    
    def c07 = new Reservarea(areacode:"c07",status:true,cost:1000)
     c07.save()
    
    def c08 = new Reservarea(areacode:"c08",status:true,cost:10000)
     c08.save()
    def c11 = new Reservarea(areacode:"c11",status:false,cost:1000)
    if (c11.validate()) {
          c11.save()
      }else println c11.errors
    

    def c12 = new Reservarea(areacode:"c12",status:true,cost:1000)
     c12.save()
    
    def c13 = new Reservarea(areacode:"c13",status:false,cost:1000)
     c13.save()
    
     def c14 = new Reservarea(areacode:"c14",status:true,cost:1000)
     c14.save()
    
    def c15 = new Reservarea(areacode:"c15",status:true,cost:2000)
     c15.save()
    
    def c16 = new Reservarea(areacode:"c16",status:false,cost:1000)
    c16.save()
    
    def c17 = new Reservarea(areacode:"c17",status:true,cost:1000)
     c17.save()
    
    def c18 = new Reservarea(areacode:"c18",status:true,cost:10000)
     c18.save()

}
    def destroy = {

    }
}
