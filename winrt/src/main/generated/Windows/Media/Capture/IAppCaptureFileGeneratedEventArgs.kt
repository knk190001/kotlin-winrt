package Windows.Media.Capture

import Windows.Storage.StorageFile
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

@ABIMarker(IAppCaptureFileGeneratedEventArgs.ABI::class)
@Signature("{4189fbf4-465e-45bf-907f-165b3fb23758}")
@Guid("4189fbf4465e45bf907f165b3fb23758")
@WinRTInterface("4189fbf4465e45bf907f165b3fb23758")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureFileGeneratedEventArgs.ByReference::class)
public interface IAppCaptureFileGeneratedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_File(): StorageFile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureFileGeneratedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppCaptureFileGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureFileGeneratedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureFileGeneratedEventArgs {
    public val __1904865409_Ptr: Pointer?

    public val _1904865409_VtblPtr: Pointer?
      get() = __1904865409_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_File(): StorageFile? {
      val fnPtr = _1904865409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1904865409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureFileGeneratedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1904865409_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureFileGeneratedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4189fbf4465e45bf907f165b3fb23758")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureFileGeneratedEventArgs(ptr: Pointer?): WithDefault =
        IAppCaptureFileGeneratedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureFileGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppCaptureFileGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureFileGeneratedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1904865409_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureFileGeneratedEventArgs):
        Array<IAppCaptureFileGeneratedEventArgs?> = (elements as
        Array<IAppCaptureFileGeneratedEventArgs?>).castToImpl<IAppCaptureFileGeneratedEventArgs,IAppCaptureFileGeneratedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureFileGeneratedEventArgs?> =
        arrayOfNulls<IAppCaptureFileGeneratedEventArgs_Impl>(size) as
        Array<IAppCaptureFileGeneratedEventArgs?>
  }
}
