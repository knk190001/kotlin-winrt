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

@ABIMarker(IDisplayTaskPool2.ABI::class)
@Signature("{46b879b6-5d17-5955-a872-eb38003db586}")
@Guid("46b879b65d175955a872eb38003db586")
@WinRTInterface("46b879b65d175955a872eb38003db586")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTaskPool2.ByReference::class)
public interface IDisplayTaskPool2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryExecuteTask(task: DisplayTask?): DisplayTaskResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayTaskPool2> {
    public override fun getValue() = ABI.makeIDisplayTaskPool2(pointer.getPointer(0))

    public fun setValue(value: IDisplayTaskPool2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTaskPool2 {
    public val __2134451727_Ptr: Pointer?

    public val _2134451727_VtblPtr: Pointer?
      get() = __2134451727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryExecuteTask(task: DisplayTask?): DisplayTaskResult? {
      val fnPtr = _2134451727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayTaskResult>()
      val hr = fn.invokeHR(arrayOf(__2134451727_Ptr, marshalToNative(task), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayTaskResult>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayTaskPool2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2134451727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTaskPool2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46b879b65d175955a872eb38003db586")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTaskPool2(ptr: Pointer?): WithDefault = IDisplayTaskPool2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTaskPool2 {
      val address = segment.toRawLongValue()
      return makeIDisplayTaskPool2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTaskPool2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2134451727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTaskPool2): Array<IDisplayTaskPool2?> = (elements
        as Array<IDisplayTaskPool2?>).castToImpl<IDisplayTaskPool2,IDisplayTaskPool2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTaskPool2?> =
        arrayOfNulls<IDisplayTaskPool2_Impl>(size) as Array<IDisplayTaskPool2?>
  }
}
