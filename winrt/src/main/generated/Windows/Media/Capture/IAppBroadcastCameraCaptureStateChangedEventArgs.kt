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

@ABIMarker(IAppBroadcastCameraCaptureStateChangedEventArgs.ABI::class)
@Signature("{1e334cd0-b882-4b88-8692-05999aceb70f}")
@Guid("1e334cd0b8824b88869205999aceb70f")
@WinRTInterface("1e334cd0b8824b88869205999aceb70f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastCameraCaptureStateChangedEventArgs.ByReference::class)
public interface IAppBroadcastCameraCaptureStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): AppBroadcastCameraCaptureState?

  @InterfaceMethod(1)
  public fun get_ErrorCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastCameraCaptureStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastCameraCaptureStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastCameraCaptureStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastCameraCaptureStateChangedEventArgs {
    public val __1502140587_Ptr: Pointer?

    public val _1502140587_VtblPtr: Pointer?
      get() = __1502140587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): AppBroadcastCameraCaptureState? {
      val fnPtr = _1502140587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastCameraCaptureState>()
      val hr = fn.invokeHR(arrayOf(__1502140587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastCameraCaptureState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _1502140587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1502140587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastCameraCaptureStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1502140587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastCameraCaptureStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e334cd0b8824b88869205999aceb70f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastCameraCaptureStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastCameraCaptureStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastCameraCaptureStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastCameraCaptureStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastCameraCaptureStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1502140587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastCameraCaptureStateChangedEventArgs):
        Array<IAppBroadcastCameraCaptureStateChangedEventArgs?> = (elements as
        Array<IAppBroadcastCameraCaptureStateChangedEventArgs?>).castToImpl<IAppBroadcastCameraCaptureStateChangedEventArgs,IAppBroadcastCameraCaptureStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastCameraCaptureStateChangedEventArgs?>
        = arrayOfNulls<IAppBroadcastCameraCaptureStateChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastCameraCaptureStateChangedEventArgs?>
  }
}
