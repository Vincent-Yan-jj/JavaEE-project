/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function accFocus() {
//捕获触发事件的对象，并设置为以下语句的默认对象 
with(event.srcElement) 
     //如果当前值为默认值，则清空 
if(value==defaultValue) value="" 
} 

function accBlur(){ 
//捕获触发事件的对象，并设置为以下语句的默认对象 
with(event.srcElement) 
//如果当前值为空，则重置为默认值 
if(value=="") value=defaultValue 
} 

