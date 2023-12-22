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

@ABIMarker(CompositionLight.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionLight;{6d633e77-a6b8-5a2d-8235-e0c380c3b47b})")
@WinRTByReference(brClass = CompositionLight.ByReference::class)
public open class CompositionLight(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionLight.WithDefault, ICompositionLight2.WithDefault,
    ICompositionLight3.WithDefault, IWinRTObject {
  private val __520475739_Interface: ICompositionLight.WithDefault by lazy {
    as_520475739()
  }


  private val __1045121325_Interface: ICompositionLight2.WithDefault by lazy {
    as_1045121325()
  }


  private val __1045121326_Interface: ICompositionLight3.WithDefault by lazy {
    as_1045121326()
  }


  public override val __520475739_Ptr: JNAPointer? by lazy {
    __520475739_Interface.__520475739_Ptr
  }


  public override val __1045121325_Ptr: JNAPointer? by lazy {
    __1045121325_Interface.__1045121325_Ptr
  }


  public override val __1045121326_Ptr: JNAPointer? by lazy {
    __1045121326_Interface.__1045121326_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__520475739_Interface, __1045121325_Interface, __1045121326_Interface)

  private fun as_520475739(): ICompositionLight.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLight.ABI.makeICompositionLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLight.ABI.makeICompositionLight(ref.value))
  }

  private fun as_1045121325(): ICompositionLight2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLight2.ABI.makeICompositionLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLight2.ABI.makeICompositionLight2(ref.value))
  }

  private fun as_1045121326(): ICompositionLight3.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLight3.ABI.makeICompositionLight3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLight3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLight3.ABI.makeICompositionLight3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionLight> {
    public override fun getValue() = CompositionLight(pointer.getPointer(0))

    public fun setValue(value: CompositionLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionLight, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionLight {
      val address = segment.toRawLongValue()
      return CompositionLight(Pointer(address))
    }

    public override fun toNative(obj: CompositionLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
