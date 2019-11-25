(ns noober-backend.system
  (:require
   [com.stuartsierra.component :as component]
   [noobers.schema :as schema]
   [noobers.server :as server]))

(defn new-system
  []
  (merge (component/system-map)
         (server/new-server)
         (schema/new-schema-provider)))