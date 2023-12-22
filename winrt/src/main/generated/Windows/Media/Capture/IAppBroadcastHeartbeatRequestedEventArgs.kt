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

@ABIMarker(IAppBroadcastHeartbeatRequestedEventArgs.ABI::class)
@Signature("{cea54283-ee51-4dbf-9472-79a9ed4e2165}")
@Guid("cea54283ee514dbf947279a9ed4e2165")
@WinRTInterface("cea54283ee514dbf947279a9ed4e2165")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastHeartbeatRequestedEventArgs.ByReference::class)
public interface IAppBroadcastHeartbeatRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastHeartbeatRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastHeartbeatRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastHeartbeatRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastHeartbeatRequestedEventArgs {
    public val __1042415181_Ptr: Pointer?

    public val _1042415181_VtblPtr: Pointer?
      get() = __1042415181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1042415181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1042415181_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1042415181_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1042415181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastHeartbeatRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042415181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastHeartbeatRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cea54283ee514dbf947279a9ed4e2165")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastHeartbeatRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastHeartbeatRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastHeartbeatRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastHeartbeatRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastHeartbeatRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042415181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastHeartbeatRequestedEventArgs):
        Array<IAppBroadcastHeartbeatRequestedEventArgs?> = (elements as
        Array<IAppBroadcastHeartbeatRequestedEventArgs?>).castToImpl<IAppBroadcastHeartbeatRequestedEventArgs,IAppBroadcastHeartbeatRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastHeartbeatRequestedEventArgs?> =
        arrayOfNulls<IAppBroadcastHeartbeatRequestedEventArgs_Impl>(size) as
        Array<IAppBroadcastHeartbeatRequestedEventArgs?>
  }
}
