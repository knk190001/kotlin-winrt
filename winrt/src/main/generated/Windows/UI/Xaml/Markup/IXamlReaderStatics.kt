package Windows.UI.Xaml.Markup

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlReaderStatics.ABI::class)
@Signature("{9891c6bd-534f-4955-b85a-8a8dc0dca602}")
@Guid("9891c6bd534f4955b85a8a8dc0dca602")
@WinRTInterface("9891c6bd534f4955b85a8a8dc0dca602")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlReaderStatics.ByReference::class)
public interface IXamlReaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Load(xaml: String?): IUnknown?

  @InterfaceMethod(1)
  public fun LoadWithInitialTemplateValidation(xaml: String?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlReaderStatics> {
    public override fun getValue() = ABI.makeIXamlReaderStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlReaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlReaderStatics {
    public val __907899952_Ptr: Pointer?

    public val _907899952_VtblPtr: Pointer?
      get() = __907899952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Load(xaml: String?): IUnknown? {
      val fnPtr = _907899952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__907899952_Ptr, marshalToNative(xaml), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadWithInitialTemplateValidation(xaml: String?): IUnknown? {
      val fnPtr = _907899952_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__907899952_Ptr, marshalToNative(xaml), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IXamlReaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __907899952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlReaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9891c6bd534f4955b85a8a8dc0dca602")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlReaderStatics(ptr: Pointer?): WithDefault = IXamlReaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlReaderStatics {
      val address = segment.toRawLongValue()
      return makeIXamlReaderStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlReaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__907899952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlReaderStatics): Array<IXamlReaderStatics?> =
        (elements as
        Array<IXamlReaderStatics?>).castToImpl<IXamlReaderStatics,IXamlReaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlReaderStatics?> =
        arrayOfNulls<IXamlReaderStatics_Impl>(size) as Array<IXamlReaderStatics?>
  }
}
