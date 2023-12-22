package Windows.Data.Xml.Xsl

import Windows.Data.Xml.Dom.XmlDocument
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

@ABIMarker(IXsltProcessorFactory.ABI::class)
@Signature("{274146c0-9a51-4663-bf30-0ef742146f20}")
@Guid("274146c09a514663bf300ef742146f20")
@WinRTInterface("274146c09a514663bf300ef742146f20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXsltProcessorFactory.ByReference::class)
public interface IXsltProcessorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(document: XmlDocument?): XsltProcessor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXsltProcessorFactory> {
    public override fun getValue() = ABI.makeIXsltProcessorFactory(pointer.getPointer(0))

    public fun setValue(value: IXsltProcessorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXsltProcessorFactory {
    public val __1539689155_Ptr: Pointer?

    public val _1539689155_VtblPtr: Pointer?
      get() = __1539689155_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(document: XmlDocument?): XsltProcessor? {
      val fnPtr = _1539689155_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XsltProcessor>()
      val hr = fn.invokeHR(arrayOf(__1539689155_Ptr, marshalToNative(document), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XsltProcessor>(result.getValue())
      return resultValue
    }
  }

  public class IXsltProcessorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539689155_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXsltProcessorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("274146c09a514663bf300ef742146f20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXsltProcessorFactory(ptr: Pointer?): WithDefault =
        IXsltProcessorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXsltProcessorFactory {
      val address = segment.toRawLongValue()
      return makeIXsltProcessorFactory(Pointer(address))
    }

    public override fun toNative(obj: IXsltProcessorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539689155_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXsltProcessorFactory): Array<IXsltProcessorFactory?> =
        (elements as
        Array<IXsltProcessorFactory?>).castToImpl<IXsltProcessorFactory,IXsltProcessorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXsltProcessorFactory?> =
        arrayOfNulls<IXsltProcessorFactory_Impl>(size) as Array<IXsltProcessorFactory?>
  }
}
