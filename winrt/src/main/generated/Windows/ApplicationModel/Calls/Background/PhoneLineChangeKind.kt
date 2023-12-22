package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(PhoneLineChangeKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind;i4)")
@WinRTByReference(brClass = PhoneLineChangeKind.ByReference::class)
public enum class PhoneLineChangeKind(
  public val value: Int
) : NativeMapped {
  Added(0),
  Removed(1),
  PropertiesChanged(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineChangeKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Added
      1 -> Removed
      2 -> PropertiesChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneLineChangeKind> {
    public fun setValue(newValue: PhoneLineChangeKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineChangeKind =
        PhoneLineChangeKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneLineChangeKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineChangeKind =
        PhoneLineChangeKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineChangeKind): Int = obj.value
  }
}
