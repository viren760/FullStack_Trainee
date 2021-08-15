import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-department',
  template: `
   <div (click)="onSelect(department)" *ngFor="let department of departments" class="dep">
     <span class="badge">{{department.id}} </span>- <span class="text">{{department.name}} </span>
   </div> 
  `,
  styles: [
  ]
})
export class DepartmentComponent implements OnInit {

  departments=[
    {"id":1, "name":"Java"},
    {"id":2, "name":"Angular"},
    {"id":3, "name":"Node"},
    {"id":4, "name":"React"}
  ]

  constructor(private router:Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  onSelect(department){
    // this.router.navigate(['/department',department.id]);
    this.router.navigate([department.id],{relativeTo:this.route})
  }

}
