package Windows.UI.WindowManagement

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

@ABIMarker(DisplayRegion.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.DisplayRegion;{db50c3a2-4094-5f47-8cb1-ea01ddafaa94})")
@WinRTByReference(brClass = DisplayRegion.ByReference::class)
public class DisplayRegion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayRegion.WithDefault, IWinRTObject {
  private val __1982628239_Interface: IDisplayRegion.WithDefault by lazy {
    as_1982628239()
  }


  public override val __1982628239_Ptr: JNAPointer? by lazy {
    __1982628239_Interface.__1982628239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1982628239_Interface)

  private fun as_1982628239(): IDisplayRegion.WithDefault {
    if(pointer == NULL) {
      return(IDisplayRegion.ABI.makeIDisplayRegion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayRegion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayRegion.ABI.makeIDisplayRegion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayRegion>
      {
    public override fun getValue() = DisplayRegion(pointer.getPointer(0))

    public fun setValue(value: DisplayRegion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayRegion, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayRegion {
      val address = segment.toRawLongValue()
      return DisplayRegion(Pointer(address))
    }

    public override fun toNative(obj: DisplayRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
