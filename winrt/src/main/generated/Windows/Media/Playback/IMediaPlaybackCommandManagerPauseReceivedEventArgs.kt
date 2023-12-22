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

@ABIMarker(IMediaPlaybackCommandManagerPauseReceivedEventArgs.ABI::class)
@Signature("{5ceccd1c-c25c-4221-b16c-c3c98ce012d6}")
@Guid("5ceccd1cc25c4221b16cc3c98ce012d6")
@WinRTInterface("5ceccd1cc25c4221b16cc3c98ce012d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackCommandManagerPauseReceivedEventArgs.ByReference::class)
public interface IMediaPlaybackCommandManagerPauseReceivedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackCommandManagerPauseReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackCommandManagerPauseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackCommandManagerPauseReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackCommandManagerPauseReceivedEventArgs {
    public val __987198360_Ptr: Pointer?

    public val _987198360_VtblPtr: Pointer?
      get() = __987198360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _987198360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__987198360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _987198360_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987198360_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _987198360_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__987198360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackCommandManagerPauseReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __987198360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackCommandManagerPauseReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ceccd1cc25c4221b16cc3c98ce012d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackCommandManagerPauseReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlaybackCommandManagerPauseReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaPlaybackCommandManagerPauseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackCommandManagerPauseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackCommandManagerPauseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__987198360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackCommandManagerPauseReceivedEventArgs):
        Array<IMediaPlaybackCommandManagerPauseReceivedEventArgs?> = (elements as
        Array<IMediaPlaybackCommandManagerPauseReceivedEventArgs?>).castToImpl<IMediaPlaybackCommandManagerPauseReceivedEventArgs,IMediaPlaybackCommandManagerPauseReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMediaPlaybackCommandManagerPauseReceivedEventArgs?> =
        arrayOfNulls<IMediaPlaybackCommandManagerPauseReceivedEventArgs_Impl>(size) as
        Array<IMediaPlaybackCommandManagerPauseReceivedEventArgs?>
  }
}
