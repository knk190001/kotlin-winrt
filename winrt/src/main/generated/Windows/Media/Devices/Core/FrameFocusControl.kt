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

@ABIMarker(FrameFocusControl.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameFocusControl;{272df1d0-d912-4214-a67b-e38a8d48d8c6})")
@WinRTByReference(brClass = FrameFocusControl.ByReference::class)
public class FrameFocusControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameFocusControl.WithDefault, IWinRTObject {
  private val __1567903602_Interface: IFrameFocusControl.WithDefault by lazy {
    as_1567903602()
  }


  public override val __1567903602_Ptr: JNAPointer? by lazy {
    __1567903602_Interface.__1567903602_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1567903602_Interface)

  private fun as_1567903602(): IFrameFocusControl.WithDefault {
    if(pointer == NULL) {
      return(IFrameFocusControl.ABI.makeIFrameFocusControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameFocusControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameFocusControl.ABI.makeIFrameFocusControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameFocusControl> {
    public override fun getValue() = FrameFocusControl(pointer.getPointer(0))

    public fun setValue(value: FrameFocusControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameFocusControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameFocusControl {
      val address = segment.toRawLongValue()
      return FrameFocusControl(Pointer(address))
    }

    public override fun toNative(obj: FrameFocusControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
