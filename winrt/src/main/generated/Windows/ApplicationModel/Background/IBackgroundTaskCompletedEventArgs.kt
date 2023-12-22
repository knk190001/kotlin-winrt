package Windows.ApplicationModel.Background

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

@ABIMarker(IBackgroundTaskCompletedEventArgs.ABI::class)
@Signature("{565d25cf-f209-48f4-9967-2b184f7bfbf0}")
@Guid("565d25cff20948f499672b184f7bfbf0")
@WinRTInterface("565d25cff20948f499672b184f7bfbf0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskCompletedEventArgs.ByReference::class)
public interface IBackgroundTaskCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun CheckResult(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIBackgroundTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskCompletedEventArgs {
    public val __2089873328_Ptr: Pointer?

    public val _2089873328_VtblPtr: Pointer?
      get() = __2089873328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2089873328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2089873328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CheckResult(): Unit {
      val fnPtr = _2089873328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2089873328_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTaskCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2089873328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("565d25cff20948f499672b184f7bfbf0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskCompletedEventArgs(ptr: Pointer?): WithDefault =
        IBackgroundTaskCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2089873328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskCompletedEventArgs):
        Array<IBackgroundTaskCompletedEventArgs?> = (elements as
        Array<IBackgroundTaskCompletedEventArgs?>).castToImpl<IBackgroundTaskCompletedEventArgs,IBackgroundTaskCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskCompletedEventArgs?> =
        arrayOfNulls<IBackgroundTaskCompletedEventArgs_Impl>(size) as
        Array<IBackgroundTaskCompletedEventArgs?>
  }
}
