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

@ABIMarker(CompositionLineGeometry.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionLineGeometry;{489f9382-c186-5936-8946-c4f927e844aa})")
@WinRTByReference(brClass = CompositionLineGeometry.ByReference::class)
public class CompositionLineGeometry(
  ptr: JNAPointer? = NULL
) : CompositionGeometry(ptr), ICompositionLineGeometry.WithDefault, IWinRTObject {
  private val __159400727_Interface: ICompositionLineGeometry.WithDefault by lazy {
    as_159400727()
  }


  public override val __159400727_Ptr: JNAPointer? by lazy {
    __159400727_Interface.__159400727_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__159400727_Interface)

  private fun as_159400727(): ICompositionLineGeometry.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLineGeometry.ABI.makeICompositionLineGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLineGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLineGeometry.ABI.makeICompositionLineGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionLineGeometry> {
    public override fun getValue() = CompositionLineGeometry(pointer.getPointer(0))

    public fun setValue(value: CompositionLineGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionLineGeometry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionLineGeometry {
      val address = segment.toRawLongValue()
      return CompositionLineGeometry(Pointer(address))
    }

    public override fun toNative(obj: CompositionLineGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
