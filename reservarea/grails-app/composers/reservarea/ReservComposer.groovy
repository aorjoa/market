package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.event.MouseEvent
import org.zkoss.zul.Messagebox
import org.zkoss.zk.ui.event.Event

class ReservComposer extends GrailsComposer {

    def afterCompose = { window ->
    	//Market mouse events
        def checkval = new HashSet()
        def cost = 0
    	$("#market").onMouseOver({
    		$("#market").setTop("50px")
    		$("#market").setLeft("450px")
    		$("#market").setWidth("35%")
    		})

    	$("#market").onMouseOut({
    		$("#market").setWidth("32%")
    		$("#market").setTop("85px")
    		$("#market").setLeft("480px")
    		})
		$("#showpicmarket").on('click',{

		$("#popuppicmarket").setVisible(true)
		$("#popuppicmarket").setLeft("20%")
    	$("#popuppicmarket").setTop("10%")
    	$("#popuppicmarket").setSizable(true)
		$("#popuppicmarket").doPopup()

			})
        $("#showdetailmarket").on('click',{

        $("#popupdetailmarket").setVisible(true)
        $("#popupdetailmarket").setLeft("20%")
        $("#popupdetailmarket").setTop("30%")
        $("#popupdetailmarket").setSizable(true)
        $("#popupdetailmarket").doPopup()

            })
         $("#showreservmarket").on('click',{

        $("#popupreservmarket").setVisible(true)
        $("#popupreservmarket").setLeft("20%")
        $("#popupreservmarket").setTop("30%")
        $("#popupreservmarket").setSizable(true)
        $("#popupreservmarket").doPopup()

            })
 
		//Toy mouse events
    	$("#toy").onMouseOver({
    		$("#toy").setTop("200px")
    		$("#toy").setLeft("130px")
    		$("#toy").setWidth("25%")
    		})

    	$("#toy").onMouseOut({
    		$("#toy").setWidth("20%")
    		$("#toy").setTop("235px")
    		$("#toy").setLeft("200px")
    		})

  
        $("#showdetailtoy").on('click',{

        $("#popupdetailtoy").setVisible(true)
        $("#popupdetailtoy").setLeft("20%")
        $("#popupdetailtoy").setTop("30%")
        $("#popupdetailtoy").setSizable(true)
        $("#popupdetailtoy").doPopup()

            })
         $("#showreservtoy").on('click',{

        $("#popupreservtoy").setVisible(true)
        $("#popupreservtoy").setLeft("20%")
        $("#popupreservtoy").setTop("30%")
        $("#popupreservtoy").setSizable(true)
        $("#popupreservtoy").doPopup()

            })
  

    	//Office mouse events
    	$("#office").onMouseOver({
    		$("#office").setTop("200px")
    		$("#office").setLeft("820px")
    		$("#office").setWidth("25%")
    		})

    	$("#office").onMouseOut({
    		$("#office").setWidth("20%")
    		$("#office").setTop("235px")
    		$("#office").setLeft("800px")
    		})
   
        $("#showdetailoffice").on('click',{

        $("#popupdetailoffice").setVisible(true)
        $("#popupdetailoffice").setLeft("20%")
        $("#popupdetailoffice").setTop("30%")
        $("#popupdetailoffice").setSizable(true)
        $("#popupdetailoffice").doPopup()

            })
         $("#showreservoffice").on('click',{

        $("#popupreservoffice").setVisible(true)
        $("#popupreservoffice").setLeft("20%")
        $("#popupreservoffice").setTop("30%")
        $("#popupreservoffice").setSizable(true)
        $("#popupreservoffice").doPopup()

            })

       	//Park mouse events
    	$("#park").onMouseOver({
    		$("#park").setTop("360px")
    		$("#park").setLeft("300px")
    		$("#park").setWidth("45%")
    		})

    	$("#park").onMouseOut({
    		$("#park").setWidth("40%")
    		$("#park").setTop("350px")
    		$("#park").setLeft("340px")
    		})
       
    

         $("#showdetailpark").on('click',{

        $("#popupdetailpark").setVisible(true)
        $("#popupdetailpark").setLeft("20%")
        $("#popupdetailpark").setTop("30%")
        $("#popupdetailpark").setSizable(true)
        $("#popupdetailpark").doPopup()

            })

         $("#showcarpark").on('click',{

            redirect(uri:'cararea.zul')

        })


       //Business logic
       def areaselect = Reservarea.findAll()
       for(c in areaselect){

        if(c.status==false){
            $("window window #$c.areacode").setStyle("text-align:center;background-color:red;")
        }
       }
            $("window window window").on('click',{
               for(c in areaselect){
                    if(c.status == true && c.areacode == $(it)[0].id){
                        def recheck = checkval.add($(it)[0].id)
                        $("#checkval").val("จองพื้นที่ "+checkval.size()+" รายการ")
                        if(recheck==true){
                        cost+=c.cost
                    }
                    }
                }
             
          //  alert($(it)[0].id)

            })

        $("#checkout").on('click',{
            if(checkval.isEmpty() != true){
Messagebox.show("ยืนยันการจองพื้นที่ : "+checkval.size()+" ที่ รวมราคา : "+cost+" บาท", null, Messagebox.OK | Messagebox.CANCEL , Messagebox.QUESTION,
new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(Event evt) throws InterruptedException {
if (evt.getName().equals("onOK")) {
session.cost=cost
session.areaselected=checkval
redirect(uri:'addcontract.zul')
}
}
}
)

          
         }
            })
      
    }
}
