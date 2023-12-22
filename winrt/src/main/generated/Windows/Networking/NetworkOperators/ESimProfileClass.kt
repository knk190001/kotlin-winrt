package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimProfileClass.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.ESimProfileClass;i4)")
@WinRTByReference(brClass = ESimProfileClass.ByReference::class)
public enum class ESimProfileClass(
  public val value: Int
) : NativeMapped {
  Operational(0),
  Test(1),
  Provisioning(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ESimProfileClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Operational
      1 -> Test
      2 -> Provisioning
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ESimProfileClass> {
    public fun setValue(newValue: ESimProfileClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ESimProfileClass =
        ESimProfileClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ESimProfileClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ESimProfileClass =
        ESimProfileClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: ESimProfileClass): Int = obj.value
  }
}
