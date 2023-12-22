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

@ABIMarker(IWebViewControlDeferredPermissionRequest.ABI::class)
@Signature("{2ce349e0-d759-445c-9926-8995298f152b}")
@Guid("2ce349e0d759445c99268995298f152b")
@WinRTInterface("2ce349e0d759445c99268995298f152b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlDeferredPermissionRequest.ByReference::class)
public interface IWebViewControlDeferredPermissionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  @InterfaceMethod(2)
  public fun get_PermissionType(): WebViewControlPermissionType?

  @InterfaceMethod(3)
  public fun Allow(): Unit

  @InterfaceMethod(4)
  public fun Deny(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlDeferredPermissionRequest> {
    public override fun getValue() =
        ABI.makeIWebViewControlDeferredPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlDeferredPermissionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlDeferredPermissionRequest {
    public val __1678760723_Ptr: Pointer?

    public val _1678760723_VtblPtr: Pointer?
      get() = __1678760723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1678760723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1678760723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1678760723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1678760723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PermissionType(): WebViewControlPermissionType? {
      val fnPtr = _1678760723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlPermissionType>()
      val hr = fn.invokeHR(arrayOf(__1678760723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlPermissionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Allow(): Unit {
      val fnPtr = _1678760723_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1678760723_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Deny(): Unit {
      val fnPtr = _1678760723_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1678760723_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlDeferredPermissionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1678760723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlDeferredPermissionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ce349e0d759445c99268995298f152b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlDeferredPermissionRequest(ptr: Pointer?): WithDefault =
        IWebViewControlDeferredPermissionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlDeferredPermissionRequest {
      val address = segment.toRawLongValue()
      return makeIWebViewControlDeferredPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlDeferredPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1678760723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlDeferredPermissionRequest):
        Array<IWebViewControlDeferredPermissionRequest?> = (elements as
        Array<IWebViewControlDeferredPermissionRequest?>).castToImpl<IWebViewControlDeferredPermissionRequest,IWebViewControlDeferredPermissionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlDeferredPermissionRequest?> =
        arrayOfNulls<IWebViewControlDeferredPermissionRequest_Impl>(size) as
        Array<IWebViewControlDeferredPermissionRequest?>
  }
}
