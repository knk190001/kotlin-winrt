package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ICashDrawer.ABI::class)
@Signature("{9f88f5c8-de54-4aee-a890-920bcbfe30fc}")
@Guid("9f88f5c8de544aeea890920bcbfe30fc")
@WinRTInterface("9f88f5c8de544aeea890920bcbfe30fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawer.ByReference::class)
public interface ICashDrawer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Capabilities(): CashDrawerCapabilities?

  @InterfaceMethod(2)
  public fun get_Status(): CashDrawerStatus?

  @InterfaceMethod(3)
  public fun get_IsDrawerOpen(): Boolean

  @InterfaceMethod(4)
  public fun get_DrawerEventSource(): CashDrawerEventSource?

  @InterfaceMethod(5)
  public fun ClaimDrawerAsync(): IAsyncOperation<ClaimedCashDrawer?>?

  @InterfaceMethod(6)
  public fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?): IAsyncOperation<String?>?

  @InterfaceMethod(7)
  public fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<String?>?

  @InterfaceMethod(8)
  public fun add_StatusUpdated(handler: TypedEventHandler<CashDrawer?,
      CashDrawerStatusUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_StatusUpdated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICashDrawer> {
    public override fun getValue() = ABI.makeICashDrawer(pointer.getPointer(0))

    public fun setValue(value: ICashDrawer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawer {
    public val __1179582051_Ptr: Pointer?

    public val _1179582051_VtblPtr: Pointer?
      get() = __1179582051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): CashDrawerCapabilities? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): CashDrawerStatus? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerStatus>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsDrawerOpen(): Boolean {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DrawerEventSource(): CashDrawerEventSource? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerEventSource>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerEventSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ClaimDrawerAsync(): IAsyncOperation<ClaimedCashDrawer?>? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedCashDrawer?>>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ClaimedCashDrawer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?):
        IAsyncOperation<String?>? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<String?>? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun add_StatusUpdated(handler: TypedEventHandler<CashDrawer?,
        CashDrawerStatusUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_StatusUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1179582051_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1179582051_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICashDrawer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1179582051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f88f5c8de544aeea890920bcbfe30fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawer(ptr: Pointer?): WithDefault = ICashDrawer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawer {
      val address = segment.toRawLongValue()
      return makeICashDrawer(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1179582051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawer): Array<ICashDrawer?> = (elements as
        Array<ICashDrawer?>).castToImpl<ICashDrawer,ICashDrawer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawer?> =
        arrayOfNulls<ICashDrawer_Impl>(size) as Array<ICashDrawer?>
  }
}
