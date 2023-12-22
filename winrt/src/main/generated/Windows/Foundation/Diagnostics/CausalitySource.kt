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

@ABIMarker(CausalitySource.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.CausalitySource;i4)")
@WinRTByReference(brClass = CausalitySource.ByReference::class)
public enum class CausalitySource(
  public val value: Int
) : NativeMapped {
  Application(0),
  Library(1),
  System(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CausalitySource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Application
      1 -> Library
      2 -> System
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CausalitySource> {
    public fun setValue(newValue: CausalitySource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CausalitySource =
        CausalitySource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CausalitySource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CausalitySource =
        CausalitySource.values()[0].fromNative(value, null)

    public override fun toNative(obj: CausalitySource): Int = obj.value
  }
}
