package Windows.Networking

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

@ABIMarker(DomainNameType.ABI::class)
@Signature("enum(Windows.Networking.DomainNameType;i4)")
@WinRTByReference(brClass = DomainNameType.ByReference::class)
public enum class DomainNameType(
  public val value: Int
) : NativeMapped {
  Suffix(0),
  FullyQualified(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DomainNameType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Suffix
      1 -> FullyQualified
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DomainNameType> {
    public fun setValue(newValue: DomainNameType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DomainNameType =
        DomainNameType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DomainNameType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DomainNameType =
        DomainNameType.values()[0].fromNative(value, null)

    public override fun toNative(obj: DomainNameType): Int = obj.value
  }
}
