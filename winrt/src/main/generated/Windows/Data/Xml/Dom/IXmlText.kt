package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlCharacterData.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IXmlText.ABI::class)
@Signature("{f931a4cb-308d-4760-a1d5-43b67450ac7e}")
@Guid("f931a4cb308d4760a1d543b67450ac7e")
@WinRTInterface("f931a4cb308d4760a1d543b67450ac7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlText.ByReference::class)
public interface IXmlText : NativeMapped, IWinRTInterface, IXmlCharacterData, IXmlNode,
    IXmlNodeSelector, IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun SplitText(offset: WinDef.UINT): IXmlText?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlText> {
    public override fun getValue() = ABI.makeIXmlText(pointer.getPointer(0))

    public fun setValue(value: IXmlText_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlText, IXmlCharacterData.WithDefault, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __306800013_Ptr: Pointer?

    public val _306800013_VtblPtr: Pointer?
      get() = __306800013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SplitText(offset: WinDef.UINT): IXmlText? {
      val fnPtr = _306800013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlText>()
      val hr = fn.invokeHR(arrayOf(__306800013_Ptr, offset, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlText>(result.getValue())
      return resultValue
    }
  }

  public class IXmlText_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlCharacterData, IXmlNode,
      IXmlNodeSelector, IXmlNodeSerializer {
    public override val __230445549_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_306800013_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_306800013_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_306800013_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_306800013_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __306800013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlText, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f931a4cb308d4760a1d543b67450ac7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlText(ptr: Pointer?): WithDefault = IXmlText_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlText {
      val address = segment.toRawLongValue()
      return makeIXmlText(Pointer(address))
    }

    public override fun toNative(obj: IXmlText): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__306800013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlText): Array<IXmlText?> = (elements as
        Array<IXmlText?>).castToImpl<IXmlText,IXmlText_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlText?> = arrayOfNulls<IXmlText_Impl>(size) as
        Array<IXmlText?>
  }
}
