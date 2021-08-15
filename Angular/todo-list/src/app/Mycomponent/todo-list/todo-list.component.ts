import { Todo } from './../../Todo';
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

 @Input() todo:Todo;
 @Output() todoDelete : EventEmitter<Todo> = new EventEmitter();

 constructor() {

  }

  ngOnInit(): void {
  }

  onClick(todo:Todo){
    this.todoDelete.emit(todo)
    console.log("click has been triggered")
  }



}
