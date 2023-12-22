package Windows.Devices.PointOfService

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

@ABIMarker(ICashDrawerEventSource.ABI::class)
@Signature("{e006e46c-f2f9-442f-8dd6-06c10a4227ba}")
@Guid("e006e46cf2f9442f8dd606c10a4227ba")
@WinRTInterface("e006e46cf2f9442f8dd606c10a4227ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerEventSource.ByReference::class)
public interface ICashDrawerEventSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_DrawerClosed(handler: TypedEventHandler<CashDrawerEventSource?,
      CashDrawerClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_DrawerClosed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_DrawerOpened(handler: TypedEventHandler<CashDrawerEventSource?,
      CashDrawerOpenedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DrawerOpened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerEventSource> {
    public override fun getValue() = ABI.makeICashDrawerEventSource(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerEventSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerEventSource {
    public val __37800178_Ptr: Pointer?

    public val _37800178_VtblPtr: Pointer?
      get() = __37800178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_DrawerClosed(handler: TypedEventHandler<CashDrawerEventSource?,
        CashDrawerClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _37800178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__37800178_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_DrawerClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _37800178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__37800178_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_DrawerOpened(handler: TypedEventHandler<CashDrawerEventSource?,
        CashDrawerOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _37800178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__37800178_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DrawerOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _37800178_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__37800178_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICashDrawerEventSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __37800178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerEventSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e006e46cf2f9442f8dd606c10a4227ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerEventSource(ptr: Pointer?): WithDefault =
        ICashDrawerEventSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerEventSource {
      val address = segment.toRawLongValue()
      return makeICashDrawerEventSource(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerEventSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__37800178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerEventSource): Array<ICashDrawerEventSource?> =
        (elements as
        Array<ICashDrawerEventSource?>).castToImpl<ICashDrawerEventSource,ICashDrawerEventSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerEventSource?> =
        arrayOfNulls<ICashDrawerEventSource_Impl>(size) as Array<ICashDrawerEventSource?>
  }
}
