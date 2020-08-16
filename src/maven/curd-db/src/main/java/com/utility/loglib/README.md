# Log in java

## Design Component

1. Log
    - Main log class which take log at different level.
    - By .properties and LogManager we can easily configure log.
    - Two ways to configure log
        - Via a configuration class.
        - Via a configuration file.
2. Handler
    - Get log and use formatter and filter to save it.
    - We can provide our own Handler but default available are
        - ConsoleHandler
        - FileHandler
        - StreamHandler
        - SocketHandler
        - MemoryHandler
3. Formatter
    - log to specific look.
    - We can provide our own Formatter but default available are
        - XMLFormatter
        - SimpleFormatter
4. Filter
    - Before saving log we can filter some log
    - We can override `isLoggable` method to write LogRecord.

## Log

- There are two ways of log in java
    1. `org.apache.log4j.*` package provides the following levels in descending order:
        ```
        FATAL
        ERROR
        WARN
        INFO
        DEBUG
        ```
    2. `java.util.logging` package provides the following levels in descending order:
        ```
        SEVERE(HIGHEST LEVEL)
        WARNING
        INFO
        CONFIG
        FINE
        FINER
        FINEST(LOWEST LEVEL)
        ```

# Log by Configuration File

- handlers:
    - A white space or comma separated list of handler class names to be added to the root Logger
- config
    - A white space or comma separated list of class names which will be instantiated when the LogManager is initialized. The constructors of these classes can execute arbitrary configuration code.
-------------------------------------------------------------------------------
- "logger".handlers
    - Sets the handler classes to use for a given Logger in the hierarchy. Replace the "logger" with a specific name of a Logger in your app (e.g. com.jenkov.web).
- "logger".useParentHandlers
    - Tells a given Logger whether it should log to its parents or not (true or false).
- "logger".level
    - Tells a given Logger what minimum log level it should log.
-------------------------------------------------------------------------------
- java.util.logging.FileHandler.level
    - Sets the default log level for all FileHandler's.
- java.util.logging.FileHandler.filter
    - A class name of the Filter to use on all FileHandler's.
- java.util.logging.FileHandler.formatter
    - A class name of the Formatter to use on all FileHandler's.
- java.util.logging.FileHandler.encoding
    - The encoding to use by all FileHandler's (e.g. UTF-8, UTF-16 etc.).
- java.util.logging.FileHandler.limit
    - The approximate amount of bytes to write to a log file, before rotating to a new file.
- java.util.logging.FileHandler.count
    - The number of log files to use in the log file rotation.
- java.util.logging.FileHandler.append
    - Sets whether or not the FileHandler's should append to an existing file or not (true or false), if an existing log file is found.
- java.util.logging.FileHandler.pattern
    - The log file name pattern.
-------------------------------------------------------------------------------
- java.util.logging.ConsoleHandler.level
    - Sets the default log level of all ConsoleHandler's.
- java.util.logging.ConsoleHandler.filter
    - Sets the Filter to use by all ConsoleHandler's
- java.util.logging.ConsoleHandler.formatter
    - Sets the Formatter to use by all ConsoleHandler's.
- java.util.logging.ConsoleHandler.encoding
    - Sets the encoding to use by all ConsoleHandler's.
-------------------------------------------------------------------------------
- java.util.logging.StreamHandler.level
    - Sets the default log level of all StreamHandler's.
- java.util.logging.StreamHandler.filter
    - Sets the Filter to use by all StreamHandler's
- java.util.logging.StreamHandler.formatter
    - Sets the Formatter to use by all StreamHandler's.
- java.util.logging.StreamHandler.encoding
    - Sets the encoding to use by all StreamHandler's.
-------------------------------------------------------------------------------
- java.util.logging.SocketHandler.level
    - Sets the default log level of all SocketHandler's.
- java.util.logging.SocketHandler.filter
    - Sets the Filter to use by all SocketHandler's.
- java.util.logging.SocketHandler.formatter
    - Sets the Formatter to use by all SocketHandler's.
- java.util.logging.SocketHandler.encoding
    - Sets the encoding to use by all SocketHandler's.
- java.util.logging.SocketHandler.host
    - Sets the host name of the host to send the log messages to (e.g. jenkov.com).
- java.util.logging.SocketHandler.port
    - Sets the port number of of the host to send the log message to (e.g. 9999).
-------------------------------------------------------------------------------
- java.util.logging.MemoryHandler.level
    - Sets the default log level of all MemoryHandler's.
- java.util.logging.MemoryHandler.filter
    - Sets the Filter to use by all MemoryHandler's.
- java.util.logging.MemoryHandler.size
    - The size of the internal LogRecord buffer.
- java.util.logging.MemoryHandler.push
    - The push level of messages causing the buffer to be pushed to the target Handler. Defaults to SEVERE.
- java.util.logging.MemoryHandler.target
    - The class name of the target Handler.
-------------------------------------------------------------------------------

# Log config example

- `log.properties`
```
handlers = java.util.logging.FileHandler
config   =

"logger".handlers           =
"logger".useParentHandlers  =
"logger".level              =

java.util.logging.FileHandler.level     = WARNING
java.util.logging.FileHandler.filter    =
java.util.logging.FileHandler.formatter =
java.util.logging.FileHandler.encoding  =
java.util.logging.FileHandler.limit     =
java.util.logging.FileHandler.count     =
java.util.logging.FileHandler.append    = false
java.util.logging.FileHandler.pattern   = log.%u.%g.txt

java.util.logging.ConsoleHandler.level     = WARNING
java.util.logging.ConsoleHandler.filter    =
java.util.logging.ConsoleHandler.formatter =
java.util.logging.ConsoleHandler.encoding  =

java.util.logging.StreamHandler.level     = WARNING
java.util.logging.StreamHandler.filter    =
java.util.logging.StreamHandler.formatter =
java.util.logging.StreamHandler.encoding  =

java.util.logging.SocketHandler.level     = WARNING
java.util.logging.SocketHandler.filter    =
java.util.logging.SocketHandler.formatter =
java.util.logging.SocketHandler.encoding  =
java.util.logging.SocketHandler.host      =
java.util.logging.SocketHandler.port      =

java.util.logging.MemoryHandler.level     = WARNING
java.util.logging.MemoryHandler.filter    =
java.util.logging.MemoryHandler.size      =
java.util.logging.MemoryHandler.push      =
java.util.logging.MemoryHandler.target    =
```
