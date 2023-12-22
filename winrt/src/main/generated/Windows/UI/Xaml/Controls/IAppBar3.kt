package Windows.UI.Xaml.Controls

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.Primitives.AppBarTemplateSettings
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

@ABIMarker(IAppBar3.ABI::class)
@Signature("{982b001f-752e-4e7a-b055-54802c9ea749}")
@Guid("982b001f752e4e7ab05554802c9ea749")
@WinRTInterface("982b001f752e4e7ab05554802c9ea749")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBar3.ByReference::class)
public interface IAppBar3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): AppBarTemplateSettings?

  @InterfaceMethod(1)
  public fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Opening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Closing(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBar3> {
    public override fun getValue() = ABI.makeIAppBar3(pointer.getPointer(0))

    public fun setValue(value: IAppBar3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBar3 {
    public val __1641543515_Ptr: Pointer?

    public val _1641543515_VtblPtr: Pointer?
      get() = __1641543515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): AppBarTemplateSettings? {
      val fnPtr = _1641543515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1641543515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1641543515_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1641543515_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Opening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1641543515_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1641543515_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Closing(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1641543515_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1641543515_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1641543515_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1641543515_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBar3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1641543515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBar3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("982b001f752e4e7ab05554802c9ea749")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBar3(ptr: Pointer?): WithDefault = IAppBar3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBar3 {
      val address = segment.toRawLongValue()
      return makeIAppBar3(Pointer(address))
    }

    public override fun toNative(obj: IAppBar3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1641543515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBar3): Array<IAppBar3?> = (elements as
        Array<IAppBar3?>).castToImpl<IAppBar3,IAppBar3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBar3?> = arrayOfNulls<IAppBar3_Impl>(size) as
        Array<IAppBar3?>
  }
}
