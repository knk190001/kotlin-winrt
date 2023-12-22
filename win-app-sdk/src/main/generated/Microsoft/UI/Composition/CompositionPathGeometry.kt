package Microsoft.UI.Composition

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

@ABIMarker(CompositionPathGeometry.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionPathGeometry;{0f6e6b82-060b-571e-b849-ab8e0d723962})")
@WinRTByReference(brClass = CompositionPathGeometry.ByReference::class)
public class CompositionPathGeometry(
  ptr: JNAPointer? = NULL
) : CompositionGeometry(ptr), ICompositionPathGeometry.WithDefault, IWinRTObject {
  private val __140036536_Interface: ICompositionPathGeometry.WithDefault by lazy {
    as_140036536()
  }


  public override val __140036536_Ptr: JNAPointer? by lazy {
    __140036536_Interface.__140036536_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__140036536_Interface)

  private fun as_140036536(): ICompositionPathGeometry.WithDefault {
    if(pointer == NULL) {
      return(ICompositionPathGeometry.ABI.makeICompositionPathGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionPathGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionPathGeometry.ABI.makeICompositionPathGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionPathGeometry> {
    public override fun getValue() = CompositionPathGeometry(pointer.getPointer(0))

    public fun setValue(value: CompositionPathGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionPathGeometry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionPathGeometry {
      val address = segment.toRawLongValue()
      return CompositionPathGeometry(Pointer(address))
    }

    public override fun toNative(obj: CompositionPathGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
