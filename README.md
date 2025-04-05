🔹 1. Proxy Pattern – Real Estate Image System
📘 Problem:
You're building a system for a real estate agency. Thumbnails should load immediately, but high-resolution images must load only on user demand (e.g., click-to-zoom).

✅ Solution:
Implemented Proxy Pattern:

ImageProxy enables lazy loading of full images.

ProtectionProxyImageUploader ensures only authorized agents can upload images.

AgentSession simulates login/authentication.

🎯 Problem Solved:
Reduced memory and bandwidth consumption by loading full images only when needed.

Enhanced security by restricting image upload functionality.

🔹 2. Flyweight Pattern – Map Marker Rendering
📘 Problem:
Rendering 1000+ markers on a map (hospitals, gas stations, restaurants), all with shared styles.

✅ Solution:
Applied Flyweight Pattern:

MarkerFactory caches marker styles (hospital, gas, restaurant).

Each Marker shares a single instance of MarkerStyle rather than duplicating.

📊 Result:
1000 markers use only 3 unique style objects.

Saves memory and improves rendering efficiency.
🧠 Used Design Patterns
✅ Proxy Pattern (Structural)

✅ Flyweight Pattern (Structural)
