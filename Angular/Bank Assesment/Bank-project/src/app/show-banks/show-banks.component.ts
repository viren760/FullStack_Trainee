import { BanksService } from './../banks.service';
import { UserService } from './../user.service';
import { User } from './../user';
import { Component, OnInit } from '@angular/core';
import { Banks } from '../Banks';
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
                   <tbody> 
                      <tr *ngFor="let bank of banks"  >
                        <td>
                          {{bank.bankId}}
                        </td>
                        <td>
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
    </div> 
  `,
  styles: [
  ]
})
export class ShowBanksComponent implements OnInit {

  public banks:Banks[] | undefined;
  
  constructor(private bankService: BanksService,private http:HttpClient) { }

  ngOnInit(): void {

this.bankService.getBanks().subscribe((data:Banks[])=>{
  console.log(data);
  this.banks=data;
})
  }

  // showBankDetails(Id:any){
  //  this.http.get('http://localhost:9091/banks/',Id).subscribe((result)=>{
  //    console.log('get the data :',result)
  //  })
  // }

  // deleteBank(Id:any){
  //  this.http.delete('http://localhost:9091/banks/',Id).subscribe((result)=>{
  //    console.log('successfully deleted:',result)
  //  }) 
  // }

}
