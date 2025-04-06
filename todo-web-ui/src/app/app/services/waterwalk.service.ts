import { Injectable } from '@angular/core';
import { WaterwalkServiceClient } from '../../todo-service/ContractServiceClientPb';
import { RouterHashLocationFeature } from '@angular/router';
import { CreateLocationRq, LocationDto, Void } from '../../todo-service/contract_pb';
import { RtlScrollAxisType } from '@angular/cdk/platform';

@Injectable({
  providedIn: 'root'
})
export class WaterwalkService {



  private backendClient: WaterwalkServiceClient;


  public locations: LocationDto[] = [];

  constructor() {
    this.backendClient =
      new WaterwalkServiceClient("http://localhost:8080");

    this.initLocations();
  }


  private initLocations() {

    var locationStream = this.backendClient.getLocationList(new Void);

    locationStream.on('data', (response: LocationDto) => {
      this.locations.push(response)
    });
  }

  public addLocation(rq: CreateLocationRq): Promise<LocationDto> {
    var locationPromise = this.backendClient.createLocation(rq);
    locationPromise.then((result: LocationDto) => this.locations.push(result))
    return locationPromise;
  }


  public saveLocation(location: LocationDto) {

    var resp = this.backendClient.updateLocation(location)
    resp.then()


  }


  public deleteLocation(location: LocationDto) {
    let index = this.locations.indexOf(location);
    this.locations.splice(index, 1);

  }
}
