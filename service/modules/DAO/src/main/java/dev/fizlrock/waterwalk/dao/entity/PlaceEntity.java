package dev.fizlrock.waterwalk.dao.entity;

import lombok.Builder;
import lombok.Data;

/** PlaceEntity */

//     Name     |          Type          | Nullable | Default
// -------------+------------------------+----------+---------
//  name        | character varying(100) | "NO"     |
//  description | character varying(300) | "NO"     |
//  id          | bigint                 | "NO"     |

@Data
@Builder
public class PlaceEntity {
  private Long id;
  private String name;
  private String description;
}
