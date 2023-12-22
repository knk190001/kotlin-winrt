package Windows.Media.Playback

import Windows.Foundation.Deferral
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackCommandManagerNextReceivedEventArgs.ABI::class)
@Signature("{e1504433-a2b0-45d4-b9de-5f42ac14a839}")
@Guid("e1504433a2b045d4b9de5f42ac14a839")
@WinRTInterface("e1504433a2b045d4b9de5f42ac14a839")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackCommandManagerNextReceivedEventArgs.ByReference::class)
public interface IMediaPlaybackCommandManagerNextReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackCommandManagerNextReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackCommandManagerNextReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackCommandManagerNextReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackCommandManagerNextReceivedEventArgs {
    public val __153545723_Ptr: Pointer?

    public val _153545723_VtblPtr: Pointer?
      get() = __153545723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _153545723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__153545723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _153545723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153545723_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _153545723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__153545723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackCommandManagerNextReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153545723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackCommandManagerNextReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1504433a2b045d4b9de5f42ac14a839")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackCommandManagerNextReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlaybackCommandManagerNextReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaPlaybackCommandManagerNextReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackCommandManagerNextReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackCommandManagerNextReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__153545723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackCommandManagerNextReceivedEventArgs):
        Array<IMediaPlaybackCommandManagerNextReceivedEventArgs?> = (elements as
        Array<IMediaPlaybackCommandManagerNextReceivedEventArgs?>).castToImpl<IMediaPlaybackCommandManagerNextReceivedEventArgs,IMediaPlaybackCommandManagerNextReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMediaPlaybackCommandManagerNextReceivedEventArgs?> =
        arrayOfNulls<IMediaPlaybackCommandManagerNextReceivedEventArgs_Impl>(size) as
        Array<IMediaPlaybackCommandManagerNextReceivedEventArgs?>
  }
}
