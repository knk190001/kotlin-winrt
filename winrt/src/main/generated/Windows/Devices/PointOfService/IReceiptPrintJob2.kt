package Windows.Devices.PointOfService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IReceiptPrintJob2.ABI::class)
@Signature("{0cbc12e3-9e29-5179-bcd8-1811d3b9a10e}")
@Guid("0cbc12e39e295179bcd81811d3b9a10e")
@WinRTInterface("0cbc12e39e295179bcd81811d3b9a10e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReceiptPrintJob2.ByReference::class)
public interface IReceiptPrintJob2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StampPaper(): Unit

  @InterfaceMethod(1)
  public fun Print(`data`: String?, printOptions: PosPrinterPrintOptions?): Unit

  @InterfaceMethod(2)
  public fun FeedPaperByLine(lineCount: Int): Unit

  @InterfaceMethod(3)
  public fun FeedPaperByMapModeUnit(distance: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReceiptPrintJob2> {
    public override fun getValue() = ABI.makeIReceiptPrintJob2(pointer.getPointer(0))

    public fun setValue(value: IReceiptPrintJob2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReceiptPrintJob2 {
    public val __397516329_Ptr: Pointer?

    public val _397516329_VtblPtr: Pointer?
      get() = __397516329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StampPaper(): Unit {
      val fnPtr = _397516329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__397516329_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Print(`data`: String?, printOptions: PosPrinterPrintOptions?): Unit {
      val fnPtr = _397516329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__397516329_Ptr, marshalToNative(data),
          marshalToNative(printOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun FeedPaperByLine(lineCount: Int): Unit {
      val fnPtr = _397516329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__397516329_Ptr, lineCount,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun FeedPaperByMapModeUnit(distance: Int): Unit {
      val fnPtr = _397516329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__397516329_Ptr, distance,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IReceiptPrintJob2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __397516329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReceiptPrintJob2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cbc12e39e295179bcd81811d3b9a10e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReceiptPrintJob2(ptr: Pointer?): WithDefault = IReceiptPrintJob2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReceiptPrintJob2 {
      val address = segment.toRawLongValue()
      return makeIReceiptPrintJob2(Pointer(address))
    }

    public override fun toNative(obj: IReceiptPrintJob2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__397516329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReceiptPrintJob2): Array<IReceiptPrintJob2?> = (elements
        as Array<IReceiptPrintJob2?>).castToImpl<IReceiptPrintJob2,IReceiptPrintJob2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReceiptPrintJob2?> =
        arrayOfNulls<IReceiptPrintJob2_Impl>(size) as Array<IReceiptPrintJob2?>
  }
}
