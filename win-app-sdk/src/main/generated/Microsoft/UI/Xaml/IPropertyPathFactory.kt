package Microsoft.UI.Xaml

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

@ABIMarker(IPropertyPathFactory.ABI::class)
@Signature("{08a8ccab-7ff8-5cec-bd3c-72c98804d989}")
@Guid("08a8ccab7ff85cecbd3c72c98804d989")
@WinRTInterface("08a8ccab7ff85cecbd3c72c98804d989")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyPathFactory.ByReference::class)
public interface IPropertyPathFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(path: String?): PropertyPath?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyPathFactory> {
    public override fun getValue() = ABI.makeIPropertyPathFactory(pointer.getPointer(0))

    public fun setValue(value: IPropertyPathFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyPathFactory {
    public val __719151209_Ptr: Pointer?

    public val _719151209_VtblPtr: Pointer?
      get() = __719151209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(path: String?): PropertyPath? {
      val fnPtr = _719151209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyPath>()
      val hr = fn.invokeHR(arrayOf(__719151209_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyPath>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyPathFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __719151209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyPathFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08a8ccab7ff85cecbd3c72c98804d989")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyPathFactory(ptr: Pointer?): WithDefault = IPropertyPathFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyPathFactory {
      val address = segment.toRawLongValue()
      return makeIPropertyPathFactory(Pointer(address))
    }

    public override fun toNative(obj: IPropertyPathFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__719151209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyPathFactory): Array<IPropertyPathFactory?> =
        (elements as
        Array<IPropertyPathFactory?>).castToImpl<IPropertyPathFactory,IPropertyPathFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyPathFactory?> =
        arrayOfNulls<IPropertyPathFactory_Impl>(size) as Array<IPropertyPathFactory?>
  }
}
