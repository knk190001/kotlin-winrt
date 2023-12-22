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

@ABIMarker(IPermilleFormatterFactory.ABI::class)
@Signature("{2b37b4ac-e638-4ed5-a998-62f6b06a49ae}")
@Guid("2b37b4ace6384ed5a99862f6b06a49ae")
@WinRTInterface("2b37b4ace6384ed5a99862f6b06a49ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPermilleFormatterFactory.ByReference::class)
public interface IPermilleFormatterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePermilleFormatter(languages: IIterable<String?>?, geographicRegion: String?):
      PermilleFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPermilleFormatterFactory> {
    public override fun getValue() = ABI.makeIPermilleFormatterFactory(pointer.getPointer(0))

    public fun setValue(value: IPermilleFormatterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPermilleFormatterFactory {
    public val __1715894863_Ptr: Pointer?

    public val _1715894863_VtblPtr: Pointer?
      get() = __1715894863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePermilleFormatter(languages: IIterable<String?>?,
        geographicRegion: String?): PermilleFormatter? {
      val fnPtr = _1715894863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PermilleFormatter>()
      val hr = fn.invokeHR(arrayOf(__1715894863_Ptr, marshalToNative(languages),
          marshalToNative(geographicRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PermilleFormatter>(result.getValue())
      return resultValue
    }
  }

  public class IPermilleFormatterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1715894863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPermilleFormatterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b37b4ace6384ed5a99862f6b06a49ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPermilleFormatterFactory(ptr: Pointer?): WithDefault =
        IPermilleFormatterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPermilleFormatterFactory {
      val address = segment.toRawLongValue()
      return makeIPermilleFormatterFactory(Pointer(address))
    }

    public override fun toNative(obj: IPermilleFormatterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1715894863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPermilleFormatterFactory):
        Array<IPermilleFormatterFactory?> = (elements as
        Array<IPermilleFormatterFactory?>).castToImpl<IPermilleFormatterFactory,IPermilleFormatterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPermilleFormatterFactory?> =
        arrayOfNulls<IPermilleFormatterFactory_Impl>(size) as Array<IPermilleFormatterFactory?>
  }
}
