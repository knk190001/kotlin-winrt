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

@ABIMarker(IAppCaptureMicrophoneCaptureStateChangedEventArgs.ABI::class)
@Signature("{324d249e-45bc-4c35-bc35-e469fc7a69e0}")
@Guid("324d249e45bc4c35bc35e469fc7a69e0")
@WinRTInterface("324d249e45bc4c35bc35e469fc7a69e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureMicrophoneCaptureStateChangedEventArgs.ByReference::class)
public interface IAppCaptureMicrophoneCaptureStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): AppCaptureMicrophoneCaptureState?

  @InterfaceMethod(1)
  public fun get_ErrorCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureMicrophoneCaptureStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppCaptureMicrophoneCaptureStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureMicrophoneCaptureStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureMicrophoneCaptureStateChangedEventArgs {
    public val __1548443061_Ptr: Pointer?

    public val _1548443061_VtblPtr: Pointer?
      get() = __1548443061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): AppCaptureMicrophoneCaptureState? {
      val fnPtr = _1548443061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureMicrophoneCaptureState>()
      val hr = fn.invokeHR(arrayOf(__1548443061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureMicrophoneCaptureState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _1548443061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1548443061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppCaptureMicrophoneCaptureStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1548443061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureMicrophoneCaptureStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("324d249e45bc4c35bc35e469fc7a69e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureMicrophoneCaptureStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppCaptureMicrophoneCaptureStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppCaptureMicrophoneCaptureStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppCaptureMicrophoneCaptureStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureMicrophoneCaptureStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1548443061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureMicrophoneCaptureStateChangedEventArgs):
        Array<IAppCaptureMicrophoneCaptureStateChangedEventArgs?> = (elements as
        Array<IAppCaptureMicrophoneCaptureStateChangedEventArgs?>).castToImpl<IAppCaptureMicrophoneCaptureStateChangedEventArgs,IAppCaptureMicrophoneCaptureStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppCaptureMicrophoneCaptureStateChangedEventArgs?> =
        arrayOfNulls<IAppCaptureMicrophoneCaptureStateChangedEventArgs_Impl>(size) as
        Array<IAppCaptureMicrophoneCaptureStateChangedEventArgs?>
  }
}
