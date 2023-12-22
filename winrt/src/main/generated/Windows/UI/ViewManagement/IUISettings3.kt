package Windows.UI.ViewManagement

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Color
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

@ABIMarker(IUISettings3.ABI::class)
@Signature("{03021be4-5254-4781-8194-5168f7d06d7b}")
@Guid("03021be45254478181945168f7d06d7b")
@WinRTInterface("03021be45254478181945168f7d06d7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettings3.ByReference::class)
public interface IUISettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetColorValue(desiredColor: UIColorType?): Color?

  @InterfaceMethod(1)
  public fun add_ColorValuesChanged(handler: TypedEventHandler<UISettings?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_ColorValuesChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUISettings3> {
    public override fun getValue() = ABI.makeIUISettings3(pointer.getPointer(0))

    public fun setValue(value: IUISettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettings3 {
    public val __1754751350_Ptr: Pointer?

    public val _1754751350_VtblPtr: Pointer?
      get() = __1754751350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetColorValue(desiredColor: UIColorType?): Color? {
      val fnPtr = _1754751350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1754751350_Ptr, marshalToNative(desiredColor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_ColorValuesChanged(handler: TypedEventHandler<UISettings?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1754751350_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1754751350_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_ColorValuesChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1754751350_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1754751350_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUISettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754751350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03021be45254478181945168f7d06d7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettings3(ptr: Pointer?): WithDefault = IUISettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettings3 {
      val address = segment.toRawLongValue()
      return makeIUISettings3(Pointer(address))
    }

    public override fun toNative(obj: IUISettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754751350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettings3): Array<IUISettings3?> = (elements as
        Array<IUISettings3?>).castToImpl<IUISettings3,IUISettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettings3?> =
        arrayOfNulls<IUISettings3_Impl>(size) as Array<IUISettings3?>
  }
}
