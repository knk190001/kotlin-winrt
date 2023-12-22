package Windows.Globalization.NumberFormatting

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(INumeralSystemTranslatorFactory.ABI::class)
@Signature("{9630c8da-36ef-4d88-a85c-6f0d98d620a6}")
@Guid("9630c8da36ef4d88a85c6f0d98d620a6")
@WinRTInterface("9630c8da36ef4d88a85c6f0d98d620a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumeralSystemTranslatorFactory.ByReference::class)
public interface INumeralSystemTranslatorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(languages: IIterable<String?>?): NumeralSystemTranslator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumeralSystemTranslatorFactory> {
    public override fun getValue() = ABI.makeINumeralSystemTranslatorFactory(pointer.getPointer(0))

    public fun setValue(value: INumeralSystemTranslatorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumeralSystemTranslatorFactory {
    public val __1860694374_Ptr: Pointer?

    public val _1860694374_VtblPtr: Pointer?
      get() = __1860694374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(languages: IIterable<String?>?): NumeralSystemTranslator? {
      val fnPtr = _1860694374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NumeralSystemTranslator>()
      val hr = fn.invokeHR(arrayOf(__1860694374_Ptr, marshalToNative(languages), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NumeralSystemTranslator>(result.getValue())
      return resultValue
    }
  }

  public class INumeralSystemTranslatorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860694374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumeralSystemTranslatorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9630c8da36ef4d88a85c6f0d98d620a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumeralSystemTranslatorFactory(ptr: Pointer?): WithDefault =
        INumeralSystemTranslatorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumeralSystemTranslatorFactory {
      val address = segment.toRawLongValue()
      return makeINumeralSystemTranslatorFactory(Pointer(address))
    }

    public override fun toNative(obj: INumeralSystemTranslatorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860694374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumeralSystemTranslatorFactory):
        Array<INumeralSystemTranslatorFactory?> = (elements as
        Array<INumeralSystemTranslatorFactory?>).castToImpl<INumeralSystemTranslatorFactory,INumeralSystemTranslatorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumeralSystemTranslatorFactory?> =
        arrayOfNulls<INumeralSystemTranslatorFactory_Impl>(size) as
        Array<INumeralSystemTranslatorFactory?>
  }
}
