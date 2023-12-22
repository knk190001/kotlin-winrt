package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IClaimedCashDrawer.ABI::class)
@Signature("{ca3f99af-abb8-42c1-8a84-5c66512f5a75}")
@Guid("ca3f99afabb842c18a845c66512f5a75")
@WinRTInterface("ca3f99afabb842c18a845c66512f5a75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedCashDrawer.ByReference::class)
public interface IClaimedCashDrawer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun get_IsDrawerOpen(): Boolean

  @InterfaceMethod(3)
  public fun get_CloseAlarm(): CashDrawerCloseAlarm?

  @InterfaceMethod(4)
  public fun OpenDrawerAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun EnableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun DisableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun RetainDeviceAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(9)
  public fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?, String?>?>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(10)
  public fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedCashDrawer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedCashDrawer> {
    public override fun getValue() = ABI.makeIClaimedCashDrawer(pointer.getPointer(0))

    public fun setValue(value: IClaimedCashDrawer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedCashDrawer {
    public val __2077204736_Ptr: Pointer?

    public val _2077204736_VtblPtr: Pointer?
      get() = __2077204736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsDrawerOpen(): Boolean {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CloseAlarm(): CashDrawerCloseAlarm? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerCloseAlarm>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerCloseAlarm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun OpenDrawerAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun EnableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun DisableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun RetainDeviceAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?,
        String?>?>?): IAsyncOperation<Boolean>? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr, marshalToNative(statistics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedCashDrawer?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2077204736_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2077204736_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedCashDrawer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2077204736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedCashDrawer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca3f99afabb842c18a845c66512f5a75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedCashDrawer(ptr: Pointer?): WithDefault = IClaimedCashDrawer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedCashDrawer {
      val address = segment.toRawLongValue()
      return makeIClaimedCashDrawer(Pointer(address))
    }

    public override fun toNative(obj: IClaimedCashDrawer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2077204736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedCashDrawer): Array<IClaimedCashDrawer?> =
        (elements as
        Array<IClaimedCashDrawer?>).castToImpl<IClaimedCashDrawer,IClaimedCashDrawer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedCashDrawer?> =
        arrayOfNulls<IClaimedCashDrawer_Impl>(size) as Array<IClaimedCashDrawer?>
  }
}
