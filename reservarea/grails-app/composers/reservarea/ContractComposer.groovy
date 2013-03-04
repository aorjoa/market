package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.Messagebox
import org.zkoss.zk.ui.Executions


class ContractComposer extends GrailsComposer {

    def afterCompose = { window ->

    	def NewWindow = {
		
			Executions.getCurrent().sendRedirect("/viewcontract.zul","_blank");
		}

		
        def X = Contract.findAll()

		for(c in X){
			
			$('#gridbox > rows ').append{
				
				row{
					def del = $('#gridbox > rows > row')
					def a = $(it).getIndex() 
					
					Integer i = c.id
				
					label(value: c.no)
					label(value: c.date)
					label(value: c.area)
					label(value: c.name)
				
					
					button(image: '../reservarea/ext/images/view.png' ,,width : "20px", mold:"trendy" ,onClick : {


					def v = Contract.findById(i)
					session["view"] = v
					NewWindow()

					})



					button(image: '../reservarea/ext/images/edit.png' ,,width : "20px", mold:"trendy")










					button(image: '../reservarea/ext/images/del.png' ,width : "20px", mold:"trendy",onClick : {
					
	
    							
		Messagebox.show("คุณต้องการลบสัญญาหรือไม่?","ลบสัญญา", Messagebox.YES | Messagebox.NO,Messagebox.QUESTION,
        new org.zkoss.zk.ui.event.EventListener(){
            public void onEvent(Event e){
                if(Messagebox.ON_YES.equals(e.getName())){
                    del[a].detach()
    				def r = Contract.get(i)
					
						for(ss in r.resv){

							def f = Reservarea.get(ss.id)
							f.status = true
							f.save()
						}

					r.delete()
				
                }
            }
        }
    );
					
					})
	
    			}
			}
		}


		 $('#add').on('click',{
		

		 	redirect(uri: "reserv.zul")



		})
    }
}
