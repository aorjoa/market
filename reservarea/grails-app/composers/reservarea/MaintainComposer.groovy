package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class MaintainComposer extends GrailsComposer {

     def afterCompose = { window ->
        // initialize components here
        def selectDelete
        def selectKnock
        
       
        $('#confrim').on('click',{

          def user = session["login_name"]
          def userxx = Login.findByUsername(user.username)

       
       new Maintenance(
          annu:$('#x1').getText(),
          area:$('#x3').getText(),
          mess:$('#x2').getText(),
          date:$('#x4').val(),
          sta:false,
          login:user

         
        ).save()

         alert('successfully, Or show orders')

          $('#x1')[0].text= ''
          $('#x3')[0].text= ''
          $('#x2')[0].text= ''
          $('#x4')[0].text= ''


           def goon= Maintenance.findAll()
          $('#output > row').detach()
          for(i in goon){
             Integer a = i.id
                  $('#output').append{
                          row (){

                              image (src:"/ext/images/message.jpg")
                              label( value: i.mess)
                              label( value: i.area)
                              label( value: i.date) 
                              button(label:'Click!')
               
                           
                            hbox {
                               
                              def pp =image (src:"/ext/images/pass.jpg" , visible:false)                         
                            
                               button(label:'No!', onClick:{ ev ->
                               
                                 // def ss = $(it).target
                                    def b = ev.target 
                                    b.setVisible(false)
                                    pp.setVisible(true)
                                    
                                })
                              
                            }
                
                          }
                  }

                  selectDelete = $("#output row:last-child button[label='Click!']")
                      selectDelete.on('click',{ 
                            def idel = session["staff_name"]
                            def dty = Staff.findByUser_name(idel.user_name) 
                           
                             alert('ดูแลโดย Mr.'+idel.user_name)
                          

                         })
                        
               def selectDelete2 = $("#output row:last-child button[label='No!']")
                        selectDelete2.on('click',{ 
                            def idel = session["staff_name"]
                            def dty = Staff.findByUser_name(idel.user_name)                     
                            if(idel.user_name==idel.user_name){
                                   def r = Maintenance.get(a)
                                    r.sta = true
                                    r.save()
                             alert('updated status')
                             }else{
                              alert('Wait admin for update')
                             }

                         }) 


                  }


           
        })

         $('#mess').on('click',{
          if($('#lol1').getText()=="" || $('#lol2').getText()=="" || $('#lol3').getText()==""){
            alert('please input data')
          }else{
          new Maintain(

            to:$('#lol1').getText(),
            subject:$('#lol2').getText(),
            intro:$('#lol3').getText()
            ).save()
          alert('I got it.')
            $('#lol1')[0].text=''
            $('#lol2')[0].text=''
            $('#lol3')[0].text=''
        }

          })

         $('#btnMain').on('click',{
         redirect(uri:"showdata.zul")

          })

          $('#btnOut').on('click',{
         redirect(uri:"login.zul")

          })
        
        $('#clear').on('click',{
          
          $('#x1')[0].text= ''
          $('#x3')[0].text= ''
          $('#x2')[0].text= ''
          $('#x4')[0].text= ''

       })

    }
}
