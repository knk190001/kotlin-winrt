package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlNode.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IXmlDocumentType.ABI::class)
@Signature("{f7342425-9781-4964-8e94-9b1c6dfc9bc7}")
@Guid("f7342425978149648e949b1c6dfc9bc7")
@WinRTInterface("f7342425978149648e949b1c6dfc9bc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocumentType.ByReference::class)
public interface IXmlDocumentType : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Entities(): XmlNamedNodeMap?

  @InterfaceMethod(2)
  public fun get_Notations(): XmlNamedNodeMap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlDocumentType> {
    public override fun getValue() = ABI.makeIXmlDocumentType(pointer.getPointer(0))

    public fun setValue(value: IXmlDocumentType_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocumentType, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __516788053_Ptr: Pointer?

    public val _516788053_VtblPtr: Pointer?
      get() = __516788053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _516788053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__516788053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Entities(): XmlNamedNodeMap? {
      val fnPtr = _516788053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNamedNodeMap>()
      val hr = fn.invokeHR(arrayOf(__516788053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNamedNodeMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Notations(): XmlNamedNodeMap? {
      val fnPtr = _516788053_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNamedNodeMap>()
      val hr = fn.invokeHR(arrayOf(__516788053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNamedNodeMap>(result.getValue())
      return resultValue
    }
  }

  public class IXmlDocumentType_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_516788053_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_516788053_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_516788053_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __516788053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocumentType, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7342425978149648e949b1c6dfc9bc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocumentType(ptr: Pointer?): WithDefault = IXmlDocumentType_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocumentType {
      val address = segment.toRawLongValue()
      return makeIXmlDocumentType(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocumentType): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516788053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentType): Array<IXmlDocumentType?> = (elements as
        Array<IXmlDocumentType?>).castToImpl<IXmlDocumentType,IXmlDocumentType_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentType?> =
        arrayOfNulls<IXmlDocumentType_Impl>(size) as Array<IXmlDocumentType?>
  }
}
