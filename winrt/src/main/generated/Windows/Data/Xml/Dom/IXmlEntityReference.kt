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

@ABIMarker(IXmlEntityReference.ABI::class)
@Signature("{2e2f47bc-c3d0-4ccf-bb86-0ab8c36a61cf}")
@Guid("2e2f47bcc3d04ccfbb860ab8c36a61cf")
@WinRTInterface("2e2f47bcc3d04ccfbb860ab8c36a61cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlEntityReference.ByReference::class)
public interface IXmlEntityReference : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlEntityReference> {
    public override fun getValue() = ABI.makeIXmlEntityReference(pointer.getPointer(0))

    public fun setValue(value: IXmlEntityReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlEntityReference, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __166392248_Ptr: Pointer?

    public val _166392248_VtblPtr: Pointer?
      get() = __166392248_Ptr?.getPointer(0)
  }

  public class IXmlEntityReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_166392248_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_166392248_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_166392248_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __166392248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlEntityReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e2f47bcc3d04ccfbb860ab8c36a61cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlEntityReference(ptr: Pointer?): WithDefault = IXmlEntityReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlEntityReference {
      val address = segment.toRawLongValue()
      return makeIXmlEntityReference(Pointer(address))
    }

    public override fun toNative(obj: IXmlEntityReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__166392248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlEntityReference): Array<IXmlEntityReference?> =
        (elements as
        Array<IXmlEntityReference?>).castToImpl<IXmlEntityReference,IXmlEntityReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlEntityReference?> =
        arrayOfNulls<IXmlEntityReference_Impl>(size) as Array<IXmlEntityReference?>
  }
}
