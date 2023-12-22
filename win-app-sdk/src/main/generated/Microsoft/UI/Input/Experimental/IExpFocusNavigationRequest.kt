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

@ABIMarker(IExpFocusNavigationRequest.ABI::class)
@Signature("{4de7c4d0-6f4b-5176-9ae2-346d3318db4e}")
@Guid("4de7c4d06f4b51769ae2346d3318db4e")
@WinRTInterface("4de7c4d06f4b51769ae2346d3318db4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusNavigationRequest.ByReference::class)
public interface IExpFocusNavigationRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_HintRect(): Rect?

  @InterfaceMethod(2)
  public fun get_Reason(): ExpFocusNavigationReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusNavigationRequest> {
    public override fun getValue() = ABI.makeIExpFocusNavigationRequest(pointer.getPointer(0))

    public fun setValue(value: IExpFocusNavigationRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusNavigationRequest {
    public val __1383467997_Ptr: Pointer?

    public val _1383467997_VtblPtr: Pointer?
      get() = __1383467997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1383467997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1383467997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HintRect(): Rect? {
      val fnPtr = _1383467997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1383467997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Reason(): ExpFocusNavigationReason? {
      val fnPtr = _1383467997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationReason>()
      val hr = fn.invokeHR(arrayOf(__1383467997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationReason>(result.getValue())
      return resultValue
    }
  }

  public class IExpFocusNavigationRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383467997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusNavigationRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4de7c4d06f4b51769ae2346d3318db4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusNavigationRequest(ptr: Pointer?): WithDefault =
        IExpFocusNavigationRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusNavigationRequest {
      val address = segment.toRawLongValue()
      return makeIExpFocusNavigationRequest(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusNavigationRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383467997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusNavigationRequest):
        Array<IExpFocusNavigationRequest?> = (elements as
        Array<IExpFocusNavigationRequest?>).castToImpl<IExpFocusNavigationRequest,IExpFocusNavigationRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusNavigationRequest?> =
        arrayOfNulls<IExpFocusNavigationRequest_Impl>(size) as Array<IExpFocusNavigationRequest?>
  }
}
