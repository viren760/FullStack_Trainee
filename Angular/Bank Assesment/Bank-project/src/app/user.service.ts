import { User } from './user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl='http://localhost:9091/login';

  constructor(private http:HttpClient) { }

  getUser():Observable<User[]>{
    return this.http.get<User[]>(`${this.baseUrl}`);
  }

}
