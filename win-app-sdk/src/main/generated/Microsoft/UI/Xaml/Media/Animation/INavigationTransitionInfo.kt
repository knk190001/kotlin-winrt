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

@ABIMarker(INavigationTransitionInfo.ABI::class)
@Signature("{25bb17fb-6e15-514e-b278-197537a4d990}")
@Guid("25bb17fb6e15514eb278197537a4d990")
@WinRTInterface("25bb17fb6e15514eb278197537a4d990")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationTransitionInfo.ByReference::class)
public interface INavigationTransitionInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationTransitionInfo> {
    public override fun getValue() = ABI.makeINavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: INavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationTransitionInfo {
    public val __1254482898_Ptr: Pointer?

    public val _1254482898_VtblPtr: Pointer?
      get() = __1254482898_Ptr?.getPointer(0)
  }

  public class INavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1254482898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25bb17fb6e15514eb278197537a4d990")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationTransitionInfo(ptr: Pointer?): WithDefault =
        INavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeINavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: INavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1254482898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationTransitionInfo):
        Array<INavigationTransitionInfo?> = (elements as
        Array<INavigationTransitionInfo?>).castToImpl<INavigationTransitionInfo,INavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationTransitionInfo?> =
        arrayOfNulls<INavigationTransitionInfo_Impl>(size) as Array<INavigationTransitionInfo?>
  }
}
