import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { AdvertisementModel } from '../advertisement-model';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  public id=-1;
  public title='';
  public name='';
  public category='';
  public description='';
  categories=['Furniture', 'Hardware', 'Mobile'];

  constructor(public router:Router, public route: ActivatedRoute, public service: AdvertisementServiceService) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) =>{
      this.id= parseInt(params.get('id') || '-1');
    })
    console.log(this.id);
    
    this.service.getAdvertisement(this.id).subscribe(adv =>{
      this.title= adv.title;
      this.name= adv.name;
      this.category= adv.category;
      this.description= adv.description;
    });
  }

  update(){
    this.service.updateAdvertisement(this.id, {id: this.id, title:this.title, name: this.name, category: this.category, description: this.description}).subscribe();
    this.router.navigate(['/advertisements']);
  }

}
