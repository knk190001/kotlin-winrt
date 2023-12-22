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

@ABIMarker(IUserDataTaskListCompleteTaskRequestEventArgs.ABI::class)
@Signature("{d77c393d-4cf2-48ad-87fd-963f0eaa7a95}")
@Guid("d77c393d4cf248ad87fd963f0eaa7a95")
@WinRTInterface("d77c393d4cf248ad87fd963f0eaa7a95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListCompleteTaskRequestEventArgs.ByReference::class)
public interface IUserDataTaskListCompleteTaskRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): UserDataTaskListCompleteTaskRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListCompleteTaskRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListCompleteTaskRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListCompleteTaskRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListCompleteTaskRequestEventArgs {
    public val __1518866419_Ptr: Pointer?

    public val _1518866419_VtblPtr: Pointer?
      get() = __1518866419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): UserDataTaskListCompleteTaskRequest? {
      val fnPtr = _1518866419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListCompleteTaskRequest>()
      val hr = fn.invokeHR(arrayOf(__1518866419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListCompleteTaskRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1518866419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1518866419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListCompleteTaskRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1518866419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListCompleteTaskRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d77c393d4cf248ad87fd963f0eaa7a95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListCompleteTaskRequestEventArgs(ptr: Pointer?): WithDefault =
        IUserDataTaskListCompleteTaskRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListCompleteTaskRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListCompleteTaskRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListCompleteTaskRequestEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1518866419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListCompleteTaskRequestEventArgs):
        Array<IUserDataTaskListCompleteTaskRequestEventArgs?> = (elements as
        Array<IUserDataTaskListCompleteTaskRequestEventArgs?>).castToImpl<IUserDataTaskListCompleteTaskRequestEventArgs,IUserDataTaskListCompleteTaskRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListCompleteTaskRequestEventArgs?> =
        arrayOfNulls<IUserDataTaskListCompleteTaskRequestEventArgs_Impl>(size) as
        Array<IUserDataTaskListCompleteTaskRequestEventArgs?>
  }
}
