package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class MoneyareaComposer extends GrailsComposer {

    def afterCompose = { window ->
        // initialize components here
		
		$('#btnsave').on('click',{
		if($('#tx1')[0].getText()=="" || $('#tx2')[0].getText()=="" || $('#tx3')[0].getText()=="" || $('#tx4')[0].getText()=="" ||
		$('#tx5')[0].getText()==""  || $('#tx6')[0].getText()=="" || $('#tx7')[0].getText()==""  || $('#tx8')[0].getText()==""){
			alert('กรุณากรอกข้อมูลให้ครบ')
		}else{
			new Moneyarea(
			no:$('#tx1').getText(),
			area:$('#tx2').getText(),
			renter:$('#tx3').getText(),
			phone:$('#tx4').getText(),
			store:$('#tx5').getText(),
			rental:$('#tx6').getText(),
			date:$('#tx7').getText(),
			status:$('#tx8').getText()
			).save()
			alert('บันทึกเรียบร้อย')
			$('#tx1')[0].text= ''
			$('#tx2')[0].text= ''
			$('#tx3')[0].text= ''
			$('#tx4')[0].text= ''
			$('#tx5')[0].text= ''
			$('#tx6')[0].text= ''
			$('#tx7')[0].text= ''
			$('#tx8')[0].text= ''
			}
			})
			
			
		def mShow = Moneyarea.findAll()
              for(m in mShow) {
                $('#pick').append {
                  listitem(value: m) {
                    listcell(value: m.area, label: m.area)

                    
                }
              }
          }

	         $('#pick').on('select', {
				def ss = $(it).val()
				
			 $('#grid > rows').append{

      
            row{
			  
              label(value:ss.no)
              label(value:ss.area)
              label(value:ss.renter)
              label(value:ss.phone)
			  label(value:ss.store)
			  label(value:ss.rental)
			  label(value:ss.date)
			  label(value:ss.status)
			  
			  
            }
			}
			
				
		})
    }
}
