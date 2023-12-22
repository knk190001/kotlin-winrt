package Microsoft.UI.Xaml.Markup

import Windows.UI.Xaml.Interop.TypeName
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProvideValueTargetProperty.ABI::class)
@Signature("{ce777b1f-b42e-59d1-870d-12fdf0629133}")
@Guid("ce777b1fb42e59d1870d12fdf0629133")
@WinRTInterface("ce777b1fb42e59d1870d12fdf0629133")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvideValueTargetProperty.ByReference::class)
public interface IProvideValueTargetProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Type(): TypeName?

  @InterfaceMethod(2)
  public fun get_DeclaringType(): TypeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvideValueTargetProperty> {
    public override fun getValue() = ABI.makeIProvideValueTargetProperty(pointer.getPointer(0))

    public fun setValue(value: IProvideValueTargetProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvideValueTargetProperty {
    public val __347122869_Ptr: Pointer?

    public val _347122869_VtblPtr: Pointer?
      get() = __347122869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _347122869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347122869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Type(): TypeName? {
      val fnPtr = _347122869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__347122869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeclaringType(): TypeName? {
      val fnPtr = _347122869_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__347122869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }
  }

  public class IProvideValueTargetProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __347122869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvideValueTargetProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce777b1fb42e59d1870d12fdf0629133")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvideValueTargetProperty(ptr: Pointer?): WithDefault =
        IProvideValueTargetProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvideValueTargetProperty {
      val address = segment.toRawLongValue()
      return makeIProvideValueTargetProperty(Pointer(address))
    }

    public override fun toNative(obj: IProvideValueTargetProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__347122869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvideValueTargetProperty):
        Array<IProvideValueTargetProperty?> = (elements as
        Array<IProvideValueTargetProperty?>).castToImpl<IProvideValueTargetProperty,IProvideValueTargetProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvideValueTargetProperty?> =
        arrayOfNulls<IProvideValueTargetProperty_Impl>(size) as Array<IProvideValueTargetProperty?>
  }
}
