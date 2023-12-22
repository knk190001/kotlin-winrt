package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferCompletionGroup.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup;{2d930225-986b-574d-7950-0add47f5d706})")
@WinRTByReference(brClass = BackgroundTransferCompletionGroup.ByReference::class)
public class BackgroundTransferCompletionGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTransferCompletionGroup.WithDefault, IWinRTObject {
  private val __307218327_Interface: IBackgroundTransferCompletionGroup.WithDefault by lazy {
    as_307218327()
  }


  public override val __307218327_Ptr: JNAPointer? by lazy {
    __307218327_Interface.__307218327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__307218327_Interface)

  public constructor() : this(ABI.activate())

  private fun as_307218327(): IBackgroundTransferCompletionGroup.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferCompletionGroup.ABI.makeIBackgroundTransferCompletionGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferCompletionGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferCompletionGroup.ABI.makeIBackgroundTransferCompletionGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTransferCompletionGroup> {
    public override fun getValue() = BackgroundTransferCompletionGroup(pointer.getPointer(0))

    public fun setValue(value: BackgroundTransferCompletionGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTransferCompletionGroup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BackgroundTransferCompletionGroup {
      val address = segment.toRawLongValue()
      return BackgroundTransferCompletionGroup(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTransferCompletionGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
