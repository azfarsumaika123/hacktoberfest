<div align="center">

# 🎯 Computer Vision Projects Collection

[![Python](https://img.shields.io/badge/Python-3.7+-3776AB?style=for-the-badge&logo=python)](https://python.org/)
[![OpenCV](https://img.shields.io/badge/OpenCV-4.5+-5C3EE8?style=for-the-badge&logo=opencv)](https://opencv.org/)
[![MediaPipe](https://img.shields.io/badge/MediaPipe-0.8+-FF6B6B?style=for-the-badge&logo=google)](https://mediapipe.dev/)

*A collection of professional-grade computer vision applications built with Python, OpenCV, and MediaPipe for real-world automation and monitoring solutions.*

</div>

---

## 📋 Table of Contents
- [🎯 Projects Overview](#-projects-overview)
- [🛠️ System Requirements](#️-system-requirements)
- [📥 Installation Guide](#-installation-guide)
- [🚀 Quick Start](#-quick-start)
- [📖 Project Documentation](#-project-documentation)
- [🤝 Contributing](#-contributing)

---

## 🎯 Projects Overview

### 1. 🌟 Webcam Motion Detector
Real-time motion detection system with comprehensive logging capabilities.

**Key Features:**
- ✅ Real-time motion detection using computer vision
- ✅ Automatic time logging with start/end timestamps
- ✅ CSV export functionality for data analysis
- ✅ Configurable sensitivity settings

### 2. 🖱️ Virtual Mouse Controller
Advanced hand gesture-based mouse control system with audio and display management.

**Key Features:**
- ✅ Hand gesture recognition for mouse control
- ✅ Air-based clicking and scrolling
- ✅ System volume control via hand gestures
- ✅ Screen brightness adjustment
- ✅ Real-time hand tracking visualization

---

## 🛠️ System Requirements

| Component | Minimum | Recommended |
|-----------|---------|-------------|
| **Python** | 3.7+ | 3.9+ |
| **RAM** | 4GB | 8GB+ |
| **Webcam** | 720p | 1080p |
| **OS** | Windows 10/Linux/macOS | Windows 11/Latest Linux/macOS |

---

## 📥 Installation Guide

### 🔧 Method 1: Project-Specific Installation

#### For Webcam Motion Detector:
```bash
# Install core dependencies
pip install opencv-python pandas

# Optional: Install with specific versions
pip install opencv-python==4.5.3.56 pandas==1.3.0
```

#### For Virtual Mouse Controller:
```bash
# Install all required dependencies
pip install pyautogui==0.9.53
pip install opencv-python==4.5.3.56
pip install mediapipe==0.8.6.2
pip install comtypes==1.1.10
pip install pycaw==20181226
pip install screen-brightness-control==0.9.0
```

### 🚀 Method 2: Complete Environment Setup
```bash
# Clone the repository
git clone <repository-url>
cd PlayCafe

# Install all dependencies at once
pip install -r requirements.txt

# Alternative: Create virtual environment (recommended)
python -m venv cv_projects
source cv_projects/bin/activate  # Linux/macOS
# cv_projects\Scripts\activate    # Windows

pip install -r requirements.txt
```

---

## 🚀 Quick Start

### 🌟 Running Motion Detector
```bash
# Navigate to project directory
cd motion_detector

# Run the application
python motion_detector.py

# View generated logs
ls motion_logs/  # Check CSV files
```

### 🖱️ Running Virtual Mouse
```bash
# Navigate to project directory
cd virtual_mouse

# Run the application
python virtual_mouse.py

# Use hand gestures to control your system!
```

---

## 📖 Project Documentation

### 🌟 Webcam Motion Detector

**Core Dependencies:**
```
opencv-python >= 4.5.0
pandas >= 1.3.0
```

**Usage Example:**
```python
import cv2
import pandas as pd
from datetime import datetime

# Initialize motion detector
detector = MotionDetector()
detector.start_monitoring()
```

### 🖱️ Virtual Mouse Controller

**Core Dependencies:**
```
pyautogui==0.9.53          # Mouse automation
opencv-python==4.5.3.56    # Computer vision
mediapipe==0.8.6.2         # Hand tracking
comtypes==1.1.10           # Windows COM interface
pycaw==20181226            # Audio control
screen-brightness-control==0.9.0  # Display control
```

**Gesture Controls:**
| Gesture | Action | Description |
|---------|--------|-------------|
| ✋ **Open Palm** | Move Cursor | Navigate mouse pointer |
| 👆 **Index Point** | Left Click | Primary mouse button |
| ✌️ **Peace Sign** | Right Click | Context menu |
| 🤏 **Pinch** | Scroll | Vertical scrolling |
| 👋 **Wave** | Volume Control | Adjust system volume |

---

## 🔧 Advanced Configuration

### Environment Variables
```bash
# Set custom paths
export CV_PROJECTS_PATH="/path/to/projects"
export MOTION_LOG_DIR="/path/to/logs"

# Performance tuning
export OPENCV_DNN_BACKEND="CUDA"  # GPU acceleration
```

### Requirements.txt
```txt
# Motion Detector
opencv-python==4.5.3.56
pandas>=1.3.0

# Virtual Mouse
pyautogui==0.9.53
mediapipe==0.8.6.2
comtypes==1.1.10
pycaw==20181226
screen-brightness-control==0.9.0

# Development tools
pytest>=6.0.0
black>=21.0.0
flake8>=3.9.0
```

---

## 🤝 Contributing

We welcome contributions! Please follow these guidelines:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

Made with ❤️ by the Computer Vision Community

[![GitHub stars](https://img.shields.io/github/stars/username/repo?style=social)](https://github.com/username/repo)
[![GitHub forks](https://img.shields.io/github/forks/username/repo?style=social)](https://github.com/username/repo)

</div>
