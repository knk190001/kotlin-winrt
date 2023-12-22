package Windows.UI.Input.Inking

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(InkStrokeContainer.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkStrokeContainer;{22accbc6-faa9-4f14-b68c-f6cee670ae16})")
@WinRTByReference(brClass = InkStrokeContainer.ByReference::class)
public class InkStrokeContainer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkStrokeContainer.WithDefault, IInkStrokeContainer2.WithDefault,
    IInkStrokeContainer3.WithDefault, IWinRTObject {
  private val __241300611_Interface: IInkStrokeContainer.WithDefault by lazy {
    as_241300611()
  }


  private val __1109615701_Interface: IInkStrokeContainer2.WithDefault by lazy {
    as_1109615701()
  }


  private val __1109615702_Interface: IInkStrokeContainer3.WithDefault by lazy {
    as_1109615702()
  }


  public override val __241300611_Ptr: JNAPointer? by lazy {
    __241300611_Interface.__241300611_Ptr
  }


  public override val __1109615701_Ptr: JNAPointer? by lazy {
    __1109615701_Interface.__1109615701_Ptr
  }


  public override val __1109615702_Ptr: JNAPointer? by lazy {
    __1109615702_Interface.__1109615702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__241300611_Interface, __1109615701_Interface, __1109615702_Interface)

  public constructor() : this(ABI.activate())

  private fun as_241300611(): IInkStrokeContainer.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeContainer.ABI.makeIInkStrokeContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeContainer.ABI.makeIInkStrokeContainer(ref.value))
  }

  private fun as_1109615701(): IInkStrokeContainer2.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeContainer2.ABI.makeIInkStrokeContainer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeContainer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeContainer2.ABI.makeIInkStrokeContainer2(ref.value))
  }

  private fun as_1109615702(): IInkStrokeContainer3.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeContainer3.ABI.makeIInkStrokeContainer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeContainer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeContainer3.ABI.makeIInkStrokeContainer3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkStrokeContainer> {
    public override fun getValue() = InkStrokeContainer(pointer.getPointer(0))

    public fun setValue(value: InkStrokeContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkStrokeContainer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkStrokeContainer".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): InkStrokeContainer {
      val address = segment.toRawLongValue()
      return InkStrokeContainer(Pointer(address))
    }

    public override fun toNative(obj: InkStrokeContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
