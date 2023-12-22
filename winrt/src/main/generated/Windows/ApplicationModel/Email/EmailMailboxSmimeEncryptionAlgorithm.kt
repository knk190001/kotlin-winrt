package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMailboxSmimeEncryptionAlgorithm.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm;i4)")
@WinRTByReference(brClass = EmailMailboxSmimeEncryptionAlgorithm.ByReference::class)
public enum class EmailMailboxSmimeEncryptionAlgorithm(
  public val value: Int
) : NativeMapped {
  Any(0),
  TripleDes(1),
  Des(2),
  RC2128Bit(3),
  RC264Bit(4),
  RC240Bit(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxSmimeEncryptionAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Any
      1 -> TripleDes
      2 -> Des
      3 -> RC2128Bit
      4 -> RC264Bit
      5 -> RC240Bit
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailMailboxSmimeEncryptionAlgorithm> {
    public fun setValue(newValue: EmailMailboxSmimeEncryptionAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxSmimeEncryptionAlgorithm =
        EmailMailboxSmimeEncryptionAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxSmimeEncryptionAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxSmimeEncryptionAlgorithm =
        EmailMailboxSmimeEncryptionAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxSmimeEncryptionAlgorithm): Int = obj.value
  }
}
