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

@ABIMarker(FrameIsoSpeedCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameIsoSpeedCapabilities;{16bdff61-6df6-4ac9-b92a-9f6ecd1ad2fa})")
@WinRTByReference(brClass = FrameIsoSpeedCapabilities.ByReference::class)
public class FrameIsoSpeedCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameIsoSpeedCapabilities.WithDefault, IWinRTObject {
  private val __878757313_Interface: IFrameIsoSpeedCapabilities.WithDefault by lazy {
    as_878757313()
  }


  public override val __878757313_Ptr: JNAPointer? by lazy {
    __878757313_Interface.__878757313_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__878757313_Interface)

  private fun as_878757313(): IFrameIsoSpeedCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IFrameIsoSpeedCapabilities.ABI.makeIFrameIsoSpeedCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameIsoSpeedCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameIsoSpeedCapabilities.ABI.makeIFrameIsoSpeedCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameIsoSpeedCapabilities> {
    public override fun getValue() = FrameIsoSpeedCapabilities(pointer.getPointer(0))

    public fun setValue(value: FrameIsoSpeedCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameIsoSpeedCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameIsoSpeedCapabilities {
      val address = segment.toRawLongValue()
      return FrameIsoSpeedCapabilities(Pointer(address))
    }

    public override fun toNative(obj: FrameIsoSpeedCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
