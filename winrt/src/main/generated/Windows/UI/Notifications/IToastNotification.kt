package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
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

@ABIMarker(IToastNotification.ABI::class)
@Signature("{997e2675-059e-4e60-8b06-1760917c8b80}")
@Guid("997e2675059e4e608b061760917c8b80")
@WinRTInterface("997e2675059e4e608b061760917c8b80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotification.ByReference::class)
public interface IToastNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): XmlDocument?

  @InterfaceMethod(1)
  public fun put_ExpirationTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun get_ExpirationTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun add_Dismissed(handler: TypedEventHandler<ToastNotification?,
      ToastDismissedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Dismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Activated(handler: TypedEventHandler<ToastNotification?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Activated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_Failed(handler: TypedEventHandler<ToastNotification?, ToastFailedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Failed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotification> {
    public override fun getValue() = ABI.makeIToastNotification(pointer.getPointer(0))

    public fun setValue(value: IToastNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotification {
    public val __1936149058_Ptr: Pointer?

    public val _1936149058_VtblPtr: Pointer?
      get() = __1936149058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): XmlDocument? {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExpirationTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationTime(): IReference<DateTime?>? {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Dismissed(handler: TypedEventHandler<ToastNotification?,
        ToastDismissedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Dismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Activated(handler: TypedEventHandler<ToastNotification?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Activated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Failed(handler: TypedEventHandler<ToastNotification?,
        ToastFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Failed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1936149058_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1936149058_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936149058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("997e2675059e4e608b061760917c8b80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotification(ptr: Pointer?): WithDefault = IToastNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotification {
      val address = segment.toRawLongValue()
      return makeIToastNotification(Pointer(address))
    }

    public override fun toNative(obj: IToastNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936149058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification): Array<IToastNotification?> =
        (elements as
        Array<IToastNotification?>).castToImpl<IToastNotification,IToastNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification?> =
        arrayOfNulls<IToastNotification_Impl>(size) as Array<IToastNotification?>
  }
}
