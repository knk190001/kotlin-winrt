package Windows.UI.WebUI

import Windows.Graphics.Printing.IPrintDocumentSource
import Windows.Graphics.Printing.IPrintDocumentSource.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHtmlPrintDocumentSource.ABI::class)
@Signature("{cea6469a-0e05-467a-abc9-36ec1d4cdcb6}")
@Guid("cea6469a0e05467aabc936ec1d4cdcb6")
@WinRTInterface("cea6469a0e05467aabc936ec1d4cdcb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHtmlPrintDocumentSource.ByReference::class)
public interface IHtmlPrintDocumentSource : NativeMapped, IWinRTInterface, IPrintDocumentSource {
  @InterfaceMethod(0)
  public fun get_Content(): PrintContent?

  @InterfaceMethod(1)
  public fun put_Content(value: PrintContent?): Unit

  @InterfaceMethod(2)
  public fun get_LeftMargin(): Float

  @InterfaceMethod(3)
  public fun put_LeftMargin(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_TopMargin(): Float

  @InterfaceMethod(5)
  public fun put_TopMargin(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_RightMargin(): Float

  @InterfaceMethod(7)
  public fun put_RightMargin(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_BottomMargin(): Float

  @InterfaceMethod(9)
  public fun put_BottomMargin(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_EnableHeaderFooter(): Boolean

  @InterfaceMethod(11)
  public fun put_EnableHeaderFooter(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_ShrinkToFit(): Boolean

  @InterfaceMethod(13)
  public fun put_ShrinkToFit(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_PercentScale(): Float

  @InterfaceMethod(15)
  public fun put_PercentScale(scalePercent: Float): Unit

  @InterfaceMethod(16)
  public fun get_PageRange(): String?

  @InterfaceMethod(17)
  public fun TrySetPageRange(strPageRange: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHtmlPrintDocumentSource> {
    public override fun getValue() = ABI.makeIHtmlPrintDocumentSource(pointer.getPointer(0))

    public fun setValue(value: IHtmlPrintDocumentSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHtmlPrintDocumentSource, IPrintDocumentSource.WithDefault {
    public val __613028344_Ptr: Pointer?

    public val _613028344_VtblPtr: Pointer?
      get() = __613028344_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): PrintContent? {
      val fnPtr = _613028344_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintContent>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: PrintContent?): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LeftMargin(): Float {
      val fnPtr = _613028344_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_LeftMargin(value: Float): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TopMargin(): Float {
      val fnPtr = _613028344_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_TopMargin(value: Float): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RightMargin(): Float {
      val fnPtr = _613028344_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RightMargin(value: Float): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_BottomMargin(): Float {
      val fnPtr = _613028344_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_BottomMargin(value: Float): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_EnableHeaderFooter(): Boolean {
      val fnPtr = _613028344_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_EnableHeaderFooter(value: Boolean): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ShrinkToFit(): Boolean {
      val fnPtr = _613028344_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_ShrinkToFit(value: Boolean): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PercentScale(): Float {
      val fnPtr = _613028344_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_PercentScale(scalePercent: Float): Unit {
      val fnPtr = _613028344_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, scalePercent,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PageRange(): String? {
      val fnPtr = _613028344_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun TrySetPageRange(strPageRange: String?): Boolean {
      val fnPtr = _613028344_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__613028344_Ptr, marshalToNative(strPageRange), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHtmlPrintDocumentSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintDocumentSource {
    public override val __1773976807_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_613028344_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __613028344_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHtmlPrintDocumentSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cea6469a0e05467aabc936ec1d4cdcb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHtmlPrintDocumentSource(ptr: Pointer?): WithDefault =
        IHtmlPrintDocumentSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHtmlPrintDocumentSource {
      val address = segment.toRawLongValue()
      return makeIHtmlPrintDocumentSource(Pointer(address))
    }

    public override fun toNative(obj: IHtmlPrintDocumentSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__613028344_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHtmlPrintDocumentSource):
        Array<IHtmlPrintDocumentSource?> = (elements as
        Array<IHtmlPrintDocumentSource?>).castToImpl<IHtmlPrintDocumentSource,IHtmlPrintDocumentSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHtmlPrintDocumentSource?> =
        arrayOfNulls<IHtmlPrintDocumentSource_Impl>(size) as Array<IHtmlPrintDocumentSource?>
  }
}
