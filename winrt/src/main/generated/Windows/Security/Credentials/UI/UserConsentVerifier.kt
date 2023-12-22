package Windows.Security.Credentials.UI

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UserConsentVerifier.ABI::class)
@WinRTByReference(brClass = UserConsentVerifier.ByReference::class)
public class UserConsentVerifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserConsentVerifier> {
    public override fun getValue() = UserConsentVerifier(pointer.getPointer(0))

    public fun setValue(value: UserConsentVerifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserConsentVerifier, MemoryAddress> {
    public val IUserConsentVerifierStatics_Instance: IUserConsentVerifierStatics by lazy {
      createIUserConsentVerifierStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserConsentVerifierStatics(): IUserConsentVerifierStatics {
      val refiid = Guid.REFIID(IUserConsentVerifierStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.UI.UserConsentVerifier".toHandle(),refiid,interfacePtr)
      val result =
          IUserConsentVerifierStatics.ABI.makeIUserConsentVerifierStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserConsentVerifier {
      val address = segment.toRawLongValue()
      return UserConsentVerifier(Pointer(address))
    }

    public override fun toNative(obj: UserConsentVerifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CheckAvailabilityAsync() =
        ABI.IUserConsentVerifierStatics_Instance.CheckAvailabilityAsync()

    public fun RequestVerificationAsync(message: String) =
        ABI.IUserConsentVerifierStatics_Instance.RequestVerificationAsync(message)
  }
}
