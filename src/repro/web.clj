(ns repro.web)

(defn app [_]
  {:status 200
   :headers {"Content-Type" "text/html; charset=utf-8"}
   :body "<!doctype html><html><head><title>ok</title></head><body>ok</body></html>"})
