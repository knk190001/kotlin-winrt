package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2_9.ABI::class)
@Signature("{64b2ec16-0b29-5216-bf86-e575c88f7031}")
@Guid("64b2ec160b295216bf86e575c88f7031")
@WinRTInterface("64b2ec160b295216bf86e575c88f7031")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_9.ByReference::class)
public interface ICoreWebView2_9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultDownloadDialogOpen(): Boolean

  @InterfaceMethod(1)
  public fun get_DefaultDownloadDialogCornerAlignment():
      CoreWebView2DefaultDownloadDialogCornerAlignment?

  @InterfaceMethod(2)
  public
      fun put_DefaultDownloadDialogCornerAlignment(value: CoreWebView2DefaultDownloadDialogCornerAlignment?):
      Unit

  @InterfaceMethod(3)
  public fun get_DefaultDownloadDialogMargin(): Point?

  @InterfaceMethod(4)
  public fun put_DefaultDownloadDialogMargin(value: Point?): Unit

  @InterfaceMethod(5)
  public fun add_IsDefaultDownloadDialogOpenChanged(handler: TypedEventHandler<CoreWebView2?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_IsDefaultDownloadDialogOpenChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun OpenDefaultDownloadDialog(): Unit

  @InterfaceMethod(8)
  public fun CloseDefaultDownloadDialog(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_9> {
    public override fun getValue() = ABI.makeICoreWebView2_9(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_9 {
    public val __335594431_Ptr: Pointer?

    public val _335594431_VtblPtr: Pointer?
      get() = __335594431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultDownloadDialogOpen(): Boolean {
      val fnPtr = _335594431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DefaultDownloadDialogCornerAlignment():
        CoreWebView2DefaultDownloadDialogCornerAlignment? {
      val fnPtr = _335594431_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2DefaultDownloadDialogCornerAlignment>()
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CoreWebView2DefaultDownloadDialogCornerAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun put_DefaultDownloadDialogCornerAlignment(value: CoreWebView2DefaultDownloadDialogCornerAlignment?):
        Unit {
      val fnPtr = _335594431_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DefaultDownloadDialogMargin(): Point? {
      val fnPtr = _335594431_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DefaultDownloadDialogMargin(value: Point?): Unit {
      val fnPtr = _335594431_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override
        fun add_IsDefaultDownloadDialogOpenChanged(handler: TypedEventHandler<CoreWebView2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _335594431_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_IsDefaultDownloadDialogOpenChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _335594431_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun OpenDefaultDownloadDialog(): Unit {
      val fnPtr = _335594431_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun CloseDefaultDownloadDialog(): Unit {
      val fnPtr = _335594431_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594431_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64b2ec160b295216bf86e575c88f7031")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_9(ptr: Pointer?): WithDefault = ICoreWebView2_9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_9 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_9(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_9): Array<ICoreWebView2_9?> = (elements as
        Array<ICoreWebView2_9?>).castToImpl<ICoreWebView2_9,ICoreWebView2_9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_9?> =
        arrayOfNulls<ICoreWebView2_9_Impl>(size) as Array<ICoreWebView2_9?>
  }
}
