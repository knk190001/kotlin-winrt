package Windows.Security.ExchangeActiveSyncProvisioning

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

@ABIMarker(EasEncryptionProviderType.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType;i4)")
@WinRTByReference(brClass = EasEncryptionProviderType.ByReference::class)
public enum class EasEncryptionProviderType(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  WindowsEncryption(1),
  OtherEncryption(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasEncryptionProviderType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> WindowsEncryption
      2 -> OtherEncryption
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EasEncryptionProviderType>
      {
    public fun setValue(newValue: EasEncryptionProviderType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasEncryptionProviderType =
        EasEncryptionProviderType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasEncryptionProviderType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasEncryptionProviderType =
        EasEncryptionProviderType.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasEncryptionProviderType): Int = obj.value
  }
}
