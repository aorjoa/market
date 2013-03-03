package reservarea

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class CarareaComposer extends GrailsComposer {

    def afterCompose = { window ->
        // initialize components here
          $('#p4').on('click',{
           if($('#ram').getSelectedItem()==null) {
                alert("กรุณาเลือกประเภทรถ")
             }else if($('#tt1').getText()=='') {
                alert('กรุณากรอกทะเบียนรถ')
            }else if($('#dd1').getText()=='') {
                alert('กรุณาเลือกวันและเวลา')
            }else if($('#price').getSelectedItem()==null) {
                alert('คุณกรอกข้อมูลไม่ครบ')
            }else{

            def es = 50
            def aaa= 100
            def bbb= 999
            def ccc= 400
            def ddd= 20

            if($('#price > radio[checked=true]').text()=="1-4 ชั่วโมง" && $('#ram > radio[checked=true]').text()=="รถยนต์" ){
            def c = new Cararea()
            c.car=$('#ram > radio[checked=true]').text()
            c.hour=$('#price > radio[checked=true]').text()
            c.tabean=$('#tt1').getText() 
            c.date=$('#dd1').val()
            c.price= es
           
            c.save()

            alert('บันทึกเรียบร้อย')

            }else if ($('#price > radio[checked=true]').text()=="4-12 ชั่วโมง" && $('#ram > radio[checked=true]').text()=="รถยนต์") {

            def c = new Cararea()
            c.car=$('#ram > radio[checked=true]').text()
            c.hour=$('#price > radio[checked=true]').text()
            c.tabean=$('#tt1').getText() 
            c.date=$('#dd1').val()
            c.price= ccc
           
            c.save()

            alert('บันทึกเรียบร้อย')


            }else if ($('#price > radio[checked=true]').text()=="1-4 ชั่วโมง" && $('#ram > radio[checked=true]').text()=="รถจักรยานยนต์") {

            def c = new Cararea()
            c.car=$('#ram > radio[checked=true]').text()
            c.hour=$('#price > radio[checked=true]').text()
            c.tabean=$('#tt1').getText() 
            c.date=$('#dd1').val()
            c.price= ddd
           
            c.save()

            alert('บันทึกเรียบร้อย')

            }else if ($('#price > radio[checked=true]').text()=="4-12 ชั่วโมง" && $('#ram > radio[checked=true]').text()=="รถจักรยานยนต์") {

            def c = new Cararea()
            c.car=$('#ram > radio[checked=true]').text()
            c.hour=$('#price > radio[checked=true]').text()
            c.tabean=$('#tt1').getText() 
            c.date=$('#dd1').val()
            c.price= aaa
           
            c.save()

            alert('บันทึกเรียบร้อย')

            }else{

            def c = new Cararea()
            c.car=$('#ram > radio[checked=true]').text()
            c.hour=$('#price > radio[checked=true]').text()
            c.tabean=$('#tt1').getText() 
            c.date=$('#dd1').val()
            c.price= bbb
           
            c.save()

            alert('บันทึกเรียบร้อย')

            }

           
            $('#tt1')[0].text = ''
            $('#dd1')[0].text = ''
            $('#ram1').setSelected(false)
            $('#ram2').setSelected(false)
            $('#price1').setSelected(false)
            $('#price2').setSelected(false)
            $('#price3').setSelected(false)
            

         def ret = Cararea.findAll()
            $('#qw > row').detach()
            for (i in ret){
                $('#qw').append{
                    row(){

                        label(value:i.car)
                        label(value:i.tabean)
                        label(value:i.date)
                        label(value:i.hour)
                        label(value:i.price)


                    }
                }
            } 



            }

        })
    }
}
