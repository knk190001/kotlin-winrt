package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarToolButtonFactory.ABI::class)
@Signature("{6293bf4b-89fe-4ed0-a1a6-88d3eba917b2}")
@Guid("6293bf4b89fe4ed0a1a688d3eba917b2")
@WinRTInterface("6293bf4b89fe4ed0a1a688d3eba917b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarToolButtonFactory.ByReference::class)
public interface IInkToolbarToolButtonFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarToolButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarToolButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarToolButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarToolButtonFactory {
    public val __180733713_Ptr: Pointer?

    public val _180733713_VtblPtr: Pointer?
      get() = __180733713_Ptr?.getPointer(0)
  }

  public class IInkToolbarToolButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __180733713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarToolButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6293bf4b89fe4ed0a1a688d3eba917b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarToolButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarToolButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarToolButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarToolButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarToolButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__180733713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarToolButtonFactory):
        Array<IInkToolbarToolButtonFactory?> = (elements as
        Array<IInkToolbarToolButtonFactory?>).castToImpl<IInkToolbarToolButtonFactory,IInkToolbarToolButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarToolButtonFactory?> =
        arrayOfNulls<IInkToolbarToolButtonFactory_Impl>(size) as
        Array<IInkToolbarToolButtonFactory?>
  }
}
