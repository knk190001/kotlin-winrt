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

@ABIMarker(InkManager.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkManager;{4744737d-671b-4163-9c95-4e8d7a035fe1})")
@WinRTByReference(brClass = InkManager.ByReference::class)
public class InkManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkManager.WithDefault, IInkRecognizerContainer.WithDefault,
    IInkStrokeContainer.WithDefault, IWinRTObject {
  private val __80296449_Interface: IInkManager.WithDefault by lazy {
    as_80296449()
  }


  private val __783661167_Interface: IInkRecognizerContainer.WithDefault by lazy {
    as_783661167()
  }


  private val __241300611_Interface: IInkStrokeContainer.WithDefault by lazy {
    as_241300611()
  }


  public override val __80296449_Ptr: JNAPointer? by lazy {
    __80296449_Interface.__80296449_Ptr
  }


  public override val __783661167_Ptr: JNAPointer? by lazy {
    __783661167_Interface.__783661167_Ptr
  }


  public override val __241300611_Ptr: JNAPointer? by lazy {
    __241300611_Interface.__241300611_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__80296449_Interface, __783661167_Interface, __241300611_Interface)

  public constructor() : this(ABI.activate())

  private fun as_80296449(): IInkManager.WithDefault {
    if(pointer == NULL) {
      return(IInkManager.ABI.makeIInkManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkManager.ABI.makeIInkManager(ref.value))
  }

  private fun as_783661167(): IInkRecognizerContainer.WithDefault {
    if(pointer == NULL) {
      return(IInkRecognizerContainer.ABI.makeIInkRecognizerContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkRecognizerContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkRecognizerContainer.ABI.makeIInkRecognizerContainer(ref.value))
  }

  private fun as_241300611(): IInkStrokeContainer.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeContainer.ABI.makeIInkStrokeContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeContainer.ABI.makeIInkStrokeContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkManager> {
    public override fun getValue() = InkManager(pointer.getPointer(0))

    public fun setValue(value: InkManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkManager".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InkManager {
      val address = segment.toRawLongValue()
      return InkManager(Pointer(address))
    }

    public override fun toNative(obj: InkManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
