package reservarea

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class ShowdataComposer extends GrailsComposer {

    def afterCompose = { window ->

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

    	


        
    }
}
