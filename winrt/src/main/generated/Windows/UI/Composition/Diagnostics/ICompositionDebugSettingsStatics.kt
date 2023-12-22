package Windows.UI.Composition.Diagnostics

import Windows.UI.Composition.Compositor
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

@ABIMarker(ICompositionDebugSettingsStatics.ABI::class)
@Signature("{64ec1f1e-6af8-4af8-b814-c870fd5a9505}")
@Guid("64ec1f1e6af84af8b814c870fd5a9505")
@WinRTInterface("64ec1f1e6af84af8b814c870fd5a9505")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionDebugSettingsStatics.ByReference::class)
public interface ICompositionDebugSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetSettings(compositor: Compositor?): CompositionDebugSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionDebugSettingsStatics> {
    public override fun getValue() = ABI.makeICompositionDebugSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionDebugSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionDebugSettingsStatics {
    public val __800450249_Ptr: Pointer?

    public val _800450249_VtblPtr: Pointer?
      get() = __800450249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetSettings(compositor: Compositor?): CompositionDebugSettings? {
      val fnPtr = _800450249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDebugSettings>()
      val hr = fn.invokeHR(arrayOf(__800450249_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDebugSettings>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionDebugSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __800450249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionDebugSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64ec1f1e6af84af8b814c870fd5a9505")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionDebugSettingsStatics(ptr: Pointer?): WithDefault =
        ICompositionDebugSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionDebugSettingsStatics {
      val address = segment.toRawLongValue()
      return makeICompositionDebugSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionDebugSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__800450249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionDebugSettingsStatics):
        Array<ICompositionDebugSettingsStatics?> = (elements as
        Array<ICompositionDebugSettingsStatics?>).castToImpl<ICompositionDebugSettingsStatics,ICompositionDebugSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionDebugSettingsStatics?> =
        arrayOfNulls<ICompositionDebugSettingsStatics_Impl>(size) as
        Array<ICompositionDebugSettingsStatics?>
  }
}
