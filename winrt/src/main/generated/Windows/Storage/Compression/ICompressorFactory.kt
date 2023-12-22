package Windows.Storage.Compression

import Windows.Storage.Streams.IOutputStream
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICompressorFactory.ABI::class)
@Signature("{5f3d96a4-2cfb-442c-a8ba-d7d11b039da0}")
@Guid("5f3d96a42cfb442ca8bad7d11b039da0")
@WinRTInterface("5f3d96a42cfb442ca8bad7d11b039da0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompressorFactory.ByReference::class)
public interface ICompressorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCompressor(underlyingStream: IOutputStream?): Compressor?

  @InterfaceMethod(1)
  public fun CreateCompressorEx(
    underlyingStream: IOutputStream?,
    algorithm: CompressAlgorithm?,
    blockSize: WinDef.UINT
  ): Compressor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompressorFactory> {
    public override fun getValue() = ABI.makeICompressorFactory(pointer.getPointer(0))

    public fun setValue(value: ICompressorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompressorFactory {
    public val __354960540_Ptr: Pointer?

    public val _354960540_VtblPtr: Pointer?
      get() = __354960540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCompressor(underlyingStream: IOutputStream?): Compressor? {
      val fnPtr = _354960540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compressor>()
      val hr = fn.invokeHR(arrayOf(__354960540_Ptr, marshalToNative(underlyingStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compressor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCompressorEx(
      underlyingStream: IOutputStream?,
      algorithm: CompressAlgorithm?,
      blockSize: WinDef.UINT
    ): Compressor? {
      val fnPtr = _354960540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compressor>()
      val hr = fn.invokeHR(arrayOf(__354960540_Ptr, marshalToNative(underlyingStream),
          marshalToNative(algorithm), blockSize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compressor>(result.getValue())
      return resultValue
    }
  }

  public class ICompressorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __354960540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompressorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f3d96a42cfb442ca8bad7d11b039da0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompressorFactory(ptr: Pointer?): WithDefault = ICompressorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompressorFactory {
      val address = segment.toRawLongValue()
      return makeICompressorFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompressorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__354960540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompressorFactory): Array<ICompressorFactory?> =
        (elements as
        Array<ICompressorFactory?>).castToImpl<ICompressorFactory,ICompressorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompressorFactory?> =
        arrayOfNulls<ICompressorFactory_Impl>(size) as Array<ICompressorFactory?>
  }
}
