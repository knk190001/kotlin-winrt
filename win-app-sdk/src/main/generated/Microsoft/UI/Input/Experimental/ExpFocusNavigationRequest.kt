package Microsoft.UI.Input.Experimental

import Windows.Foundation.Rect
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

@ABIMarker(ExpFocusNavigationRequest.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpFocusNavigationRequest;{4de7c4d0-6f4b-5176-9ae2-346d3318db4e})")
@WinRTByReference(brClass = ExpFocusNavigationRequest.ByReference::class)
public class ExpFocusNavigationRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpFocusNavigationRequest.WithDefault, IWinRTObject {
  private val __1383467997_Interface: IExpFocusNavigationRequest.WithDefault by lazy {
    as_1383467997()
  }


  public override val __1383467997_Ptr: JNAPointer? by lazy {
    __1383467997_Interface.__1383467997_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383467997_Interface)

  private fun as_1383467997(): IExpFocusNavigationRequest.WithDefault {
    if(pointer == NULL) {
      return(IExpFocusNavigationRequest.ABI.makeIExpFocusNavigationRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpFocusNavigationRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpFocusNavigationRequest.ABI.makeIExpFocusNavigationRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpFocusNavigationRequest> {
    public override fun getValue() = ExpFocusNavigationRequest(pointer.getPointer(0))

    public fun setValue(value: ExpFocusNavigationRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpFocusNavigationRequest, MemoryAddress> {
    public val IExpFocusNavigationRequestStatics_Instance: IExpFocusNavigationRequestStatics by
        lazy {
      createIExpFocusNavigationRequestStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpFocusNavigationRequestStatics(): IExpFocusNavigationRequestStatics {
      val refiid = Guid.REFIID(IExpFocusNavigationRequestStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.Experimental.ExpFocusNavigationRequest".toHandle(),refiid,interfacePtr)
      val result =
          IExpFocusNavigationRequestStatics.ABI.makeIExpFocusNavigationRequestStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExpFocusNavigationRequest {
      val address = segment.toRawLongValue()
      return ExpFocusNavigationRequest(Pointer(address))
    }

    public override fun toNative(obj: ExpFocusNavigationRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFocusNavigationRequestReasonAndHintRect(reason: ExpFocusNavigationReason,
        hintRect: Rect) =
        ABI.IExpFocusNavigationRequestStatics_Instance.CreateFocusNavigationRequestReasonAndHintRect(reason,
        hintRect)

    public fun CreateFocusNavigationRequestReasonHintRectAndId(
      reason: ExpFocusNavigationReason,
      hintRect: Rect,
      correlationId: Guid.GUID
    ) =
        ABI.IExpFocusNavigationRequestStatics_Instance.CreateFocusNavigationRequestReasonHintRectAndId(reason,
        hintRect, correlationId)

    public fun CreateFocusNavigationRequestWithReason(reason: ExpFocusNavigationReason) =
        ABI.IExpFocusNavigationRequestStatics_Instance.CreateFocusNavigationRequestWithReason(reason)
  }
}
