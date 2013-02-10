package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.event.MouseEvent

class ReservComposer extends GrailsComposer {

    def afterCompose = { window ->
    	$("#market").onMouseOver({
    		$("#market").class("marketover")
    		})

    
    }
}
