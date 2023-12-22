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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PenDevice.ABI::class)
@Signature("rc(Windows.Devices.Input.PenDevice;{31856eba-a738-5a8c-b8f6-f97ef68d18ef})")
@WinRTByReference(brClass = PenDevice.ByReference::class)
public class PenDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenDevice.WithDefault, IPenDevice2.WithDefault, IWinRTObject {
  private val __935475188_Interface: IPenDevice.WithDefault by lazy {
    as_935475188()
  }


  private val __1065040194_Interface: IPenDevice2.WithDefault by lazy {
    as_1065040194()
  }


  public override val __935475188_Ptr: JNAPointer? by lazy {
    __935475188_Interface.__935475188_Ptr
  }


  public override val __1065040194_Ptr: JNAPointer? by lazy {
    __1065040194_Interface.__1065040194_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__935475188_Interface, __1065040194_Interface)

  private fun as_935475188(): IPenDevice.WithDefault {
    if(pointer == NULL) {
      return(IPenDevice.ABI.makeIPenDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenDevice.ABI.makeIPenDevice(ref.value))
  }

  private fun as_1065040194(): IPenDevice2.WithDefault {
    if(pointer == NULL) {
      return(IPenDevice2.ABI.makeIPenDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenDevice2.ABI.makeIPenDevice2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PenDevice> {
    public override fun getValue() = PenDevice(pointer.getPointer(0))

    public fun setValue(value: PenDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenDevice, MemoryAddress> {
    public val IPenDeviceStatics_Instance: IPenDeviceStatics by lazy {
      createIPenDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPenDeviceStatics(): IPenDeviceStatics {
      val refiid = Guid.REFIID(IPenDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Input.PenDevice".toHandle(),refiid,interfacePtr)
      val result = IPenDeviceStatics.ABI.makeIPenDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PenDevice {
      val address = segment.toRawLongValue()
      return PenDevice(Pointer(address))
    }

    public override fun toNative(obj: PenDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFromPointerId(pointerId: WinDef.UINT) =
        ABI.IPenDeviceStatics_Instance.GetFromPointerId(pointerId)
  }
}
