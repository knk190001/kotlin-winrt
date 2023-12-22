package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IContinuumNavigationTransitionInfo.ABI::class)
@Signature("{c55da70f-ff2a-5fc3-81c5-9670f4d78752}")
@Guid("c55da70fff2a5fc381c59670f4d78752")
@WinRTInterface("c55da70fff2a5fc381c59670f4d78752")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContinuumNavigationTransitionInfo.ByReference::class)
public interface IContinuumNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExitElement(): UIElement?

  @InterfaceMethod(1)
  public fun put_ExitElement(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContinuumNavigationTransitionInfo> {
    public override fun getValue() =
        ABI.makeIContinuumNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: IContinuumNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContinuumNavigationTransitionInfo {
    public val __1450811634_Ptr: Pointer?

    public val _1450811634_VtblPtr: Pointer?
      get() = __1450811634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExitElement(): UIElement? {
      val fnPtr = _1450811634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1450811634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExitElement(value: UIElement?): Unit {
      val fnPtr = _1450811634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1450811634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContinuumNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1450811634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContinuumNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c55da70fff2a5fc381c59670f4d78752")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContinuumNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        IContinuumNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContinuumNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeIContinuumNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: IContinuumNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1450811634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContinuumNavigationTransitionInfo):
        Array<IContinuumNavigationTransitionInfo?> = (elements as
        Array<IContinuumNavigationTransitionInfo?>).castToImpl<IContinuumNavigationTransitionInfo,IContinuumNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContinuumNavigationTransitionInfo?> =
        arrayOfNulls<IContinuumNavigationTransitionInfo_Impl>(size) as
        Array<IContinuumNavigationTransitionInfo?>
  }
}
