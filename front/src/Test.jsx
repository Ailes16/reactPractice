import React, { useState, useEffect } from "react";

const Test = () => {
  const [user, setUser] = useState([]);

  useEffect(() => {
    // APIをfetchする(呼び出す)
    fetch("http://localhost:8080", { method: "GET" })
      // レスポンスデータをjson形式に設定
      .then(res => res.json())
      // APIから渡されるレスポンスデータをstateにセット
      .then(data => setUser(data));
  }, []);
  return (
    <div>
      <p>{user.userId}</p>
      <p>{user.userName}</p>
    </div>
  );
};

export default Test;
