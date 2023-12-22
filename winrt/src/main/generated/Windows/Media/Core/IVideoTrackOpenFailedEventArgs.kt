package Windows.Media.Core

import Windows.Foundation.HResult
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

@ABIMarker(IVideoTrackOpenFailedEventArgs.ABI::class)
@Signature("{7679e231-04f9-4c82-a4ee-8602c8bb4754}")
@Guid("7679e23104f94c82a4ee8602c8bb4754")
@WinRTInterface("7679e23104f94c82a4ee8602c8bb4754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoTrackOpenFailedEventArgs.ByReference::class)
public interface IVideoTrackOpenFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoTrackOpenFailedEventArgs> {
    public override fun getValue() = ABI.makeIVideoTrackOpenFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVideoTrackOpenFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoTrackOpenFailedEventArgs {
    public val __383926069_Ptr: Pointer?

    public val _383926069_VtblPtr: Pointer?
      get() = __383926069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _383926069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__383926069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IVideoTrackOpenFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __383926069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoTrackOpenFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7679e23104f94c82a4ee8602c8bb4754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoTrackOpenFailedEventArgs(ptr: Pointer?): WithDefault =
        IVideoTrackOpenFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoTrackOpenFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVideoTrackOpenFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVideoTrackOpenFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__383926069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoTrackOpenFailedEventArgs):
        Array<IVideoTrackOpenFailedEventArgs?> = (elements as
        Array<IVideoTrackOpenFailedEventArgs?>).castToImpl<IVideoTrackOpenFailedEventArgs,IVideoTrackOpenFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoTrackOpenFailedEventArgs?> =
        arrayOfNulls<IVideoTrackOpenFailedEventArgs_Impl>(size) as
        Array<IVideoTrackOpenFailedEventArgs?>
  }
}
