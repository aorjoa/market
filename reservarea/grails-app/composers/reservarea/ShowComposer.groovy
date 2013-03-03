package reservarea

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class ShowComposer extends GrailsComposer {

    def afterCompose = { window ->

    	$('#btnSavedata').on('click',{

    	//	def e = session["login_name"]
	 
		 new Register(
			name:        $('#name').text(),
        	lastname:      $('#lastname').text(),
            age:            $('#age').text(),
            phone:          $('#phone').text(),
        	email:             $('#email').text(),
			address:         $('#address').text(),
        	birthday:      $('#birthday').text(),
        	//login: new Login(username : e.username,password: e.password)

      	).save()
		alert('Editdata  Complete')
		Executions.sendRedirect("/showdata.zul")

		})

		$('#btnCleardata').on('click',{
	 		$('#name')[0].text = ''
        	$('#lastname')[0].text =''
            $('#age')[0].text =''
            $('#phone')[0].text =''
        	$('#email')[0].text =''
			$('#address')[0].text =''
        	$('#birthday')[0].text =''
      })



    	


       
    }
}
