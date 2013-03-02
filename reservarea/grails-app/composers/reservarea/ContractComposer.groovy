package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.Messagebox


class ContractComposer extends GrailsComposer {

    def afterCompose = { window ->
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
				
					
					button(label : "see",width : "30px", ,mold:"trendy")
					button(label : "edit",width : "30px", ,mold:"trendy")
					button(label : "del",width : "30px", ,mold:"trendy",onClick : {
					
	
    				
					
					})
	
    				}
					}
					}
    }
}
