package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreInputView4.ABI::class)
@Signature("{002863d6-d9ef-57eb-8cef-77f6ce1b7ee7}")
@Guid("002863d6d9ef57eb8cef77f6ce1b7ee7")
@WinRTInterface("002863d6d9ef57eb8cef77f6ce1b7ee7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputView4.ByReference::class)
public interface ICoreInputView4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PrimaryViewShowing(handler: TypedEventHandler<CoreInputView?,
      CoreInputViewShowingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PrimaryViewShowing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PrimaryViewHiding(handler: TypedEventHandler<CoreInputView?,
      CoreInputViewHidingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PrimaryViewHiding(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputView4> {
    public override fun getValue() = ABI.makeICoreInputView4(pointer.getPointer(0))

    public fun setValue(value: ICoreInputView4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputView4 {
    public val __1575919401_Ptr: Pointer?

    public val _1575919401_VtblPtr: Pointer?
      get() = __1575919401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PrimaryViewShowing(handler: TypedEventHandler<CoreInputView?,
        CoreInputViewShowingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1575919401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919401_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PrimaryViewShowing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1575919401_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919401_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PrimaryViewHiding(handler: TypedEventHandler<CoreInputView?,
        CoreInputViewHidingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1575919401_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919401_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PrimaryViewHiding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1575919401_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919401_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreInputView4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575919401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputView4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("002863d6d9ef57eb8cef77f6ce1b7ee7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputView4(ptr: Pointer?): WithDefault = ICoreInputView4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputView4 {
      val address = segment.toRawLongValue()
      return makeICoreInputView4(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputView4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575919401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputView4): Array<ICoreInputView4?> = (elements as
        Array<ICoreInputView4?>).castToImpl<ICoreInputView4,ICoreInputView4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputView4?> =
        arrayOfNulls<ICoreInputView4_Impl>(size) as Array<ICoreInputView4?>
  }
}
