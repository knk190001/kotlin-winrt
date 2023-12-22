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

@ABIMarker(UsbInterfaceDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterfaceDescriptor;{199670c7-b7ee-4f90-8cd5-94a2e257598a})")
@WinRTByReference(brClass = UsbInterfaceDescriptor.ByReference::class)
public class UsbInterfaceDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterfaceDescriptor.WithDefault, IWinRTObject {
  private val __500944485_Interface: IUsbInterfaceDescriptor.WithDefault by lazy {
    as_500944485()
  }


  public override val __500944485_Ptr: JNAPointer? by lazy {
    __500944485_Interface.__500944485_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__500944485_Interface)

  private fun as_500944485(): IUsbInterfaceDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterfaceDescriptor.ABI.makeIUsbInterfaceDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterfaceDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterfaceDescriptor.ABI.makeIUsbInterfaceDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterfaceDescriptor> {
    public override fun getValue() = UsbInterfaceDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbInterfaceDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterfaceDescriptor, MemoryAddress> {
    public val IUsbInterfaceDescriptorStatics_Instance: IUsbInterfaceDescriptorStatics by lazy {
      createIUsbInterfaceDescriptorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUsbInterfaceDescriptorStatics(): IUsbInterfaceDescriptorStatics {
      val refiid = Guid.REFIID(IUsbInterfaceDescriptorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbInterfaceDescriptor".toHandle(),refiid,interfacePtr)
      val result =
          IUsbInterfaceDescriptorStatics.ABI.makeIUsbInterfaceDescriptorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UsbInterfaceDescriptor {
      val address = segment.toRawLongValue()
      return UsbInterfaceDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbInterfaceDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryParse(descriptor: UsbDescriptor, parsed: ByReference) =
        ABI.IUsbInterfaceDescriptorStatics_Instance.TryParse(descriptor, parsed)

    public fun Parse(descriptor: UsbDescriptor) =
        ABI.IUsbInterfaceDescriptorStatics_Instance.Parse(descriptor)
  }
}
