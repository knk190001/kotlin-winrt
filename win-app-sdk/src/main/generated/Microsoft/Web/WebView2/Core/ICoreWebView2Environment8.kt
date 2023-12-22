package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICoreWebView2Environment8.ABI::class)
@Signature("{db67c807-d0db-5980-a3a9-75ef8f63d6f6}")
@Guid("db67c807d0db5980a3a975ef8f63d6f6")
@WinRTInterface("db67c807d0db5980a3a975ef8f63d6f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment8.ByReference::class)
public interface ICoreWebView2Environment8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ProcessInfosChanged(handler: TypedEventHandler<CoreWebView2Environment?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ProcessInfosChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetProcessInfos(): IVectorView<CoreWebView2ProcessInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment8> {
    public override fun getValue() = ABI.makeICoreWebView2Environment8(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment8 {
    public val __174970988_Ptr: Pointer?

    public val _174970988_VtblPtr: Pointer?
      get() = __174970988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ProcessInfosChanged(handler: TypedEventHandler<CoreWebView2Environment?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _174970988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174970988_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ProcessInfosChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _174970988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174970988_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetProcessInfos(): IVectorView<CoreWebView2ProcessInfo?>? {
      val fnPtr = _174970988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreWebView2ProcessInfo?>>()
      val hr = fn.invokeHR(arrayOf(__174970988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreWebView2ProcessInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db67c807d0db5980a3a975ef8f63d6f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment8(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment8 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment8(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment8):
        Array<ICoreWebView2Environment8?> = (elements as
        Array<ICoreWebView2Environment8?>).castToImpl<ICoreWebView2Environment8,ICoreWebView2Environment8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment8?> =
        arrayOfNulls<ICoreWebView2Environment8_Impl>(size) as Array<ICoreWebView2Environment8?>
  }
}
