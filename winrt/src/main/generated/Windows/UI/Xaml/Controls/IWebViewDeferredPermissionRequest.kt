package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewDeferredPermissionRequest.ABI::class)
@Signature("{a3dcc461-7350-4d3a-8fb9-40eeec2746c2}")
@Guid("a3dcc46173504d3a8fb940eeec2746c2")
@WinRTInterface("a3dcc46173504d3a8fb940eeec2746c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewDeferredPermissionRequest.ByReference::class)
public interface IWebViewDeferredPermissionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_PermissionType(): WebViewPermissionType?

  @InterfaceMethod(2)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(3)
  public fun Allow(): Unit

  @InterfaceMethod(4)
  public fun Deny(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewDeferredPermissionRequest> {
    public override fun getValue() =
        ABI.makeIWebViewDeferredPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: IWebViewDeferredPermissionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewDeferredPermissionRequest {
    public val __1628846500_Ptr: Pointer?

    public val _1628846500_VtblPtr: Pointer?
      get() = __1628846500_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1628846500_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1628846500_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PermissionType(): WebViewPermissionType? {
      val fnPtr = _1628846500_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewPermissionType>()
      val hr = fn.invokeHR(arrayOf(__1628846500_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewPermissionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1628846500_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1628846500_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Allow(): Unit {
      val fnPtr = _1628846500_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1628846500_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Deny(): Unit {
      val fnPtr = _1628846500_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1628846500_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewDeferredPermissionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1628846500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewDeferredPermissionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3dcc46173504d3a8fb940eeec2746c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewDeferredPermissionRequest(ptr: Pointer?): WithDefault =
        IWebViewDeferredPermissionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewDeferredPermissionRequest {
      val address = segment.toRawLongValue()
      return makeIWebViewDeferredPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebViewDeferredPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1628846500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewDeferredPermissionRequest):
        Array<IWebViewDeferredPermissionRequest?> = (elements as
        Array<IWebViewDeferredPermissionRequest?>).castToImpl<IWebViewDeferredPermissionRequest,IWebViewDeferredPermissionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewDeferredPermissionRequest?> =
        arrayOfNulls<IWebViewDeferredPermissionRequest_Impl>(size) as
        Array<IWebViewDeferredPermissionRequest?>
  }
}
