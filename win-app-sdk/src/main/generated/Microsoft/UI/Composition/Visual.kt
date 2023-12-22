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

@ABIMarker(Visual.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Visual;{c0eeab6c-c897-5ac6-a1c9-63abd5055b9b})")
@WinRTByReference(brClass = Visual.ByReference::class)
public open class Visual(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVisual.WithDefault, IVisual2.WithDefault, IVisual3.WithDefault,
    IVisual4.WithDefault, IWinRTObject {
  private val __1922832537_Interface: IVisual.WithDefault by lazy {
    as_1922832537()
  }


  private val __521733447_Interface: IVisual2.WithDefault by lazy {
    as_521733447()
  }


  private val __521733446_Interface: IVisual3.WithDefault by lazy {
    as_521733446()
  }


  private val __521733445_Interface: IVisual4.WithDefault by lazy {
    as_521733445()
  }


  public override val __1922832537_Ptr: JNAPointer? by lazy {
    __1922832537_Interface.__1922832537_Ptr
  }


  public override val __521733447_Ptr: JNAPointer? by lazy {
    __521733447_Interface.__521733447_Ptr
  }


  public override val __521733446_Ptr: JNAPointer? by lazy {
    __521733446_Interface.__521733446_Ptr
  }


  public override val __521733445_Ptr: JNAPointer? by lazy {
    __521733445_Interface.__521733445_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1922832537_Interface, __521733447_Interface, __521733446_Interface,
        __521733445_Interface)

  private fun as_1922832537(): IVisual.WithDefault {
    if(pointer == NULL) {
      return(IVisual.ABI.makeIVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisual.ABI.makeIVisual(ref.value))
  }

  private fun as_521733447(): IVisual2.WithDefault {
    if(pointer == NULL) {
      return(IVisual2.ABI.makeIVisual2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisual2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisual2.ABI.makeIVisual2(ref.value))
  }

  private fun as_521733446(): IVisual3.WithDefault {
    if(pointer == NULL) {
      return(IVisual3.ABI.makeIVisual3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisual3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisual3.ABI.makeIVisual3(ref.value))
  }

  private fun as_521733445(): IVisual4.WithDefault {
    if(pointer == NULL) {
      return(IVisual4.ABI.makeIVisual4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisual4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisual4.ABI.makeIVisual4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Visual> {
    public override fun getValue() = Visual(pointer.getPointer(0))

    public fun setValue(value: Visual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Visual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Visual {
      val address = segment.toRawLongValue()
      return Visual(Pointer(address))
    }

    public override fun toNative(obj: Visual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
