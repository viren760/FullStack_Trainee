import { Banks } from './../Banks';
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
         <h3 class="text-center">Bank Details</h3>
         <div class="card-body">
             <table class="table table-stripped" >
                 <thead>
                   <th> Id </th>
                   <th> Bank Name</th>
                   </thead>
                   <tbody  *ngFor="let bank of banks"> 
                      <tr>
                        <td>
                          {{bank.bankId}}
                        </td>
                        <td >
                          {{bank.bankName}}
                        </td>  
                        <td>
                          <!-- <button class="btn btn-danger" (click)='deleteBank(bank.Id)'> Delete</button> -->
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

  public banks:Banks[] | undefined;
  
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

  showBankDetails(Id:any){
   this.http.get('http://localhost:9091/banks/',Id).subscribe((result)=>{
     console.log('get the data :',result)
   })
  }

  // deleteBank(Id:any){
  //  this.http.delete('http://localhost:9091/banks/',Id).subscribe((result)=>{
  //    console.log('successfully deleted:',result)
  //  }) 
  // }

}
