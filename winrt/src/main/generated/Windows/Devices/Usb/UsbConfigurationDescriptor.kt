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

@ABIMarker(UsbConfigurationDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbConfigurationDescriptor;{f2176d92-b442-407a-8207-7d646c0385f3})")
@WinRTByReference(brClass = UsbConfigurationDescriptor.ByReference::class)
public class UsbConfigurationDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbConfigurationDescriptor.WithDefault, IWinRTObject {
  private val __20097182_Interface: IUsbConfigurationDescriptor.WithDefault by lazy {
    as_20097182()
  }


  public override val __20097182_Ptr: JNAPointer? by lazy {
    __20097182_Interface.__20097182_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__20097182_Interface)

  private fun as_20097182(): IUsbConfigurationDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbConfigurationDescriptor.ABI.makeIUsbConfigurationDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbConfigurationDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbConfigurationDescriptor.ABI.makeIUsbConfigurationDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbConfigurationDescriptor> {
    public override fun getValue() = UsbConfigurationDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbConfigurationDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbConfigurationDescriptor, MemoryAddress> {
    public val IUsbConfigurationDescriptorStatics_Instance: IUsbConfigurationDescriptorStatics by
        lazy {
      createIUsbConfigurationDescriptorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUsbConfigurationDescriptorStatics(): IUsbConfigurationDescriptorStatics {
      val refiid = Guid.REFIID(IUsbConfigurationDescriptorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbConfigurationDescriptor".toHandle(),refiid,interfacePtr)
      val result =
          IUsbConfigurationDescriptorStatics.ABI.makeIUsbConfigurationDescriptorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UsbConfigurationDescriptor {
      val address = segment.toRawLongValue()
      return UsbConfigurationDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbConfigurationDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryParse(descriptor: UsbDescriptor, parsed: ByReference) =
        ABI.IUsbConfigurationDescriptorStatics_Instance.TryParse(descriptor, parsed)

    public fun Parse(descriptor: UsbDescriptor) =
        ABI.IUsbConfigurationDescriptorStatics_Instance.Parse(descriptor)
  }
}
