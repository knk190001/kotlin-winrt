package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPosPrinter.ABI::class)
@Signature("{2a03c10e-9a19-4a01-994f-12dfad6adcbf}")
@Guid("2a03c10e9a194a01994f12dfad6adcbf")
@WinRTInterface("2a03c10e9a194a01994f12dfad6adcbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinter.ByReference::class)
public interface IPosPrinter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Capabilities(): PosPrinterCapabilities?

  @InterfaceMethod(2)
  public fun get_SupportedCharacterSets(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_SupportedTypeFaces(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_Status(): PosPrinterStatus?

  @InterfaceMethod(5)
  public fun ClaimPrinterAsync(): IAsyncOperation<ClaimedPosPrinter?>?

  @InterfaceMethod(6)
  public fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?): IAsyncOperation<String?>?

  @InterfaceMethod(7)
  public fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<String?>?

  @InterfaceMethod(8)
  public fun add_StatusUpdated(handler: TypedEventHandler<PosPrinter?,
      PosPrinterStatusUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_StatusUpdated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPosPrinter> {
    public override fun getValue() = ABI.makeIPosPrinter(pointer.getPointer(0))

    public fun setValue(value: IPosPrinter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinter {
    public val __574109573_Ptr: Pointer?

    public val _574109573_VtblPtr: Pointer?
      get() = __574109573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): PosPrinterCapabilities? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterCapabilities>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedCharacterSets(): IVectorView<WinDef.UINT>? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SupportedTypeFaces(): IVectorView<String?>? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Status(): PosPrinterStatus? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterStatus>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ClaimPrinterAsync(): IAsyncOperation<ClaimedPosPrinter?>? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedPosPrinter?>>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ClaimedPosPrinter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?):
        IAsyncOperation<String?>? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<String?>? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun add_StatusUpdated(handler: TypedEventHandler<PosPrinter?,
        PosPrinterStatusUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _574109573_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_StatusUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _574109573_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574109573_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPosPrinter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __574109573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a03c10e9a194a01994f12dfad6adcbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinter(ptr: Pointer?): WithDefault = IPosPrinter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinter {
      val address = segment.toRawLongValue()
      return makeIPosPrinter(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574109573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinter): Array<IPosPrinter?> = (elements as
        Array<IPosPrinter?>).castToImpl<IPosPrinter,IPosPrinter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinter?> =
        arrayOfNulls<IPosPrinter_Impl>(size) as Array<IPosPrinter?>
  }
}
