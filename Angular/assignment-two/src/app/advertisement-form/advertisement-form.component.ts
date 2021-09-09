import { Component, OnInit} from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AdvertisementModel } from '../advertisement-model';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-advertisement-form',
  templateUrl: './advertisement-form.component.html',
  styleUrls: ['./advertisement-form.component.css']
})
export class AdvertisementFormComponent implements OnInit {

  categories=['Furniture', 'Hardware', 'Mobile'];

  advForm= this.fb.group({
    title: ['', [Validators.required, Validators.minLength(3)]],
    name: ['Tony', Validators.required],
    category: ['', Validators.required],
    description: ['']
  });
  public advModel: any;
  public advs: AdvertisementModel[]=[];
  public isSubmitted=false;

  constructor(public service: AdvertisementServiceService, public router: Router, public fb: FormBuilder) { }

  ngOnInit(): void {
  }

  addNewAdv(){
    console.log(this.advForm);
    console.log(this.advForm.value);
    this.advModel=this.advForm.value;
    this.advs.push(this.advModel);
    this.advForm.patchValue(this.service.setAdvertisement(this.advModel).subscribe(data => console.log(data)));
    this.isSubmitted=true;
  }

}
