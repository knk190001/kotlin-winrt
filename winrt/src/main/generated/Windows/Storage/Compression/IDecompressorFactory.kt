package Windows.Storage.Compression

import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IDecompressorFactory.ABI::class)
@Signature("{5337e252-1da2-42e1-8834-0379d28d742f}")
@Guid("5337e2521da242e188340379d28d742f")
@WinRTInterface("5337e2521da242e188340379d28d742f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDecompressorFactory.ByReference::class)
public interface IDecompressorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDecompressor(underlyingStream: IInputStream?): Decompressor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDecompressorFactory> {
    public override fun getValue() = ABI.makeIDecompressorFactory(pointer.getPointer(0))

    public fun setValue(value: IDecompressorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDecompressorFactory {
    public val __305849667_Ptr: Pointer?

    public val _305849667_VtblPtr: Pointer?
      get() = __305849667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDecompressor(underlyingStream: IInputStream?): Decompressor? {
      val fnPtr = _305849667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Decompressor>()
      val hr = fn.invokeHR(arrayOf(__305849667_Ptr, marshalToNative(underlyingStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Decompressor>(result.getValue())
      return resultValue
    }
  }

  public class IDecompressorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __305849667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDecompressorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5337e2521da242e188340379d28d742f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDecompressorFactory(ptr: Pointer?): WithDefault = IDecompressorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDecompressorFactory {
      val address = segment.toRawLongValue()
      return makeIDecompressorFactory(Pointer(address))
    }

    public override fun toNative(obj: IDecompressorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__305849667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDecompressorFactory): Array<IDecompressorFactory?> =
        (elements as
        Array<IDecompressorFactory?>).castToImpl<IDecompressorFactory,IDecompressorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDecompressorFactory?> =
        arrayOfNulls<IDecompressorFactory_Impl>(size) as Array<IDecompressorFactory?>
  }
}
