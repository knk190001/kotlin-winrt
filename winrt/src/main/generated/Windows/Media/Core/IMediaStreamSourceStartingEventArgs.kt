package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceStartingEventArgs.ABI::class)
@Signature("{f41468f2-c274-4940-a5bb-28a572452fa7}")
@Guid("f41468f2c2744940a5bb28a572452fa7")
@WinRTInterface("f41468f2c2744940a5bb28a572452fa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceStartingEventArgs.ByReference::class)
public interface IMediaStreamSourceStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): MediaStreamSourceStartingRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceStartingEventArgs {
    public val __974800845_Ptr: Pointer?

    public val _974800845_VtblPtr: Pointer?
      get() = __974800845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): MediaStreamSourceStartingRequest? {
      val fnPtr = _974800845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceStartingRequest>()
      val hr = fn.invokeHR(arrayOf(__974800845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSourceStartingRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __974800845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f41468f2c2744940a5bb28a572452fa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceStartingEventArgs(ptr: Pointer?): WithDefault =
        IMediaStreamSourceStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__974800845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceStartingEventArgs):
        Array<IMediaStreamSourceStartingEventArgs?> = (elements as
        Array<IMediaStreamSourceStartingEventArgs?>).castToImpl<IMediaStreamSourceStartingEventArgs,IMediaStreamSourceStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceStartingEventArgs?> =
        arrayOfNulls<IMediaStreamSourceStartingEventArgs_Impl>(size) as
        Array<IMediaStreamSourceStartingEventArgs?>
  }
}
