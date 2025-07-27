# Shuffle String Generator

## 项目简介

Shuffle String Generator 是一个随机字符串生成器应用，可以帮助用户快速生成各种类型的随机字符串。该应用支持多种模式，包括纯小写字母、纯大写字母、大小写混合、纯数字以及字母数字混合等模式，并允许用户自定义生成字符串的长度。

## 主要功能

- 🎲 多种生成模式：
    - 小写字母
    - 大写字母
    - 大小写混合
    - 纯数字
    - 字母数字混合
- 📏 自定义字符串长度
- 📋 一键复制生成结果
- ❤️ 收藏喜爱的字符串
- 💾 数据持久化存储
- 🌍 多语言支持（简体中文）

## 技术要点

### 开发技术

- **Kotlin** - 主要开发语言
- **Jetpack Compose** - 现代 Android UI 工具包
- **Material 3** - Google 最新的设计系统
- **Android Architecture Components**

### 核心组件

- **DataStore** - 用于持久化存储收藏的字符串
- **Compose Runtime** - 状态管理 (`mutableStateOf`, `mutableStateListOf`)
- **Material Icons** - 使用官方图标库
- **Clipboard Manager** - 实现复制功能

### 架构模式

- **声明式 UI** - 使用 Compose 构建界面
- **单向数据流** - 状态管理和界面更新
- **函数式编程** - Composable 函数设计

### 国际化支持

- **多语言资源** - 支持字符串资源的多语言管理
- **资源引用** - 使用 `stringResource` 引用字符串资源

## 使用场景

- 生成随机密码
- 创建唯一标识符
- 测试数据生成
- 游戏中的随机名称生成

## 屏幕截图

（此处可以添加应用界面截图）

## 安装说明

1. 克隆项目到本地
2. 使用 Android Studio 打开项目
3. 同步 Gradle 依赖
4. 构建并运行应用

## 依赖库

```gradle
// Compose 相关
implementation "androidx.compose.ui:ui:$compose_version"
implementation "androidx.compose.material3:material3:$compose_version"
implementation "androidx.compose.material:material-icons-extended:$compose_version"

// DataStore
implementation "androidx.datastore:datastore-preferences:1.0.0"

// Lifecycle
implementation "androidx.lifecycle:lifecycle-runtime-compose:2.6.1"
```