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

@ABIMarker(IWebViewPermissionRequest.ABI::class)
@Signature("{17b76332-66c4-4131-999e-df7de20a8c9c}")
@Guid("17b7633266c44131999edf7de20a8c9c")
@WinRTInterface("17b7633266c44131999edf7de20a8c9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewPermissionRequest.ByReference::class)
public interface IWebViewPermissionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_PermissionType(): WebViewPermissionType?

  @InterfaceMethod(2)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_State(): WebViewPermissionState?

  @InterfaceMethod(4)
  public fun Defer(): Unit

  @InterfaceMethod(5)
  public fun Allow(): Unit

  @InterfaceMethod(6)
  public fun Deny(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewPermissionRequest> {
    public override fun getValue() = ABI.makeIWebViewPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: IWebViewPermissionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewPermissionRequest {
    public val __601676483_Ptr: Pointer?

    public val _601676483_VtblPtr: Pointer?
      get() = __601676483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _601676483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PermissionType(): WebViewPermissionType? {
      val fnPtr = _601676483_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewPermissionType>()
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewPermissionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _601676483_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_State(): WebViewPermissionState? {
      val fnPtr = _601676483_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewPermissionState>()
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewPermissionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Defer(): Unit {
      val fnPtr = _601676483_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Allow(): Unit {
      val fnPtr = _601676483_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Deny(): Unit {
      val fnPtr = _601676483_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__601676483_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewPermissionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __601676483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewPermissionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17b7633266c44131999edf7de20a8c9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewPermissionRequest(ptr: Pointer?): WithDefault =
        IWebViewPermissionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewPermissionRequest {
      val address = segment.toRawLongValue()
      return makeIWebViewPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebViewPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__601676483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewPermissionRequest):
        Array<IWebViewPermissionRequest?> = (elements as
        Array<IWebViewPermissionRequest?>).castToImpl<IWebViewPermissionRequest,IWebViewPermissionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewPermissionRequest?> =
        arrayOfNulls<IWebViewPermissionRequest_Impl>(size) as Array<IWebViewPermissionRequest?>
  }
}
