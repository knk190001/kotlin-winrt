package Microsoft.UI.Text

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

@ABIMarker(TabAlignment.ABI::class)
@Signature("enum(Microsoft.UI.Text.TabAlignment;i4)")
@WinRTByReference(brClass = TabAlignment.ByReference::class)
public enum class TabAlignment(
  public val value: Int
) : NativeMapped {
  Left(0),
  Center(1),
  Right(2),
  Decimal(3),
  Bar(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TabAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Center
      2 -> Right
      3 -> Decimal
      4 -> Bar
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TabAlignment> {
    public fun setValue(newValue: TabAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TabAlignment =
        TabAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TabAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TabAlignment =
        TabAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: TabAlignment): Int = obj.value
  }
}
