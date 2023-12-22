package Microsoft.UI.Input.Interop

import Microsoft.UI.Input.PointerPoint
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(PenDeviceInterop.ABI::class)
@WinRTByReference(brClass = PenDeviceInterop.ByReference::class)
public class PenDeviceInterop(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenDeviceInterop> {
    public override fun getValue() = PenDeviceInterop(pointer.getPointer(0))

    public fun setValue(value: PenDeviceInterop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenDeviceInterop, MemoryAddress> {
    public val IPenDeviceInteropStatics_Instance: IPenDeviceInteropStatics by lazy {
      createIPenDeviceInteropStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPenDeviceInteropStatics(): IPenDeviceInteropStatics {
      val refiid = Guid.REFIID(IPenDeviceInteropStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.Interop.PenDeviceInterop".toHandle(),refiid,interfacePtr)
      val result = IPenDeviceInteropStatics.ABI.makeIPenDeviceInteropStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PenDeviceInterop {
      val address = segment.toRawLongValue()
      return PenDeviceInterop(Pointer(address))
    }

    public override fun toNative(obj: PenDeviceInterop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromPointerPoint(pointerPoint: PointerPoint) =
        ABI.IPenDeviceInteropStatics_Instance.FromPointerPoint(pointerPoint)
  }
}
