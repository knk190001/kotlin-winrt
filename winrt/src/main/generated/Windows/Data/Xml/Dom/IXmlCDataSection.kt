package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlText.ABI.IID
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

@ABIMarker(IXmlCDataSection.ABI::class)
@Signature("{4d04b46f-c8bd-45b4-8899-0400d7c2c60f}")
@Guid("4d04b46fc8bd45b488990400d7c2c60f")
@WinRTInterface("4d04b46fc8bd45b488990400d7c2c60f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlCDataSection.ByReference::class)
public interface IXmlCDataSection : NativeMapped, IWinRTInterface, IXmlText, IXmlCharacterData,
    IXmlNode, IXmlNodeSelector, IXmlNodeSerializer {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlCDataSection> {
    public override fun getValue() = ABI.makeIXmlCDataSection(pointer.getPointer(0))

    public fun setValue(value: IXmlCDataSection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlCDataSection, IXmlText.WithDefault,
      IXmlCharacterData.WithDefault, IXmlNode.WithDefault, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __253792296_Ptr: Pointer?

    public val _253792296_VtblPtr: Pointer?
      get() = __253792296_Ptr?.getPointer(0)
  }

  public class IXmlCDataSection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlText, IXmlCharacterData,
      IXmlNode, IXmlNodeSelector, IXmlNodeSerializer {
    public override val __306800013_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_253792296_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __230445549_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlCharacterData.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_253792296_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_253792296_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_253792296_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_253792296_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __253792296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlCDataSection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d04b46fc8bd45b488990400d7c2c60f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlCDataSection(ptr: Pointer?): WithDefault = IXmlCDataSection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlCDataSection {
      val address = segment.toRawLongValue()
      return makeIXmlCDataSection(Pointer(address))
    }

    public override fun toNative(obj: IXmlCDataSection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253792296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlCDataSection): Array<IXmlCDataSection?> = (elements as
        Array<IXmlCDataSection?>).castToImpl<IXmlCDataSection,IXmlCDataSection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlCDataSection?> =
        arrayOfNulls<IXmlCDataSection_Impl>(size) as Array<IXmlCDataSection?>
  }
}
