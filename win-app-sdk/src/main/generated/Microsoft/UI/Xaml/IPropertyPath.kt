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

@ABIMarker(IPropertyPath.ABI::class)
@Signature("{8b0712f6-9e57-53b0-80b1-966a79f60b96}")
@Guid("8b0712f69e5753b080b1966a79f60b96")
@WinRTInterface("8b0712f69e5753b080b1966a79f60b96")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyPath.ByReference::class)
public interface IPropertyPath : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPropertyPath>
      {
    public override fun getValue() = ABI.makeIPropertyPath(pointer.getPointer(0))

    public fun setValue(value: IPropertyPath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyPath {
    public val __2132522655_Ptr: Pointer?

    public val _2132522655_VtblPtr: Pointer?
      get() = __2132522655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): String? {
      val fnPtr = _2132522655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2132522655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyPath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132522655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyPath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b0712f69e5753b080b1966a79f60b96")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyPath(ptr: Pointer?): WithDefault = IPropertyPath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyPath {
      val address = segment.toRawLongValue()
      return makeIPropertyPath(Pointer(address))
    }

    public override fun toNative(obj: IPropertyPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132522655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyPath): Array<IPropertyPath?> = (elements as
        Array<IPropertyPath?>).castToImpl<IPropertyPath,IPropertyPath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyPath?> =
        arrayOfNulls<IPropertyPath_Impl>(size) as Array<IPropertyPath?>
  }
}
