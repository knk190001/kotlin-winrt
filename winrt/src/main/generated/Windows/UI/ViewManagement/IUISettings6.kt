package Windows.UI.ViewManagement

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

@ABIMarker(IUISettings6.ABI::class)
@Signature("{aef19bd7-fe31-5a04-ada4-469aaec6dfa9}")
@Guid("aef19bd7fe315a04ada4469aaec6dfa9")
@WinRTInterface("aef19bd7fe315a04ada4469aaec6dfa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettings6.ByReference::class)
public interface IUISettings6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AnimationsEnabledChanged(handler: TypedEventHandler<UISettings?,
      UISettingsAnimationsEnabledChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AnimationsEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_MessageDurationChanged(handler: TypedEventHandler<UISettings?,
      UISettingsMessageDurationChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_MessageDurationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUISettings6> {
    public override fun getValue() = ABI.makeIUISettings6(pointer.getPointer(0))

    public fun setValue(value: IUISettings6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettings6 {
    public val __1754751347_Ptr: Pointer?

    public val _1754751347_VtblPtr: Pointer?
      get() = __1754751347_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AnimationsEnabledChanged(handler: TypedEventHandler<UISettings?,
        UISettingsAnimationsEnabledChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1754751347_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1754751347_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AnimationsEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1754751347_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1754751347_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_MessageDurationChanged(handler: TypedEventHandler<UISettings?,
        UISettingsMessageDurationChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1754751347_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1754751347_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_MessageDurationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1754751347_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1754751347_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUISettings6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754751347_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettings6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aef19bd7fe315a04ada4469aaec6dfa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettings6(ptr: Pointer?): WithDefault = IUISettings6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettings6 {
      val address = segment.toRawLongValue()
      return makeIUISettings6(Pointer(address))
    }

    public override fun toNative(obj: IUISettings6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754751347_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettings6): Array<IUISettings6?> = (elements as
        Array<IUISettings6?>).castToImpl<IUISettings6,IUISettings6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettings6?> =
        arrayOfNulls<IUISettings6_Impl>(size) as Array<IUISettings6?>
  }
}
