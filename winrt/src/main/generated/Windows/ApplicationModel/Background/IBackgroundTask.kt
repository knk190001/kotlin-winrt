package Windows.ApplicationModel.Background

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

@ABIMarker(IBackgroundTask.ABI::class)
@Signature("{7d13d534-fd12-43ce-8c22-ea1ff13c06df}")
@Guid("7d13d534fd1243ce8c22ea1ff13c06df")
@WinRTInterface("7d13d534fd1243ce8c22ea1ff13c06df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTask.ByReference::class)
public interface IBackgroundTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Run(taskInstance: IBackgroundTaskInstance?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTask> {
    public override fun getValue() = ABI.makeIBackgroundTask(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTask {
    public val __856964092_Ptr: Pointer?

    public val _856964092_VtblPtr: Pointer?
      get() = __856964092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Run(taskInstance: IBackgroundTaskInstance?): Unit {
      val fnPtr = _856964092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__856964092_Ptr, marshalToNative(taskInstance),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856964092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d13d534fd1243ce8c22ea1ff13c06df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTask(ptr: Pointer?): WithDefault = IBackgroundTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTask {
      val address = segment.toRawLongValue()
      return makeIBackgroundTask(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856964092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTask): Array<IBackgroundTask?> = (elements as
        Array<IBackgroundTask?>).castToImpl<IBackgroundTask,IBackgroundTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTask?> =
        arrayOfNulls<IBackgroundTask_Impl>(size) as Array<IBackgroundTask?>
  }
}
