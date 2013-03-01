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

       new Maintenance(
          annu:$('#x1').getText(),
          area:$('#x3').getText(),
          mess:$('#x2').getText(),
          date:$('#x4').val()
         
        ).save()

         alert('successfully, Or show orders')

          $('#x1')[0].text= ''
          $('#x3')[0].text= ''
          $('#x2')[0].text= ''
          $('#x4')[0].text= ''


          def goon= Maintenance.findAll()
          $('#output > row').detach()
          for(i in goon){
                  $('#output').append{
                          row (){

                              image (src:"/ext/images/message.jpg")
                              label( value: i.mess)
                              label( value: i.area)
                              label( value: i.date) 
                              button(label:'Click!')
               
                           
                            hbox {
                              
                              button(label:'No!', onClick:{ ev ->
                                    def b = ev.target
                                    b.setVisible(false)                                                 
                                })
                             image (src:"/ext/images/pass.jpg" , visible:true)  

                              
                            }
                
                          }
                  }

                 selectDelete = $("#output row:last-child button[label='Click!']")
                        selectDelete.on('click',{                    
                             alert('xxx')
                         }) 
           }
        })

         $('#mess').on('click',{
          if($('#lol1').getText()=="" || $('#lol2').getText()=="" || $('#lol3').getText()==""){
            alert('please input data')
          }else{
          new Comment(

            to:$('#lol1').getText(),
            subject:$('#lol2').getText(),
            intro:$('#lol3').getText()
            ).save()
          alert('ไดรัแจ้งความคิดเห็ฯแล้ว')
        }

          })
        
        $('#clear').on('click',{
          
          $('#x1')[0].text= ''
          $('#x3')[0].text= ''
          $('#x2')[0].text= ''
          $('#x4')[0].text= ''

       })

    }
}
