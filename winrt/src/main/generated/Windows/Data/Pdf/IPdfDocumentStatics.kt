package Windows.Data.Pdf

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IPdfDocumentStatics.ABI::class)
@Signature("{433a0b5f-c007-4788-90f2-08143d922599}")
@Guid("433a0b5fc007478890f208143d922599")
@WinRTInterface("433a0b5fc007478890f208143d922599")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPdfDocumentStatics.ByReference::class)
public interface IPdfDocumentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadFromFileAsync(`file`: IStorageFile?): IAsyncOperation<PdfDocument?>?

  @InterfaceMethod(1)
  public fun LoadFromFileAsync(`file`: IStorageFile?, password: String?):
      IAsyncOperation<PdfDocument?>?

  @InterfaceMethod(2)
  public fun LoadFromStreamAsync(inputStream: IRandomAccessStream?): IAsyncOperation<PdfDocument?>?

  @InterfaceMethod(3)
  public fun LoadFromStreamAsync(inputStream: IRandomAccessStream?, password: String?):
      IAsyncOperation<PdfDocument?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPdfDocumentStatics> {
    public override fun getValue() = ABI.makeIPdfDocumentStatics(pointer.getPointer(0))

    public fun setValue(value: IPdfDocumentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPdfDocumentStatics {
    public val __384904568_Ptr: Pointer?

    public val _384904568_VtblPtr: Pointer?
      get() = __384904568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadFromFileAsync(`file`: IStorageFile?): IAsyncOperation<PdfDocument?>? {
      val fnPtr = _384904568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PdfDocument?>>()
      val hr = fn.invokeHR(arrayOf(__384904568_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PdfDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadFromFileAsync(`file`: IStorageFile?, password: String?):
        IAsyncOperation<PdfDocument?>? {
      val fnPtr = _384904568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PdfDocument?>>()
      val hr = fn.invokeHR(arrayOf(__384904568_Ptr, marshalToNative(file),
          marshalToNative(password), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PdfDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LoadFromStreamAsync(inputStream: IRandomAccessStream?):
        IAsyncOperation<PdfDocument?>? {
      val fnPtr = _384904568_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PdfDocument?>>()
      val hr = fn.invokeHR(arrayOf(__384904568_Ptr, marshalToNative(inputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PdfDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LoadFromStreamAsync(inputStream: IRandomAccessStream?, password: String?):
        IAsyncOperation<PdfDocument?>? {
      val fnPtr = _384904568_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PdfDocument?>>()
      val hr = fn.invokeHR(arrayOf(__384904568_Ptr, marshalToNative(inputStream),
          marshalToNative(password), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PdfDocument?>>(result.getValue())
      return resultValue
    }
  }

  public class IPdfDocumentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384904568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPdfDocumentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("433a0b5fc007478890f208143d922599")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPdfDocumentStatics(ptr: Pointer?): WithDefault = IPdfDocumentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPdfDocumentStatics {
      val address = segment.toRawLongValue()
      return makeIPdfDocumentStatics(Pointer(address))
    }

    public override fun toNative(obj: IPdfDocumentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384904568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPdfDocumentStatics): Array<IPdfDocumentStatics?> =
        (elements as
        Array<IPdfDocumentStatics?>).castToImpl<IPdfDocumentStatics,IPdfDocumentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPdfDocumentStatics?> =
        arrayOfNulls<IPdfDocumentStatics_Impl>(size) as Array<IPdfDocumentStatics?>
  }
}
