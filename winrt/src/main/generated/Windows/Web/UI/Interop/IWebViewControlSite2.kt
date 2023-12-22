package Windows.Web.UI.Interop

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

@ABIMarker(IWebViewControlSite2.ABI::class)
@Signature("{d13b2e3f-48ee-4730-8243-d2ed0c05606a}")
@Guid("d13b2e3f48ee47308243d2ed0c05606a")
@WinRTInterface("d13b2e3f48ee47308243d2ed0c05606a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlSite2.ByReference::class)
public interface IWebViewControlSite2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_GotFocus(handler: TypedEventHandler<WebViewControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_LostFocus(handler: TypedEventHandler<WebViewControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlSite2> {
    public override fun getValue() = ABI.makeIWebViewControlSite2(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlSite2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlSite2 {
    public val __1043535290_Ptr: Pointer?

    public val _1043535290_VtblPtr: Pointer?
      get() = __1043535290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_GotFocus(handler: TypedEventHandler<WebViewControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1043535290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1043535290_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1043535290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1043535290_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_LostFocus(handler: TypedEventHandler<WebViewControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1043535290_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1043535290_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1043535290_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1043535290_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlSite2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1043535290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlSite2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d13b2e3f48ee47308243d2ed0c05606a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlSite2(ptr: Pointer?): WithDefault = IWebViewControlSite2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlSite2 {
      val address = segment.toRawLongValue()
      return makeIWebViewControlSite2(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlSite2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1043535290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlSite2): Array<IWebViewControlSite2?> =
        (elements as
        Array<IWebViewControlSite2?>).castToImpl<IWebViewControlSite2,IWebViewControlSite2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlSite2?> =
        arrayOfNulls<IWebViewControlSite2_Impl>(size) as Array<IWebViewControlSite2?>
  }
}
