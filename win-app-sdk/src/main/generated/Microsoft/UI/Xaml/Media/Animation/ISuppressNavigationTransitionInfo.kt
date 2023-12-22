package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ISuppressNavigationTransitionInfo.ABI::class)
@Signature("{3ecd2bd1-9805-5f51-bb9e-051fea8dc355}")
@Guid("3ecd2bd198055f51bb9e051fea8dc355")
@WinRTInterface("3ecd2bd198055f51bb9e051fea8dc355")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISuppressNavigationTransitionInfo.ByReference::class)
public interface ISuppressNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISuppressNavigationTransitionInfo> {
    public override fun getValue() =
        ABI.makeISuppressNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: ISuppressNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISuppressNavigationTransitionInfo {
    public val __791934119_Ptr: Pointer?

    public val _791934119_VtblPtr: Pointer?
      get() = __791934119_Ptr?.getPointer(0)
  }

  public class ISuppressNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791934119_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISuppressNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ecd2bd198055f51bb9e051fea8dc355")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISuppressNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        ISuppressNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISuppressNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeISuppressNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ISuppressNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791934119_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISuppressNavigationTransitionInfo):
        Array<ISuppressNavigationTransitionInfo?> = (elements as
        Array<ISuppressNavigationTransitionInfo?>).castToImpl<ISuppressNavigationTransitionInfo,ISuppressNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISuppressNavigationTransitionInfo?> =
        arrayOfNulls<ISuppressNavigationTransitionInfo_Impl>(size) as
        Array<ISuppressNavigationTransitionInfo?>
  }
}
