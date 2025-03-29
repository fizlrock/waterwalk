import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WaterwalkServiceClient } from './todo-service/ContractServiceClientPb';
import { Void } from './todo-service/contract_pb';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {

  constructor() {

    var client = new WaterwalkServiceClient("http://localhost:8080")
    var stream = client.getLocationList(new Void())


    stream.on('data', (response) => {
      console.log('Получена локация:', response);
    });


  }

  title = 'todo-web-ui';
}
