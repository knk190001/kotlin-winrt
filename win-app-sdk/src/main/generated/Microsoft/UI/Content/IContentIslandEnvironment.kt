package Microsoft.UI.Content

import Microsoft.UI.DisplayId
import Microsoft.UI.WindowId
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

@ABIMarker(IContentIslandEnvironment.ABI::class)
@Signature("{c334236d-da88-566d-811d-74aef2eba978}")
@Guid("c334236dda88566d811d74aef2eba978")
@WinRTInterface("c334236dda88566d811d74aef2eba978")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandEnvironment.ByReference::class)
public interface IContentIslandEnvironment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppWindowId(): WindowId?

  @InterfaceMethod(1)
  public fun get_DisplayId(): DisplayId?

  @InterfaceMethod(2)
  public fun add_SettingChanged(handler: TypedEventHandler<ContentIslandEnvironment?,
      ContentEnvironmentSettingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SettingChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_StateChanged(handler: TypedEventHandler<ContentIslandEnvironment?,
      ContentEnvironmentStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandEnvironment> {
    public override fun getValue() = ABI.makeIContentIslandEnvironment(pointer.getPointer(0))

    public fun setValue(value: IContentIslandEnvironment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandEnvironment {
    public val __2013746031_Ptr: Pointer?

    public val _2013746031_VtblPtr: Pointer?
      get() = __2013746031_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppWindowId(): WindowId? {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayId(): DisplayId? {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_SettingChanged(handler: TypedEventHandler<ContentIslandEnvironment?,
        ContentEnvironmentSettingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SettingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_StateChanged(handler: TypedEventHandler<ContentIslandEnvironment?,
        ContentEnvironmentStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013746031_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013746031_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentIslandEnvironment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2013746031_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandEnvironment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c334236dda88566d811d74aef2eba978")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandEnvironment(ptr: Pointer?): WithDefault =
        IContentIslandEnvironment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIslandEnvironment {
      val address = segment.toRawLongValue()
      return makeIContentIslandEnvironment(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2013746031_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandEnvironment):
        Array<IContentIslandEnvironment?> = (elements as
        Array<IContentIslandEnvironment?>).castToImpl<IContentIslandEnvironment,IContentIslandEnvironment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIslandEnvironment?> =
        arrayOfNulls<IContentIslandEnvironment_Impl>(size) as Array<IContentIslandEnvironment?>
  }
}
