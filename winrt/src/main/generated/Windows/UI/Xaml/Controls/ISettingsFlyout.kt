package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.Primitives.SettingsFlyoutTemplateSettings
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.ImageSource
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISettingsFlyout.ABI::class)
@Signature("{830ba82b-c55b-4e32-a51c-5791e024c8af}")
@Guid("830ba82bc55b4e32a51c5791e024c8af")
@WinRTInterface("830ba82bc55b4e32a51c5791e024c8af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsFlyout.ByReference::class)
public interface ISettingsFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_HeaderBackground(): Brush?

  @InterfaceMethod(3)
  public fun put_HeaderBackground(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_HeaderForeground(): Brush?

  @InterfaceMethod(5)
  public fun put_HeaderForeground(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_IconSource(): ImageSource?

  @InterfaceMethod(7)
  public fun put_IconSource(value: ImageSource?): Unit

  @InterfaceMethod(8)
  public fun get_TemplateSettings(): SettingsFlyoutTemplateSettings?

  @InterfaceMethod(9)
  public fun add_BackClick(handler: BackClickEventHandler?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_BackClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun Show(): Unit

  @InterfaceMethod(12)
  public fun ShowIndependent(): Unit

  @InterfaceMethod(13)
  public fun Hide(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsFlyout> {
    public override fun getValue() = ABI.makeISettingsFlyout(pointer.getPointer(0))

    public fun setValue(value: ISettingsFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsFlyout {
    public val __600483610_Ptr: Pointer?

    public val _600483610_VtblPtr: Pointer?
      get() = __600483610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HeaderBackground(): Brush? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HeaderBackground(value: Brush?): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HeaderForeground(): Brush? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderForeground(value: Brush?): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IconSource(): ImageSource? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_IconSource(value: ImageSource?): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TemplateSettings(): SettingsFlyoutTemplateSettings? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsFlyoutTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsFlyoutTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_BackClick(handler: BackClickEventHandler?): EventRegistrationToken? {
      val fnPtr = _600483610_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_BackClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Show(): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun ShowIndependent(): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Hide(): Unit {
      val fnPtr = _600483610_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600483610_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISettingsFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600483610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("830ba82bc55b4e32a51c5791e024c8af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsFlyout(ptr: Pointer?): WithDefault = ISettingsFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsFlyout {
      val address = segment.toRawLongValue()
      return makeISettingsFlyout(Pointer(address))
    }

    public override fun toNative(obj: ISettingsFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600483610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsFlyout): Array<ISettingsFlyout?> = (elements as
        Array<ISettingsFlyout?>).castToImpl<ISettingsFlyout,ISettingsFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsFlyout?> =
        arrayOfNulls<ISettingsFlyout_Impl>(size) as Array<ISettingsFlyout?>
  }
}
