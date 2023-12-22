package Windows.UI.Xaml.Core.Direct

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlDirectStatics.ABI::class)
@Signature("{321887cc-14e4-5c6f-878d-fbb604ad7d17}")
@Guid("321887cc14e45c6f878dfbb604ad7d17")
@WinRTInterface("321887cc14e45c6f878dfbb604ad7d17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlDirectStatics.ByReference::class)
public interface IXamlDirectStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): XamlDirect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlDirectStatics> {
    public override fun getValue() = ABI.makeIXamlDirectStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlDirectStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlDirectStatics {
    public val __2065087156_Ptr: Pointer?

    public val _2065087156_VtblPtr: Pointer?
      get() = __2065087156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): XamlDirect? {
      val fnPtr = _2065087156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlDirect>()
      val hr = fn.invokeHR(arrayOf(__2065087156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlDirect>(result.getValue())
      return resultValue
    }
  }

  public class IXamlDirectStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2065087156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlDirectStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("321887cc14e45c6f878dfbb604ad7d17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlDirectStatics(ptr: Pointer?): WithDefault = IXamlDirectStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlDirectStatics {
      val address = segment.toRawLongValue()
      return makeIXamlDirectStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlDirectStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2065087156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlDirectStatics): Array<IXamlDirectStatics?> =
        (elements as
        Array<IXamlDirectStatics?>).castToImpl<IXamlDirectStatics,IXamlDirectStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlDirectStatics?> =
        arrayOfNulls<IXamlDirectStatics_Impl>(size) as Array<IXamlDirectStatics?>
  }
}
