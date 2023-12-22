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

@ABIMarker(CompositionGeometry.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionGeometry;{e985217c-6a17-4207-abd8-5fd3dd612a9d})")
@WinRTByReference(brClass = CompositionGeometry.ByReference::class)
public open class CompositionGeometry(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionGeometry.WithDefault, IWinRTObject {
  private val __739403314_Interface: ICompositionGeometry.WithDefault by lazy {
    as_739403314()
  }


  public override val __739403314_Ptr: JNAPointer? by lazy {
    __739403314_Interface.__739403314_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__739403314_Interface)

  private fun as_739403314(): ICompositionGeometry.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGeometry.ABI.makeICompositionGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGeometry.ABI.makeICompositionGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionGeometry> {
    public override fun getValue() = CompositionGeometry(pointer.getPointer(0))

    public fun setValue(value: CompositionGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionGeometry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionGeometry {
      val address = segment.toRawLongValue()
      return CompositionGeometry(Pointer(address))
    }

    public override fun toNative(obj: CompositionGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
