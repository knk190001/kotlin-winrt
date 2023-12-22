package Windows.UI.Xaml.Automation

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

@ABIMarker(RowOrColumnMajor.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.RowOrColumnMajor;i4)")
@WinRTByReference(brClass = RowOrColumnMajor.ByReference::class)
public enum class RowOrColumnMajor(
  public val value: Int
) : NativeMapped {
  RowMajor(0),
  ColumnMajor(1),
  Indeterminate(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RowOrColumnMajor {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RowMajor
      1 -> ColumnMajor
      2 -> Indeterminate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RowOrColumnMajor> {
    public fun setValue(newValue: RowOrColumnMajor): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RowOrColumnMajor =
        RowOrColumnMajor.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RowOrColumnMajor, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RowOrColumnMajor =
        RowOrColumnMajor.values()[0].fromNative(value, null)

    public override fun toNative(obj: RowOrColumnMajor): Int = obj.value
  }
}
