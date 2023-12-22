package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
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

@ABIMarker(INavigationEventArgs2.ABI::class)
@Signature("{dbff71d9-979a-4b2e-a49b-3bb17fdef574}")
@Guid("dbff71d9979a4b2ea49b3bb17fdef574")
@WinRTInterface("dbff71d9979a4b2ea49b3bb17fdef574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationEventArgs2.ByReference::class)
public interface INavigationEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigationTransitionInfo(): NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationEventArgs2> {
    public override fun getValue() = ABI.makeINavigationEventArgs2(pointer.getPointer(0))

    public fun setValue(value: INavigationEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationEventArgs2 {
    public val __70711059_Ptr: Pointer?

    public val _70711059_VtblPtr: Pointer?
      get() = __70711059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _70711059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__70711059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class INavigationEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __70711059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbff71d9979a4b2ea49b3bb17fdef574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationEventArgs2(ptr: Pointer?): WithDefault =
        INavigationEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationEventArgs2 {
      val address = segment.toRawLongValue()
      return makeINavigationEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: INavigationEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__70711059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationEventArgs2): Array<INavigationEventArgs2?> =
        (elements as
        Array<INavigationEventArgs2?>).castToImpl<INavigationEventArgs2,INavigationEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationEventArgs2?> =
        arrayOfNulls<INavigationEventArgs2_Impl>(size) as Array<INavigationEventArgs2?>
  }
}
