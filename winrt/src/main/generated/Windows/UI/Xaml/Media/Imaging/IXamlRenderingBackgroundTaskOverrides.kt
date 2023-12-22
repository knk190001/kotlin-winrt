package Windows.UI.Xaml.Media.Imaging

import Windows.ApplicationModel.Background.IBackgroundTaskInstance
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

@ABIMarker(IXamlRenderingBackgroundTaskOverrides.ABI::class)
@Signature("{9c2a6997-a908-4711-b4b2-a960db3d8e5a}")
@Guid("9c2a6997a9084711b4b2a960db3d8e5a")
@WinRTInterface("9c2a6997a9084711b4b2a960db3d8e5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRenderingBackgroundTaskOverrides.ByReference::class)
public interface IXamlRenderingBackgroundTaskOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnRun(taskInstance: IBackgroundTaskInstance?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlRenderingBackgroundTaskOverrides> {
    public override fun getValue() =
        ABI.makeIXamlRenderingBackgroundTaskOverrides(pointer.getPointer(0))

    public fun setValue(value: IXamlRenderingBackgroundTaskOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRenderingBackgroundTaskOverrides {
    public val __1974680126_Ptr: Pointer?

    public val _1974680126_VtblPtr: Pointer?
      get() = __1974680126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnRun(taskInstance: IBackgroundTaskInstance?): Unit {
      val fnPtr = _1974680126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1974680126_Ptr, marshalToNative(taskInstance),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlRenderingBackgroundTaskOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1974680126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRenderingBackgroundTaskOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c2a6997a9084711b4b2a960db3d8e5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRenderingBackgroundTaskOverrides(ptr: Pointer?): WithDefault =
        IXamlRenderingBackgroundTaskOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRenderingBackgroundTaskOverrides {
      val address = segment.toRawLongValue()
      return makeIXamlRenderingBackgroundTaskOverrides(Pointer(address))
    }

    public override fun toNative(obj: IXamlRenderingBackgroundTaskOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1974680126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRenderingBackgroundTaskOverrides):
        Array<IXamlRenderingBackgroundTaskOverrides?> = (elements as
        Array<IXamlRenderingBackgroundTaskOverrides?>).castToImpl<IXamlRenderingBackgroundTaskOverrides,IXamlRenderingBackgroundTaskOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRenderingBackgroundTaskOverrides?> =
        arrayOfNulls<IXamlRenderingBackgroundTaskOverrides_Impl>(size) as
        Array<IXamlRenderingBackgroundTaskOverrides?>
  }
}
