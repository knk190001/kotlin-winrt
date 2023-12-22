package Windows.Devices.PointOfService

import Windows.Devices.PointOfService.IPosPrinterJob.ABI.IID
import Windows.Foundation.Rect
import Windows.Graphics.Imaging.BitmapFrame
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IReceiptOrSlipJob.ABI::class)
@Signature("{532199be-c8c3-4dc2-89e9-5c4a37b34ddc}")
@Guid("532199bec8c34dc289e95c4a37b34ddc")
@WinRTInterface("532199bec8c34dc289e95c4a37b34ddc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReceiptOrSlipJob.ByReference::class)
public interface IReceiptOrSlipJob : NativeMapped, IWinRTInterface, IPosPrinterJob {
  @InterfaceMethod(0)
  public fun SetBarcodeRotation(value: PosPrinterRotation?): Unit

  @InterfaceMethod(1)
  public fun SetPrintRotation(value: PosPrinterRotation?, includeBitmaps: Boolean): Unit

  @InterfaceMethod(2)
  public fun SetPrintArea(value: Rect?): Unit

  @InterfaceMethod(3)
  public fun SetBitmap(
    bitmapNumber: WinDef.UINT,
    bitmap: BitmapFrame?,
    alignment: PosPrinterAlignment?
  ): Unit

  @InterfaceMethod(4)
  public fun SetBitmap(
    bitmapNumber: WinDef.UINT,
    bitmap: BitmapFrame?,
    alignment: PosPrinterAlignment?,
    width: WinDef.UINT
  ): Unit

  @InterfaceMethod(5)
  public fun SetCustomAlignedBitmap(
    bitmapNumber: WinDef.UINT,
    bitmap: BitmapFrame?,
    alignmentDistance: WinDef.UINT
  ): Unit

  @InterfaceMethod(6)
  public fun SetCustomAlignedBitmap(
    bitmapNumber: WinDef.UINT,
    bitmap: BitmapFrame?,
    alignmentDistance: WinDef.UINT,
    width: WinDef.UINT
  ): Unit

  @InterfaceMethod(7)
  public fun PrintSavedBitmap(bitmapNumber: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun DrawRuledLine(
    positionList: String?,
    lineDirection: PosPrinterLineDirection?,
    lineWidth: WinDef.UINT,
    lineStyle: PosPrinterLineStyle?,
    lineColor: WinDef.UINT
  ): Unit

  @InterfaceMethod(9)
  public fun PrintBarcode(
    `data`: String?,
    symbology: WinDef.UINT,
    height: WinDef.UINT,
    width: WinDef.UINT,
    textPosition: PosPrinterBarcodeTextPosition?,
    alignment: PosPrinterAlignment?
  ): Unit

  @InterfaceMethod(10)
  public fun PrintBarcodeCustomAlign(
    `data`: String?,
    symbology: WinDef.UINT,
    height: WinDef.UINT,
    width: WinDef.UINT,
    textPosition: PosPrinterBarcodeTextPosition?,
    alignmentDistance: WinDef.UINT
  ): Unit

  @InterfaceMethod(11)
  public fun PrintBitmap(bitmap: BitmapFrame?, alignment: PosPrinterAlignment?): Unit

  @InterfaceMethod(12)
  public fun PrintBitmap(
    bitmap: BitmapFrame?,
    alignment: PosPrinterAlignment?,
    width: WinDef.UINT
  ): Unit

  @InterfaceMethod(13)
  public fun PrintCustomAlignedBitmap(bitmap: BitmapFrame?, alignmentDistance: WinDef.UINT): Unit

  @InterfaceMethod(14)
  public fun PrintCustomAlignedBitmap(
    bitmap: BitmapFrame?,
    alignmentDistance: WinDef.UINT,
    width: WinDef.UINT
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReceiptOrSlipJob> {
    public override fun getValue() = ABI.makeIReceiptOrSlipJob(pointer.getPointer(0))

    public fun setValue(value: IReceiptOrSlipJob_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReceiptOrSlipJob, IPosPrinterJob.WithDefault {
    public val __206561087_Ptr: Pointer?

    public val _206561087_VtblPtr: Pointer?
      get() = __206561087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetBarcodeRotation(value: PosPrinterRotation?): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetPrintRotation(value: PosPrinterRotation?, includeBitmaps: Boolean):
        Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(value), includeBitmaps,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetPrintArea(value: Rect?): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetBitmap(
      bitmapNumber: WinDef.UINT,
      bitmap: BitmapFrame?,
      alignment: PosPrinterAlignment?
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, bitmapNumber, marshalToNative(bitmap),
          marshalToNative(alignment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetBitmap(
      bitmapNumber: WinDef.UINT,
      bitmap: BitmapFrame?,
      alignment: PosPrinterAlignment?,
      width: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, bitmapNumber, marshalToNative(bitmap),
          marshalToNative(alignment), width,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetCustomAlignedBitmap(
      bitmapNumber: WinDef.UINT,
      bitmap: BitmapFrame?,
      alignmentDistance: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, bitmapNumber, marshalToNative(bitmap),
          alignmentDistance,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetCustomAlignedBitmap(
      bitmapNumber: WinDef.UINT,
      bitmap: BitmapFrame?,
      alignmentDistance: WinDef.UINT,
      width: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, bitmapNumber, marshalToNative(bitmap),
          alignmentDistance, width,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun PrintSavedBitmap(bitmapNumber: WinDef.UINT): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, bitmapNumber,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun DrawRuledLine(
      positionList: String?,
      lineDirection: PosPrinterLineDirection?,
      lineWidth: WinDef.UINT,
      lineStyle: PosPrinterLineStyle?,
      lineColor: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(positionList),
          marshalToNative(lineDirection), lineWidth, marshalToNative(lineStyle), lineColor,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun PrintBarcode(
      `data`: String?,
      symbology: WinDef.UINT,
      height: WinDef.UINT,
      width: WinDef.UINT,
      textPosition: PosPrinterBarcodeTextPosition?,
      alignment: PosPrinterAlignment?
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(data), symbology, height, width,
          marshalToNative(textPosition), marshalToNative(alignment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun PrintBarcodeCustomAlign(
      `data`: String?,
      symbology: WinDef.UINT,
      height: WinDef.UINT,
      width: WinDef.UINT,
      textPosition: PosPrinterBarcodeTextPosition?,
      alignmentDistance: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(data), symbology, height, width,
          marshalToNative(textPosition), alignmentDistance,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun PrintBitmap(bitmap: BitmapFrame?, alignment: PosPrinterAlignment?): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(bitmap),
          marshalToNative(alignment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun PrintBitmap(
      bitmap: BitmapFrame?,
      alignment: PosPrinterAlignment?,
      width: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(bitmap),
          marshalToNative(alignment), width,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun PrintCustomAlignedBitmap(bitmap: BitmapFrame?,
        alignmentDistance: WinDef.UINT): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(bitmap), alignmentDistance,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun PrintCustomAlignedBitmap(
      bitmap: BitmapFrame?,
      alignmentDistance: WinDef.UINT,
      width: WinDef.UINT
    ): Unit {
      val fnPtr = _206561087_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__206561087_Ptr, marshalToNative(bitmap), alignmentDistance,
          width,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IReceiptOrSlipJob_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPosPrinterJob {
    public override val __738591224_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_206561087_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __206561087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReceiptOrSlipJob, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("532199bec8c34dc289e95c4a37b34ddc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReceiptOrSlipJob(ptr: Pointer?): WithDefault = IReceiptOrSlipJob_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReceiptOrSlipJob {
      val address = segment.toRawLongValue()
      return makeIReceiptOrSlipJob(Pointer(address))
    }

    public override fun toNative(obj: IReceiptOrSlipJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__206561087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReceiptOrSlipJob): Array<IReceiptOrSlipJob?> = (elements
        as Array<IReceiptOrSlipJob?>).castToImpl<IReceiptOrSlipJob,IReceiptOrSlipJob_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReceiptOrSlipJob?> =
        arrayOfNulls<IReceiptOrSlipJob_Impl>(size) as Array<IReceiptOrSlipJob?>
  }
}
