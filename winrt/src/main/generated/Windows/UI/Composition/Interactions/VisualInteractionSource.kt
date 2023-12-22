package Windows.UI.Composition.Interactions

import Windows.UI.Composition.CompositionObject
import Windows.UI.Composition.IVisualElement
import Windows.UI.Composition.Visual
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(VisualInteractionSource.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.VisualInteractionSource;{ca0e8a86-d8d6-4111-b088-70347bd2b0ed})")
@WinRTByReference(brClass = VisualInteractionSource.ByReference::class)
public class VisualInteractionSource(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVisualInteractionSource.WithDefault,
    IVisualInteractionSource2.WithDefault, IVisualInteractionSource3.WithDefault,
    ICompositionInteractionSource.WithDefault, IWinRTObject {
  private val __177881448_Interface: IVisualInteractionSource.WithDefault by lazy {
    as_177881448()
  }


  private val __1219357542_Interface: IVisualInteractionSource2.WithDefault by lazy {
    as_1219357542()
  }


  private val __1219357541_Interface: IVisualInteractionSource3.WithDefault by lazy {
    as_1219357541()
  }


  private val __1138000392_Interface: ICompositionInteractionSource.WithDefault by lazy {
    as_1138000392()
  }


  public override val __177881448_Ptr: JNAPointer? by lazy {
    __177881448_Interface.__177881448_Ptr
  }


  public override val __1219357542_Ptr: JNAPointer? by lazy {
    __1219357542_Interface.__1219357542_Ptr
  }


  public override val __1219357541_Ptr: JNAPointer? by lazy {
    __1219357541_Interface.__1219357541_Ptr
  }


  public override val __1138000392_Ptr: JNAPointer? by lazy {
    __1138000392_Interface.__1138000392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__177881448_Interface, __1219357542_Interface, __1219357541_Interface,
        __1138000392_Interface)

  private fun as_177881448(): IVisualInteractionSource.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource.ABI.makeIVisualInteractionSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource.ABI.makeIVisualInteractionSource(ref.value))
  }

  private fun as_1219357542(): IVisualInteractionSource2.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource2.ABI.makeIVisualInteractionSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource2.ABI.makeIVisualInteractionSource2(ref.value))
  }

  private fun as_1219357541(): IVisualInteractionSource3.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource3.ABI.makeIVisualInteractionSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource3.ABI.makeIVisualInteractionSource3(ref.value))
  }

  private fun as_1138000392(): ICompositionInteractionSource.WithDefault {
    if(pointer == NULL) {
      return(ICompositionInteractionSource.ABI.makeICompositionInteractionSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionInteractionSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionInteractionSource.ABI.makeICompositionInteractionSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualInteractionSource> {
    public override fun getValue() = VisualInteractionSource(pointer.getPointer(0))

    public fun setValue(value: VisualInteractionSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualInteractionSource, MemoryAddress> {
    public val IVisualInteractionSourceStatics2_Instance: IVisualInteractionSourceStatics2 by lazy {
      createIVisualInteractionSourceStatics2()
    }


    public val IVisualInteractionSourceStatics_Instance: IVisualInteractionSourceStatics by lazy {
      createIVisualInteractionSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVisualInteractionSourceStatics2(): IVisualInteractionSourceStatics2 {
      val refiid = Guid.REFIID(IVisualInteractionSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Interactions.VisualInteractionSource".toHandle(),refiid,interfacePtr)
      val result =
          IVisualInteractionSourceStatics2.ABI.makeIVisualInteractionSourceStatics2(interfacePtr.value)
      return result
    }

    public fun createIVisualInteractionSourceStatics(): IVisualInteractionSourceStatics {
      val refiid = Guid.REFIID(IVisualInteractionSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Interactions.VisualInteractionSource".toHandle(),refiid,interfacePtr)
      val result =
          IVisualInteractionSourceStatics.ABI.makeIVisualInteractionSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VisualInteractionSource {
      val address = segment.toRawLongValue()
      return VisualInteractionSource(Pointer(address))
    }

    public override fun toNative(obj: VisualInteractionSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromIVisualElement(source: IVisualElement) =
        ABI.IVisualInteractionSourceStatics2_Instance.CreateFromIVisualElement(source)

    public fun Create(source: Visual) = ABI.IVisualInteractionSourceStatics_Instance.Create(source)
  }
}
