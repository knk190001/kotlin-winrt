package Windows.UI.Xaml.Markup

import Windows.UI.Xaml.Interop.TypeName
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlType.ABI::class)
@Signature("{7920eab1-a2e5-479a-bd50-6cef3c0b4970}")
@Guid("7920eab1a2e5479abd506cef3c0b4970")
@WinRTInterface("7920eab1a2e5479abd506cef3c0b4970")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlType.ByReference::class)
public interface IXamlType : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseType(): IXamlType?

  @InterfaceMethod(1)
  public fun get_ContentProperty(): IXamlMember?

  @InterfaceMethod(2)
  public fun get_FullName(): String?

  @InterfaceMethod(3)
  public fun get_IsArray(): Boolean

  @InterfaceMethod(4)
  public fun get_IsCollection(): Boolean

  @InterfaceMethod(5)
  public fun get_IsConstructible(): Boolean

  @InterfaceMethod(6)
  public fun get_IsDictionary(): Boolean

  @InterfaceMethod(7)
  public fun get_IsMarkupExtension(): Boolean

  @InterfaceMethod(8)
  public fun get_IsBindable(): Boolean

  @InterfaceMethod(9)
  public fun get_ItemType(): IXamlType?

  @InterfaceMethod(10)
  public fun get_KeyType(): IXamlType?

  @InterfaceMethod(11)
  public fun get_UnderlyingType(): TypeName?

  @InterfaceMethod(12)
  public fun ActivateInstance(): IUnknown?

  @InterfaceMethod(13)
  public fun CreateFromString(value: String?): IUnknown?

  @InterfaceMethod(14)
  public fun GetMember(name: String?): IXamlMember?

  @InterfaceMethod(15)
  public fun AddToVector(instance: IUnknown?, value: IUnknown?): Unit

  @InterfaceMethod(16)
  public fun AddToMap(
    instance: IUnknown?,
    key: IUnknown?,
    value: IUnknown?
  ): Unit

  @InterfaceMethod(17)
  public fun RunInitializer(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlType> {
    public override fun getValue() = ABI.makeIXamlType(pointer.getPointer(0))

    public fun setValue(value: IXamlType_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlType {
    public val __1675472076_Ptr: Pointer?

    public val _1675472076_VtblPtr: Pointer?
      get() = __1675472076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseType(): IXamlType? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentProperty(): IXamlMember? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlMember>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlMember>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FullName(): String? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsArray(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsCollection(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsConstructible(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsDictionary(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsMarkupExtension(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsBindable(): Boolean {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_ItemType(): IXamlType? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_KeyType(): IXamlType? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_UnderlyingType(): TypeName? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ActivateInstance(): IUnknown? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateFromString(value: String?): IUnknown? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetMember(name: String?): IXamlMember? {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlMember>()
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlMember>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun AddToVector(instance: IUnknown?, value: IUnknown?): Unit {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr, marshalToNative(instance),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun AddToMap(
      instance: IUnknown?,
      key: IUnknown?,
      value: IUnknown?
    ): Unit {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr, marshalToNative(instance),
          marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun RunInitializer(): Unit {
      val fnPtr = _1675472076_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1675472076_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlType_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1675472076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlType, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7920eab1a2e5479abd506cef3c0b4970")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlType(ptr: Pointer?): WithDefault = IXamlType_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlType {
      val address = segment.toRawLongValue()
      return makeIXamlType(Pointer(address))
    }

    public override fun toNative(obj: IXamlType): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1675472076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlType): Array<IXamlType?> = (elements as
        Array<IXamlType?>).castToImpl<IXamlType,IXamlType_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlType?> = arrayOfNulls<IXamlType_Impl>(size)
        as Array<IXamlType?>
  }
}
