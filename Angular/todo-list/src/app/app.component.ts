import { Component } from '@angular/core';
import{Todo} from '../app/Todo'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  todos:Todo[];
  title = 'Todo-list';

 constructor(){
   this.todos =[
     {
       sno:3,
       title:"this is title",
       desc:"description",
       active:true
     }
   ]
  // setTimeout(() => {
  //   this.title="Changed title";
  // }, 2000);
 }
}
