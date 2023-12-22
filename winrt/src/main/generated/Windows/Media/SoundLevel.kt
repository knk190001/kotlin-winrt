package Windows.Media

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

@ABIMarker(SoundLevel.ABI::class)
@Signature("enum(Windows.Media.SoundLevel;i4)")
@WinRTByReference(brClass = SoundLevel.ByReference::class)
public enum class SoundLevel(
  public val value: Int
) : NativeMapped {
  Muted(0),
  Low(1),
  Full(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SoundLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Muted
      1 -> Low
      2 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SoundLevel> {
    public fun setValue(newValue: SoundLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SoundLevel =
        SoundLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SoundLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SoundLevel =
        SoundLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: SoundLevel): Int = obj.value
  }
}
