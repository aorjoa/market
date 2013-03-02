package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class ViewcontractComposer extends GrailsComposer {

    def afterCompose = { window ->

    

        def x = session["view"]


		$('#no')[0].value = x.no
		$('#area')[0].value = x.area
		$('#name')[0].value = x.name
		
		
		$('#date')[0].value = x.date
		$('#price')[0].value = x.price
		$('#tel')[0].value = x.tel

		$('#address')[0].value = x.address
		
    }
}
