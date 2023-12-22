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

@ABIMarker(InkRecognizerContainer.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkRecognizerContainer;{a74d9a31-8047-4698-a912-f82a5085012f})")
@WinRTByReference(brClass = InkRecognizerContainer.ByReference::class)
public class InkRecognizerContainer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkRecognizerContainer.WithDefault, IWinRTObject {
  private val __783661167_Interface: IInkRecognizerContainer.WithDefault by lazy {
    as_783661167()
  }


  public override val __783661167_Ptr: JNAPointer? by lazy {
    __783661167_Interface.__783661167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__783661167_Interface)

  public constructor() : this(ABI.activate())

  private fun as_783661167(): IInkRecognizerContainer.WithDefault {
    if(pointer == NULL) {
      return(IInkRecognizerContainer.ABI.makeIInkRecognizerContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkRecognizerContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkRecognizerContainer.ABI.makeIInkRecognizerContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkRecognizerContainer> {
    public override fun getValue() = InkRecognizerContainer(pointer.getPointer(0))

    public fun setValue(value: InkRecognizerContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkRecognizerContainer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkRecognizerContainer".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InkRecognizerContainer {
      val address = segment.toRawLongValue()
      return InkRecognizerContainer(Pointer(address))
    }

    public override fun toNative(obj: InkRecognizerContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
