package Windows.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CompositionVirtualDrawingSurface.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionVirtualDrawingSurface;{a9c384db-8740-4f94-8b9d-b68521e7863d})")
@WinRTByReference(brClass = CompositionVirtualDrawingSurface.ByReference::class)
public class CompositionVirtualDrawingSurface(
  ptr: JNAPointer? = NULL
) : CompositionDrawingSurface(ptr), ICompositionVirtualDrawingSurface.WithDefault, IWinRTObject {
  private val __1791307074_Interface: ICompositionVirtualDrawingSurface.WithDefault by lazy {
    as_1791307074()
  }


  public override val __1791307074_Ptr: JNAPointer? by lazy {
    __1791307074_Interface.__1791307074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1791307074_Interface)

  private fun as_1791307074(): ICompositionVirtualDrawingSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionVirtualDrawingSurface.ABI.makeICompositionVirtualDrawingSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionVirtualDrawingSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionVirtualDrawingSurface.ABI.makeICompositionVirtualDrawingSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionVirtualDrawingSurface> {
    public override fun getValue() = CompositionVirtualDrawingSurface(pointer.getPointer(0))

    public fun setValue(value: CompositionVirtualDrawingSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionVirtualDrawingSurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionVirtualDrawingSurface {
      val address = segment.toRawLongValue()
      return CompositionVirtualDrawingSurface(Pointer(address))
    }

    public override fun toNative(obj: CompositionVirtualDrawingSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
