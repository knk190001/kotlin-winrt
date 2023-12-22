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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedPosPrinter.ABI::class)
@Signature("{6d64ce0c-e03e-4b14-a38e-c28c34b86353}")
@Guid("6d64ce0ce03e4b14a38ec28c34b86353")
@WinRTInterface("6d64ce0ce03e4b14a38ec28c34b86353")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedPosPrinter.ByReference::class)
public interface IClaimedPosPrinter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_CharacterSet(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_CharacterSet(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_IsCoverOpen(): Boolean

  @InterfaceMethod(5)
  public fun put_IsCharacterSetMappingEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsCharacterSetMappingEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_MapMode(value: PosPrinterMapMode?): Unit

  @InterfaceMethod(8)
  public fun get_MapMode(): PosPrinterMapMode?

  @InterfaceMethod(9)
  public fun get_Receipt(): ClaimedReceiptPrinter?

  @InterfaceMethod(10)
  public fun get_Slip(): ClaimedSlipPrinter?

  @InterfaceMethod(11)
  public fun get_Journal(): ClaimedJournalPrinter?

  @InterfaceMethod(12)
  public fun EnableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun DisableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(14)
  public fun RetainDeviceAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(16)
  public fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?, String?>?>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(17)
  public fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedPosPrinter?,
      PosPrinterReleaseDeviceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedPosPrinter> {
    public override fun getValue() = ABI.makeIClaimedPosPrinter(pointer.getPointer(0))

    public fun setValue(value: IClaimedPosPrinter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedPosPrinter {
    public val __1471732258_Ptr: Pointer?

    public val _1471732258_VtblPtr: Pointer?
      get() = __1471732258_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_CharacterSet(value: WinDef.UINT): Unit {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CharacterSet(): WinDef.UINT {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsCoverOpen(): Boolean {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsCharacterSetMappingEnabled(value: Boolean): Unit {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsCharacterSetMappingEnabled(): Boolean {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MapMode(value: PosPrinterMapMode?): Unit {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MapMode(): PosPrinterMapMode? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterMapMode>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterMapMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Receipt(): ClaimedReceiptPrinter? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClaimedReceiptPrinter>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClaimedReceiptPrinter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Slip(): ClaimedSlipPrinter? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClaimedSlipPrinter>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClaimedSlipPrinter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Journal(): ClaimedJournalPrinter? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClaimedJournalPrinter>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClaimedJournalPrinter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun EnableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun DisableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun RetainDeviceAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?,
        String?>?>?): IAsyncOperation<Boolean>? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, marshalToNative(statistics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedPosPrinter?,
        PosPrinterReleaseDeviceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1471732258_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471732258_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedPosPrinter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1471732258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedPosPrinter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d64ce0ce03e4b14a38ec28c34b86353")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedPosPrinter(ptr: Pointer?): WithDefault = IClaimedPosPrinter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedPosPrinter {
      val address = segment.toRawLongValue()
      return makeIClaimedPosPrinter(Pointer(address))
    }

    public override fun toNative(obj: IClaimedPosPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1471732258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedPosPrinter): Array<IClaimedPosPrinter?> =
        (elements as
        Array<IClaimedPosPrinter?>).castToImpl<IClaimedPosPrinter,IClaimedPosPrinter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedPosPrinter?> =
        arrayOfNulls<IClaimedPosPrinter_Impl>(size) as Array<IClaimedPosPrinter?>
  }
}
