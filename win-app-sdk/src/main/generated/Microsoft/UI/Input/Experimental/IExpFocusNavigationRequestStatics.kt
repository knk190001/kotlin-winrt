package Microsoft.UI.Input.Experimental

import Windows.Foundation.Rect
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpFocusNavigationRequestStatics.ABI::class)
@Signature("{1cc934bb-ec15-5faa-af75-afe45d0ce1a9}")
@Guid("1cc934bbec155faaaf75afe45d0ce1a9")
@WinRTInterface("1cc934bbec155faaaf75afe45d0ce1a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusNavigationRequestStatics.ByReference::class)
public interface IExpFocusNavigationRequestStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFocusNavigationRequestReasonAndHintRect(reason: ExpFocusNavigationReason?,
      hintRect: Rect?): ExpFocusNavigationRequest?

  @InterfaceMethod(1)
  public fun CreateFocusNavigationRequestReasonHintRectAndId(
    reason: ExpFocusNavigationReason?,
    hintRect: Rect?,
    correlationId: com.sun.jna.platform.win32.Guid.GUID?
  ): ExpFocusNavigationRequest?

  @InterfaceMethod(2)
  public fun CreateFocusNavigationRequestWithReason(reason: ExpFocusNavigationReason?):
      ExpFocusNavigationRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusNavigationRequestStatics> {
    public override fun getValue() =
        ABI.makeIExpFocusNavigationRequestStatics(pointer.getPointer(0))

    public fun setValue(value: IExpFocusNavigationRequestStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusNavigationRequestStatics {
    public val __1765796136_Ptr: Pointer?

    public val _1765796136_VtblPtr: Pointer?
      get() = __1765796136_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateFocusNavigationRequestReasonAndHintRect(reason: ExpFocusNavigationReason?,
        hintRect: Rect?): ExpFocusNavigationRequest? {
      val fnPtr = _1765796136_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1765796136_Ptr, marshalToNative(reason),
          marshalToNative(hintRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFocusNavigationRequestReasonHintRectAndId(
      reason: ExpFocusNavigationReason?,
      hintRect: Rect?,
      correlationId: com.sun.jna.platform.win32.Guid.GUID?
    ): ExpFocusNavigationRequest? {
      val fnPtr = _1765796136_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1765796136_Ptr, marshalToNative(reason),
          marshalToNative(hintRect), marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFocusNavigationRequestWithReason(reason: ExpFocusNavigationReason?):
        ExpFocusNavigationRequest? {
      val fnPtr = _1765796136_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1765796136_Ptr, marshalToNative(reason), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationRequest>(result.getValue())
      return resultValue
    }
  }

  public class IExpFocusNavigationRequestStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1765796136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusNavigationRequestStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cc934bbec155faaaf75afe45d0ce1a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusNavigationRequestStatics(ptr: Pointer?): WithDefault =
        IExpFocusNavigationRequestStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusNavigationRequestStatics {
      val address = segment.toRawLongValue()
      return makeIExpFocusNavigationRequestStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusNavigationRequestStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1765796136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusNavigationRequestStatics):
        Array<IExpFocusNavigationRequestStatics?> = (elements as
        Array<IExpFocusNavigationRequestStatics?>).castToImpl<IExpFocusNavigationRequestStatics,IExpFocusNavigationRequestStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusNavigationRequestStatics?> =
        arrayOfNulls<IExpFocusNavigationRequestStatics_Impl>(size) as
        Array<IExpFocusNavigationRequestStatics?>
  }
}
