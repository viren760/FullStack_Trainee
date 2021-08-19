import { BanksService } from 'src/app/banks.service';
import { Component } from '@angular/core';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'Bank-project';
  isButtonVisible = true;
  constructor(public authservice:UserService, public service:BanksService){
    localStorage.setItem('status',"0");
  }

  ngOnInit(): void {
  }

  logout(){
    this.service.status = false;
    localStorage.setItem('status',"0");
  }



}
