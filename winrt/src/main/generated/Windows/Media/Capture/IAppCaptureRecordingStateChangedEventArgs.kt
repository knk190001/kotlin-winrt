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

@ABIMarker(IAppCaptureRecordingStateChangedEventArgs.ABI::class)
@Signature("{24fc8712-e305-490d-b415-6b1c9049736b}")
@Guid("24fc8712e305490db4156b1c9049736b")
@WinRTInterface("24fc8712e305490db4156b1c9049736b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureRecordingStateChangedEventArgs.ByReference::class)
public interface IAppCaptureRecordingStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): AppCaptureRecordingState?

  @InterfaceMethod(1)
  public fun get_ErrorCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureRecordingStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppCaptureRecordingStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureRecordingStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureRecordingStateChangedEventArgs {
    public val __1359424864_Ptr: Pointer?

    public val _1359424864_VtblPtr: Pointer?
      get() = __1359424864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): AppCaptureRecordingState? {
      val fnPtr = _1359424864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureRecordingState>()
      val hr = fn.invokeHR(arrayOf(__1359424864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureRecordingState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _1359424864_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1359424864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppCaptureRecordingStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359424864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureRecordingStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24fc8712e305490db4156b1c9049736b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureRecordingStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppCaptureRecordingStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppCaptureRecordingStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppCaptureRecordingStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureRecordingStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359424864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureRecordingStateChangedEventArgs):
        Array<IAppCaptureRecordingStateChangedEventArgs?> = (elements as
        Array<IAppCaptureRecordingStateChangedEventArgs?>).castToImpl<IAppCaptureRecordingStateChangedEventArgs,IAppCaptureRecordingStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureRecordingStateChangedEventArgs?> =
        arrayOfNulls<IAppCaptureRecordingStateChangedEventArgs_Impl>(size) as
        Array<IAppCaptureRecordingStateChangedEventArgs?>
  }
}
