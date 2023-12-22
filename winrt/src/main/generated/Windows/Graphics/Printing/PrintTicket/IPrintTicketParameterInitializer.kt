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

@ABIMarker(IPrintTicketParameterInitializer.ABI::class)
@Signature("{5e3335bb-a0a5-48b1-9d5c-07116ddc597a}")
@Guid("5e3335bba0a548b19d5c07116ddc597a")
@WinRTInterface("5e3335bba0a548b19d5c07116ddc597a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTicketParameterInitializer.ByReference::class)
public interface IPrintTicketParameterInitializer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_XmlNamespace(): String?

  @InterfaceMethod(2)
  public fun get_XmlNode(): IXmlNode?

  @InterfaceMethod(3)
  public fun put_Value(value: PrintTicketValue?): Unit

  @InterfaceMethod(4)
  public fun get_Value(): PrintTicketValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTicketParameterInitializer> {
    public override fun getValue() = ABI.makeIPrintTicketParameterInitializer(pointer.getPointer(0))

    public fun setValue(value: IPrintTicketParameterInitializer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTicketParameterInitializer {
    public val __996797057_Ptr: Pointer?

    public val _996797057_VtblPtr: Pointer?
      get() = __996797057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _996797057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__996797057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XmlNamespace(): String? {
      val fnPtr = _996797057_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__996797057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XmlNode(): IXmlNode? {
      val fnPtr = _996797057_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__996797057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: PrintTicketValue?): Unit {
      val fnPtr = _996797057_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996797057_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): PrintTicketValue? {
      val fnPtr = _996797057_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketValue>()
      val hr = fn.invokeHR(arrayOf(__996797057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketValue>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTicketParameterInitializer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996797057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTicketParameterInitializer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e3335bba0a548b19d5c07116ddc597a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTicketParameterInitializer(ptr: Pointer?): WithDefault =
        IPrintTicketParameterInitializer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTicketParameterInitializer {
      val address = segment.toRawLongValue()
      return makeIPrintTicketParameterInitializer(Pointer(address))
    }

    public override fun toNative(obj: IPrintTicketParameterInitializer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996797057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTicketParameterInitializer):
        Array<IPrintTicketParameterInitializer?> = (elements as
        Array<IPrintTicketParameterInitializer?>).castToImpl<IPrintTicketParameterInitializer,IPrintTicketParameterInitializer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTicketParameterInitializer?> =
        arrayOfNulls<IPrintTicketParameterInitializer_Impl>(size) as
        Array<IPrintTicketParameterInitializer?>
  }
}
