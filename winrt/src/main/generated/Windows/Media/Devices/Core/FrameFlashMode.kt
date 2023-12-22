package Windows.Media.Devices.Core

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

@ABIMarker(FrameFlashMode.ABI::class)
@Signature("enum(Windows.Media.Devices.Core.FrameFlashMode;i4)")
@WinRTByReference(brClass = FrameFlashMode.ByReference::class)
public enum class FrameFlashMode(
  public val value: Int
) : NativeMapped {
  Disable(0),
  Enable(1),
  Global(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FrameFlashMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disable
      1 -> Enable
      2 -> Global
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FrameFlashMode> {
    public fun setValue(newValue: FrameFlashMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FrameFlashMode =
        FrameFlashMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FrameFlashMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FrameFlashMode =
        FrameFlashMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FrameFlashMode): Int = obj.value
  }
}
