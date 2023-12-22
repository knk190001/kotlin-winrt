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

@ABIMarker(IXmlProcessingInstruction.ABI::class)
@Signature("{2707fd1e-1e92-4ece-b6f4-26f069078ddc}")
@Guid("2707fd1e1e924eceb6f426f069078ddc")
@WinRTInterface("2707fd1e1e924eceb6f426f069078ddc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlProcessingInstruction.ByReference::class)
public interface IXmlProcessingInstruction : NativeMapped, IWinRTInterface, IXmlNode,
    IXmlNodeSelector, IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_Target(): String?

  @InterfaceMethod(1)
  public fun get_Data(): String?

  @InterfaceMethod(2)
  public fun put_Data(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlProcessingInstruction> {
    public override fun getValue() = ABI.makeIXmlProcessingInstruction(pointer.getPointer(0))

    public fun setValue(value: IXmlProcessingInstruction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlProcessingInstruction, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __154536165_Ptr: Pointer?

    public val _154536165_VtblPtr: Pointer?
      get() = __154536165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Target(): String? {
      val fnPtr = _154536165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__154536165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Data(): String? {
      val fnPtr = _154536165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__154536165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Data(value: String?): Unit {
      val fnPtr = _154536165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__154536165_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlProcessingInstruction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_154536165_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_154536165_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_154536165_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __154536165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlProcessingInstruction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2707fd1e1e924eceb6f426f069078ddc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlProcessingInstruction(ptr: Pointer?): WithDefault =
        IXmlProcessingInstruction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlProcessingInstruction {
      val address = segment.toRawLongValue()
      return makeIXmlProcessingInstruction(Pointer(address))
    }

    public override fun toNative(obj: IXmlProcessingInstruction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__154536165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlProcessingInstruction):
        Array<IXmlProcessingInstruction?> = (elements as
        Array<IXmlProcessingInstruction?>).castToImpl<IXmlProcessingInstruction,IXmlProcessingInstruction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlProcessingInstruction?> =
        arrayOfNulls<IXmlProcessingInstruction_Impl>(size) as Array<IXmlProcessingInstruction?>
  }
}
