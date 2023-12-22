package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastMicrophoneCaptureStateChangedEventArgs.ABI::class)
@Signature("{a86ad5e9-9440-4908-9d09-65b7e315d795}")
@Guid("a86ad5e9944049089d0965b7e315d795")
@WinRTInterface("a86ad5e9944049089d0965b7e315d795")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastMicrophoneCaptureStateChangedEventArgs.ByReference::class)
public interface IAppBroadcastMicrophoneCaptureStateChangedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_State(): AppBroadcastMicrophoneCaptureState?

  @InterfaceMethod(1)
  public fun get_ErrorCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastMicrophoneCaptureStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastMicrophoneCaptureStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastMicrophoneCaptureStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastMicrophoneCaptureStateChangedEventArgs {
    public val __677537488_Ptr: Pointer?

    public val _677537488_VtblPtr: Pointer?
      get() = __677537488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): AppBroadcastMicrophoneCaptureState? {
      val fnPtr = _677537488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastMicrophoneCaptureState>()
      val hr = fn.invokeHR(arrayOf(__677537488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastMicrophoneCaptureState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _677537488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__677537488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastMicrophoneCaptureStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __677537488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastMicrophoneCaptureStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a86ad5e9944049089d0965b7e315d795")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastMicrophoneCaptureStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastMicrophoneCaptureStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastMicrophoneCaptureStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastMicrophoneCaptureStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastMicrophoneCaptureStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__677537488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastMicrophoneCaptureStateChangedEventArgs):
        Array<IAppBroadcastMicrophoneCaptureStateChangedEventArgs?> = (elements as
        Array<IAppBroadcastMicrophoneCaptureStateChangedEventArgs?>).castToImpl<IAppBroadcastMicrophoneCaptureStateChangedEventArgs,IAppBroadcastMicrophoneCaptureStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppBroadcastMicrophoneCaptureStateChangedEventArgs?> =
        arrayOfNulls<IAppBroadcastMicrophoneCaptureStateChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastMicrophoneCaptureStateChangedEventArgs?>
  }
}
