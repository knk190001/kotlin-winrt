package Windows.Media.Capture

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(AppBroadcastCameraOverlayLocation.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastCameraOverlayLocation;i4)")
@WinRTByReference(brClass = AppBroadcastCameraOverlayLocation.ByReference::class)
public enum class AppBroadcastCameraOverlayLocation(
  public val value: Int
) : NativeMapped {
  TopLeft(0),
  TopCenter(1),
  TopRight(2),
  MiddleLeft(3),
  MiddleCenter(4),
  MiddleRight(5),
  BottomLeft(6),
  BottomCenter(7),
  BottomRight(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastCameraOverlayLocation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TopLeft
      1 -> TopCenter
      2 -> TopRight
      3 -> MiddleLeft
      4 -> MiddleCenter
      5 -> MiddleRight
      6 -> BottomLeft
      7 -> BottomCenter
      8 -> BottomRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppBroadcastCameraOverlayLocation> {
    public fun setValue(newValue: AppBroadcastCameraOverlayLocation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastCameraOverlayLocation =
        AppBroadcastCameraOverlayLocation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastCameraOverlayLocation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastCameraOverlayLocation =
        AppBroadcastCameraOverlayLocation.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastCameraOverlayLocation): Int = obj.value
  }
}
