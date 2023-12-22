package Windows.Devices.PointOfService

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICashDrawerCloseAlarm.ABI::class)
@Signature("{6bf88cc7-6f63-430e-ab3b-95d75ffbe87f}")
@Guid("6bf88cc76f63430eab3b95d75ffbe87f")
@WinRTInterface("6bf88cc76f63430eab3b95d75ffbe87f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerCloseAlarm.ByReference::class)
public interface ICashDrawerCloseAlarm : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AlarmTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(1)
  public fun get_AlarmTimeout(): TimeSpan?

  @InterfaceMethod(2)
  public fun put_BeepFrequency(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_BeepFrequency(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_BeepDuration(value: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_BeepDuration(): TimeSpan?

  @InterfaceMethod(6)
  public fun put_BeepDelay(value: TimeSpan?): Unit

  @InterfaceMethod(7)
  public fun get_BeepDelay(): TimeSpan?

  @InterfaceMethod(8)
  public fun add_AlarmTimeoutExpired(handler: TypedEventHandler<CashDrawerCloseAlarm?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_AlarmTimeoutExpired(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun StartAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerCloseAlarm> {
    public override fun getValue() = ABI.makeICashDrawerCloseAlarm(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerCloseAlarm_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerCloseAlarm {
    public val __1260314116_Ptr: Pointer?

    public val _1260314116_VtblPtr: Pointer?
      get() = __1260314116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AlarmTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AlarmTimeout(): TimeSpan? {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_BeepFrequency(value: WinDef.UINT): Unit {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BeepFrequency(): WinDef.UINT {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_BeepDuration(value: TimeSpan?): Unit {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_BeepDuration(): TimeSpan? {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_BeepDelay(value: TimeSpan?): Unit {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_BeepDelay(): TimeSpan? {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun add_AlarmTimeoutExpired(handler: TypedEventHandler<CashDrawerCloseAlarm?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_AlarmTimeoutExpired(token: EventRegistrationToken?): Unit {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1260314116_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1260314116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ICashDrawerCloseAlarm_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1260314116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerCloseAlarm, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bf88cc76f63430eab3b95d75ffbe87f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerCloseAlarm(ptr: Pointer?): WithDefault =
        ICashDrawerCloseAlarm_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerCloseAlarm {
      val address = segment.toRawLongValue()
      return makeICashDrawerCloseAlarm(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerCloseAlarm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1260314116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerCloseAlarm): Array<ICashDrawerCloseAlarm?> =
        (elements as
        Array<ICashDrawerCloseAlarm?>).castToImpl<ICashDrawerCloseAlarm,ICashDrawerCloseAlarm_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerCloseAlarm?> =
        arrayOfNulls<ICashDrawerCloseAlarm_Impl>(size) as Array<ICashDrawerCloseAlarm?>
  }
}
