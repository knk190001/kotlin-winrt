package Windows.ApplicationModel.Activation

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

@ABIMarker(WebAuthenticationBrokerContinuationEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.WebAuthenticationBrokerContinuationEventArgs;{75dda3d4-7714-453d-b7ff-b95e3a1709da})")
@WinRTByReference(brClass = WebAuthenticationBrokerContinuationEventArgs.ByReference::class)
public class WebAuthenticationBrokerContinuationEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAuthenticationBrokerContinuationEventArgs.WithDefault,
    IContinuationActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __917748028_Interface: IWebAuthenticationBrokerContinuationEventArgs.WithDefault by
      lazy {
    as_917748028()
  }


  private val __1151516762_Interface: IContinuationActivatedEventArgs.WithDefault by lazy {
    as_1151516762()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __917748028_Ptr: JNAPointer? by lazy {
    __917748028_Interface.__917748028_Ptr
  }


  public override val __1151516762_Ptr: JNAPointer? by lazy {
    __1151516762_Interface.__1151516762_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__917748028_Interface, __1151516762_Interface, __1721660047_Interface)

  private fun as_917748028(): IWebAuthenticationBrokerContinuationEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebAuthenticationBrokerContinuationEventArgs.ABI.makeIWebAuthenticationBrokerContinuationEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAuthenticationBrokerContinuationEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAuthenticationBrokerContinuationEventArgs.ABI.makeIWebAuthenticationBrokerContinuationEventArgs(ref.value))
  }

  private fun as_1151516762(): IContinuationActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContinuationActivatedEventArgs.ABI.makeIContinuationActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContinuationActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContinuationActivatedEventArgs.ABI.makeIContinuationActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAuthenticationBrokerContinuationEventArgs> {
    public override fun getValue() =
        WebAuthenticationBrokerContinuationEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebAuthenticationBrokerContinuationEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAuthenticationBrokerContinuationEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebAuthenticationBrokerContinuationEventArgs {
      val address = segment.toRawLongValue()
      return WebAuthenticationBrokerContinuationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebAuthenticationBrokerContinuationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
