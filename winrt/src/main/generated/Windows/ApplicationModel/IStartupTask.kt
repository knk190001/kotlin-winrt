package Windows.ApplicationModel

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

@ABIMarker(IStartupTask.ABI::class)
@Signature("{f75c23c8-b5f2-4f6c-88dd-36cb1d599d17}")
@Guid("f75c23c8b5f24f6c88dd36cb1d599d17")
@WinRTInterface("f75c23c8b5f24f6c88dd36cb1d599d17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartupTask.ByReference::class)
public interface IStartupTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestEnableAsync(): IAsyncOperation<StartupTaskState?>?

  @InterfaceMethod(1)
  public fun Disable(): Unit

  @InterfaceMethod(2)
  public fun get_State(): StartupTaskState?

  @InterfaceMethod(3)
  public fun get_TaskId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStartupTask> {
    public override fun getValue() = ABI.makeIStartupTask(pointer.getPointer(0))

    public fun setValue(value: IStartupTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartupTask {
    public val __243320733_Ptr: Pointer?

    public val _243320733_VtblPtr: Pointer?
      get() = __243320733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestEnableAsync(): IAsyncOperation<StartupTaskState?>? {
      val fnPtr = _243320733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StartupTaskState?>>()
      val hr = fn.invokeHR(arrayOf(__243320733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StartupTaskState?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Disable(): Unit {
      val fnPtr = _243320733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__243320733_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_State(): StartupTaskState? {
      val fnPtr = _243320733_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StartupTaskState>()
      val hr = fn.invokeHR(arrayOf(__243320733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StartupTaskState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TaskId(): String? {
      val fnPtr = _243320733_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__243320733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStartupTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __243320733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartupTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f75c23c8b5f24f6c88dd36cb1d599d17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartupTask(ptr: Pointer?): WithDefault = IStartupTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartupTask {
      val address = segment.toRawLongValue()
      return makeIStartupTask(Pointer(address))
    }

    public override fun toNative(obj: IStartupTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__243320733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartupTask): Array<IStartupTask?> = (elements as
        Array<IStartupTask?>).castToImpl<IStartupTask,IStartupTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartupTask?> =
        arrayOfNulls<IStartupTask_Impl>(size) as Array<IStartupTask?>
  }
}
