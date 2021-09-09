import { Component, OnInit } from '@angular/core';
import { Employee } from '../data';
import { TestServiceService } from '../test-service.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public employees: any;

  constructor(private service: TestServiceService) { }

  ngOnInit(): void {
    this.service.getData().subscribe(data => this.employees=data);
    console.log(this.employees);
  }

  post(){
    this.service.postData({
      name: "Tony",
      //department: "Weapons",
      designation: "Iron Man",
      salary: 6455
    }).subscribe(data => console.log(data));
  }

}