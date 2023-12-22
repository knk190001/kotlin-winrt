package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IUserDataTask.ABI::class)
@Signature("{7c6585d1-e0d4-4f99-aee2-bc2d5ddadf4c}")
@Guid("7c6585d1e0d44f99aee2bc2d5ddadf4c")
@WinRTInterface("7c6585d1e0d44f99aee2bc2d5ddadf4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTask.ByReference::class)
public interface IUserDataTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_ListId(): String?

  @InterfaceMethod(2)
  public fun get_RemoteId(): String?

  @InterfaceMethod(3)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_CompletedDate(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_CompletedDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_Details(): String?

  @InterfaceMethod(7)
  public fun put_Details(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_DetailsKind(): UserDataTaskDetailsKind?

  @InterfaceMethod(9)
  public fun put_DetailsKind(value: UserDataTaskDetailsKind?): Unit

  @InterfaceMethod(10)
  public fun get_DueDate(): IReference<DateTime?>?

  @InterfaceMethod(11)
  public fun put_DueDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(12)
  public fun get_Kind(): UserDataTaskKind?

  @InterfaceMethod(13)
  public fun get_Priority(): UserDataTaskPriority?

  @InterfaceMethod(14)
  public fun put_Priority(value: UserDataTaskPriority?): Unit

  @InterfaceMethod(15)
  public fun get_RecurrenceProperties(): UserDataTaskRecurrenceProperties?

  @InterfaceMethod(16)
  public fun put_RecurrenceProperties(value: UserDataTaskRecurrenceProperties?): Unit

  @InterfaceMethod(17)
  public fun get_RegenerationProperties(): UserDataTaskRegenerationProperties?

  @InterfaceMethod(18)
  public fun put_RegenerationProperties(value: UserDataTaskRegenerationProperties?): Unit

  @InterfaceMethod(19)
  public fun get_Reminder(): IReference<DateTime?>?

  @InterfaceMethod(20)
  public fun put_Reminder(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(21)
  public fun get_Sensitivity(): UserDataTaskSensitivity?

  @InterfaceMethod(22)
  public fun put_Sensitivity(value: UserDataTaskSensitivity?): Unit

  @InterfaceMethod(23)
  public fun get_Subject(): String?

  @InterfaceMethod(24)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(25)
  public fun get_StartDate(): IReference<DateTime?>?

  @InterfaceMethod(26)
  public fun put_StartDate(value: IReference<DateTime?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserDataTask>
      {
    public override fun getValue() = ABI.makeIUserDataTask(pointer.getPointer(0))

    public fun setValue(value: IUserDataTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTask {
    public val __819828076_Ptr: Pointer?

    public val _819828076_VtblPtr: Pointer?
      get() = __819828076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ListId(): String? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoteId(): String? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CompletedDate(): IReference<DateTime?>? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CompletedDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Details(): String? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Details(value: String?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DetailsKind(): UserDataTaskDetailsKind? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskDetailsKind>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskDetailsKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DetailsKind(value: UserDataTaskDetailsKind?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DueDate(): IReference<DateTime?>? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DueDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Kind(): UserDataTaskKind? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskKind>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Priority(): UserDataTaskPriority? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskPriority>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Priority(value: UserDataTaskPriority?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_RecurrenceProperties(): UserDataTaskRecurrenceProperties? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskRecurrenceProperties>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskRecurrenceProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_RecurrenceProperties(value: UserDataTaskRecurrenceProperties?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_RegenerationProperties(): UserDataTaskRegenerationProperties? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskRegenerationProperties>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskRegenerationProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_RegenerationProperties(value: UserDataTaskRegenerationProperties?):
        Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_Reminder(): IReference<DateTime?>? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_Reminder(value: IReference<DateTime?>?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_Sensitivity(): UserDataTaskSensitivity? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskSensitivity>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskSensitivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_Sensitivity(value: UserDataTaskSensitivity?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_Subject(): String? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_StartDate(): IReference<DateTime?>? {
      val fnPtr = _819828076_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_StartDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _819828076_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__819828076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __819828076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c6585d1e0d44f99aee2bc2d5ddadf4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTask(ptr: Pointer?): WithDefault = IUserDataTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTask {
      val address = segment.toRawLongValue()
      return makeIUserDataTask(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__819828076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTask): Array<IUserDataTask?> = (elements as
        Array<IUserDataTask?>).castToImpl<IUserDataTask,IUserDataTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTask?> =
        arrayOfNulls<IUserDataTask_Impl>(size) as Array<IUserDataTask?>
  }
}
