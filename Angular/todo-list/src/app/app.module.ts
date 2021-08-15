import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { TodosComponent } from './Mycomponent/todos/todos.component';
import { TodoListComponent } from './Mycomponent/todo-list/todo-list.component';
import { AddTodoComponent } from './Mycomponent/add-todo/add-todo.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    TodosComponent,
    TodoListComponent,
    AddTodoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    // TodoComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
