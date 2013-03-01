package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class MaintainComposer extends GrailsComposer {

    def afterCompose = { window ->
        // initialize components here
         $('#confrim').on('click',{

           if($('#x1')[0].getText()=="" || $('#x2')[0].getText()==""  || $('#x3')[0].getText()=="" || $('#x4')[0].getText()==""){
                 alert('please input data')
          }else{


       new Maintenance(
        	annu:$('#x1').getText(),
        	area:$('#x3').getText(),
        	mess:$('#x2').getText(),
        	date:$('#x4').val()
         
      	).save()

      	alert('successfully, keep it 100%')

      	})
    }
}
