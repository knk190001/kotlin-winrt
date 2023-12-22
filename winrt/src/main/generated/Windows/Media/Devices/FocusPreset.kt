package Windows.Media.Devices

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

@ABIMarker(FocusPreset.ABI::class)
@Signature("enum(Windows.Media.Devices.FocusPreset;i4)")
@WinRTByReference(brClass = FocusPreset.ByReference::class)
public enum class FocusPreset(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Manual(1),
  AutoMacro(2),
  AutoNormal(3),
  AutoInfinity(4),
  AutoHyperfocal(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FocusPreset {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Manual
      2 -> AutoMacro
      3 -> AutoNormal
      4 -> AutoInfinity
      5 -> AutoHyperfocal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusPreset> {
    public fun setValue(newValue: FocusPreset): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusPreset =
        FocusPreset.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusPreset, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusPreset =
        FocusPreset.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusPreset): Int = obj.value
  }
}
