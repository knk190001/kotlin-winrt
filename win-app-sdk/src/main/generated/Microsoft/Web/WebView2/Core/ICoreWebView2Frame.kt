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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Frame.ABI::class)
@Signature("{02ffcbf9-19e7-5bb8-8273-346420fb1503}")
@Guid("02ffcbf919e75bb88273346420fb1503")
@WinRTInterface("02ffcbf919e75bb88273346420fb1503")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Frame.ByReference::class)
public interface ICoreWebView2Frame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun add_NameChanged(handler: TypedEventHandler<CoreWebView2Frame?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_NameChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Destroyed(handler: TypedEventHandler<CoreWebView2Frame?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Destroyed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun RemoveHostObjectFromScript(name: String?): Unit

  @InterfaceMethod(6)
  public fun IsDestroyed(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Frame> {
    public override fun getValue() = ABI.makeICoreWebView2Frame(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Frame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Frame {
    public val __968877926_Ptr: Pointer?

    public val _968877926_VtblPtr: Pointer?
      get() = __968877926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _968877926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_NameChanged(handler: TypedEventHandler<CoreWebView2Frame?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _968877926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_NameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _968877926_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Destroyed(handler: TypedEventHandler<CoreWebView2Frame?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _968877926_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Destroyed(token: EventRegistrationToken?): Unit {
      val fnPtr = _968877926_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun RemoveHostObjectFromScript(name: String?): Unit {
      val fnPtr = _968877926_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun IsDestroyed(): Int {
      val fnPtr = _968877926_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__968877926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2Frame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __968877926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Frame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02ffcbf919e75bb88273346420fb1503")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Frame(ptr: Pointer?): WithDefault = ICoreWebView2Frame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Frame {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Frame(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Frame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__968877926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Frame): Array<ICoreWebView2Frame?> =
        (elements as
        Array<ICoreWebView2Frame?>).castToImpl<ICoreWebView2Frame,ICoreWebView2Frame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Frame?> =
        arrayOfNulls<ICoreWebView2Frame_Impl>(size) as Array<ICoreWebView2Frame?>
  }
}
