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

@ABIMarker(CompositionDrawingSurface.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionDrawingSurface;{216cab97-a2ee-5a29-ad6b-0bc2df4a1504})")
@WinRTByReference(brClass = CompositionDrawingSurface.ByReference::class)
public open class CompositionDrawingSurface(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionDrawingSurface.WithDefault,
    ICompositionDrawingSurface2.WithDefault, ICompositionSurface.WithDefault, IWinRTObject {
  private val __924912896_Interface: ICompositionDrawingSurface.WithDefault by lazy {
    as_924912896()
  }


  private val __1392471246_Interface: ICompositionDrawingSurface2.WithDefault by lazy {
    as_1392471246()
  }


  private val __310213500_Interface: ICompositionSurface.WithDefault by lazy {
    as_310213500()
  }


  public override val __924912896_Ptr: JNAPointer? by lazy {
    __924912896_Interface.__924912896_Ptr
  }


  public override val __1392471246_Ptr: JNAPointer? by lazy {
    __1392471246_Interface.__1392471246_Ptr
  }


  public override val __310213500_Ptr: JNAPointer? by lazy {
    __310213500_Interface.__310213500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__924912896_Interface, __1392471246_Interface, __310213500_Interface)

  private fun as_924912896(): ICompositionDrawingSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDrawingSurface.ABI.makeICompositionDrawingSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDrawingSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDrawingSurface.ABI.makeICompositionDrawingSurface(ref.value))
  }

  private fun as_1392471246(): ICompositionDrawingSurface2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDrawingSurface2.ABI.makeICompositionDrawingSurface2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDrawingSurface2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDrawingSurface2.ABI.makeICompositionDrawingSurface2(ref.value))
  }

  private fun as_310213500(): ICompositionSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurface.ABI.makeICompositionSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurface.ABI.makeICompositionSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionDrawingSurface> {
    public override fun getValue() = CompositionDrawingSurface(pointer.getPointer(0))

    public fun setValue(value: CompositionDrawingSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionDrawingSurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionDrawingSurface {
      val address = segment.toRawLongValue()
      return CompositionDrawingSurface(Pointer(address))
    }

    public override fun toNative(obj: CompositionDrawingSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
