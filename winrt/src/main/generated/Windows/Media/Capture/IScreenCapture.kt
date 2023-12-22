package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaSource
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

@ABIMarker(IScreenCapture.ABI::class)
@Signature("{89179ef7-cd12-4e0e-a6d4-5b3de98b2e9b}")
@Guid("89179ef7cd124e0ea6d45b3de98b2e9b")
@WinRTInterface("89179ef7cd124e0ea6d45b3de98b2e9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScreenCapture.ByReference::class)
public interface IScreenCapture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioSource(): IMediaSource?

  @InterfaceMethod(1)
  public fun get_VideoSource(): IMediaSource?

  @InterfaceMethod(2)
  public fun get_IsAudioSuspended(): Boolean

  @InterfaceMethod(3)
  public fun get_IsVideoSuspended(): Boolean

  @InterfaceMethod(4)
  public fun add_SourceSuspensionChanged(handler: TypedEventHandler<ScreenCapture?,
      SourceSuspensionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SourceSuspensionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScreenCapture>
      {
    public override fun getValue() = ABI.makeIScreenCapture(pointer.getPointer(0))

    public fun setValue(value: IScreenCapture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScreenCapture {
    public val __1381685150_Ptr: Pointer?

    public val _1381685150_VtblPtr: Pointer?
      get() = __1381685150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioSource(): IMediaSource? {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaSource>()
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoSource(): IMediaSource? {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaSource>()
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsAudioSuspended(): Boolean {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsVideoSuspended(): Boolean {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_SourceSuspensionChanged(handler: TypedEventHandler<ScreenCapture?,
        SourceSuspensionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SourceSuspensionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1381685150_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1381685150_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScreenCapture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1381685150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScreenCapture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("89179ef7cd124e0ea6d45b3de98b2e9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScreenCapture(ptr: Pointer?): WithDefault = IScreenCapture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScreenCapture {
      val address = segment.toRawLongValue()
      return makeIScreenCapture(Pointer(address))
    }

    public override fun toNative(obj: IScreenCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1381685150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScreenCapture): Array<IScreenCapture?> = (elements as
        Array<IScreenCapture?>).castToImpl<IScreenCapture,IScreenCapture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScreenCapture?> =
        arrayOfNulls<IScreenCapture_Impl>(size) as Array<IScreenCapture?>
  }
}
