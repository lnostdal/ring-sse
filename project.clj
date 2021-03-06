(defproject lnostdal/ring-sse "0.2.10"
  :description "Ring async (Spec 1.4+) Server-Sent Events handler (and helpers)"
  :url "https://github.com/lnostdal/ring-sse"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [org.clojure/core.async "1.3.610"]
                 [ring/ring-core "1.9.1" :scope "provided"]]
  :profiles {:dev {:dependencies [[ring/ring-mock "0.4.0"]]}}
  :deploy-repositories [["releases" {:url           "https://clojars.org/repo"
                                     :sign-releases false
                                     :username      :env
                                     :password      :env}]]
  ;; :release-tasks [["vcs" "assert-committed"]
  ;;                 ["change" "version" "leiningen.release/bump-version" "release"]
  ;;                 ["vcs" "commit"]
  ;;                 ["vcs" "tag"]
  ;;                 ["change" "version" "leiningen.release/bump-version"]
  ;;                 ["vcs" "commit"]
  ;;                 ["vcs" "push"]]
  )

