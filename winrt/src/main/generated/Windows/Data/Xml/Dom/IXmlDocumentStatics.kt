package Windows.Data.Xml.Dom

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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

@ABIMarker(IXmlDocumentStatics.ABI::class)
@Signature("{5543d254-d757-4b79-9539-232b18f50bf1}")
@Guid("5543d254d7574b799539232b18f50bf1")
@WinRTInterface("5543d254d7574b799539232b18f50bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocumentStatics.ByReference::class)
public interface IXmlDocumentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadFromUriAsync(uri: Uri?): IAsyncOperation<XmlDocument?>?

  @InterfaceMethod(1)
  public fun LoadFromUriAsync(uri: Uri?, loadSettings: XmlLoadSettings?):
      IAsyncOperation<XmlDocument?>?

  @InterfaceMethod(2)
  public fun LoadFromFileAsync(`file`: IStorageFile?): IAsyncOperation<XmlDocument?>?

  @InterfaceMethod(3)
  public fun LoadFromFileAsync(`file`: IStorageFile?, loadSettings: XmlLoadSettings?):
      IAsyncOperation<XmlDocument?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlDocumentStatics> {
    public override fun getValue() = ABI.makeIXmlDocumentStatics(pointer.getPointer(0))

    public fun setValue(value: IXmlDocumentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocumentStatics {
    public val __1426146762_Ptr: Pointer?

    public val _1426146762_VtblPtr: Pointer?
      get() = __1426146762_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadFromUriAsync(uri: Uri?): IAsyncOperation<XmlDocument?>? {
      val fnPtr = _1426146762_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<XmlDocument?>>()
      val hr = fn.invokeHR(arrayOf(__1426146762_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<XmlDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadFromUriAsync(uri: Uri?, loadSettings: XmlLoadSettings?):
        IAsyncOperation<XmlDocument?>? {
      val fnPtr = _1426146762_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<XmlDocument?>>()
      val hr = fn.invokeHR(arrayOf(__1426146762_Ptr, marshalToNative(uri),
          marshalToNative(loadSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<XmlDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LoadFromFileAsync(`file`: IStorageFile?): IAsyncOperation<XmlDocument?>? {
      val fnPtr = _1426146762_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<XmlDocument?>>()
      val hr = fn.invokeHR(arrayOf(__1426146762_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<XmlDocument?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LoadFromFileAsync(`file`: IStorageFile?, loadSettings: XmlLoadSettings?):
        IAsyncOperation<XmlDocument?>? {
      val fnPtr = _1426146762_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<XmlDocument?>>()
      val hr = fn.invokeHR(arrayOf(__1426146762_Ptr, marshalToNative(file),
          marshalToNative(loadSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<XmlDocument?>>(result.getValue())
      return resultValue
    }
  }

  public class IXmlDocumentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1426146762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocumentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5543d254d7574b799539232b18f50bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocumentStatics(ptr: Pointer?): WithDefault = IXmlDocumentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocumentStatics {
      val address = segment.toRawLongValue()
      return makeIXmlDocumentStatics(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocumentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426146762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentStatics): Array<IXmlDocumentStatics?> =
        (elements as
        Array<IXmlDocumentStatics?>).castToImpl<IXmlDocumentStatics,IXmlDocumentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentStatics?> =
        arrayOfNulls<IXmlDocumentStatics_Impl>(size) as Array<IXmlDocumentStatics?>
  }
}
