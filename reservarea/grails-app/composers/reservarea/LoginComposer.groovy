package reservarea

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class LoginComposer extends GrailsComposer {

    def afterCompose = { window ->



 		$('#btnSave').on('click', {


            def ss = $('#user_name').getText()
            def e = Login.findByUsername(ss)
            def s = Staff.findByUser_name(ss) 

            
            if($('#user_name')[0].getText() == '' || $('#password')[0].getText() == '')
                alert('คุณยังไม่กรอกข้อมูล กรุณากรอก Username และ Password')
            else if(e != null) 
            {
            	if($('#password')[0].getText() == e.password)
                {
                    
                    alert('Customer Login Complete')
                    session["login_name"]=e
                    Executions.sendRedirect("/show.zul")
                }
                else
                {

                     alert('คุณกรอก Username และ Password ผิด กรุณากรอกใหม่')

                }
            
            }

             else if(s != null)
            {
                if($('#password')[0].getText() == s.password)
                {
                    
                    alert('Staff Login Complete')
                    session["staff_name"]=s
                    Executions.sendRedirect("/show.zul")
                }
                else
                {

                     alert('คุณกรอก Username และ Password ผิด กรุณากรอกใหม่')

                }
            
            }
            
        })


    }
}
