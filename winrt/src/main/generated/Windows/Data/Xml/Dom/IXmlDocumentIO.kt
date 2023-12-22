package Windows.Data.Xml.Dom

import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXmlDocumentIO.ABI::class)
@Signature("{6cd0e74e-ee65-4489-9ebf-ca43e87ba637}")
@Guid("6cd0e74eee6544899ebfca43e87ba637")
@WinRTInterface("6cd0e74eee6544899ebfca43e87ba637")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocumentIO.ByReference::class)
public interface IXmlDocumentIO : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadXml(xml: String?): Unit

  @InterfaceMethod(1)
  public fun LoadXml(xml: String?, loadSettings: XmlLoadSettings?): Unit

  @InterfaceMethod(2)
  public fun SaveToFileAsync(`file`: IStorageFile?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlDocumentIO>
      {
    public override fun getValue() = ABI.makeIXmlDocumentIO(pointer.getPointer(0))

    public fun setValue(value: IXmlDocumentIO_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocumentIO {
    public val __1694390241_Ptr: Pointer?

    public val _1694390241_VtblPtr: Pointer?
      get() = __1694390241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadXml(xml: String?): Unit {
      val fnPtr = _1694390241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694390241_Ptr, marshalToNative(xml),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun LoadXml(xml: String?, loadSettings: XmlLoadSettings?): Unit {
      val fnPtr = _1694390241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694390241_Ptr, marshalToNative(xml),
          marshalToNative(loadSettings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SaveToFileAsync(`file`: IStorageFile?): IAsyncAction? {
      val fnPtr = _1694390241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1694390241_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IXmlDocumentIO_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1694390241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocumentIO, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cd0e74eee6544899ebfca43e87ba637")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocumentIO(ptr: Pointer?): WithDefault = IXmlDocumentIO_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocumentIO {
      val address = segment.toRawLongValue()
      return makeIXmlDocumentIO(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocumentIO): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1694390241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentIO): Array<IXmlDocumentIO?> = (elements as
        Array<IXmlDocumentIO?>).castToImpl<IXmlDocumentIO,IXmlDocumentIO_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentIO?> =
        arrayOfNulls<IXmlDocumentIO_Impl>(size) as Array<IXmlDocumentIO?>
  }
}
