package Windows.UI.Xaml

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

@ABIMarker(FontCapitals.ABI::class)
@Signature("enum(Windows.UI.Xaml.FontCapitals;i4)")
@WinRTByReference(brClass = FontCapitals.ByReference::class)
public enum class FontCapitals(
  public val value: Int
) : NativeMapped {
  Normal(0),
  AllSmallCaps(1),
  SmallCaps(2),
  AllPetiteCaps(3),
  PetiteCaps(4),
  Unicase(5),
  Titling(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FontCapitals {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> AllSmallCaps
      2 -> SmallCaps
      3 -> AllPetiteCaps
      4 -> PetiteCaps
      5 -> Unicase
      6 -> Titling
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FontCapitals> {
    public fun setValue(newValue: FontCapitals): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FontCapitals =
        FontCapitals.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FontCapitals, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FontCapitals =
        FontCapitals.values()[0].fromNative(value, null)

    public override fun toNative(obj: FontCapitals): Int = obj.value
  }
}
