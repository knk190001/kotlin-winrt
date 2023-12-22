package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneLineTransportDevice.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineTransportDevice;{efa8f889-cffa-59f4-97e4-74705b7dc490})")
@WinRTByReference(brClass = PhoneLineTransportDevice.ByReference::class)
public class PhoneLineTransportDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineTransportDevice.WithDefault, IPhoneLineTransportDevice2.WithDefault,
    IWinRTObject {
  private val __65538171_Interface: IPhoneLineTransportDevice.WithDefault by lazy {
    as_65538171()
  }


  private val __2031683351_Interface: IPhoneLineTransportDevice2.WithDefault by lazy {
    as_2031683351()
  }


  public override val __65538171_Ptr: JNAPointer? by lazy {
    __65538171_Interface.__65538171_Ptr
  }


  public override val __2031683351_Ptr: JNAPointer? by lazy {
    __2031683351_Interface.__2031683351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__65538171_Interface, __2031683351_Interface)

  private fun as_65538171(): IPhoneLineTransportDevice.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineTransportDevice.ABI.makeIPhoneLineTransportDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineTransportDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineTransportDevice.ABI.makeIPhoneLineTransportDevice(ref.value))
  }

  private fun as_2031683351(): IPhoneLineTransportDevice2.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineTransportDevice2.ABI.makeIPhoneLineTransportDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineTransportDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineTransportDevice2.ABI.makeIPhoneLineTransportDevice2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineTransportDevice> {
    public override fun getValue() = PhoneLineTransportDevice(pointer.getPointer(0))

    public fun setValue(value: PhoneLineTransportDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineTransportDevice, MemoryAddress> {
    public val IPhoneLineTransportDeviceStatics_Instance: IPhoneLineTransportDeviceStatics by lazy {
      createIPhoneLineTransportDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneLineTransportDeviceStatics(): IPhoneLineTransportDeviceStatics {
      val refiid = Guid.REFIID(IPhoneLineTransportDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneLineTransportDevice".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneLineTransportDeviceStatics.ABI.makeIPhoneLineTransportDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneLineTransportDevice {
      val address = segment.toRawLongValue()
      return PhoneLineTransportDevice(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineTransportDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromId(id: String) = ABI.IPhoneLineTransportDeviceStatics_Instance.FromId(id)

    public fun GetDeviceSelector() =
        ABI.IPhoneLineTransportDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(transport: PhoneLineTransport) =
        ABI.IPhoneLineTransportDeviceStatics_Instance.GetDeviceSelector(transport)
  }
}
