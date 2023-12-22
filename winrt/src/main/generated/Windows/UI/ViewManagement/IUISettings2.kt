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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUISettings2.ABI::class)
@Signature("{bad82401-2721-44f9-bb91-2bb228be442f}")
@Guid("bad82401272144f9bb912bb228be442f")
@WinRTInterface("bad82401272144f9bb912bb228be442f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettings2.ByReference::class)
public interface IUISettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextScaleFactor(): Double

  @InterfaceMethod(1)
  public fun add_TextScaleFactorChanged(handler: TypedEventHandler<UISettings?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_TextScaleFactorChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUISettings2> {
    public override fun getValue() = ABI.makeIUISettings2(pointer.getPointer(0))

    public fun setValue(value: IUISettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettings2 {
    public val __1754751351_Ptr: Pointer?

    public val _1754751351_VtblPtr: Pointer?
      get() = __1754751351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextScaleFactor(): Double {
      val fnPtr = _1754751351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1754751351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_TextScaleFactorChanged(handler: TypedEventHandler<UISettings?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1754751351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1754751351_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_TextScaleFactorChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1754751351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1754751351_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUISettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754751351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bad82401272144f9bb912bb228be442f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettings2(ptr: Pointer?): WithDefault = IUISettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettings2 {
      val address = segment.toRawLongValue()
      return makeIUISettings2(Pointer(address))
    }

    public override fun toNative(obj: IUISettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754751351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettings2): Array<IUISettings2?> = (elements as
        Array<IUISettings2?>).castToImpl<IUISettings2,IUISettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettings2?> =
        arrayOfNulls<IUISettings2_Impl>(size) as Array<IUISettings2?>
  }
}
