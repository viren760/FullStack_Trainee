import { Banks } from './Banks';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BanksService {
 
  name=""

  status:boolean = false;
  private baseUrl='http://localhost:9091/banks';

  constructor(private http:HttpClient) { }

  getBanks():Observable<Banks[]>{
    return this.http.get<Banks[]>(`${this.baseUrl}`);
  }

}
