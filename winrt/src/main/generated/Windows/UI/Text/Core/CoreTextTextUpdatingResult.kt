package Windows.UI.Text.Core

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

@ABIMarker(CoreTextTextUpdatingResult.ABI::class)
@Signature("enum(Windows.UI.Text.Core.CoreTextTextUpdatingResult;i4)")
@WinRTByReference(brClass = CoreTextTextUpdatingResult.ByReference::class)
public enum class CoreTextTextUpdatingResult(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  Failed(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreTextTextUpdatingResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreTextTextUpdatingResult> {
    public fun setValue(newValue: CoreTextTextUpdatingResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreTextTextUpdatingResult =
        CoreTextTextUpdatingResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreTextTextUpdatingResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreTextTextUpdatingResult =
        CoreTextTextUpdatingResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreTextTextUpdatingResult): Int = obj.value
  }
}
