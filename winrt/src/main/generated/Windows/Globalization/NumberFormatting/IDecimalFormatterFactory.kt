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

@ABIMarker(IDecimalFormatterFactory.ABI::class)
@Signature("{0d018c9a-e393-46b8-b830-7a69c8f89fbb}")
@Guid("0d018c9ae39346b8b8307a69c8f89fbb")
@WinRTInterface("0d018c9ae39346b8b8307a69c8f89fbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDecimalFormatterFactory.ByReference::class)
public interface IDecimalFormatterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDecimalFormatter(languages: IIterable<String?>?, geographicRegion: String?):
      DecimalFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDecimalFormatterFactory> {
    public override fun getValue() = ABI.makeIDecimalFormatterFactory(pointer.getPointer(0))

    public fun setValue(value: IDecimalFormatterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDecimalFormatterFactory {
    public val __226952558_Ptr: Pointer?

    public val _226952558_VtblPtr: Pointer?
      get() = __226952558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDecimalFormatter(languages: IIterable<String?>?,
        geographicRegion: String?): DecimalFormatter? {
      val fnPtr = _226952558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DecimalFormatter>()
      val hr = fn.invokeHR(arrayOf(__226952558_Ptr, marshalToNative(languages),
          marshalToNative(geographicRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DecimalFormatter>(result.getValue())
      return resultValue
    }
  }

  public class IDecimalFormatterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __226952558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDecimalFormatterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d018c9ae39346b8b8307a69c8f89fbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDecimalFormatterFactory(ptr: Pointer?): WithDefault =
        IDecimalFormatterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDecimalFormatterFactory {
      val address = segment.toRawLongValue()
      return makeIDecimalFormatterFactory(Pointer(address))
    }

    public override fun toNative(obj: IDecimalFormatterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__226952558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDecimalFormatterFactory):
        Array<IDecimalFormatterFactory?> = (elements as
        Array<IDecimalFormatterFactory?>).castToImpl<IDecimalFormatterFactory,IDecimalFormatterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDecimalFormatterFactory?> =
        arrayOfNulls<IDecimalFormatterFactory_Impl>(size) as Array<IDecimalFormatterFactory?>
  }
}
