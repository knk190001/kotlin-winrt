package Windows.UI.Xaml.Data

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

@ABIMarker(ICustomProperty.ABI::class)
@Signature("{30da92c0-23e8-42a0-ae7c-734a0e5d2782}")
@Guid("30da92c023e842a0ae7c734a0e5d2782")
@WinRTInterface("30da92c023e842a0ae7c734a0e5d2782")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomProperty.ByReference::class)
public interface ICustomProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): TypeName?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun GetValue(target: IUnknown?): IUnknown?

  @InterfaceMethod(3)
  public fun SetValue(target: IUnknown?, value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun GetIndexedValue(target: IUnknown?, index: IUnknown?): IUnknown?

  @InterfaceMethod(5)
  public fun SetIndexedValue(
    target: IUnknown?,
    value: IUnknown?,
    index: IUnknown?
  ): Unit

  @InterfaceMethod(6)
  public fun get_CanWrite(): Boolean

  @InterfaceMethod(7)
  public fun get_CanRead(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomProperty> {
    public override fun getValue() = ABI.makeICustomProperty(pointer.getPointer(0))

    public fun setValue(value: ICustomProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomProperty {
    public val __1722479758_Ptr: Pointer?

    public val _1722479758_VtblPtr: Pointer?
      get() = __1722479758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): TypeName? {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetValue(target: IUnknown?): IUnknown? {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetValue(target: IUnknown?, value: IUnknown?): Unit {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr, marshalToNative(target),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetIndexedValue(target: IUnknown?, index: IUnknown?): IUnknown? {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr, marshalToNative(target),
          marshalToNative(index), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetIndexedValue(
      target: IUnknown?,
      value: IUnknown?,
      index: IUnknown?
    ): Unit {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr, marshalToNative(target),
          marshalToNative(value), marshalToNative(index),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CanWrite(): Boolean {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_CanRead(): Boolean {
      val fnPtr = _1722479758_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1722479758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICustomProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1722479758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30da92c023e842a0ae7c734a0e5d2782")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomProperty(ptr: Pointer?): WithDefault = ICustomProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomProperty {
      val address = segment.toRawLongValue()
      return makeICustomProperty(Pointer(address))
    }

    public override fun toNative(obj: ICustomProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1722479758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomProperty): Array<ICustomProperty?> = (elements as
        Array<ICustomProperty?>).castToImpl<ICustomProperty,ICustomProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomProperty?> =
        arrayOfNulls<ICustomProperty_Impl>(size) as Array<ICustomProperty?>
  }
}
