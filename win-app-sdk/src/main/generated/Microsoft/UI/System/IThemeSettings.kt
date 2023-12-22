package Microsoft.UI.System

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IThemeSettings.ABI::class)
@Signature("{2228ee7e-6d15-563c-8f3c-e8783ba13846}")
@Guid("2228ee7e6d15563c8f3ce8783ba13846")
@WinRTInterface("2228ee7e6d15563c8f3ce8783ba13846")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThemeSettings.ByReference::class)
public interface IThemeSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Changed(handler: TypedEventHandler<ThemeSettings?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_HighContrast(): Boolean

  @InterfaceMethod(3)
  public fun get_HighContrastScheme(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IThemeSettings>
      {
    public override fun getValue() = ABI.makeIThemeSettings(pointer.getPointer(0))

    public fun setValue(value: IThemeSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThemeSettings {
    public val __115293516_Ptr: Pointer?

    public val _115293516_VtblPtr: Pointer?
      get() = __115293516_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Changed(handler: TypedEventHandler<ThemeSettings?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _115293516_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__115293516_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _115293516_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115293516_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HighContrast(): Boolean {
      val fnPtr = _115293516_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__115293516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_HighContrastScheme(): String? {
      val fnPtr = _115293516_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115293516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IThemeSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __115293516_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThemeSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2228ee7e6d15563c8f3ce8783ba13846")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThemeSettings(ptr: Pointer?): WithDefault = IThemeSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThemeSettings {
      val address = segment.toRawLongValue()
      return makeIThemeSettings(Pointer(address))
    }

    public override fun toNative(obj: IThemeSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__115293516_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThemeSettings): Array<IThemeSettings?> = (elements as
        Array<IThemeSettings?>).castToImpl<IThemeSettings,IThemeSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThemeSettings?> =
        arrayOfNulls<IThemeSettings_Impl>(size) as Array<IThemeSettings?>
  }
}
