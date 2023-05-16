class Metar {
    var stationCode: String
    var temperature: Double
    var dewPoint: Double
    var windDirection: Int
    var windSpeed: Int

    init(stationCode: String, temperature: Double, dewPoint: Double, windDirection: Int, windSpeed: Int) {
        self.stationCode = stationCode
        self.temperature = temperature
        self.dewPoint = dewPoint
        self.windDirection = windDirection
        self.windSpeed = windSpeed
    }

    convenience init(fields: [String]) {
        let stationCode = fields[0]
        let temperature = Double(fields[1]) ?? 0.0
        let dewPoint = Double(fields[2]) ?? 0.0
        let windDirection = Int(fields[3]) ?? 0
        let windSpeed = Int(fields[4]) ?? 0

        self.init(stationCode: stationCode, temperature: temperature, dewPoint: dewPoint, windDirection: windDirection, windSpeed: windSpeed)
    }

    convenience init(metarString: String) {
        let fields = metarString.split(separator: " ").map { String($0) }
        self.init(fields: fields)
    }

    var description: String {
        return "Metar:\nStation Code: \(stationCode)\nTemperature: \(temperature)°C\nDew Point: \(dewPoint)°C\nWind Direction: \(windDirection)°\nWind Speed: \(windSpeed) knots"
    }
}

