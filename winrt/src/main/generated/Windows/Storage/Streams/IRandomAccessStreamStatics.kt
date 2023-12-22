package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperationWithProgress
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

@ABIMarker(IRandomAccessStreamStatics.ABI::class)
@Signature("{524cedcf-6e29-4ce5-9573-6b753db66c3a}")
@Guid("524cedcf6e294ce595736b753db66c3a")
@WinRTInterface("524cedcf6e294ce595736b753db66c3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRandomAccessStreamStatics.ByReference::class)
public interface IRandomAccessStreamStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CopyAsync(source: IInputStream?, destination: IOutputStream?):
      IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>?

  @InterfaceMethod(1)
  public fun CopyAsync(
    source: IInputStream?,
    destination: IOutputStream?,
    bytesToCopy: WinDef.ULONG
  ): IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>?

  @InterfaceMethod(2)
  public fun CopyAndCloseAsync(source: IInputStream?, destination: IOutputStream?):
      IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRandomAccessStreamStatics> {
    public override fun getValue() = ABI.makeIRandomAccessStreamStatics(pointer.getPointer(0))

    public fun setValue(value: IRandomAccessStreamStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRandomAccessStreamStatics {
    public val __920397430_Ptr: Pointer?

    public val _920397430_VtblPtr: Pointer?
      get() = __920397430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CopyAsync(source: IInputStream?, destination: IOutputStream?):
        IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>? {
      val fnPtr = _920397430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__920397430_Ptr, marshalToNative(source),
          marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.ULONG,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyAsync(
      source: IInputStream?,
      destination: IOutputStream?,
      bytesToCopy: WinDef.ULONG
    ): IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>? {
      val fnPtr = _920397430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__920397430_Ptr, marshalToNative(source),
          marshalToNative(destination), bytesToCopy, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.ULONG,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CopyAndCloseAsync(source: IInputStream?, destination: IOutputStream?):
        IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>? {
      val fnPtr = _920397430_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__920397430_Ptr, marshalToNative(source),
          marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.ULONG,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }
  }

  public class IRandomAccessStreamStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __920397430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRandomAccessStreamStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("524cedcf6e294ce595736b753db66c3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRandomAccessStreamStatics(ptr: Pointer?): WithDefault =
        IRandomAccessStreamStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRandomAccessStreamStatics {
      val address = segment.toRawLongValue()
      return makeIRandomAccessStreamStatics(Pointer(address))
    }

    public override fun toNative(obj: IRandomAccessStreamStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__920397430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamStatics):
        Array<IRandomAccessStreamStatics?> = (elements as
        Array<IRandomAccessStreamStatics?>).castToImpl<IRandomAccessStreamStatics,IRandomAccessStreamStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamStatics?> =
        arrayOfNulls<IRandomAccessStreamStatics_Impl>(size) as Array<IRandomAccessStreamStatics?>
  }
}
