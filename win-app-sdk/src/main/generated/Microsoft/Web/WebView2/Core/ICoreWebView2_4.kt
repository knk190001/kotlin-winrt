package Microsoft.Web.WebView2.Core

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

@ABIMarker(ICoreWebView2_4.ABI::class)
@Signature("{4ac595ce-1502-5775-b2c8-22c11a369c25}")
@Guid("4ac595ce15025775b2c822c11a369c25")
@WinRTInterface("4ac595ce15025775b2c822c11a369c25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_4.ByReference::class)
public interface ICoreWebView2_4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_FrameCreated(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2FrameCreatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_FrameCreated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_DownloadStarting(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2DownloadStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DownloadStarting(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_4> {
    public override fun getValue() = ABI.makeICoreWebView2_4(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_4 {
    public val __335594436_Ptr: Pointer?

    public val _335594436_VtblPtr: Pointer?
      get() = __335594436_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_FrameCreated(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2FrameCreatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _335594436_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335594436_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_FrameCreated(token: EventRegistrationToken?): Unit {
      val fnPtr = _335594436_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594436_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_DownloadStarting(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2DownloadStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _335594436_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335594436_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DownloadStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _335594436_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594436_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ac595ce15025775b2c822c11a369c25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_4(ptr: Pointer?): WithDefault = ICoreWebView2_4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_4 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_4(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_4): Array<ICoreWebView2_4?> = (elements as
        Array<ICoreWebView2_4?>).castToImpl<ICoreWebView2_4,ICoreWebView2_4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_4?> =
        arrayOfNulls<ICoreWebView2_4_Impl>(size) as Array<ICoreWebView2_4?>
  }
}
