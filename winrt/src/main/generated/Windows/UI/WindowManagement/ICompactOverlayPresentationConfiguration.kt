package Windows.UI.WindowManagement

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

@ABIMarker(ICompactOverlayPresentationConfiguration.ABI::class)
@Signature("{a7e5750f-5730-56c6-8e1f-d63ff4d7980d}")
@Guid("a7e5750f573056c68e1fd63ff4d7980d")
@WinRTInterface("a7e5750f573056c68e1fd63ff4d7980d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompactOverlayPresentationConfiguration.ByReference::class)
public interface ICompactOverlayPresentationConfiguration : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompactOverlayPresentationConfiguration> {
    public override fun getValue() =
        ABI.makeICompactOverlayPresentationConfiguration(pointer.getPointer(0))

    public fun setValue(value: ICompactOverlayPresentationConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompactOverlayPresentationConfiguration {
    public val __654675256_Ptr: Pointer?

    public val _654675256_VtblPtr: Pointer?
      get() = __654675256_Ptr?.getPointer(0)
  }

  public class ICompactOverlayPresentationConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654675256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompactOverlayPresentationConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7e5750f573056c68e1fd63ff4d7980d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompactOverlayPresentationConfiguration(ptr: Pointer?): WithDefault =
        ICompactOverlayPresentationConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompactOverlayPresentationConfiguration {
      val address = segment.toRawLongValue()
      return makeICompactOverlayPresentationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ICompactOverlayPresentationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654675256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompactOverlayPresentationConfiguration):
        Array<ICompactOverlayPresentationConfiguration?> = (elements as
        Array<ICompactOverlayPresentationConfiguration?>).castToImpl<ICompactOverlayPresentationConfiguration,ICompactOverlayPresentationConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompactOverlayPresentationConfiguration?> =
        arrayOfNulls<ICompactOverlayPresentationConfiguration_Impl>(size) as
        Array<ICompactOverlayPresentationConfiguration?>
  }
}
