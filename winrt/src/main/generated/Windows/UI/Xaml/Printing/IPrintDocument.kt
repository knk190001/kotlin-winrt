package Windows.UI.Xaml.Printing

import Windows.Foundation.EventRegistrationToken
import Windows.Graphics.Printing.IPrintDocumentSource
import Windows.UI.Xaml.UIElement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintDocument.ABI::class)
@Signature("{e44327c3-a999-485b-b1d8-72dc517821e6}")
@Guid("e44327c3a999485bb1d872dc517821e6")
@WinRTInterface("e44327c3a999485bb1d872dc517821e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintDocument.ByReference::class)
public interface IPrintDocument : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DocumentSource(): IPrintDocumentSource?

  @InterfaceMethod(1)
  public fun add_Paginate(handler: PaginateEventHandler?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Paginate(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_GetPreviewPage(handler: GetPreviewPageEventHandler?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_GetPreviewPage(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_AddPages(handler: AddPagesEventHandler?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_AddPages(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun AddPage(pageVisual: UIElement?): Unit

  @InterfaceMethod(8)
  public fun AddPagesComplete(): Unit

  @InterfaceMethod(9)
  public fun SetPreviewPageCount(count: Int, type: PreviewPageCountType?): Unit

  @InterfaceMethod(10)
  public fun SetPreviewPage(pageNumber: Int, pageVisual: UIElement?): Unit

  @InterfaceMethod(11)
  public fun InvalidatePreview(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintDocument>
      {
    public override fun getValue() = ABI.makeIPrintDocument(pointer.getPointer(0))

    public fun setValue(value: IPrintDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintDocument {
    public val __563196565_Ptr: Pointer?

    public val _563196565_VtblPtr: Pointer?
      get() = __563196565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DocumentSource(): IPrintDocumentSource? {
      val fnPtr = _563196565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPrintDocumentSource>()
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPrintDocumentSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Paginate(handler: PaginateEventHandler?): EventRegistrationToken? {
      val fnPtr = _563196565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Paginate(token: EventRegistrationToken?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_GetPreviewPage(handler: GetPreviewPageEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _563196565_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_GetPreviewPage(token: EventRegistrationToken?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_AddPages(handler: AddPagesEventHandler?): EventRegistrationToken? {
      val fnPtr = _563196565_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_AddPages(token: EventRegistrationToken?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun AddPage(pageVisual: UIElement?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, marshalToNative(pageVisual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun AddPagesComplete(): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetPreviewPageCount(count: Int, type: PreviewPageCountType?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, count, marshalToNative(type),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetPreviewPage(pageNumber: Int, pageVisual: UIElement?): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, pageNumber, marshalToNative(pageVisual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun InvalidatePreview(): Unit {
      val fnPtr = _563196565_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563196565_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintDocument_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __563196565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintDocument, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e44327c3a999485bb1d872dc517821e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintDocument(ptr: Pointer?): WithDefault = IPrintDocument_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintDocument {
      val address = segment.toRawLongValue()
      return makeIPrintDocument(Pointer(address))
    }

    public override fun toNative(obj: IPrintDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__563196565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintDocument): Array<IPrintDocument?> = (elements as
        Array<IPrintDocument?>).castToImpl<IPrintDocument,IPrintDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintDocument?> =
        arrayOfNulls<IPrintDocument_Impl>(size) as Array<IPrintDocument?>
  }
}
