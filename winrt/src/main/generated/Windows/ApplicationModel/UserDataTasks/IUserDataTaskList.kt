package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.IAsyncAction
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskList.ABI::class)
@Signature("{49412e39-7c1d-4df1-bed3-314b7cbf5e4e}")
@Guid("49412e397c1d4df1bed3314b7cbf5e4e")
@WinRTInterface("49412e397c1d4df1bed3314b7cbf5e4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskList.ByReference::class)
public interface IUserDataTaskList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SourceDisplayName(): String?

  @InterfaceMethod(5)
  public fun get_OtherAppReadAccess(): UserDataTaskListOtherAppReadAccess?

  @InterfaceMethod(6)
  public fun put_OtherAppReadAccess(value: UserDataTaskListOtherAppReadAccess?): Unit

  @InterfaceMethod(7)
  public fun get_OtherAppWriteAccess(): UserDataTaskListOtherAppWriteAccess?

  @InterfaceMethod(8)
  public fun put_OtherAppWriteAccess(value: UserDataTaskListOtherAppWriteAccess?): Unit

  @InterfaceMethod(9)
  public fun get_LimitedWriteOperations(): UserDataTaskListLimitedWriteOperations?

  @InterfaceMethod(10)
  public fun get_SyncManager(): UserDataTaskListSyncManager?

  @InterfaceMethod(11)
  public fun RegisterSyncManagerAsync(): IAsyncAction?

  @InterfaceMethod(12)
  public fun GetTaskReader(): UserDataTaskReader?

  @InterfaceMethod(13)
  public fun GetTaskReader(options: UserDataTaskQueryOptions?): UserDataTaskReader?

  @InterfaceMethod(14)
  public fun GetTaskAsync(userDataTask: String?): IAsyncOperation<UserDataTask?>?

  @InterfaceMethod(15)
  public fun SaveTaskAsync(userDataTask: UserDataTask?): IAsyncAction?

  @InterfaceMethod(16)
  public fun DeleteTaskAsync(userDataTaskId: String?): IAsyncAction?

  @InterfaceMethod(17)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(18)
  public fun SaveAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskList> {
    public override fun getValue() = ABI.makeIUserDataTaskList(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskList {
    public val __1277633874_Ptr: Pointer?

    public val _1277633874_VtblPtr: Pointer?
      get() = __1277633874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SourceDisplayName(): String? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_OtherAppReadAccess(): UserDataTaskListOtherAppReadAccess? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_OtherAppReadAccess(value: UserDataTaskListOtherAppReadAccess?): Unit {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_OtherAppWriteAccess(): UserDataTaskListOtherAppWriteAccess? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListOtherAppWriteAccess>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListOtherAppWriteAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_OtherAppWriteAccess(value: UserDataTaskListOtherAppWriteAccess?): Unit {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_LimitedWriteOperations(): UserDataTaskListLimitedWriteOperations? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListLimitedWriteOperations>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListLimitedWriteOperations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SyncManager(): UserDataTaskListSyncManager? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListSyncManager>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListSyncManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun RegisterSyncManagerAsync(): IAsyncAction? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetTaskReader(): UserDataTaskReader? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskReader>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetTaskReader(options: UserDataTaskQueryOptions?): UserDataTaskReader? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskReader>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetTaskAsync(userDataTask: String?): IAsyncOperation<UserDataTask?>? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTask?>>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(userDataTask), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTask?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun SaveTaskAsync(userDataTask: UserDataTask?): IAsyncAction? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(userDataTask), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun DeleteTaskAsync(userDataTaskId: String?): IAsyncAction? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr, marshalToNative(userDataTaskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1277633874_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1277633874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1277633874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49412e397c1d4df1bed3314b7cbf5e4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskList(ptr: Pointer?): WithDefault = IUserDataTaskList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskList {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskList(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1277633874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskList): Array<IUserDataTaskList?> = (elements
        as Array<IUserDataTaskList?>).castToImpl<IUserDataTaskList,IUserDataTaskList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskList?> =
        arrayOfNulls<IUserDataTaskList_Impl>(size) as Array<IUserDataTaskList?>
  }
}
