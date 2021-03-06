# Spring Cloud Loadbalancer Getting Started

Client-side load-balancer abstraction and implementation provided by Spring Cloud

## Description
### Dependency
- spring-cloud-starter-loadbalancer

### Related Repository

- https://github.com/shinyay/spring-cloud-getting-started
- https://github.com/shinyay/spring-cloud-gateway-gs
- https://github.com/shinyay/spring-cloud-config-gs
- https://github.com/shinyay/spring-cloud-eureka-server-gs
- https://github.com/shinyay/spring-cloud-config-client-gs

### Spring RestTemplate as a Load Balancer Client
Create a `RestTemplate` Bean with `@Bean` and `@LoadBalanced` qualifier

```kotlin
@LoadBalanced
@Bean
fun template() = RestTemplate()
```

```kotlin
template.getForObject(url, String::class.java)
```

### Spring WebClient as a Load Balancer Client
Create a `WebClient.Builder` Bean with `@Bean` and `@LoadBalanced` qualifier

```kotlin
@LoadBalanced
@Bean
fun webClient() = WebClient.builder()
```

```kotlin
webClientBuilder.build()
    .get()
    .uri(url)
    .retrieve()
    .bodyToMono(String::class.java)
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
