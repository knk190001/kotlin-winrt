package Windows.Data.Text

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

@ABIMarker(ITextConversionGeneratorFactory.ABI::class)
@Signature("{fcaa3781-3083-49ab-be15-56dfbbb74d6f}")
@Guid("fcaa3781308349abbe1556dfbbb74d6f")
@WinRTInterface("fcaa3781308349abbe1556dfbbb74d6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextConversionGeneratorFactory.ByReference::class)
public interface ITextConversionGeneratorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(languageTag: String?): TextConversionGenerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextConversionGeneratorFactory> {
    public override fun getValue() = ABI.makeITextConversionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(value: ITextConversionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextConversionGeneratorFactory {
    public val __535014979_Ptr: Pointer?

    public val _535014979_VtblPtr: Pointer?
      get() = __535014979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(languageTag: String?): TextConversionGenerator? {
      val fnPtr = _535014979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextConversionGenerator>()
      val hr = fn.invokeHR(arrayOf(__535014979_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextConversionGenerator>(result.getValue())
      return resultValue
    }
  }

  public class ITextConversionGeneratorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535014979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextConversionGeneratorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcaa3781308349abbe1556dfbbb74d6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextConversionGeneratorFactory(ptr: Pointer?): WithDefault =
        ITextConversionGeneratorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextConversionGeneratorFactory {
      val address = segment.toRawLongValue()
      return makeITextConversionGeneratorFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextConversionGeneratorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535014979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextConversionGeneratorFactory):
        Array<ITextConversionGeneratorFactory?> = (elements as
        Array<ITextConversionGeneratorFactory?>).castToImpl<ITextConversionGeneratorFactory,ITextConversionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextConversionGeneratorFactory?> =
        arrayOfNulls<ITextConversionGeneratorFactory_Impl>(size) as
        Array<ITextConversionGeneratorFactory?>
  }
}
