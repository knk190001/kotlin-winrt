package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ISlideNavigationTransitionInfo.ABI::class)
@Signature("{d6ac9d77-2e03-405f-80ed-e62beef3668f}")
@Guid("d6ac9d772e03405f80ede62beef3668f")
@WinRTInterface("d6ac9d772e03405f80ede62beef3668f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlideNavigationTransitionInfo.ByReference::class)
public interface ISlideNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlideNavigationTransitionInfo> {
    public override fun getValue() = ABI.makeISlideNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: ISlideNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlideNavigationTransitionInfo {
    public val __155921054_Ptr: Pointer?

    public val _155921054_VtblPtr: Pointer?
      get() = __155921054_Ptr?.getPointer(0)
  }

  public class ISlideNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155921054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlideNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6ac9d772e03405f80ede62beef3668f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlideNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        ISlideNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlideNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeISlideNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ISlideNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155921054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlideNavigationTransitionInfo):
        Array<ISlideNavigationTransitionInfo?> = (elements as
        Array<ISlideNavigationTransitionInfo?>).castToImpl<ISlideNavigationTransitionInfo,ISlideNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlideNavigationTransitionInfo?> =
        arrayOfNulls<ISlideNavigationTransitionInfo_Impl>(size) as
        Array<ISlideNavigationTransitionInfo?>
  }
}
