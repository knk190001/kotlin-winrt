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

@ABIMarker(LetterCase.ABI::class)
@Signature("enum(Microsoft.UI.Text.LetterCase;i4)")
@WinRTByReference(brClass = LetterCase.ByReference::class)
public enum class LetterCase(
  public val value: Int
) : NativeMapped {
  Lower(0),
  Upper(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LetterCase {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Lower
      1 -> Upper
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LetterCase> {
    public fun setValue(newValue: LetterCase): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LetterCase =
        LetterCase.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LetterCase, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LetterCase =
        LetterCase.values()[0].fromNative(value, null)

    public override fun toNative(obj: LetterCase): Int = obj.value
  }
}
