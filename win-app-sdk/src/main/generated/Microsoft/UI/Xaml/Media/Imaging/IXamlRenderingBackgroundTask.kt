package Microsoft.UI.Xaml.Media.Imaging

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlRenderingBackgroundTask.ABI::class)
@Signature("{7807000c-a050-5121-ac74-3322d5358e39}")
@Guid("7807000ca0505121ac743322d5358e39")
@WinRTInterface("7807000ca0505121ac743322d5358e39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRenderingBackgroundTask.ByReference::class)
public interface IXamlRenderingBackgroundTask : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlRenderingBackgroundTask> {
    public override fun getValue() = ABI.makeIXamlRenderingBackgroundTask(pointer.getPointer(0))

    public fun setValue(value: IXamlRenderingBackgroundTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRenderingBackgroundTask {
    public val __4321392_Ptr: Pointer?

    public val _4321392_VtblPtr: Pointer?
      get() = __4321392_Ptr?.getPointer(0)
  }

  public class IXamlRenderingBackgroundTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4321392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRenderingBackgroundTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7807000ca0505121ac743322d5358e39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRenderingBackgroundTask(ptr: Pointer?): WithDefault =
        IXamlRenderingBackgroundTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRenderingBackgroundTask {
      val address = segment.toRawLongValue()
      return makeIXamlRenderingBackgroundTask(Pointer(address))
    }

    public override fun toNative(obj: IXamlRenderingBackgroundTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__4321392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRenderingBackgroundTask):
        Array<IXamlRenderingBackgroundTask?> = (elements as
        Array<IXamlRenderingBackgroundTask?>).castToImpl<IXamlRenderingBackgroundTask,IXamlRenderingBackgroundTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRenderingBackgroundTask?> =
        arrayOfNulls<IXamlRenderingBackgroundTask_Impl>(size) as
        Array<IXamlRenderingBackgroundTask?>
  }
}
