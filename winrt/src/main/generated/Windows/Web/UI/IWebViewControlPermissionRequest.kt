package Windows.Web.UI

import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWebViewControlPermissionRequest.ABI::class)
@Signature("{e5bc836c-f22f-40e2-95b2-7729f840eb7f}")
@Guid("e5bc836cf22f40e295b27729f840eb7f")
@WinRTInterface("e5bc836cf22f40e295b27729f840eb7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlPermissionRequest.ByReference::class)
public interface IWebViewControlPermissionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  @InterfaceMethod(2)
  public fun get_PermissionType(): WebViewControlPermissionType?

  @InterfaceMethod(3)
  public fun get_State(): WebViewControlPermissionState?

  @InterfaceMethod(4)
  public fun Defer(): Unit

  @InterfaceMethod(5)
  public fun Allow(): Unit

  @InterfaceMethod(6)
  public fun Deny(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlPermissionRequest> {
    public override fun getValue() = ABI.makeIWebViewControlPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlPermissionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlPermissionRequest {
    public val __1672945420_Ptr: Pointer?

    public val _1672945420_VtblPtr: Pointer?
      get() = __1672945420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PermissionType(): WebViewControlPermissionType? {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlPermissionType>()
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlPermissionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_State(): WebViewControlPermissionState? {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlPermissionState>()
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlPermissionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Defer(): Unit {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Allow(): Unit {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Deny(): Unit {
      val fnPtr = _1672945420_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672945420_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlPermissionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1672945420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlPermissionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5bc836cf22f40e295b27729f840eb7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlPermissionRequest(ptr: Pointer?): WithDefault =
        IWebViewControlPermissionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlPermissionRequest {
      val address = segment.toRawLongValue()
      return makeIWebViewControlPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1672945420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlPermissionRequest):
        Array<IWebViewControlPermissionRequest?> = (elements as
        Array<IWebViewControlPermissionRequest?>).castToImpl<IWebViewControlPermissionRequest,IWebViewControlPermissionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlPermissionRequest?> =
        arrayOfNulls<IWebViewControlPermissionRequest_Impl>(size) as
        Array<IWebViewControlPermissionRequest?>
  }
}
