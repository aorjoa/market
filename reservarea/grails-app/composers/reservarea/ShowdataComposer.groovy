package reservarea

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class ShowdataComposer extends GrailsComposer {

    def afterCompose = { window ->

        def rett = Register.findAll()
        for (i in rett){
        $('#kung2 > row').detach()
        $('#kung2').append{
            row(){
            label(value:i.name)
            label(value:i.lastname)
            label(value:i.age)
            label(value:i.phone)
            label(value:i.email)
            label(value:i.address)
            label(value:i.birthday)
          }   

        }



          

            //$('#address')[0].value = x.address
        }




		$('#btnMaintain').on('Click',{

    		
			Executions.sendRedirect("/maintain.zul")


    	})

    	def NewWindow = {
		
			Executions.getCurrent().sendRedirect("/viewcontract.zul","_blank");
		}


    	$('#btnViewcontract').on('Click',{


            def e = session["login_name"]

    		def a = Login.findByUsername(e.username)
			def v = Contract.findById(a.id)
			session["view"] = v
			NewWindow()


    	})

        $('#btnEditdata').on('Click',{

            
            Executions.sendRedirect("/show.zul")


        })


        $('#btnMoney').on('Click',{

            
            Executions.sendRedirect("/moneyarea.zul")


        })

    	


        
    }
}
