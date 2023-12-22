package Windows.ApplicationModel

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

@ABIMarker(PackageSignatureKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.PackageSignatureKind;i4)")
@WinRTByReference(brClass = PackageSignatureKind.ByReference::class)
public enum class PackageSignatureKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Developer(1),
  Enterprise(2),
  Store(3),
  System(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageSignatureKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Developer
      2 -> Enterprise
      3 -> Store
      4 -> System
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageSignatureKind> {
    public fun setValue(newValue: PackageSignatureKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageSignatureKind =
        PackageSignatureKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageSignatureKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageSignatureKind =
        PackageSignatureKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageSignatureKind): Int = obj.value
  }
}
