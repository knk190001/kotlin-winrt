package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IUserDataTaskManager.ABI::class)
@Signature("{8451c914-e60b-48a9-9211-7fb8a56cb84c}")
@Guid("8451c914e60b48a992117fb8a56cb84c")
@WinRTInterface("8451c914e60b48a992117fb8a56cb84c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskManager.ByReference::class)
public interface IUserDataTaskManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(accessType: UserDataTaskStoreAccessType?):
      IAsyncOperation<UserDataTaskStore?>?

  @InterfaceMethod(1)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskManager> {
    public override fun getValue() = ABI.makeIUserDataTaskManager(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskManager {
    public val __643952249_Ptr: Pointer?

    public val _643952249_VtblPtr: Pointer?
      get() = __643952249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(accessType: UserDataTaskStoreAccessType?):
        IAsyncOperation<UserDataTaskStore?>? {
      val fnPtr = _643952249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTaskStore?>>()
      val hr = fn.invokeHR(arrayOf(__643952249_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTaskStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _643952249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__643952249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __643952249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8451c914e60b48a992117fb8a56cb84c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskManager(ptr: Pointer?): WithDefault = IUserDataTaskManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskManager {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskManager(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__643952249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskManager): Array<IUserDataTaskManager?> =
        (elements as
        Array<IUserDataTaskManager?>).castToImpl<IUserDataTaskManager,IUserDataTaskManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskManager?> =
        arrayOfNulls<IUserDataTaskManager_Impl>(size) as Array<IUserDataTaskManager?>
  }
}
