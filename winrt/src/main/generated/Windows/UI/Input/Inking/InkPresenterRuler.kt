package Windows.UI.Input.Inking

import Windows.UI.Input.Inking.IInkPresenterRulerFactory.ABI.IID
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

@ABIMarker(InkPresenterRuler.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkPresenterRuler;{6cda7d5a-dec7-4dd7-877a-2133f183d48a})")
@WinRTByReference(brClass = InkPresenterRuler.ByReference::class)
public class InkPresenterRuler(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkPresenterRuler.WithDefault, IInkPresenterStencil.WithDefault,
    IInkPresenterRuler2.WithDefault, IWinRTObject {
  private val __1779118502_Interface: IInkPresenterRuler.WithDefault by lazy {
    as_1779118502()
  }


  private val __516770336_Interface: IInkPresenterStencil.WithDefault by lazy {
    as_516770336()
  }


  private val __681901336_Interface: IInkPresenterRuler2.WithDefault by lazy {
    as_681901336()
  }


  public override val __1779118502_Ptr: JNAPointer? by lazy {
    __1779118502_Interface.__1779118502_Ptr
  }


  public override val __516770336_Ptr: JNAPointer? by lazy {
    __516770336_Interface.__516770336_Ptr
  }


  public override val __681901336_Ptr: JNAPointer? by lazy {
    __681901336_Interface.__681901336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1779118502_Interface, __516770336_Interface, __681901336_Interface)

  public constructor(inkPresenter: InkPresenter) : this(ABI.activate(inkPresenter))

  private fun as_1779118502(): IInkPresenterRuler.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenterRuler.ABI.makeIInkPresenterRuler(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenterRuler>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenterRuler.ABI.makeIInkPresenterRuler(ref.value))
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

  private fun as_681901336(): IInkPresenterRuler2.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenterRuler2.ABI.makeIInkPresenterRuler2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenterRuler2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenterRuler2.ABI.makeIInkPresenterRuler2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkPresenterRuler> {
    public override fun getValue() = InkPresenterRuler(pointer.getPointer(0))

    public fun setValue(value: InkPresenterRuler): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkPresenterRuler, MemoryAddress> {
    public val IInkPresenterRulerFactory_Instance: IInkPresenterRulerFactory by lazy {
      createIInkPresenterRulerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkPresenterRulerFactory(): IInkPresenterRulerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkPresenterRuler".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkPresenterRulerFactory.ABI.makeIInkPresenterRulerFactory(factoryActivatorPtr.value))
    }

    public fun activate(inkPresenter: InkPresenter): JNAPointer? =
        IInkPresenterRulerFactory_Instance.Create(inkPresenter)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkPresenterRuler {
      val address = segment.toRawLongValue()
      return InkPresenterRuler(Pointer(address))
    }

    public override fun toNative(obj: InkPresenterRuler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
