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

@ABIMarker(DisplaySurface.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplaySurface;{594f6cc6-139a-56d6-a4b1-15fe2cb76adb})")
@WinRTByReference(brClass = DisplaySurface.ByReference::class)
public class DisplaySurface(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplaySurface.WithDefault, IWinRTObject {
  private val __1006465651_Interface: IDisplaySurface.WithDefault by lazy {
    as_1006465651()
  }


  public override val __1006465651_Ptr: JNAPointer? by lazy {
    __1006465651_Interface.__1006465651_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1006465651_Interface)

  private fun as_1006465651(): IDisplaySurface.WithDefault {
    if(pointer == NULL) {
      return(IDisplaySurface.ABI.makeIDisplaySurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplaySurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplaySurface.ABI.makeIDisplaySurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplaySurface>
      {
    public override fun getValue() = DisplaySurface(pointer.getPointer(0))

    public fun setValue(value: DisplaySurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplaySurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplaySurface {
      val address = segment.toRawLongValue()
      return DisplaySurface(Pointer(address))
    }

    public override fun toNative(obj: DisplaySurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
