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

@ABIMarker(IEntranceNavigationTransitionInfo.ABI::class)
@Signature("{720a256b-1c8a-41ee-82ec-8a87c0cf47da}")
@Guid("720a256b1c8a41ee82ec8a87c0cf47da")
@WinRTInterface("720a256b1c8a41ee82ec8a87c0cf47da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEntranceNavigationTransitionInfo.ByReference::class)
public interface IEntranceNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEntranceNavigationTransitionInfo> {
    public override fun getValue() =
        ABI.makeIEntranceNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: IEntranceNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEntranceNavigationTransitionInfo {
    public val __354758221_Ptr: Pointer?

    public val _354758221_VtblPtr: Pointer?
      get() = __354758221_Ptr?.getPointer(0)
  }

  public class IEntranceNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __354758221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEntranceNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("720a256b1c8a41ee82ec8a87c0cf47da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEntranceNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        IEntranceNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEntranceNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeIEntranceNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: IEntranceNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__354758221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEntranceNavigationTransitionInfo):
        Array<IEntranceNavigationTransitionInfo?> = (elements as
        Array<IEntranceNavigationTransitionInfo?>).castToImpl<IEntranceNavigationTransitionInfo,IEntranceNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEntranceNavigationTransitionInfo?> =
        arrayOfNulls<IEntranceNavigationTransitionInfo_Impl>(size) as
        Array<IEntranceNavigationTransitionInfo?>
  }
}
