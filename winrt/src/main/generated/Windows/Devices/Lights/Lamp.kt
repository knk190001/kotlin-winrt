package Windows.Devices.Lights

import Windows.Foundation.IClosable
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

@ABIMarker(Lamp.ABI::class)
@Signature("rc(Windows.Devices.Lights.Lamp;{047d5b9a-ea45-4b2b-b1a2-14dff00bde7b})")
@WinRTByReference(brClass = Lamp.ByReference::class)
public class Lamp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILamp.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1135233560_Interface: ILamp.WithDefault by lazy {
    as_1135233560()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1135233560_Ptr: JNAPointer? by lazy {
    __1135233560_Interface.__1135233560_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1135233560_Interface, __1260617006_Interface)

  private fun as_1135233560(): ILamp.WithDefault {
    if(pointer == NULL) {
      return(ILamp.ABI.makeILamp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILamp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILamp.ABI.makeILamp(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Lamp> {
    public override fun getValue() = Lamp(pointer.getPointer(0))

    public fun setValue(value: Lamp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Lamp, MemoryAddress> {
    public val ILampStatics_Instance: ILampStatics by lazy {
      createILampStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampStatics(): ILampStatics {
      val refiid = Guid.REFIID(ILampStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Lamp".toHandle(),refiid,interfacePtr)
      val result = ILampStatics.ABI.makeILampStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Lamp {
      val address = segment.toRawLongValue()
      return Lamp(Pointer(address))
    }

    public override fun toNative(obj: Lamp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ILampStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.ILampStatics_Instance.FromIdAsync(deviceId)

    public fun GetDefaultAsync() = ABI.ILampStatics_Instance.GetDefaultAsync()
  }
}
