package Windows.Graphics.Printing.PrintTicket

import Windows.Data.Xml.Dom.IXmlNode
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

@ABIMarker(IPrintTicketParameterDefinition.ABI::class)
@Signature("{d6bab4e4-2962-4c01-b7f3-9a9294eb8335}")
@Guid("d6bab4e429624c01b7f39a9294eb8335")
@WinRTInterface("d6bab4e429624c01b7f39a9294eb8335")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTicketParameterDefinition.ByReference::class)
public interface IPrintTicketParameterDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_XmlNamespace(): String?

  @InterfaceMethod(2)
  public fun get_XmlNode(): IXmlNode?

  @InterfaceMethod(3)
  public fun get_DataType(): PrintTicketParameterDataType?

  @InterfaceMethod(4)
  public fun get_UnitType(): String?

  @InterfaceMethod(5)
  public fun get_RangeMin(): Int

  @InterfaceMethod(6)
  public fun get_RangeMax(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTicketParameterDefinition> {
    public override fun getValue() = ABI.makeIPrintTicketParameterDefinition(pointer.getPointer(0))

    public fun setValue(value: IPrintTicketParameterDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTicketParameterDefinition {
    public val __883523116_Ptr: Pointer?

    public val _883523116_VtblPtr: Pointer?
      get() = __883523116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _883523116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XmlNamespace(): String? {
      val fnPtr = _883523116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XmlNode(): IXmlNode? {
      val fnPtr = _883523116_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DataType(): PrintTicketParameterDataType? {
      val fnPtr = _883523116_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketParameterDataType>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketParameterDataType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_UnitType(): String? {
      val fnPtr = _883523116_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RangeMin(): Int {
      val fnPtr = _883523116_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_RangeMax(): Int {
      val fnPtr = _883523116_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__883523116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTicketParameterDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883523116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTicketParameterDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6bab4e429624c01b7f39a9294eb8335")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTicketParameterDefinition(ptr: Pointer?): WithDefault =
        IPrintTicketParameterDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTicketParameterDefinition {
      val address = segment.toRawLongValue()
      return makeIPrintTicketParameterDefinition(Pointer(address))
    }

    public override fun toNative(obj: IPrintTicketParameterDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883523116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTicketParameterDefinition):
        Array<IPrintTicketParameterDefinition?> = (elements as
        Array<IPrintTicketParameterDefinition?>).castToImpl<IPrintTicketParameterDefinition,IPrintTicketParameterDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTicketParameterDefinition?> =
        arrayOfNulls<IPrintTicketParameterDefinition_Impl>(size) as
        Array<IPrintTicketParameterDefinition?>
  }
}
