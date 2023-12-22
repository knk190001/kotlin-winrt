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

@ABIMarker(CompositionLight.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionLight;{41a6d7c2-2e5d-4bc1-b09e-8f0a03e3d8d3})")
@WinRTByReference(brClass = CompositionLight.ByReference::class)
public open class CompositionLight(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionLight.WithDefault, ICompositionLight2.WithDefault,
    ICompositionLight3.WithDefault, IWinRTObject {
  private val __1350926022_Interface: ICompositionLight.WithDefault by lazy {
    as_1350926022()
  }


  private val __1070966328_Interface: ICompositionLight2.WithDefault by lazy {
    as_1070966328()
  }


  private val __1070966329_Interface: ICompositionLight3.WithDefault by lazy {
    as_1070966329()
  }


  public override val __1350926022_Ptr: JNAPointer? by lazy {
    __1350926022_Interface.__1350926022_Ptr
  }


  public override val __1070966328_Ptr: JNAPointer? by lazy {
    __1070966328_Interface.__1070966328_Ptr
  }


  public override val __1070966329_Ptr: JNAPointer? by lazy {
    __1070966329_Interface.__1070966329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1350926022_Interface, __1070966328_Interface, __1070966329_Interface)

  private fun as_1350926022(): ICompositionLight.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLight.ABI.makeICompositionLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLight.ABI.makeICompositionLight(ref.value))
  }

  private fun as_1070966328(): ICompositionLight2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLight2.ABI.makeICompositionLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLight2.ABI.makeICompositionLight2(ref.value))
  }

  private fun as_1070966329(): ICompositionLight3.WithDefault {
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
