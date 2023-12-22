package Windows.Graphics.Printing.PrintTicket

import Windows.Data.Xml.Dom.IXmlNode
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPrintTicketFeature.ABI::class)
@Signature("{e7607d6a-59f5-4103-8858-b97710963d39}")
@Guid("e7607d6a59f541038858b97710963d39")
@WinRTInterface("e7607d6a59f541038858b97710963d39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTicketFeature.ByReference::class)
public interface IPrintTicketFeature : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_XmlNamespace(): String?

  @InterfaceMethod(2)
  public fun get_XmlNode(): IXmlNode?

  @InterfaceMethod(3)
  public fun get_DisplayName(): String?

  @InterfaceMethod(4)
  public fun GetOption(name: String?, xmlNamespace: String?): PrintTicketOption?

  @InterfaceMethod(5)
  public fun get_Options(): IVectorView<PrintTicketOption?>?

  @InterfaceMethod(6)
  public fun GetSelectedOption(): PrintTicketOption?

  @InterfaceMethod(7)
  public fun SetSelectedOption(value: PrintTicketOption?): Unit

  @InterfaceMethod(8)
  public fun get_SelectionType(): PrintTicketFeatureSelectionType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTicketFeature> {
    public override fun getValue() = ABI.makeIPrintTicketFeature(pointer.getPointer(0))

    public fun setValue(value: IPrintTicketFeature_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTicketFeature {
    public val __599184658_Ptr: Pointer?

    public val _599184658_VtblPtr: Pointer?
      get() = __599184658_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XmlNamespace(): String? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XmlNode(): IXmlNode? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayName(): String? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetOption(name: String?, xmlNamespace: String?): PrintTicketOption? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketOption>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr, marshalToNative(name),
          marshalToNative(xmlNamespace), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Options(): IVectorView<PrintTicketOption?>? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PrintTicketOption?>>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PrintTicketOption?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetSelectedOption(): PrintTicketOption? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketOption>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetSelectedOption(value: PrintTicketOption?): Unit {
      val fnPtr = _599184658_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SelectionType(): PrintTicketFeatureSelectionType? {
      val fnPtr = _599184658_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeatureSelectionType>()
      val hr = fn.invokeHR(arrayOf(__599184658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeatureSelectionType>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTicketFeature_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __599184658_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTicketFeature, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7607d6a59f541038858b97710963d39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTicketFeature(ptr: Pointer?): WithDefault = IPrintTicketFeature_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTicketFeature {
      val address = segment.toRawLongValue()
      return makeIPrintTicketFeature(Pointer(address))
    }

    public override fun toNative(obj: IPrintTicketFeature): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__599184658_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTicketFeature): Array<IPrintTicketFeature?> =
        (elements as
        Array<IPrintTicketFeature?>).castToImpl<IPrintTicketFeature,IPrintTicketFeature_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTicketFeature?> =
        arrayOfNulls<IPrintTicketFeature_Impl>(size) as Array<IPrintTicketFeature?>
  }
}
