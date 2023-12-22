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

@ABIMarker(IDrillInNavigationTransitionInfo.ABI::class)
@Signature("{3b86201a-45d3-463b-939e-c8595f439bcc}")
@Guid("3b86201a45d3463b939ec8595f439bcc")
@WinRTInterface("3b86201a45d3463b939ec8595f439bcc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDrillInNavigationTransitionInfo.ByReference::class)
public interface IDrillInNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDrillInNavigationTransitionInfo> {
    public override fun getValue() = ABI.makeIDrillInNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: IDrillInNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDrillInNavigationTransitionInfo {
    public val __1574851823_Ptr: Pointer?

    public val _1574851823_VtblPtr: Pointer?
      get() = __1574851823_Ptr?.getPointer(0)
  }

  public class IDrillInNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1574851823_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDrillInNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b86201a45d3463b939ec8595f439bcc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDrillInNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        IDrillInNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDrillInNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeIDrillInNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: IDrillInNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1574851823_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDrillInNavigationTransitionInfo):
        Array<IDrillInNavigationTransitionInfo?> = (elements as
        Array<IDrillInNavigationTransitionInfo?>).castToImpl<IDrillInNavigationTransitionInfo,IDrillInNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDrillInNavigationTransitionInfo?> =
        arrayOfNulls<IDrillInNavigationTransitionInfo_Impl>(size) as
        Array<IDrillInNavigationTransitionInfo?>
  }
}
