import { DepartmentContactComponent } from './department-contact/department-contact.component';
import { DepartmentOverviewComponent } from './department-overview/department-overview.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentComponent } from './department/department.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'',  redirectTo:'/department',pathMatch:'full'},
  {path :"department", component:DepartmentComponent},
  {path:"department/:id", component:DepartmentListComponent,children:[
    {path:'overview',component:DepartmentOverviewComponent},
    {path:'contact',component:DepartmentContactComponent}
  ]},
  {path : "employee", component:EmployeeComponent},
  {path:'**', component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export  const routingComponents = [DepartmentComponent, EmployeeComponent,PageNotFoundComponent,DepartmentListComponent,DepartmentContactComponent,DepartmentOverviewComponent]