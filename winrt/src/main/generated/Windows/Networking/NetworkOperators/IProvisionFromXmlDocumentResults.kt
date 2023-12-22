package Windows.Networking.NetworkOperators

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProvisionFromXmlDocumentResults.ABI::class)
@Signature("{217700e0-8203-11df-adb9-f4ce462d9137}")
@Guid("217700e0820311dfadb9f4ce462d9137")
@WinRTInterface("217700e0820311dfadb9f4ce462d9137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvisionFromXmlDocumentResults.ByReference::class)
public interface IProvisionFromXmlDocumentResults : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllElementsProvisioned(): Boolean

  @InterfaceMethod(1)
  public fun get_ProvisionResultsXml(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvisionFromXmlDocumentResults> {
    public override fun getValue() = ABI.makeIProvisionFromXmlDocumentResults(pointer.getPointer(0))

    public fun setValue(value: IProvisionFromXmlDocumentResults_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvisionFromXmlDocumentResults {
    public val __396801878_Ptr: Pointer?

    public val _396801878_VtblPtr: Pointer?
      get() = __396801878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllElementsProvisioned(): Boolean {
      val fnPtr = _396801878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__396801878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ProvisionResultsXml(): String? {
      val fnPtr = _396801878_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__396801878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProvisionFromXmlDocumentResults_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396801878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvisionFromXmlDocumentResults, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217700e0820311dfadb9f4ce462d9137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvisionFromXmlDocumentResults(ptr: Pointer?): WithDefault =
        IProvisionFromXmlDocumentResults_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvisionFromXmlDocumentResults {
      val address = segment.toRawLongValue()
      return makeIProvisionFromXmlDocumentResults(Pointer(address))
    }

    public override fun toNative(obj: IProvisionFromXmlDocumentResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396801878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvisionFromXmlDocumentResults):
        Array<IProvisionFromXmlDocumentResults?> = (elements as
        Array<IProvisionFromXmlDocumentResults?>).castToImpl<IProvisionFromXmlDocumentResults,IProvisionFromXmlDocumentResults_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvisionFromXmlDocumentResults?> =
        arrayOfNulls<IProvisionFromXmlDocumentResults_Impl>(size) as
        Array<IProvisionFromXmlDocumentResults?>
  }
}
