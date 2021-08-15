import { EmployeeService } from './../employee.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  public employees=[] as any;
  public errorMsg="";
  
  constructor(private _employeeService:EmployeeService) { }

  ngOnInit(){
    this._employeeService.getEmployees()
    .subscribe(data => this.employees = data,
               error =>this.errorMsg = error);
  }
}
