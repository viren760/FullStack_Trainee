import { Todo } from './../../Todo';
import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {
  title:string;
  desc:string;
  @Output() todoAdd : EventEmitter<Todo> = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
onSubmit(){
  const Todo={
    title:this.title,
    desc:this.desc
  }
  console.log(Todo.title);
  console.log(Todo.desc);
  this.todoAdd.emit();
}

}
