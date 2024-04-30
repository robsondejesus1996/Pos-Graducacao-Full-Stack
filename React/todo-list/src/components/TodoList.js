import { useState } from "react";
import { TodoListItem } from "./TodoListItem";

export const TodoList = () => {
  const defaultItems = [
    { name: "Tarefa 1", isCompleted: false },
    { name: "Tarefa 2", isCompleted: false },
    { name: "Tarefa 3", isCompleted: false },
    { name: "Tarefa 4", isCompleted: false },
  ];
  const [items, setItems] = useState(defaultItems);

  return (
    <ul>
      {items.map((item) => (
        <TodoListItem item={item} />
      ))}
    </ul>
  );
};
