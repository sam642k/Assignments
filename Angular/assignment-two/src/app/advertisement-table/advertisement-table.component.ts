import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdvertisementModel } from '../advertisement-model';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-advertisement-table',
  templateUrl: './advertisement-table.component.html',
  styleUrls: ['./advertisement-table.component.css']
})
export class AdvertisementTableComponent implements OnInit {

  public advs: AdvertisementModel[]=[];
  constructor(public service: AdvertisementServiceService, public router:Router) { }

  ngOnInit(): void {
    this.service.getAllAdvertisments().subscribe(data =>this.advs=data)
    
  }

  delete(id: number){
    this.service.delete(id).subscribe();
    this.service.getAllAdvertisments().subscribe(data => this.advs=data);
  }

  edit(id: number){
    this.router.navigate(['/edit-product', id]);
  }

}
