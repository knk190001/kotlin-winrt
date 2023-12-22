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

@ABIMarker(IUserDataTaskListSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("{8ead1c12-768e-43bd-8385-5cdc351ffdea}")
@Guid("8ead1c12768e43bd83855cdc351ffdea")
@WinRTInterface("8ead1c12768e43bd83855cdc351ffdea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListSyncManagerSyncRequestEventArgs.ByReference::class)
public interface IUserDataTaskListSyncManagerSyncRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): UserDataTaskListSyncManagerSyncRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListSyncManagerSyncRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListSyncManagerSyncRequestEventArgs {
    public val __106516238_Ptr: Pointer?

    public val _106516238_VtblPtr: Pointer?
      get() = __106516238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): UserDataTaskListSyncManagerSyncRequest? {
      val fnPtr = _106516238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListSyncManagerSyncRequest>()
      val hr = fn.invokeHR(arrayOf(__106516238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListSyncManagerSyncRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _106516238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__106516238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListSyncManagerSyncRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106516238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ead1c12768e43bd83855cdc351ffdea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListSyncManagerSyncRequestEventArgs(ptr: Pointer?): WithDefault =
        IUserDataTaskListSyncManagerSyncRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListSyncManagerSyncRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__106516238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListSyncManagerSyncRequestEventArgs):
        Array<IUserDataTaskListSyncManagerSyncRequestEventArgs?> = (elements as
        Array<IUserDataTaskListSyncManagerSyncRequestEventArgs?>).castToImpl<IUserDataTaskListSyncManagerSyncRequestEventArgs,IUserDataTaskListSyncManagerSyncRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListSyncManagerSyncRequestEventArgs?>
        = arrayOfNulls<IUserDataTaskListSyncManagerSyncRequestEventArgs_Impl>(size) as
        Array<IUserDataTaskListSyncManagerSyncRequestEventArgs?>
  }
}
