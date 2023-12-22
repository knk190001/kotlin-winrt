package Windows.Devices.Usb

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UsbEndpointDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbEndpointDescriptor;{6b4862d9-8df7-4b40-ac83-578f139f0575})")
@WinRTByReference(brClass = UsbEndpointDescriptor.ByReference::class)
public class UsbEndpointDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbEndpointDescriptor.WithDefault, IWinRTObject {
  private val __2116361625_Interface: IUsbEndpointDescriptor.WithDefault by lazy {
    as_2116361625()
  }


  public override val __2116361625_Ptr: JNAPointer? by lazy {
    __2116361625_Interface.__2116361625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2116361625_Interface)

  private fun as_2116361625(): IUsbEndpointDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbEndpointDescriptor.ABI.makeIUsbEndpointDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbEndpointDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbEndpointDescriptor.ABI.makeIUsbEndpointDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbEndpointDescriptor> {
    public override fun getValue() = UsbEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbEndpointDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbEndpointDescriptor, MemoryAddress> {
    public val IUsbEndpointDescriptorStatics_Instance: IUsbEndpointDescriptorStatics by lazy {
      createIUsbEndpointDescriptorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUsbEndpointDescriptorStatics(): IUsbEndpointDescriptorStatics {
      val refiid = Guid.REFIID(IUsbEndpointDescriptorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbEndpointDescriptor".toHandle(),refiid,interfacePtr)
      val result =
          IUsbEndpointDescriptorStatics.ABI.makeIUsbEndpointDescriptorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UsbEndpointDescriptor {
      val address = segment.toRawLongValue()
      return UsbEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryParse(descriptor: UsbDescriptor, parsed: ByReference) =
        ABI.IUsbEndpointDescriptorStatics_Instance.TryParse(descriptor, parsed)

    public fun Parse(descriptor: UsbDescriptor) =
        ABI.IUsbEndpointDescriptorStatics_Instance.Parse(descriptor)
  }
}
