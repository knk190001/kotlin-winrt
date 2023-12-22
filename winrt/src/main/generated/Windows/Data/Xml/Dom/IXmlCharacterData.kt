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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IXmlCharacterData.ABI::class)
@Signature("{132e42ab-4e36-4df6-b1c8-0ce62fd88b26}")
@Guid("132e42ab4e364df6b1c80ce62fd88b26")
@WinRTInterface("132e42ab4e364df6b1c80ce62fd88b26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlCharacterData.ByReference::class)
public interface IXmlCharacterData : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_Data(): String?

  @InterfaceMethod(1)
  public fun put_Data(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Length(): WinDef.UINT

  @InterfaceMethod(3)
  public fun SubstringData(offset: WinDef.UINT, count: WinDef.UINT): String?

  @InterfaceMethod(4)
  public fun AppendData(`data`: String?): Unit

  @InterfaceMethod(5)
  public fun InsertData(offset: WinDef.UINT, `data`: String?): Unit

  @InterfaceMethod(6)
  public fun DeleteData(offset: WinDef.UINT, count: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun ReplaceData(
    offset: WinDef.UINT,
    count: WinDef.UINT,
    `data`: String?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlCharacterData> {
    public override fun getValue() = ABI.makeIXmlCharacterData(pointer.getPointer(0))

    public fun setValue(value: IXmlCharacterData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlCharacterData, IXmlNode.WithDefault,
      IXmlNodeSelector.WithDefault, IXmlNodeSerializer.WithDefault {
    public val __230445549_Ptr: Pointer?

    public val _230445549_VtblPtr: Pointer?
      get() = __230445549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): String? {
      val fnPtr = _230445549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: String?): Unit {
      val fnPtr = _230445549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Length(): WinDef.UINT {
      val fnPtr = _230445549_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SubstringData(offset: WinDef.UINT, count: WinDef.UINT): String? {
      val fnPtr = _230445549_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, offset, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AppendData(`data`: String?): Unit {
      val fnPtr = _230445549_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun InsertData(offset: WinDef.UINT, `data`: String?): Unit {
      val fnPtr = _230445549_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, offset, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun DeleteData(offset: WinDef.UINT, count: WinDef.UINT): Unit {
      val fnPtr = _230445549_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, offset, count,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun ReplaceData(
      offset: WinDef.UINT,
      count: WinDef.UINT,
      `data`: String?
    ): Unit {
      val fnPtr = _230445549_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__230445549_Ptr, offset, count, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlCharacterData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_230445549_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_230445549_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_230445549_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __230445549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlCharacterData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("132e42ab4e364df6b1c80ce62fd88b26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlCharacterData(ptr: Pointer?): WithDefault = IXmlCharacterData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlCharacterData {
      val address = segment.toRawLongValue()
      return makeIXmlCharacterData(Pointer(address))
    }

    public override fun toNative(obj: IXmlCharacterData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__230445549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlCharacterData): Array<IXmlCharacterData?> = (elements
        as Array<IXmlCharacterData?>).castToImpl<IXmlCharacterData,IXmlCharacterData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlCharacterData?> =
        arrayOfNulls<IXmlCharacterData_Impl>(size) as Array<IXmlCharacterData?>
  }
}
