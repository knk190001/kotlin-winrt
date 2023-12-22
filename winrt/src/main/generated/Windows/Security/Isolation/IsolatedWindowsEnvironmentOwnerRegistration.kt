package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentOwnerRegistration.ABI::class)
@WinRTByReference(brClass = IsolatedWindowsEnvironmentOwnerRegistration.ByReference::class)
public class IsolatedWindowsEnvironmentOwnerRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentOwnerRegistration> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentOwnerRegistration(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentOwnerRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentOwnerRegistration, MemoryAddress> {
    public val IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Instance:
        IIsolatedWindowsEnvironmentOwnerRegistrationStatics by lazy {
      createIIsolatedWindowsEnvironmentOwnerRegistrationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIsolatedWindowsEnvironmentOwnerRegistrationStatics():
        IIsolatedWindowsEnvironmentOwnerRegistrationStatics {
      val refiid = Guid.REFIID(IIsolatedWindowsEnvironmentOwnerRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentOwnerRegistration".toHandle(),refiid,interfacePtr)
      val result =
          IIsolatedWindowsEnvironmentOwnerRegistrationStatics.ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentOwnerRegistration {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentOwnerRegistration(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentOwnerRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Register(ownerName: String,
        ownerRegistrationData: IsolatedWindowsEnvironmentOwnerRegistrationData) =
        ABI.IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Instance.Register(ownerName,
        ownerRegistrationData)

    public fun Unregister(ownerName: String) =
        ABI.IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Instance.Unregister(ownerName)
  }
}
