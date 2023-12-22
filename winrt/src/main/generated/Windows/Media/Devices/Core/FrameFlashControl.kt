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

@ABIMarker(FrameFlashControl.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameFlashControl;{75d5f6c7-bd45-4fab-9375-45ac04b332c2})")
@WinRTByReference(brClass = FrameFlashControl.ByReference::class)
public class FrameFlashControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameFlashControl.WithDefault, IWinRTObject {
  private val __1544874614_Interface: IFrameFlashControl.WithDefault by lazy {
    as_1544874614()
  }


  public override val __1544874614_Ptr: JNAPointer? by lazy {
    __1544874614_Interface.__1544874614_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1544874614_Interface)

  private fun as_1544874614(): IFrameFlashControl.WithDefault {
    if(pointer == NULL) {
      return(IFrameFlashControl.ABI.makeIFrameFlashControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameFlashControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameFlashControl.ABI.makeIFrameFlashControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameFlashControl> {
    public override fun getValue() = FrameFlashControl(pointer.getPointer(0))

    public fun setValue(value: FrameFlashControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameFlashControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameFlashControl {
      val address = segment.toRawLongValue()
      return FrameFlashControl(Pointer(address))
    }

    public override fun toNative(obj: FrameFlashControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
