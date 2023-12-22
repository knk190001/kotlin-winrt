package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlCharacterData.ABI.IID
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

@ABIMarker(IXmlComment.ABI::class)
@Signature("{bca474d5-b61f-4611-9cac-2e92e3476d47}")
@Guid("bca474d5b61f46119cac2e92e3476d47")
@WinRTInterface("bca474d5b61f46119cac2e92e3476d47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlComment.ByReference::class)
public interface IXmlComment : NativeMapped, IWinRTInterface, IXmlCharacterData, IXmlNode,
    IXmlNodeSelector, IXmlNodeSerializer {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlComment> {
    public override fun getValue() = ABI.makeIXmlComment(pointer.getPointer(0))

    public fun setValue(value: IXmlComment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlComment, IXmlCharacterData.WithDefault, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __1737854465_Ptr: Pointer?

    public val _1737854465_VtblPtr: Pointer?
      get() = __1737854465_Ptr?.getPointer(0)
  }

  public class IXmlComment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlCharacterData, IXmlNode,
      IXmlNodeSelector, IXmlNodeSerializer {
    public override val __230445549_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1737854465_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1737854465_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1737854465_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1737854465_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1737854465_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlComment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bca474d5b61f46119cac2e92e3476d47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlComment(ptr: Pointer?): WithDefault = IXmlComment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlComment {
      val address = segment.toRawLongValue()
      return makeIXmlComment(Pointer(address))
    }

    public override fun toNative(obj: IXmlComment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1737854465_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlComment): Array<IXmlComment?> = (elements as
        Array<IXmlComment?>).castToImpl<IXmlComment,IXmlComment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlComment?> =
        arrayOfNulls<IXmlComment_Impl>(size) as Array<IXmlComment?>
  }
}
