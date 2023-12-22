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

@ABIMarker(ISuppressNavigationTransitionInfo.ABI::class)
@Signature("{244d7b0c-b1b7-4871-9d3e-d56203a3a5b4}")
@Guid("244d7b0cb1b748719d3ed56203a3a5b4")
@WinRTInterface("244d7b0cb1b748719d3ed56203a3a5b4")
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
    public val __322264910_Ptr: Pointer?

    public val _322264910_VtblPtr: Pointer?
      get() = __322264910_Ptr?.getPointer(0)
  }

  public class ISuppressNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __322264910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISuppressNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("244d7b0cb1b748719d3ed56203a3a5b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISuppressNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        ISuppressNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISuppressNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeISuppressNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ISuppressNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__322264910_Ptr))
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
