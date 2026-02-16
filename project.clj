(defproject ring-refresh-starvation "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [ring/ring-core "1.15.3"]
                 [ring/ring-jetty-adapter "1.15.3"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler repro.web/app
         :auto-refresh? true
         :refresh-paths ["src"]})
