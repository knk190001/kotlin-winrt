package Windows.Storage.Provider

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

@ABIMarker(StorageProviderHydrationPolicyModifier.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderHydrationPolicyModifier;u4)")
@WinRTByReference(brClass = StorageProviderHydrationPolicyModifier.ByReference::class)
public enum class StorageProviderHydrationPolicyModifier(
  public val value: Int
) : NativeMapped {
  None(0),
  ValidationRequired(1),
  StreamingAllowed(2),
  AutoDehydrationAllowed(4),
  AllowFullRestartHydration(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderHydrationPolicyModifier {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ValidationRequired
      2 -> StreamingAllowed
      4 -> AutoDehydrationAllowed
      8 -> AllowFullRestartHydration
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderHydrationPolicyModifier> {
    public fun setValue(newValue: StorageProviderHydrationPolicyModifier): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderHydrationPolicyModifier =
        StorageProviderHydrationPolicyModifier.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderHydrationPolicyModifier, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderHydrationPolicyModifier =
        StorageProviderHydrationPolicyModifier.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderHydrationPolicyModifier): Int = obj.value
  }
}
