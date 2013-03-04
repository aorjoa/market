package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.Messagebox


class AddcontractComposer extends GrailsComposer {

    def afterCompose = { window ->
       $('#save').on('click',{
		
		
     		
			def no = $('#no')[0].text
			def n = $('#name')[0].text
			def area = $('#area')[0].text
			def price = $('#price')[0].text
			def a = $('#address')[0].text
			def t = $('#tel')[0].text
			def d = $('#in').text()
			
			def u = $('#user')[0].text
			def p = $('#pass')[0].text
			
			def login = new Login(username:u,password:p)
			

     		def c = new Contract(

     			no : no,
				date : d,
				area : area,
				price : price,
				name :n,
				address :a,
				tel : t,
				login : login 
			)

			c.save()

			def r = new Register(

     		 	name : "",
				lastname : "",
	 			age : "",
				phone : "",
				email : "",
				address : "",
				birthday : "",
				login : login
			)

			r.save()


	Messagebox.show("บันทึกสัญญาเรียบร้อยแล้ว","บันทึกสัญญา", Messagebox.OK,Messagebox.INFORMATION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_OK.equals(e.getName())){
                redirect(uri: "contract.zul")
                }
            }
        }
    );
			
		})
    }
}
