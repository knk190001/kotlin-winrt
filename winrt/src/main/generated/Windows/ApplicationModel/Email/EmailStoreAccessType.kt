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

@ABIMarker(EmailStoreAccessType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailStoreAccessType;i4)")
@WinRTByReference(brClass = EmailStoreAccessType.ByReference::class)
public enum class EmailStoreAccessType(
  public val value: Int
) : NativeMapped {
  AppMailboxesReadWrite(0),
  AllMailboxesLimitedReadWrite(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailStoreAccessType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AppMailboxesReadWrite
      1 -> AllMailboxesLimitedReadWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailStoreAccessType> {
    public fun setValue(newValue: EmailStoreAccessType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailStoreAccessType =
        EmailStoreAccessType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailStoreAccessType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailStoreAccessType =
        EmailStoreAccessType.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailStoreAccessType): Int = obj.value
  }
}
