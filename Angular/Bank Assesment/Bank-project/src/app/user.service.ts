import { BanksService } from './banks.service';
import { User } from './user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class UserService {
email:any;
password:any;

loginStatus= false;
buttonFlag = false;

  private baseUrl='http://localhost:9091/login';
  private postUrl='http://localhost:9091/login/login';
 

  constructor(private http:HttpClient, private service:BanksService) { }

  getUser():Observable<User[]>{
    return this.http.get<User[]>(`${this.baseUrl}`);
  } 
  
}
