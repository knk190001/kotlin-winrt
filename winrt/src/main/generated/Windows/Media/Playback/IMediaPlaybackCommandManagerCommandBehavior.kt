package Windows.Media.Playback

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaPlaybackCommandManagerCommandBehavior.ABI::class)
@Signature("{786c1e78-ce78-4a10-afd6-843fcbb90c2e}")
@Guid("786c1e78ce784a10afd6843fcbb90c2e")
@WinRTInterface("786c1e78ce784a10afd6843fcbb90c2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackCommandManagerCommandBehavior.ByReference::class)
public interface IMediaPlaybackCommandManagerCommandBehavior : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandManager(): MediaPlaybackCommandManager?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun get_EnablingRule(): MediaCommandEnablingRule?

  @InterfaceMethod(3)
  public fun put_EnablingRule(value: MediaCommandEnablingRule?): Unit

  @InterfaceMethod(4)
  public
      fun add_IsEnabledChanged(handler: TypedEventHandler<MediaPlaybackCommandManagerCommandBehavior?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_IsEnabledChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackCommandManagerCommandBehavior> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackCommandManagerCommandBehavior(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackCommandManagerCommandBehavior_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackCommandManagerCommandBehavior {
    public val __921876043_Ptr: Pointer?

    public val _921876043_VtblPtr: Pointer?
      get() = __921876043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandManager(): MediaPlaybackCommandManager? {
      val fnPtr = _921876043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManager>()
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackCommandManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _921876043_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_EnablingRule(): MediaCommandEnablingRule? {
      val fnPtr = _921876043_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCommandEnablingRule>()
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCommandEnablingRule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EnablingRule(value: MediaCommandEnablingRule?): Unit {
      val fnPtr = _921876043_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_IsEnabledChanged(handler: TypedEventHandler<MediaPlaybackCommandManagerCommandBehavior?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _921876043_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_IsEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _921876043_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__921876043_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackCommandManagerCommandBehavior_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __921876043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackCommandManagerCommandBehavior, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("786c1e78ce784a10afd6843fcbb90c2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackCommandManagerCommandBehavior(ptr: Pointer?): WithDefault =
        IMediaPlaybackCommandManagerCommandBehavior_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaPlaybackCommandManagerCommandBehavior {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackCommandManagerCommandBehavior(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackCommandManagerCommandBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__921876043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackCommandManagerCommandBehavior):
        Array<IMediaPlaybackCommandManagerCommandBehavior?> = (elements as
        Array<IMediaPlaybackCommandManagerCommandBehavior?>).castToImpl<IMediaPlaybackCommandManagerCommandBehavior,IMediaPlaybackCommandManagerCommandBehavior_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackCommandManagerCommandBehavior?> =
        arrayOfNulls<IMediaPlaybackCommandManagerCommandBehavior_Impl>(size) as
        Array<IMediaPlaybackCommandManagerCommandBehavior?>
  }
}
