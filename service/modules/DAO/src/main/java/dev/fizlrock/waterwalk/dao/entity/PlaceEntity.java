package dev.fizlrock.waterwalk.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/** PlaceEntity */
//     Name     |          Type          | Nullable | Default
// -------------+------------------------+----------+---------
//  name        | character varying(100) | "NO"     |
//  description | character varying(300) | "NO"     |
//  id          | bigint                 | "NO"     |

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Table("place")
public class PlaceEntity {

  @Id private Long id;

  @NonNull private String name;
  @NonNull private String description;
}
