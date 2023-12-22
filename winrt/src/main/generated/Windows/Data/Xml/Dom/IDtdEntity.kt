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

@ABIMarker(IDtdEntity.ABI::class)
@Signature("{6a0b5ffc-63b4-480f-9e6a-8a92816aade4}")
@Guid("6a0b5ffc63b4480f9e6a8a92816aade4")
@WinRTInterface("6a0b5ffc63b4480f9e6a8a92816aade4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDtdEntity.ByReference::class)
public interface IDtdEntity : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_PublicId(): IUnknown?

  @InterfaceMethod(1)
  public fun get_SystemId(): IUnknown?

  @InterfaceMethod(2)
  public fun get_NotationName(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDtdEntity> {
    public override fun getValue() = ABI.makeIDtdEntity(pointer.getPointer(0))

    public fun setValue(value: IDtdEntity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDtdEntity, IXmlNode.WithDefault, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __654843968_Ptr: Pointer?

    public val _654843968_VtblPtr: Pointer?
      get() = __654843968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PublicId(): IUnknown? {
      val fnPtr = _654843968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__654843968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SystemId(): IUnknown? {
      val fnPtr = _654843968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__654843968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NotationName(): IUnknown? {
      val fnPtr = _654843968_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__654843968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IDtdEntity_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_654843968_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_654843968_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_654843968_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __654843968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDtdEntity, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a0b5ffc63b4480f9e6a8a92816aade4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDtdEntity(ptr: Pointer?): WithDefault = IDtdEntity_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDtdEntity {
      val address = segment.toRawLongValue()
      return makeIDtdEntity(Pointer(address))
    }

    public override fun toNative(obj: IDtdEntity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654843968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDtdEntity): Array<IDtdEntity?> = (elements as
        Array<IDtdEntity?>).castToImpl<IDtdEntity,IDtdEntity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDtdEntity?> = arrayOfNulls<IDtdEntity_Impl>(size)
        as Array<IDtdEntity?>
  }
}
