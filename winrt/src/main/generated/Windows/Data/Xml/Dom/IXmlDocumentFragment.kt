package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlNode.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXmlDocumentFragment.ABI::class)
@Signature("{e2ea6a96-0c21-44a5-8bc9-9e4a262708ec}")
@Guid("e2ea6a960c2144a58bc99e4a262708ec")
@WinRTInterface("e2ea6a960c2144a58bc99e4a262708ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocumentFragment.ByReference::class)
public interface IXmlDocumentFragment : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlDocumentFragment> {
    public override fun getValue() = ABI.makeIXmlDocumentFragment(pointer.getPointer(0))

    public fun setValue(value: IXmlDocumentFragment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocumentFragment, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __1707713301_Ptr: Pointer?

    public val _1707713301_VtblPtr: Pointer?
      get() = __1707713301_Ptr?.getPointer(0)
  }

  public class IXmlDocumentFragment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1707713301_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1707713301_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1707713301_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1707713301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocumentFragment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2ea6a960c2144a58bc99e4a262708ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocumentFragment(ptr: Pointer?): WithDefault = IXmlDocumentFragment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocumentFragment {
      val address = segment.toRawLongValue()
      return makeIXmlDocumentFragment(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocumentFragment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1707713301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentFragment): Array<IXmlDocumentFragment?> =
        (elements as
        Array<IXmlDocumentFragment?>).castToImpl<IXmlDocumentFragment,IXmlDocumentFragment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentFragment?> =
        arrayOfNulls<IXmlDocumentFragment_Impl>(size) as Array<IXmlDocumentFragment?>
  }
}
