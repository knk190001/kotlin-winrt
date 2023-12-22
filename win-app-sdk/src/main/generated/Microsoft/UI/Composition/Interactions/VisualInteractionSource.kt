package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.CompositionObject
import Microsoft.UI.Composition.IVisualElement
import Microsoft.UI.Composition.Visual
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
@Signature("rc(Microsoft.UI.Composition.Interactions.VisualInteractionSource;{ea595c95-b9cb-5cd4-bb9c-4934ff329063})")
@WinRTByReference(brClass = VisualInteractionSource.ByReference::class)
public class VisualInteractionSource(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVisualInteractionSource.WithDefault,
    IVisualInteractionSource2.WithDefault, IVisualInteractionSource3.WithDefault,
    ICompositionInteractionSource.WithDefault, IWinRTObject {
  private val __1213924739_Interface: IVisualInteractionSource.WithDefault by lazy {
    as_1213924739()
  }


  private val __1023038705_Interface: IVisualInteractionSource2.WithDefault by lazy {
    as_1023038705()
  }


  private val __1023038704_Interface: IVisualInteractionSource3.WithDefault by lazy {
    as_1023038704()
  }


  private val __23801363_Interface: ICompositionInteractionSource.WithDefault by lazy {
    as_23801363()
  }


  public override val __1213924739_Ptr: JNAPointer? by lazy {
    __1213924739_Interface.__1213924739_Ptr
  }


  public override val __1023038705_Ptr: JNAPointer? by lazy {
    __1023038705_Interface.__1023038705_Ptr
  }


  public override val __1023038704_Ptr: JNAPointer? by lazy {
    __1023038704_Interface.__1023038704_Ptr
  }


  public override val __23801363_Ptr: JNAPointer? by lazy {
    __23801363_Interface.__23801363_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1213924739_Interface, __1023038705_Interface, __1023038704_Interface,
        __23801363_Interface)

  private fun as_1213924739(): IVisualInteractionSource.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource.ABI.makeIVisualInteractionSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource.ABI.makeIVisualInteractionSource(ref.value))
  }

  private fun as_1023038705(): IVisualInteractionSource2.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource2.ABI.makeIVisualInteractionSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource2.ABI.makeIVisualInteractionSource2(ref.value))
  }

  private fun as_1023038704(): IVisualInteractionSource3.WithDefault {
    if(pointer == NULL) {
      return(IVisualInteractionSource3.ABI.makeIVisualInteractionSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualInteractionSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualInteractionSource3.ABI.makeIVisualInteractionSource3(ref.value))
  }

  private fun as_23801363(): ICompositionInteractionSource.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.VisualInteractionSource".toHandle(),refiid,interfacePtr)
      val result =
          IVisualInteractionSourceStatics2.ABI.makeIVisualInteractionSourceStatics2(interfacePtr.value)
      return result
    }

    public fun createIVisualInteractionSourceStatics(): IVisualInteractionSourceStatics {
      val refiid = Guid.REFIID(IVisualInteractionSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.VisualInteractionSource".toHandle(),refiid,interfacePtr)
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
