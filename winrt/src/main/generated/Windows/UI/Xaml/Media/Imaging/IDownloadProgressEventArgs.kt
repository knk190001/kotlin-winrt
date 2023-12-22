package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IDownloadProgressEventArgs.ABI::class)
@Signature("{7311e0d4-fe94-4e70-9b90-cdd47ac23afb}")
@Guid("7311e0d4fe944e709b90cdd47ac23afb")
@WinRTInterface("7311e0d4fe944e709b90cdd47ac23afb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadProgressEventArgs.ByReference::class)
public interface IDownloadProgressEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Progress(): Int

  @InterfaceMethod(1)
  public fun put_Progress(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadProgressEventArgs> {
    public override fun getValue() = ABI.makeIDownloadProgressEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDownloadProgressEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadProgressEventArgs {
    public val __151868048_Ptr: Pointer?

    public val _151868048_VtblPtr: Pointer?
      get() = __151868048_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Progress(): Int {
      val fnPtr = _151868048_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__151868048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Progress(value: Int): Unit {
      val fnPtr = _151868048_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151868048_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDownloadProgressEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151868048_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadProgressEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7311e0d4fe944e709b90cdd47ac23afb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadProgressEventArgs(ptr: Pointer?): WithDefault =
        IDownloadProgressEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadProgressEventArgs {
      val address = segment.toRawLongValue()
      return makeIDownloadProgressEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDownloadProgressEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151868048_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadProgressEventArgs):
        Array<IDownloadProgressEventArgs?> = (elements as
        Array<IDownloadProgressEventArgs?>).castToImpl<IDownloadProgressEventArgs,IDownloadProgressEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadProgressEventArgs?> =
        arrayOfNulls<IDownloadProgressEventArgs_Impl>(size) as Array<IDownloadProgressEventArgs?>
  }
}
