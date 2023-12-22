package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.AppBarTemplateSettings
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

@ABIMarker(IAppBar.ABI::class)
@Signature("{3d8c2927-5ac5-51bb-8bec-13ff4c1bd6c8}")
@Guid("3d8c29275ac551bb8bec13ff4c1bd6c8")
@WinRTInterface("3d8c29275ac551bb8bec13ff4c1bd6c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBar.ByReference::class)
public interface IAppBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(1)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsSticky(): Boolean

  @InterfaceMethod(3)
  public fun put_IsSticky(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ClosedDisplayMode(): AppBarClosedDisplayMode?

  @InterfaceMethod(5)
  public fun put_ClosedDisplayMode(value: AppBarClosedDisplayMode?): Unit

  @InterfaceMethod(6)
  public fun get_TemplateSettings(): AppBarTemplateSettings?

  @InterfaceMethod(7)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(8)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(9)
  public fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Opening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_Closing(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBar> {
    public override fun getValue() = ABI.makeIAppBar(pointer.getPointer(0))

    public fun setValue(value: IAppBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBar {
    public val __1851156153_Ptr: Pointer?

    public val _1851156153_VtblPtr: Pointer?
      get() = __1851156153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsSticky(): Boolean {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsSticky(value: Boolean): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ClosedDisplayMode(): AppBarClosedDisplayMode? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarClosedDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarClosedDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ClosedDisplayMode(value: AppBarClosedDisplayMode?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TemplateSettings(): AppBarTemplateSettings? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Opening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_Closing(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1851156153_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851156153_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1851156153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d8c29275ac551bb8bec13ff4c1bd6c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBar(ptr: Pointer?): WithDefault = IAppBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBar {
      val address = segment.toRawLongValue()
      return makeIAppBar(Pointer(address))
    }

    public override fun toNative(obj: IAppBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1851156153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBar): Array<IAppBar?> = (elements as
        Array<IAppBar?>).castToImpl<IAppBar,IAppBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBar?> = arrayOfNulls<IAppBar_Impl>(size) as
        Array<IAppBar?>
  }
}
