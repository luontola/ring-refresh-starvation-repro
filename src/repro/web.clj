(ns repro.web)

(defn app [_]
  {:status 200
   :headers {"Content-Type" "text/html; charset=utf-8"}
   :body "<!doctype html>
<html>
<head>
  <title>ok</title>
</head>
<body>
  <p>ok</p>
  <ul>
    <li><a href='/page1'>page 1</a></li>
    <li><a href='/page2'>page 2</a></li>
    <li><a href='/page3'>page 3</a></li>
    <li><a href='/page4'>page 4</a></li>
    <li><a href='/page5'>page 5</a></li>
  </ul>
</body>
</html>"})
