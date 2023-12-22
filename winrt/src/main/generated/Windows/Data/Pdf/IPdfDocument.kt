package Windows.Data.Pdf

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

@ABIMarker(IPdfDocument.ABI::class)
@Signature("{ac7ebedd-80fa-4089-846e-81b77ff5a86c}")
@Guid("ac7ebedd80fa4089846e81b77ff5a86c")
@WinRTInterface("ac7ebedd80fa4089846e81b77ff5a86c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPdfDocument.ByReference::class)
public interface IPdfDocument : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPage(pageIndex: WinDef.UINT): PdfPage?

  @InterfaceMethod(1)
  public fun get_PageCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_IsPasswordProtected(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPdfDocument> {
    public override fun getValue() = ABI.makeIPdfDocument(pointer.getPointer(0))

    public fun setValue(value: IPdfDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPdfDocument {
    public val __1581191555_Ptr: Pointer?

    public val _1581191555_VtblPtr: Pointer?
      get() = __1581191555_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPage(pageIndex: WinDef.UINT): PdfPage? {
      val fnPtr = _1581191555_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PdfPage>()
      val hr = fn.invokeHR(arrayOf(__1581191555_Ptr, pageIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PdfPage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PageCount(): WinDef.UINT {
      val fnPtr = _1581191555_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1581191555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsPasswordProtected(): Boolean {
      val fnPtr = _1581191555_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1581191555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPdfDocument_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1581191555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPdfDocument, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac7ebedd80fa4089846e81b77ff5a86c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPdfDocument(ptr: Pointer?): WithDefault = IPdfDocument_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPdfDocument {
      val address = segment.toRawLongValue()
      return makeIPdfDocument(Pointer(address))
    }

    public override fun toNative(obj: IPdfDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1581191555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPdfDocument): Array<IPdfDocument?> = (elements as
        Array<IPdfDocument?>).castToImpl<IPdfDocument,IPdfDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPdfDocument?> =
        arrayOfNulls<IPdfDocument_Impl>(size) as Array<IPdfDocument?>
  }
}
