package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.Messagebox

class MoneyareaComposer extends GrailsComposer {

    def afterCompose = { window ->
        // initialize components here
		
        Integer i = 1;
        def XX;
	
		$('#call').on('click',{
		
				Messagebox.show("คุณต้องการเรียกค่าเช่ารายเดือน?","เรียกค่าเช่า", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
            
 
		def C = Contract.findAll()
		def d = $('#dd').text()
		for(c in C){	
			new Moneyarea(
			no 		: 	c.no,
			date	:	c.date,
			area	: 	c.area,
			name	: 	c.name,
			address : 	c.address,
			tel		: 	c.tel,
			price	: 	c.price,
			date1	:	d,
			status : "false"
				).save()
			}
		redirect(uri: "moneyarea.zul")
			
		               }
           			 }
      			  }
    			);
			})

		
		
		def mShow = Moneyarea.findAll().date1.unique()
              for(m in mShow) {
                $('#tt').append {
                  listitem(value: m) {

                    listcell(value: m, label: m)

                    
                }
              }
          }





		def CreateRow = {
			$('#grid > rows > row').detach()

			 $('#grid > rows').append{

			for(qq in XX){
            row{
			  Integer a = qq.id
              label(value:qq.no)
              label(value:qq.area)
              label(value:qq.name)
              label(value:qq.tel)
			  label(value:qq.address)
			  label(value:qq.price)
			  label(value:qq.date)
			  label(value:qq.date1)
              
			  if(qq.status == "true"){
			    button(label : "ชำระเงินแล้ว" ,width : "30px", mold:"trendy",onClick : {

											
		Messagebox.show("คุณต้องการเปลี่ยนสถานะ?","เปลี่ยนสถานะ", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
                    
    				def r = Moneyarea.get(a)
					r.status = "false"
					r.save()
					session["date"] = r.date1
					redirect(uri: "moneyarea.zul")
                }
            }
        }
    );

})
		}else{

			  button(label : "ค้างชำระ" ,width : "30px", mold:"trendy",onClick : {
										
		Messagebox.show("คุณต้องการเปลี่ยนสถานะ?","เปลี่ยนสถานะ", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
                    
    				def r = Moneyarea.get(a)
					r.status = "true"
					r.save()
					session["date"] = r.date1
					redirect(uri: "moneyarea.zul")
					
                }
            }
        }
    );

})
							  } 
          				  }
						}
					
					}
				
				
		} //end closure



	
		$('#tt').on('select', {
			def rr = $(it).val()
			XX = Moneyarea.findAllByDate1(rr)
			CreateRow()
		})	

		if(session["date"] != null){
			def rr = session["date"]
			XX = Moneyarea.findAllByDate1(rr)
			session["date"] = null
			CreateRow()


		}

			$('#back').on('click',{
			redirect(uri:'contract.zul')
		})
    
	}
}

