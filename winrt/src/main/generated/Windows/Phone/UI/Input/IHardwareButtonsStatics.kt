package Windows.Phone.UI.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IHardwareButtonsStatics.ABI::class)
@Signature("{594b8780-da66-4fd8-a776-7506bd0cbfa7}")
@Guid("594b8780da664fd8a7767506bd0cbfa7")
@WinRTInterface("594b8780da664fd8a7767506bd0cbfa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHardwareButtonsStatics.ByReference::class)
public interface IHardwareButtonsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BackPressed(handler: EventHandler<BackPressedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BackPressed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHardwareButtonsStatics> {
    public override fun getValue() = ABI.makeIHardwareButtonsStatics(pointer.getPointer(0))

    public fun setValue(value: IHardwareButtonsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHardwareButtonsStatics {
    public val __1231213306_Ptr: Pointer?

    public val _1231213306_VtblPtr: Pointer?
      get() = __1231213306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BackPressed(handler: EventHandler<BackPressedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1231213306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1231213306_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BackPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1231213306_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1231213306_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHardwareButtonsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1231213306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHardwareButtonsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("594b8780da664fd8a7767506bd0cbfa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHardwareButtonsStatics(ptr: Pointer?): WithDefault =
        IHardwareButtonsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHardwareButtonsStatics {
      val address = segment.toRawLongValue()
      return makeIHardwareButtonsStatics(Pointer(address))
    }

    public override fun toNative(obj: IHardwareButtonsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1231213306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHardwareButtonsStatics): Array<IHardwareButtonsStatics?>
        = (elements as
        Array<IHardwareButtonsStatics?>).castToImpl<IHardwareButtonsStatics,IHardwareButtonsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHardwareButtonsStatics?> =
        arrayOfNulls<IHardwareButtonsStatics_Impl>(size) as Array<IHardwareButtonsStatics?>
  }
}
