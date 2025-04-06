import { Component, OnInit } from '@angular/core';

import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { CreateLocationRq, LocationDto } from '../../todo-service/contract_pb';
import { WaterwalkService } from '../services/waterwalk.service';
import { LocationFormComponent } from '../components/location-form/location-form.component';
import { MatDialog } from '@angular/material/dialog';


@Component({
  selector: 'app-location',
  imports: [MatCardModule, MatButtonModule, MatIconModule, LocationFormComponent],
  templateUrl: './location.component.html',
  styleUrl: './location.component.scss'
})
export class LocationComponent implements OnInit {

  protected waterwalkService: WaterwalkService;

  constructor(service: WaterwalkService, private dialog: MatDialog) {
    this.waterwalkService = service;
  }


  ngOnInit(): void {
  }

  protected openRoutesInLocation(id: string) {
    console.log(`opening routes in location with id ${id}`)
  }

  protected deleteLocation(location: LocationDto) {
    console.log(`deleting location ${location}`)
    this.waterwalkService.deleteLocation(location);

  }



  protected createLocation() {

    console.log(`editing location ${location}`)
    const dialogRef = this.dialog.open(LocationFormComponent, {
    });


    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        let rq = new CreateLocationRq();
        rq.setName(result.name)
        rq.setDescription(result.description);
        this.waterwalkService.addLocation(rq);
      }
    })
  }


  protected editLocation(location: LocationDto) {

    console.log(`editing location ${location}`)
    const dialogRef = this.dialog.open(LocationFormComponent, {
      data: {
        name: location.getName(),
        description: location.getDescription()
      }
    });


    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        location.setName(result.name);
        location.setDescription(result.description);
        this.waterwalkService.saveLocation(location);
        // Получаем данные из формы и сохраняем
        // let rq = new CreateLocationRq().
        //   setName(result.name).
        //   setDescription(result.description);
        // this.waterwalkService.addLocation(rq);
      }
    })



  }



}
