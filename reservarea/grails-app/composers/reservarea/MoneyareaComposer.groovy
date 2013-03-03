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
	
		$('#call').on('click',{
		
				Messagebox.show("คุณต้องการเรียกค่าเช่ารายเดือน?","เรียกค่าเช่า", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
            
 
		def C = Contract.findAll()
		
		for(c in C){	
			new Moneyarea(
			no 		: 	c.no,
			date	:	c.date,
			area	: 	c.area,
			name	: 	c.name,
			address : 	c.address,
			tel		: 	c.tel,
			price	: 	c.price,
			status : "false"
				).save()
			}
			
		               }
            }
        }
    );
		})

			
			
		$('#btnsearch').on('click',{

		//def gg = Moneyarea.findAllByNo($('#tx8').text())
		//	ss = Moneyarea.findAllByArea($('#tx8').text())
		//	 ss = Moneyarea.findAllByRenter($('#tx8').text())
		//	 ss = Moneyarea.findAllByPhone($('#tx8').text())
		//	 ss = Moneyarea.findAllByStore($('#tx8').text())
		//	 ss = Moneyarea.findAllByRental($('#tx8').text())
		//	 ss = Moneyarea.findAllByDate($('#tx8').text())
		def gg = Moneyarea.findAllByStatus($('#tx8').text())
			 
			 //if(s!= null){alert('000')}

		for(ss in gg){	

			 $('#grid > rows').append{
      
            row{

		
			
			  Integer a = ss.id
              label(value:ss.no)
              label(value:ss.area)
              label(value:ss.name)
              label(value:ss.tel)
			  label(value:ss.address)
			  label(value:ss.price)
			  label(value:ss.date)
			  
		if(ss.status == "true"){
			    button(label : "ชำระเงินแล้ว",width : "30px", mold:"trendy",onClick : {
										
		Messagebox.show("คุณต้องการเปลี่ยนสถานะ?","เปลี่ยนสถานะ", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
                    
    				def r = Moneyarea.get(a)
					r.status = "false"
					r.save()
					redirect(uri: "moneyarea.zul")
                }
            }
        }
    );

})
		}else{

			  button(label : "ค้างชำระ",width : "30px", mold:"trendy",onClick : {
										
		Messagebox.show("คุณต้องการเปลี่ยนสถานะ?","เปลี่ยนสถานะ", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
                    
    				def r = Moneyarea.get(a)
					r.status = "true"
					r.save()
					redirect(uri: "moneyarea.zul")
                }
            }
        }
    );

})
			  } //end if
   				
			 
            }
			}
			 }
				
		})
		
		
		
    
	}
}
//selectedIndex : {"1"},
//SelectedIndex()
