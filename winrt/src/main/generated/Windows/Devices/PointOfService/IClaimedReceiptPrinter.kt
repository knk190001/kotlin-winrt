package Windows.Devices.PointOfService

import Windows.Foundation.Rect
import Windows.Foundation.Size
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedReceiptPrinter.ABI::class)
@Signature("{9ad27a74-dd61-4ee2-9837-5b5d72d538b9}")
@Guid("9ad27a74dd614ee298375b5d72d538b9")
@WinRTInterface("9ad27a74dd614ee298375b5d72d538b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedReceiptPrinter.ByReference::class)
public interface IClaimedReceiptPrinter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SidewaysMaxLines(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_SidewaysMaxChars(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_LinesToPaperCut(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_PageSize(): Size?

  @InterfaceMethod(4)
  public fun get_PrintArea(): Rect?

  @InterfaceMethod(5)
  public fun CreateJob(): ReceiptPrintJob?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedReceiptPrinter> {
    public override fun getValue() = ABI.makeIClaimedReceiptPrinter(pointer.getPointer(0))

    public fun setValue(value: IClaimedReceiptPrinter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedReceiptPrinter {
    public val __2012566462_Ptr: Pointer?

    public val _2012566462_VtblPtr: Pointer?
      get() = __2012566462_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SidewaysMaxLines(): WinDef.UINT {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SidewaysMaxChars(): WinDef.UINT {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_LinesToPaperCut(): WinDef.UINT {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PageSize(): Size? {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PrintArea(): Rect? {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateJob(): ReceiptPrintJob? {
      val fnPtr = _2012566462_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReceiptPrintJob>()
      val hr = fn.invokeHR(arrayOf(__2012566462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReceiptPrintJob>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedReceiptPrinter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2012566462_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedReceiptPrinter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ad27a74dd614ee298375b5d72d538b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedReceiptPrinter(ptr: Pointer?): WithDefault =
        IClaimedReceiptPrinter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedReceiptPrinter {
      val address = segment.toRawLongValue()
      return makeIClaimedReceiptPrinter(Pointer(address))
    }

    public override fun toNative(obj: IClaimedReceiptPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2012566462_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedReceiptPrinter): Array<IClaimedReceiptPrinter?> =
        (elements as
        Array<IClaimedReceiptPrinter?>).castToImpl<IClaimedReceiptPrinter,IClaimedReceiptPrinter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedReceiptPrinter?> =
        arrayOfNulls<IClaimedReceiptPrinter_Impl>(size) as Array<IClaimedReceiptPrinter?>
  }
}
