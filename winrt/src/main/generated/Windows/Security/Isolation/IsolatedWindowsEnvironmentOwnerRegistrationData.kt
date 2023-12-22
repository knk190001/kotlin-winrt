package Windows.Security.Isolation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IsolatedWindowsEnvironmentOwnerRegistrationData.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentOwnerRegistrationData;{f888ec22-e8cf-56c0-b1df-90af4ad80e84})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentOwnerRegistrationData.ByReference::class)
public class IsolatedWindowsEnvironmentOwnerRegistrationData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentOwnerRegistrationData.WithDefault, IWinRTObject {
  private val __127621809_Interface: IIsolatedWindowsEnvironmentOwnerRegistrationData.WithDefault by
      lazy {
    as_127621809()
  }


  public override val __127621809_Ptr: JNAPointer? by lazy {
    __127621809_Interface.__127621809_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__127621809_Interface)

  public constructor() : this(ABI.activate())

  private fun as_127621809(): IIsolatedWindowsEnvironmentOwnerRegistrationData.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentOwnerRegistrationData.ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentOwnerRegistrationData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentOwnerRegistrationData.ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentOwnerRegistrationData> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentOwnerRegistrationData(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentOwnerRegistrationData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentOwnerRegistrationData, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentOwnerRegistrationData".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentOwnerRegistrationData {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentOwnerRegistrationData(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentOwnerRegistrationData):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
