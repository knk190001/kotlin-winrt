package Windows.ApplicationModel.UserDataTasks.DataProvider

import Windows.ApplicationModel.UserDataTasks.UserDataTask
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

@ABIMarker(IUserDataTaskListCreateOrUpdateTaskRequest.ABI::class)
@Signature("{2133772c-55c2-4300-8279-04326e07cce4}")
@Guid("2133772c55c24300827904326e07cce4")
@WinRTInterface("2133772c55c24300827904326e07cce4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListCreateOrUpdateTaskRequest.ByReference::class)
public interface IUserDataTaskListCreateOrUpdateTaskRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskListId(): String?

  @InterfaceMethod(1)
  public fun get_Task(): UserDataTask?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(createdOrUpdatedUserDataTask: UserDataTask?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListCreateOrUpdateTaskRequest> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListCreateOrUpdateTaskRequest(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListCreateOrUpdateTaskRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListCreateOrUpdateTaskRequest {
    public val __1378796315_Ptr: Pointer?

    public val _1378796315_VtblPtr: Pointer?
      get() = __1378796315_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskListId(): String? {
      val fnPtr = _1378796315_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1378796315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Task(): UserDataTask? {
      val fnPtr = _1378796315_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTask>()
      val hr = fn.invokeHR(arrayOf(__1378796315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTask>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(createdOrUpdatedUserDataTask: UserDataTask?):
        IAsyncAction? {
      val fnPtr = _1378796315_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1378796315_Ptr, marshalToNative(createdOrUpdatedUserDataTask),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1378796315_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1378796315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListCreateOrUpdateTaskRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1378796315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListCreateOrUpdateTaskRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2133772c55c24300827904326e07cce4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListCreateOrUpdateTaskRequest(ptr: Pointer?): WithDefault =
        IUserDataTaskListCreateOrUpdateTaskRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListCreateOrUpdateTaskRequest {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListCreateOrUpdateTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListCreateOrUpdateTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1378796315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListCreateOrUpdateTaskRequest):
        Array<IUserDataTaskListCreateOrUpdateTaskRequest?> = (elements as
        Array<IUserDataTaskListCreateOrUpdateTaskRequest?>).castToImpl<IUserDataTaskListCreateOrUpdateTaskRequest,IUserDataTaskListCreateOrUpdateTaskRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListCreateOrUpdateTaskRequest?> =
        arrayOfNulls<IUserDataTaskListCreateOrUpdateTaskRequest_Impl>(size) as
        Array<IUserDataTaskListCreateOrUpdateTaskRequest?>
  }
}
