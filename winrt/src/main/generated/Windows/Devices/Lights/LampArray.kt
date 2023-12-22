package Windows.Devices.Lights

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

@ABIMarker(LampArray.ABI::class)
@Signature("rc(Windows.Devices.Lights.LampArray;{7ace9787-c8a0-4e95-a1e0-d58676538649})")
@WinRTByReference(brClass = LampArray.ByReference::class)
public class LampArray(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArray.WithDefault, IWinRTObject {
  private val __497106257_Interface: ILampArray.WithDefault by lazy {
    as_497106257()
  }


  public override val __497106257_Ptr: JNAPointer? by lazy {
    __497106257_Interface.__497106257_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__497106257_Interface)

  private fun as_497106257(): ILampArray.WithDefault {
    if(pointer == NULL) {
      return(ILampArray.ABI.makeILampArray(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArray>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArray.ABI.makeILampArray(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LampArray> {
    public override fun getValue() = LampArray(pointer.getPointer(0))

    public fun setValue(value: LampArray): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArray, MemoryAddress> {
    public val ILampArrayStatics_Instance: ILampArrayStatics by lazy {
      createILampArrayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArrayStatics(): ILampArrayStatics {
      val refiid = Guid.REFIID(ILampArrayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.LampArray".toHandle(),refiid,interfacePtr)
      val result = ILampArrayStatics.ABI.makeILampArrayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LampArray {
      val address = segment.toRawLongValue()
      return LampArray(Pointer(address))
    }

    public override fun toNative(obj: LampArray): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ILampArrayStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.ILampArrayStatics_Instance.FromIdAsync(deviceId)
  }
}
