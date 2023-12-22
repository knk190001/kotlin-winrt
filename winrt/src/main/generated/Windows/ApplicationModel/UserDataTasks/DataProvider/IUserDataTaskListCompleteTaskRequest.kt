package Windows.ApplicationModel.UserDataTasks.DataProvider

import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskListCompleteTaskRequest.ABI::class)
@Signature("{f65e14a3-1a42-49da-8552-2873e52c55eb}")
@Guid("f65e14a31a4249da85522873e52c55eb")
@WinRTInterface("f65e14a31a4249da85522873e52c55eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListCompleteTaskRequest.ByReference::class)
public interface IUserDataTaskListCompleteTaskRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskListId(): String?

  @InterfaceMethod(1)
  public fun get_TaskId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(completedTaskId: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListCompleteTaskRequest> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListCompleteTaskRequest(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListCompleteTaskRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListCompleteTaskRequest {
    public val __1893222826_Ptr: Pointer?

    public val _1893222826_VtblPtr: Pointer?
      get() = __1893222826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskListId(): String? {
      val fnPtr = _1893222826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1893222826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TaskId(): String? {
      val fnPtr = _1893222826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1893222826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(completedTaskId: String?): IAsyncAction? {
      val fnPtr = _1893222826_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1893222826_Ptr, marshalToNative(completedTaskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1893222826_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1893222826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListCompleteTaskRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1893222826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListCompleteTaskRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f65e14a31a4249da85522873e52c55eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListCompleteTaskRequest(ptr: Pointer?): WithDefault =
        IUserDataTaskListCompleteTaskRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskListCompleteTaskRequest {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListCompleteTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListCompleteTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893222826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListCompleteTaskRequest):
        Array<IUserDataTaskListCompleteTaskRequest?> = (elements as
        Array<IUserDataTaskListCompleteTaskRequest?>).castToImpl<IUserDataTaskListCompleteTaskRequest,IUserDataTaskListCompleteTaskRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListCompleteTaskRequest?> =
        arrayOfNulls<IUserDataTaskListCompleteTaskRequest_Impl>(size) as
        Array<IUserDataTaskListCompleteTaskRequest?>
  }
}
