package Windows.ApplicationModel.UserDataTasks.DataProvider

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskListDeleteTaskRequestEventArgs.ABI::class)
@Signature("{6063dad9-f562-4145-8efe-d50078c92b7f}")
@Guid("6063dad9f56241458efed50078c92b7f")
@WinRTInterface("6063dad9f56241458efed50078c92b7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListDeleteTaskRequestEventArgs.ByReference::class)
public interface IUserDataTaskListDeleteTaskRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): UserDataTaskListDeleteTaskRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListDeleteTaskRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListDeleteTaskRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListDeleteTaskRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListDeleteTaskRequestEventArgs {
    public val __256762561_Ptr: Pointer?

    public val _256762561_VtblPtr: Pointer?
      get() = __256762561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): UserDataTaskListDeleteTaskRequest? {
      val fnPtr = _256762561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListDeleteTaskRequest>()
      val hr = fn.invokeHR(arrayOf(__256762561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListDeleteTaskRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _256762561_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__256762561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListDeleteTaskRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __256762561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListDeleteTaskRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6063dad9f56241458efed50078c92b7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListDeleteTaskRequestEventArgs(ptr: Pointer?): WithDefault =
        IUserDataTaskListDeleteTaskRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListDeleteTaskRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListDeleteTaskRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListDeleteTaskRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__256762561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListDeleteTaskRequestEventArgs):
        Array<IUserDataTaskListDeleteTaskRequestEventArgs?> = (elements as
        Array<IUserDataTaskListDeleteTaskRequestEventArgs?>).castToImpl<IUserDataTaskListDeleteTaskRequestEventArgs,IUserDataTaskListDeleteTaskRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListDeleteTaskRequestEventArgs?> =
        arrayOfNulls<IUserDataTaskListDeleteTaskRequestEventArgs_Impl>(size) as
        Array<IUserDataTaskListDeleteTaskRequestEventArgs?>
  }
}
