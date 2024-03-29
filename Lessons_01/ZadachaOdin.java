import org.json.JSONObject;

public class ZadachaOdin {
         public static StringBuilder answer(String QUERY, String PARAMS) {
            StringBuilder whereClause = new StringBuilder();
            StringBuilder resultQuery = new StringBuilder(QUERY);
    
            // Парсим параметры из JSON-строки
            JSONObject paramsJson = new JSONObject(PARAMS.replace("\\", ""));
    
            // Проходим по всем параметрам
            for (String key : paramsJson.keySet()) {
                String value = paramsJson.getString(key);
    
                // Если значение не равно "null", добавляем параметр в WHERE
                if (!value.equals("null")) {
                    if (whereClause.length() > 0) {
                        whereClause.append(" and ");
                    }
                    whereClause.append(key).append("='").append(value).append("'");
                }
            }
    
            // Если WHERE не пустой, добавляем его к запросу
            if (whereClause.length() > 0) {
                resultQuery.append(" where ").append(whereClause);
            }
    
            return resultQuery;
        }
    }