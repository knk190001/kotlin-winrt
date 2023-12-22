package Windows.Devices.Usb

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

@ABIMarker(UsbControlRequestType.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbControlRequestType;{8e9465a6-d73d-46de-94be-aae7f07c0f5c})")
@WinRTByReference(brClass = UsbControlRequestType.ByReference::class)
public class UsbControlRequestType(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbControlRequestType.WithDefault, IWinRTObject {
  private val __1813473201_Interface: IUsbControlRequestType.WithDefault by lazy {
    as_1813473201()
  }


  public override val __1813473201_Ptr: JNAPointer? by lazy {
    __1813473201_Interface.__1813473201_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1813473201_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1813473201(): IUsbControlRequestType.WithDefault {
    if(pointer == NULL) {
      return(IUsbControlRequestType.ABI.makeIUsbControlRequestType(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbControlRequestType>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbControlRequestType.ABI.makeIUsbControlRequestType(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbControlRequestType> {
    public override fun getValue() = UsbControlRequestType(pointer.getPointer(0))

    public fun setValue(value: UsbControlRequestType): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbControlRequestType, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbControlRequestType".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UsbControlRequestType {
      val address = segment.toRawLongValue()
      return UsbControlRequestType(Pointer(address))
    }

    public override fun toNative(obj: UsbControlRequestType): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
