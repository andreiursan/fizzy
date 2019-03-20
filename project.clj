(defproject fizzy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/andreiursan/fizzy"
  :license {:name "MIT License"
            :url "https://github.com/andreiursan/fizzy/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot fizzy.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
