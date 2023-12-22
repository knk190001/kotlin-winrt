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

@ABIMarker(IPercentFormatterFactory.ABI::class)
@Signature("{b7828aef-fed4-4018-a6e2-e09961e03765}")
@Guid("b7828aeffed44018a6e2e09961e03765")
@WinRTInterface("b7828aeffed44018a6e2e09961e03765")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPercentFormatterFactory.ByReference::class)
public interface IPercentFormatterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePercentFormatter(languages: IIterable<String?>?, geographicRegion: String?):
      PercentFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPercentFormatterFactory> {
    public override fun getValue() = ABI.makeIPercentFormatterFactory(pointer.getPointer(0))

    public fun setValue(value: IPercentFormatterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPercentFormatterFactory {
    public val __362156446_Ptr: Pointer?

    public val _362156446_VtblPtr: Pointer?
      get() = __362156446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePercentFormatter(languages: IIterable<String?>?,
        geographicRegion: String?): PercentFormatter? {
      val fnPtr = _362156446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PercentFormatter>()
      val hr = fn.invokeHR(arrayOf(__362156446_Ptr, marshalToNative(languages),
          marshalToNative(geographicRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PercentFormatter>(result.getValue())
      return resultValue
    }
  }

  public class IPercentFormatterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __362156446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPercentFormatterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7828aeffed44018a6e2e09961e03765")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPercentFormatterFactory(ptr: Pointer?): WithDefault =
        IPercentFormatterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPercentFormatterFactory {
      val address = segment.toRawLongValue()
      return makeIPercentFormatterFactory(Pointer(address))
    }

    public override fun toNative(obj: IPercentFormatterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__362156446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPercentFormatterFactory):
        Array<IPercentFormatterFactory?> = (elements as
        Array<IPercentFormatterFactory?>).castToImpl<IPercentFormatterFactory,IPercentFormatterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPercentFormatterFactory?> =
        arrayOfNulls<IPercentFormatterFactory_Impl>(size) as Array<IPercentFormatterFactory?>
  }
}
