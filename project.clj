(defproject com.brunobonacci/ip-geoloc "0.3.0-SNAPSHOT"
  :description "A fully automated Clojure library for IP GeoLocation"
  :url "https://github.com/BrunoBonacci/ip-geoloc"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :scm {:name "git" :url "https://github.com/BrunoBonacci/ip-geoloc"}

  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]})
