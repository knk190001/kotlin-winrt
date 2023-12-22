package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedSlipPrinter.ABI::class)
@Signature("{bd5deff2-af90-4e8a-b77b-e3ae9ca63a7f}")
@Guid("bd5deff2af904e8ab77be3ae9ca63a7f")
@WinRTInterface("bd5deff2af904e8ab77be3ae9ca63a7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedSlipPrinter.ByReference::class)
public interface IClaimedSlipPrinter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SidewaysMaxLines(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_SidewaysMaxChars(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxLines(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_LinesNearEndToEnd(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_PrintSide(): PosPrinterPrintSide?

  @InterfaceMethod(5)
  public fun get_PageSize(): Size?

  @InterfaceMethod(6)
  public fun get_PrintArea(): Rect?

  @InterfaceMethod(7)
  public fun OpenJaws(): Unit

  @InterfaceMethod(8)
  public fun CloseJaws(): Unit

  @InterfaceMethod(9)
  public fun InsertSlipAsync(timeout: TimeSpan?): IAsyncOperation<Boolean>?

  @InterfaceMethod(10)
  public fun RemoveSlipAsync(timeout: TimeSpan?): IAsyncOperation<Boolean>?

  @InterfaceMethod(11)
  public fun ChangePrintSide(printSide: PosPrinterPrintSide?): Unit

  @InterfaceMethod(12)
  public fun CreateJob(): SlipPrintJob?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedSlipPrinter> {
    public override fun getValue() = ABI.makeIClaimedSlipPrinter(pointer.getPointer(0))

    public fun setValue(value: IClaimedSlipPrinter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedSlipPrinter {
    public val __1154729154_Ptr: Pointer?

    public val _1154729154_VtblPtr: Pointer?
      get() = __1154729154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SidewaysMaxLines(): WinDef.UINT {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SidewaysMaxChars(): WinDef.UINT {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxLines(): WinDef.UINT {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_LinesNearEndToEnd(): WinDef.UINT {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PrintSide(): PosPrinterPrintSide? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterPrintSide>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterPrintSide>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PageSize(): Size? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PrintArea(): Rect? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun OpenJaws(): Unit {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun CloseJaws(): Unit {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun InsertSlipAsync(timeout: TimeSpan?): IAsyncOperation<Boolean>? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr, marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RemoveSlipAsync(timeout: TimeSpan?): IAsyncOperation<Boolean>? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr, marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun ChangePrintSide(printSide: PosPrinterPrintSide?): Unit {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr, marshalToNative(printSide),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun CreateJob(): SlipPrintJob? {
      val fnPtr = _1154729154_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SlipPrintJob>()
      val hr = fn.invokeHR(arrayOf(__1154729154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SlipPrintJob>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedSlipPrinter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1154729154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedSlipPrinter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd5deff2af904e8ab77be3ae9ca63a7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedSlipPrinter(ptr: Pointer?): WithDefault = IClaimedSlipPrinter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedSlipPrinter {
      val address = segment.toRawLongValue()
      return makeIClaimedSlipPrinter(Pointer(address))
    }

    public override fun toNative(obj: IClaimedSlipPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154729154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedSlipPrinter): Array<IClaimedSlipPrinter?> =
        (elements as
        Array<IClaimedSlipPrinter?>).castToImpl<IClaimedSlipPrinter,IClaimedSlipPrinter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedSlipPrinter?> =
        arrayOfNulls<IClaimedSlipPrinter_Impl>(size) as Array<IClaimedSlipPrinter?>
  }
}
