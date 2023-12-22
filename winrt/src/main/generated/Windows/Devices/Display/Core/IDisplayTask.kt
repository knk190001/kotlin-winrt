package Windows.Devices.Display.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDisplayTask.ABI::class)
@Signature("{5e087448-135b-5bb0-bf63-637f84227c7a}")
@Guid("5e087448135b5bb0bf63637f84227c7a")
@WinRTInterface("5e087448135b5bb0bf63637f84227c7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTask.ByReference::class)
public interface IDisplayTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetScanout(scanout: DisplayScanout?): Unit

  @InterfaceMethod(1)
  public fun SetWait(readyFence: DisplayFence?, readyFenceValue: WinDef.ULONG): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayTask> {
    public override fun getValue() = ABI.makeIDisplayTask(pointer.getPointer(0))

    public fun setValue(value: IDisplayTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTask {
    public val __619954011_Ptr: Pointer?

    public val _619954011_VtblPtr: Pointer?
      get() = __619954011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetScanout(scanout: DisplayScanout?): Unit {
      val fnPtr = _619954011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619954011_Ptr, marshalToNative(scanout),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetWait(readyFence: DisplayFence?, readyFenceValue: WinDef.ULONG): Unit {
      val fnPtr = _619954011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619954011_Ptr, marshalToNative(readyFence), readyFenceValue,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __619954011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e087448135b5bb0bf63637f84227c7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTask(ptr: Pointer?): WithDefault = IDisplayTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTask {
      val address = segment.toRawLongValue()
      return makeIDisplayTask(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__619954011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTask): Array<IDisplayTask?> = (elements as
        Array<IDisplayTask?>).castToImpl<IDisplayTask,IDisplayTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTask?> =
        arrayOfNulls<IDisplayTask_Impl>(size) as Array<IDisplayTask?>
  }
}
