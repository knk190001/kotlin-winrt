package Windows.System.Profile

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

@ABIMarker(PlatformDataCollectionLevel.ABI::class)
@Signature("enum(Windows.System.Profile.PlatformDataCollectionLevel;i4)")
@WinRTByReference(brClass = PlatformDataCollectionLevel.ByReference::class)
public enum class PlatformDataCollectionLevel(
  public val value: Int
) : NativeMapped {
  Security(0),
  Basic(1),
  Enhanced(2),
  Full(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlatformDataCollectionLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Security
      1 -> Basic
      2 -> Enhanced
      3 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlatformDataCollectionLevel> {
    public fun setValue(newValue: PlatformDataCollectionLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlatformDataCollectionLevel =
        PlatformDataCollectionLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlatformDataCollectionLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlatformDataCollectionLevel =
        PlatformDataCollectionLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlatformDataCollectionLevel): Int = obj.value
  }
}
