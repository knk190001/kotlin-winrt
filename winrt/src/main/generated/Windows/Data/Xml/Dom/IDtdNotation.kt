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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDtdNotation.ABI::class)
@Signature("{8cb4e04d-6d46-4edb-ab73-df83c51ad397}")
@Guid("8cb4e04d6d464edbab73df83c51ad397")
@WinRTInterface("8cb4e04d6d464edbab73df83c51ad397")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDtdNotation.ByReference::class)
public interface IDtdNotation : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_PublicId(): IUnknown?

  @InterfaceMethod(1)
  public fun get_SystemId(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDtdNotation> {
    public override fun getValue() = ABI.makeIDtdNotation(pointer.getPointer(0))

    public fun setValue(value: IDtdNotation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDtdNotation, IXmlNode.WithDefault, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __1625355551_Ptr: Pointer?

    public val _1625355551_VtblPtr: Pointer?
      get() = __1625355551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PublicId(): IUnknown? {
      val fnPtr = _1625355551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1625355551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SystemId(): IUnknown? {
      val fnPtr = _1625355551_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1625355551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IDtdNotation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1625355551_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1625355551_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1625355551_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1625355551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDtdNotation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cb4e04d6d464edbab73df83c51ad397")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDtdNotation(ptr: Pointer?): WithDefault = IDtdNotation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDtdNotation {
      val address = segment.toRawLongValue()
      return makeIDtdNotation(Pointer(address))
    }

    public override fun toNative(obj: IDtdNotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1625355551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDtdNotation): Array<IDtdNotation?> = (elements as
        Array<IDtdNotation?>).castToImpl<IDtdNotation,IDtdNotation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDtdNotation?> =
        arrayOfNulls<IDtdNotation_Impl>(size) as Array<IDtdNotation?>
  }
}
