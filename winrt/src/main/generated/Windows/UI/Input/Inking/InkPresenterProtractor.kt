package Windows.UI.Input.Inking

import Windows.UI.Input.Inking.IInkPresenterProtractorFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InkPresenterProtractor.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkPresenterProtractor;{7de3f2aa-ef6c-4e91-a73b-5b70d56fbd17})")
@WinRTByReference(brClass = InkPresenterProtractor.ByReference::class)
public class InkPresenterProtractor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkPresenterProtractor.WithDefault, IInkPresenterStencil.WithDefault,
    IWinRTObject {
  private val __743009274_Interface: IInkPresenterProtractor.WithDefault by lazy {
    as_743009274()
  }


  private val __516770336_Interface: IInkPresenterStencil.WithDefault by lazy {
    as_516770336()
  }


  public override val __743009274_Ptr: JNAPointer? by lazy {
    __743009274_Interface.__743009274_Ptr
  }


  public override val __516770336_Ptr: JNAPointer? by lazy {
    __516770336_Interface.__516770336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743009274_Interface, __516770336_Interface)

  public constructor(inkPresenter: InkPresenter) : this(ABI.activate(inkPresenter))

  private fun as_743009274(): IInkPresenterProtractor.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenterProtractor.ABI.makeIInkPresenterProtractor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenterProtractor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenterProtractor.ABI.makeIInkPresenterProtractor(ref.value))
  }

  private fun as_516770336(): IInkPresenterStencil.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenterStencil.ABI.makeIInkPresenterStencil(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenterStencil>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenterStencil.ABI.makeIInkPresenterStencil(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkPresenterProtractor> {
    public override fun getValue() = InkPresenterProtractor(pointer.getPointer(0))

    public fun setValue(value: InkPresenterProtractor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkPresenterProtractor, MemoryAddress> {
    public val IInkPresenterProtractorFactory_Instance: IInkPresenterProtractorFactory by lazy {
      createIInkPresenterProtractorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkPresenterProtractorFactory(): IInkPresenterProtractorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkPresenterProtractor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkPresenterProtractorFactory.ABI.makeIInkPresenterProtractorFactory(factoryActivatorPtr.value))
    }

    public fun activate(inkPresenter: InkPresenter): JNAPointer? =
        IInkPresenterProtractorFactory_Instance.Create(inkPresenter)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkPresenterProtractor {
      val address = segment.toRawLongValue()
      return InkPresenterProtractor(Pointer(address))
    }

    public override fun toNative(obj: InkPresenterProtractor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
