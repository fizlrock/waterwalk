package dev.fizlrock.waterwalk.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

/** RouteEntity */
@Table("route")
@Data
@NoArgsConstructor
public class RouteEntity {
  private Long id;
  private Long place_id;
  private String name;
  private String comment;
  private Long distance;
  private Long difficulty;
  private Long duration;
  private Long price;
}
