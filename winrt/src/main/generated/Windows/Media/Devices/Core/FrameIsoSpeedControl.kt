package Windows.Media.Devices.Core

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

@ABIMarker(FrameIsoSpeedControl.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameIsoSpeedControl;{1a03efed-786a-4c75-a557-7ab9a85f588c})")
@WinRTByReference(brClass = FrameIsoSpeedControl.ByReference::class)
public class FrameIsoSpeedControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameIsoSpeedControl.WithDefault, IWinRTObject {
  private val __265213042_Interface: IFrameIsoSpeedControl.WithDefault by lazy {
    as_265213042()
  }


  public override val __265213042_Ptr: JNAPointer? by lazy {
    __265213042_Interface.__265213042_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__265213042_Interface)

  private fun as_265213042(): IFrameIsoSpeedControl.WithDefault {
    if(pointer == NULL) {
      return(IFrameIsoSpeedControl.ABI.makeIFrameIsoSpeedControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameIsoSpeedControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameIsoSpeedControl.ABI.makeIFrameIsoSpeedControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameIsoSpeedControl> {
    public override fun getValue() = FrameIsoSpeedControl(pointer.getPointer(0))

    public fun setValue(value: FrameIsoSpeedControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameIsoSpeedControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameIsoSpeedControl {
      val address = segment.toRawLongValue()
      return FrameIsoSpeedControl(Pointer(address))
    }

    public override fun toNative(obj: FrameIsoSpeedControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
