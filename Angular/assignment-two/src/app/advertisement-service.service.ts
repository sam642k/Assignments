import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AdvertisementModel } from './advertisement-model';

@Injectable({
  providedIn: 'root'
})
export class AdvertisementServiceService {
  static id=1;
  constructor(private http: HttpClient) { }

  setAdvertisement(adv: AdvertisementModel){
    adv.id=AdvertisementServiceService.id++;
    return this.http.post<AdvertisementModel>("http://localhost:8080/advertisement", adv);
  }

  updateAdvertisement(id: number, adv: AdvertisementModel){
    return this.http.put<AdvertisementModel>(`http://localhost:8080/advertisement/${id}`, adv);
  }

  getAllAdvertisments(){
    return this.http.get<AdvertisementModel[]>("http://localhost:8080/advertisement");
  }

  getAdvertisement(id: number){
    return this.http.get<AdvertisementModel>(`http://localhost:8080/advertisement/${id}`);
  }

  delete(id: number){
    return this.http.delete<AdvertisementModel>(`http://localhost:8080/advertisement/${id}`);
  }

}
