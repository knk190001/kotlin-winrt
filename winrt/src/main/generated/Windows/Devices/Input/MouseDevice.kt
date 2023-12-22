package Windows.Devices.Input

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

@ABIMarker(MouseDevice.ABI::class)
@Signature("rc(Windows.Devices.Input.MouseDevice;{88edf458-f2c8-49f4-be1f-c256b388bc11})")
@WinRTByReference(brClass = MouseDevice.ByReference::class)
public class MouseDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMouseDevice.WithDefault, IWinRTObject {
  private val __419908288_Interface: IMouseDevice.WithDefault by lazy {
    as_419908288()
  }


  public override val __419908288_Ptr: JNAPointer? by lazy {
    __419908288_Interface.__419908288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__419908288_Interface)

  private fun as_419908288(): IMouseDevice.WithDefault {
    if(pointer == NULL) {
      return(IMouseDevice.ABI.makeIMouseDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMouseDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMouseDevice.ABI.makeIMouseDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MouseDevice> {
    public override fun getValue() = MouseDevice(pointer.getPointer(0))

    public fun setValue(value: MouseDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MouseDevice, MemoryAddress> {
    public val IMouseDeviceStatics_Instance: IMouseDeviceStatics by lazy {
      createIMouseDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMouseDeviceStatics(): IMouseDeviceStatics {
      val refiid = Guid.REFIID(IMouseDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Input.MouseDevice".toHandle(),refiid,interfacePtr)
      val result = IMouseDeviceStatics.ABI.makeIMouseDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MouseDevice {
      val address = segment.toRawLongValue()
      return MouseDevice(Pointer(address))
    }

    public override fun toNative(obj: MouseDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IMouseDeviceStatics_Instance.GetForCurrentView()
  }
}
