import { EmployeeService } from './../employee.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public employees=[] as any;
  

  constructor(private _employeeService:EmployeeService ) {}

  ngOnInit(){
    this._employeeService.getEmployees()
    .subscribe(data => this.employees = data);
  }


}
