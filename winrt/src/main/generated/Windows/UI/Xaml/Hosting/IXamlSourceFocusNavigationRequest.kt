package Windows.UI.Xaml.Hosting

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

@ABIMarker(IXamlSourceFocusNavigationRequest.ABI::class)
@Signature("{fbb93bb5-1496-5a80-ac00-e757359755e6}")
@Guid("fbb93bb514965a80ac00e757359755e6")
@WinRTInterface("fbb93bb514965a80ac00e757359755e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlSourceFocusNavigationRequest.ByReference::class)
public interface IXamlSourceFocusNavigationRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): XamlSourceFocusNavigationReason?

  @InterfaceMethod(1)
  public fun get_HintRect(): Rect?

  @InterfaceMethod(2)
  public fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlSourceFocusNavigationRequest> {
    public override fun getValue() =
        ABI.makeIXamlSourceFocusNavigationRequest(pointer.getPointer(0))

    public fun setValue(value: IXamlSourceFocusNavigationRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlSourceFocusNavigationRequest {
    public val __1344267756_Ptr: Pointer?

    public val _1344267756_VtblPtr: Pointer?
      get() = __1344267756_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): XamlSourceFocusNavigationReason? {
      val fnPtr = _1344267756_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationReason>()
      val hr = fn.invokeHR(arrayOf(__1344267756_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HintRect(): Rect? {
      val fnPtr = _1344267756_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1344267756_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1344267756_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1344267756_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IXamlSourceFocusNavigationRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344267756_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlSourceFocusNavigationRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbb93bb514965a80ac00e757359755e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlSourceFocusNavigationRequest(ptr: Pointer?): WithDefault =
        IXamlSourceFocusNavigationRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlSourceFocusNavigationRequest {
      val address = segment.toRawLongValue()
      return makeIXamlSourceFocusNavigationRequest(Pointer(address))
    }

    public override fun toNative(obj: IXamlSourceFocusNavigationRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344267756_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlSourceFocusNavigationRequest):
        Array<IXamlSourceFocusNavigationRequest?> = (elements as
        Array<IXamlSourceFocusNavigationRequest?>).castToImpl<IXamlSourceFocusNavigationRequest,IXamlSourceFocusNavigationRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlSourceFocusNavigationRequest?> =
        arrayOfNulls<IXamlSourceFocusNavigationRequest_Impl>(size) as
        Array<IXamlSourceFocusNavigationRequest?>
  }
}
