package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskListLimitedWriteOperations.ABI::class)
@Signature("{7aa267f2-6078-4183-919e-4f29f19cfae9}")
@Guid("7aa267f260784183919e4f29f19cfae9")
@WinRTInterface("7aa267f260784183919e4f29f19cfae9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListLimitedWriteOperations.ByReference::class)
public interface IUserDataTaskListLimitedWriteOperations : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCompleteTaskAsync(userDataTaskId: String?): IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun TryCreateOrUpdateTaskAsync(userDataTask: UserDataTask?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun TryDeleteTaskAsync(userDataTaskId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun TrySkipOccurrenceAsync(userDataTaskId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListLimitedWriteOperations> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListLimitedWriteOperations(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListLimitedWriteOperations_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListLimitedWriteOperations {
    public val __1327653923_Ptr: Pointer?

    public val _1327653923_VtblPtr: Pointer?
      get() = __1327653923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCompleteTaskAsync(userDataTaskId: String?): IAsyncOperation<String?>? {
      val fnPtr = _1327653923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1327653923_Ptr, marshalToNative(userDataTaskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateOrUpdateTaskAsync(userDataTask: UserDataTask?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1327653923_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1327653923_Ptr, marshalToNative(userDataTask), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryDeleteTaskAsync(userDataTaskId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1327653923_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1327653923_Ptr, marshalToNative(userDataTaskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TrySkipOccurrenceAsync(userDataTaskId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1327653923_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1327653923_Ptr, marshalToNative(userDataTaskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListLimitedWriteOperations_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1327653923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListLimitedWriteOperations, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7aa267f260784183919e4f29f19cfae9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListLimitedWriteOperations(ptr: Pointer?): WithDefault =
        IUserDataTaskListLimitedWriteOperations_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListLimitedWriteOperations {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListLimitedWriteOperations(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListLimitedWriteOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1327653923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListLimitedWriteOperations):
        Array<IUserDataTaskListLimitedWriteOperations?> = (elements as
        Array<IUserDataTaskListLimitedWriteOperations?>).castToImpl<IUserDataTaskListLimitedWriteOperations,IUserDataTaskListLimitedWriteOperations_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListLimitedWriteOperations?> =
        arrayOfNulls<IUserDataTaskListLimitedWriteOperations_Impl>(size) as
        Array<IUserDataTaskListLimitedWriteOperations?>
  }
}
