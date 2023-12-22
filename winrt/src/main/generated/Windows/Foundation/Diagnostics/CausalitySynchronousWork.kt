package Windows.Foundation.Diagnostics

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

@ABIMarker(CausalitySynchronousWork.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.CausalitySynchronousWork;i4)")
@WinRTByReference(brClass = CausalitySynchronousWork.ByReference::class)
public enum class CausalitySynchronousWork(
  public val value: Int
) : NativeMapped {
  CompletionNotification(0),
  ProgressNotification(1),
  Execution(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CausalitySynchronousWork {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> CompletionNotification
      1 -> ProgressNotification
      2 -> Execution
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CausalitySynchronousWork>
      {
    public fun setValue(newValue: CausalitySynchronousWork): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CausalitySynchronousWork =
        CausalitySynchronousWork.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CausalitySynchronousWork, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CausalitySynchronousWork =
        CausalitySynchronousWork.values()[0].fromNative(value, null)

    public override fun toNative(obj: CausalitySynchronousWork): Int = obj.value
  }
}
