import { Banks } from './../../Banks';
import { Router, ActivatedRoute } from '@angular/router';
import { BanksService } from 'src/app/banks.service';
import { UserService } from 'src/app/user.service';
import { User } from 'src/app/user';
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-show-banks',
  template: `
    <div class="container">
       <div class="card">
         <h3 class="text-center">Show All Banks</h3>
         <div class="card-body">
             <table class="table table-stripped" >
                 <thead>
                   <th> Id </th>
                   <th> Bank Name</th>
                   </thead>
                   <tbody *ngFor="let bank of banks; let i =index"> 
                    
                        <tr>
                        <td>
                         {{bank.bankId}} 
                        </td>
                        
                        <td >
                        <a [routerLink]="['/bank/banksdetail', {id:bank.bankId}]">
                        {{bank.bankName}}
                        </a>  
                      </td>   
                        <td>
                          <button class="btn btn-danger" (click)='deleteBank(bank.bankId)'> Delete</button>
                        </td> 
                      </tr>  
                   
                   </tbody>
             </table>
         </div>
       </div>
       <button class="btn btn-primary" (click)='back()' >
        back
      </button>
    </div> 
  `,
  styles: [
  ]
})
export class ShowBanksComponent implements OnInit {

  public banks!: Banks[];
  data:any
  
  constructor(private bankService: BanksService,private http:HttpClient,private router :Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
this.bankService.getBanks().subscribe((data:Banks[])=>{
  console.log(data);
  this.banks=data;
})
  }

  back(){
    return this.router.navigate(['/bank/banks'],{relativeTo:this.route})
  }


  deleteBank(index:any){
   this.http.delete('http://localhost:9091/banks/'+index).subscribe((result)=>{
     console.log('successfully deleted:',result)
   })
   
   for(var i=0; i<this.banks.length; i++){
    if(this.banks[i].bankId == index){
      this.banks.splice(i,1);
      break;
    }
   }
   
  }

}
