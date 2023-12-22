package Windows.Devices.Usb

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

@ABIMarker(UsbInterfaceSetting.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterfaceSetting;{1827bba7-8da7-4af7-8f4c-7f3032e781f5})")
@WinRTByReference(brClass = UsbInterfaceSetting.ByReference::class)
public class UsbInterfaceSetting(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterfaceSetting.WithDefault, IWinRTObject {
  private val __1907038438_Interface: IUsbInterfaceSetting.WithDefault by lazy {
    as_1907038438()
  }


  public override val __1907038438_Ptr: JNAPointer? by lazy {
    __1907038438_Interface.__1907038438_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1907038438_Interface)

  private fun as_1907038438(): IUsbInterfaceSetting.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterfaceSetting.ABI.makeIUsbInterfaceSetting(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterfaceSetting>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterfaceSetting.ABI.makeIUsbInterfaceSetting(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterfaceSetting> {
    public override fun getValue() = UsbInterfaceSetting(pointer.getPointer(0))

    public fun setValue(value: UsbInterfaceSetting): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterfaceSetting, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbInterfaceSetting {
      val address = segment.toRawLongValue()
      return UsbInterfaceSetting(Pointer(address))
    }

    public override fun toNative(obj: UsbInterfaceSetting): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
