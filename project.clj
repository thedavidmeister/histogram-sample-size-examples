(defproject histogram-sample-size-examples "0.1.0-SNAPSHOT"
  :description "Just some examples of histograms getting better with more samples."
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.6"]]
  :profiles {:uberjar {:aot :all}})
