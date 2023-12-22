package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.ToggleSwitchTemplateSettings
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.RoutedEventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToggleSwitch.ABI::class)
@Signature("{1b17eeb1-74bf-5a83-8161-a86f0fdcdf24}")
@Guid("1b17eeb174bf5a838161a86f0fdcdf24")
@WinRTInterface("1b17eeb174bf5a838161a86f0fdcdf24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSwitch.ByReference::class)
public interface IToggleSwitch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOn(): Boolean

  @InterfaceMethod(1)
  public fun put_IsOn(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(3)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(5)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(6)
  public fun get_OnContent(): IUnknown?

  @InterfaceMethod(7)
  public fun put_OnContent(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun get_OnContentTemplate(): DataTemplate?

  @InterfaceMethod(9)
  public fun put_OnContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(10)
  public fun get_OffContent(): IUnknown?

  @InterfaceMethod(11)
  public fun put_OffContent(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_OffContentTemplate(): DataTemplate?

  @InterfaceMethod(13)
  public fun put_OffContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(14)
  public fun get_TemplateSettings(): ToggleSwitchTemplateSettings?

  @InterfaceMethod(15)
  public fun add_Toggled(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Toggled(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IToggleSwitch>
      {
    public override fun getValue() = ABI.makeIToggleSwitch(pointer.getPointer(0))

    public fun setValue(value: IToggleSwitch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSwitch {
    public val __70718737_Ptr: Pointer?

    public val _70718737_VtblPtr: Pointer?
      get() = __70718737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOn(): Boolean {
      val fnPtr = _70718737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsOn(value: Boolean): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_OnContent(): IUnknown? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_OnContent(value: IUnknown?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_OnContentTemplate(): DataTemplate? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_OnContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_OffContent(): IUnknown? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_OffContent(value: IUnknown?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_OffContentTemplate(): DataTemplate? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_OffContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TemplateSettings(): ToggleSwitchTemplateSettings? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleSwitchTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleSwitchTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun add_Toggled(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _70718737_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Toggled(token: EventRegistrationToken?): Unit {
      val fnPtr = _70718737_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70718737_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleSwitch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __70718737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSwitch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b17eeb174bf5a838161a86f0fdcdf24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSwitch(ptr: Pointer?): WithDefault = IToggleSwitch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSwitch {
      val address = segment.toRawLongValue()
      return makeIToggleSwitch(Pointer(address))
    }

    public override fun toNative(obj: IToggleSwitch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__70718737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSwitch): Array<IToggleSwitch?> = (elements as
        Array<IToggleSwitch?>).castToImpl<IToggleSwitch,IToggleSwitch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSwitch?> =
        arrayOfNulls<IToggleSwitch_Impl>(size) as Array<IToggleSwitch?>
  }
}
