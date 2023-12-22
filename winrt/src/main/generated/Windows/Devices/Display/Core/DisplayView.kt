package Windows.Devices.Display.Core

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

@ABIMarker(DisplayView.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayView;{b0c98ca1-b759-5b59-b1ad-f0786aa9e53d})")
@WinRTByReference(brClass = DisplayView.ByReference::class)
public class DisplayView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayView.WithDefault, IWinRTObject {
  private val __619887163_Interface: IDisplayView.WithDefault by lazy {
    as_619887163()
  }


  public override val __619887163_Ptr: JNAPointer? by lazy {
    __619887163_Interface.__619887163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__619887163_Interface)

  private fun as_619887163(): IDisplayView.WithDefault {
    if(pointer == NULL) {
      return(IDisplayView.ABI.makeIDisplayView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayView.ABI.makeIDisplayView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayView> {
    public override fun getValue() = DisplayView(pointer.getPointer(0))

    public fun setValue(value: DisplayView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayView {
      val address = segment.toRawLongValue()
      return DisplayView(Pointer(address))
    }

    public override fun toNative(obj: DisplayView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
