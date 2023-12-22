package Windows.UI.Xaml

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

@ABIMarker(IApplicationInitializationCallbackParams.ABI::class)
@Signature("{751b792e-5772-4488-8b87-f547faa64474}")
@Guid("751b792e577244888b87f547faa64474")
@WinRTInterface("751b792e577244888b87f547faa64474")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationInitializationCallbackParams.ByReference::class)
public interface IApplicationInitializationCallbackParams : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationInitializationCallbackParams> {
    public override fun getValue() =
        ABI.makeIApplicationInitializationCallbackParams(pointer.getPointer(0))

    public fun setValue(value: IApplicationInitializationCallbackParams_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationInitializationCallbackParams {
    public val __1786531273_Ptr: Pointer?

    public val _1786531273_VtblPtr: Pointer?
      get() = __1786531273_Ptr?.getPointer(0)
  }

  public class IApplicationInitializationCallbackParams_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1786531273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationInitializationCallbackParams, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("751b792e577244888b87f547faa64474")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationInitializationCallbackParams(ptr: Pointer?): WithDefault =
        IApplicationInitializationCallbackParams_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IApplicationInitializationCallbackParams {
      val address = segment.toRawLongValue()
      return makeIApplicationInitializationCallbackParams(Pointer(address))
    }

    public override fun toNative(obj: IApplicationInitializationCallbackParams): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1786531273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationInitializationCallbackParams):
        Array<IApplicationInitializationCallbackParams?> = (elements as
        Array<IApplicationInitializationCallbackParams?>).castToImpl<IApplicationInitializationCallbackParams,IApplicationInitializationCallbackParams_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationInitializationCallbackParams?> =
        arrayOfNulls<IApplicationInitializationCallbackParams_Impl>(size) as
        Array<IApplicationInitializationCallbackParams?>
  }
}
