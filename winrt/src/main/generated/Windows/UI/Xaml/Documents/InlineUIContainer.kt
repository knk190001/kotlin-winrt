package Windows.UI.Xaml.Documents

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InlineUIContainer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.InlineUIContainer;{1416ce81-28ee-452e-b121-5fc4f60b86a6})")
@WinRTByReference(brClass = InlineUIContainer.ByReference::class)
public class InlineUIContainer(
  ptr: JNAPointer? = NULL
) : Inline(ptr), IInlineUIContainer.WithDefault, IWinRTObject {
  private val __1337271572_Interface: IInlineUIContainer.WithDefault by lazy {
    as_1337271572()
  }


  public override val __1337271572_Ptr: JNAPointer? by lazy {
    __1337271572_Interface.__1337271572_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1337271572_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1337271572(): IInlineUIContainer.WithDefault {
    if(pointer == NULL) {
      return(IInlineUIContainer.ABI.makeIInlineUIContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInlineUIContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInlineUIContainer.ABI.makeIInlineUIContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InlineUIContainer> {
    public override fun getValue() = InlineUIContainer(pointer.getPointer(0))

    public fun setValue(value: InlineUIContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InlineUIContainer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.InlineUIContainer".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InlineUIContainer {
      val address = segment.toRawLongValue()
      return InlineUIContainer(Pointer(address))
    }

    public override fun toNative(obj: InlineUIContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
