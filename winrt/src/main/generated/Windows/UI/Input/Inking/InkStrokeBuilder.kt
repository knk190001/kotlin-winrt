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

@ABIMarker(InkStrokeBuilder.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkStrokeBuilder;{82bbd1dc-1c63-41dc-9e07-4b4a70ced801})")
@WinRTByReference(brClass = InkStrokeBuilder.ByReference::class)
public class InkStrokeBuilder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkStrokeBuilder.WithDefault, IInkStrokeBuilder2.WithDefault,
    IInkStrokeBuilder3.WithDefault, IWinRTObject {
  private val __188990057_Interface: IInkStrokeBuilder.WithDefault by lazy {
    as_188990057()
  }


  private val __1563724421_Interface: IInkStrokeBuilder2.WithDefault by lazy {
    as_1563724421()
  }


  private val __1563724420_Interface: IInkStrokeBuilder3.WithDefault by lazy {
    as_1563724420()
  }


  public override val __188990057_Ptr: JNAPointer? by lazy {
    __188990057_Interface.__188990057_Ptr
  }


  public override val __1563724421_Ptr: JNAPointer? by lazy {
    __1563724421_Interface.__1563724421_Ptr
  }


  public override val __1563724420_Ptr: JNAPointer? by lazy {
    __1563724420_Interface.__1563724420_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__188990057_Interface, __1563724421_Interface, __1563724420_Interface)

  public constructor() : this(ABI.activate())

  private fun as_188990057(): IInkStrokeBuilder.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeBuilder.ABI.makeIInkStrokeBuilder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeBuilder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeBuilder.ABI.makeIInkStrokeBuilder(ref.value))
  }

  private fun as_1563724421(): IInkStrokeBuilder2.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeBuilder2.ABI.makeIInkStrokeBuilder2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeBuilder2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeBuilder2.ABI.makeIInkStrokeBuilder2(ref.value))
  }

  private fun as_1563724420(): IInkStrokeBuilder3.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeBuilder3.ABI.makeIInkStrokeBuilder3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeBuilder3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeBuilder3.ABI.makeIInkStrokeBuilder3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkStrokeBuilder> {
    public override fun getValue() = InkStrokeBuilder(pointer.getPointer(0))

    public fun setValue(value: InkStrokeBuilder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkStrokeBuilder, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkStrokeBuilder".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InkStrokeBuilder {
      val address = segment.toRawLongValue()
      return InkStrokeBuilder(Pointer(address))
    }

    public override fun toNative(obj: InkStrokeBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
