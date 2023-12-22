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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUISettings5.ABI::class)
@Signature("{5349d588-0cb5-5f05-bd34-706b3231f0bd}")
@Guid("5349d5880cb55f05bd34706b3231f0bd")
@WinRTInterface("5349d5880cb55f05bd34706b3231f0bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettings5.ByReference::class)
public interface IUISettings5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoHideScrollBars(): Boolean

  @InterfaceMethod(1)
  public fun add_AutoHideScrollBarsChanged(handler: TypedEventHandler<UISettings?,
      UISettingsAutoHideScrollBarsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_AutoHideScrollBarsChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUISettings5> {
    public override fun getValue() = ABI.makeIUISettings5(pointer.getPointer(0))

    public fun setValue(value: IUISettings5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettings5 {
    public val __1754751348_Ptr: Pointer?

    public val _1754751348_VtblPtr: Pointer?
      get() = __1754751348_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoHideScrollBars(): Boolean {
      val fnPtr = _1754751348_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1754751348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_AutoHideScrollBarsChanged(handler: TypedEventHandler<UISettings?,
        UISettingsAutoHideScrollBarsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1754751348_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1754751348_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_AutoHideScrollBarsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1754751348_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1754751348_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUISettings5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754751348_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettings5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5349d5880cb55f05bd34706b3231f0bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettings5(ptr: Pointer?): WithDefault = IUISettings5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettings5 {
      val address = segment.toRawLongValue()
      return makeIUISettings5(Pointer(address))
    }

    public override fun toNative(obj: IUISettings5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754751348_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettings5): Array<IUISettings5?> = (elements as
        Array<IUISettings5?>).castToImpl<IUISettings5,IUISettings5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettings5?> =
        arrayOfNulls<IUISettings5_Impl>(size) as Array<IUISettings5?>
  }
}
