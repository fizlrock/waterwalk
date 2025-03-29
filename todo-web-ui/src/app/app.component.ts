import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WaterwalkServiceClient } from './todo-service/ContractServiceClientPb';
import { CreateLocationRq, Void } from './todo-service/contract_pb';

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

      let obj = {
        id: response.getId(),
        name: response.getName(),
        description: response.getDescription()
      }
      console.log('Получена локация:', obj);

    });


    let rq = new CreateLocationRq();
    rq.setName("Новая локация")
    rq.setDescription("Только что открылась")

    var resp = client.createLocation(rq);
    resp.then(x => console.log(x))




  }

  title = 'todo-web-ui';
}
