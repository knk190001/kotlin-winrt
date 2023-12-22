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

@ABIMarker(IDisplayTaskPool.ABI::class)
@Signature("{c676253d-237d-5548-aafa-3e517fefef1c}")
@Guid("c676253d237d5548aafa3e517fefef1c")
@WinRTInterface("c676253d237d5548aafa3e517fefef1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTaskPool.ByReference::class)
public interface IDisplayTaskPool : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTask(): DisplayTask?

  @InterfaceMethod(1)
  public fun ExecuteTask(task: DisplayTask?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayTaskPool> {
    public override fun getValue() = ABI.makeIDisplayTaskPool(pointer.getPointer(0))

    public fun setValue(value: IDisplayTaskPool_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTaskPool {
    public val __69694049_Ptr: Pointer?

    public val _69694049_VtblPtr: Pointer?
      get() = __69694049_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTask(): DisplayTask? {
      val fnPtr = _69694049_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayTask>()
      val hr = fn.invokeHR(arrayOf(__69694049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayTask>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ExecuteTask(task: DisplayTask?): Unit {
      val fnPtr = _69694049_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__69694049_Ptr, marshalToNative(task),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayTaskPool_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __69694049_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTaskPool, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c676253d237d5548aafa3e517fefef1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTaskPool(ptr: Pointer?): WithDefault = IDisplayTaskPool_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTaskPool {
      val address = segment.toRawLongValue()
      return makeIDisplayTaskPool(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTaskPool): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__69694049_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTaskPool): Array<IDisplayTaskPool?> = (elements as
        Array<IDisplayTaskPool?>).castToImpl<IDisplayTaskPool,IDisplayTaskPool_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTaskPool?> =
        arrayOfNulls<IDisplayTaskPool_Impl>(size) as Array<IDisplayTaskPool?>
  }
}
