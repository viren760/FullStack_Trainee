import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';


@Component({
  selector: 'app-department-list',
  template: `
    <p>
     Deparment id is {{departmentId}}
    </p>
    <button (click)="previous()"> Previous</button>
    <button (click)="next()"> Next</button>
    <br>
    <br>
    <p>
      <button (click)="overview()">overview</button>
      <button (click)="contact()">contact</button>
    </p> 
    <router-outlet></router-outlet>
    <div>
      <button (click)="goback()">
        Back
      </button>
    </div>
  `,
  styles: [
  ]
})
export class DepartmentListComponent implements OnInit {
 public departmentId;
  constructor(private route : ActivatedRoute, private router :Router) { }

  ngOnInit(){
    this.route.paramMap.subscribe((params:ParamMap)=>{
      let id = parseInt(params.get('id')||'{}');
      this.departmentId=id;
    })
  }

  previous(){
    let perviousid= this.departmentId-1;
   this.router.navigate(['/department',perviousid]);
  // this.router.navigate([perviousid],{relativeTo:this.route});
  }

  next(){
   let nextid= this.departmentId +1;
   this.router.navigate(['/department',nextid]);
  // this.router.navigate([nextid],{relativeTo:this.route});
  }

  goback(){
    let selectedId= this.departmentId ? this.departmentId:null;
    // this.router.navigate(['/department',{id:selectedId}]);
    this.router.navigate(['../',{id:selectedId}],{relativeTo: this.route})
  }


overview(){
this.router.navigate(['overview'],{relativeTo:this.route})
}

contact(){
this.router.navigate(['contact'],{relativeTo:this.route})
}

}
