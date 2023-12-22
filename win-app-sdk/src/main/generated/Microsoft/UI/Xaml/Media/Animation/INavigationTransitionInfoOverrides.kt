package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationTransitionInfoOverrides.ABI::class)
@Signature("{3d6af190-5a56-513d-aff9-631925d0fa43}")
@Guid("3d6af1905a56513daff9631925d0fa43")
@WinRTInterface("3d6af1905a56513daff9631925d0fa43")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationTransitionInfoOverrides.ByReference::class)
public interface INavigationTransitionInfoOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetNavigationStateCore(): String?

  @InterfaceMethod(1)
  public fun SetNavigationStateCore(navigationState: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationTransitionInfoOverrides> {
    public override fun getValue() =
        ABI.makeINavigationTransitionInfoOverrides(pointer.getPointer(0))

    public fun setValue(value: INavigationTransitionInfoOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationTransitionInfoOverrides {
    public val __785987979_Ptr: Pointer?

    public val _785987979_VtblPtr: Pointer?
      get() = __785987979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetNavigationStateCore(): String? {
      val fnPtr = _785987979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__785987979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetNavigationStateCore(navigationState: String?): Unit {
      val fnPtr = _785987979_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__785987979_Ptr, marshalToNative(navigationState),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationTransitionInfoOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __785987979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationTransitionInfoOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d6af1905a56513daff9631925d0fa43")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationTransitionInfoOverrides(ptr: Pointer?): WithDefault =
        INavigationTransitionInfoOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationTransitionInfoOverrides {
      val address = segment.toRawLongValue()
      return makeINavigationTransitionInfoOverrides(Pointer(address))
    }

    public override fun toNative(obj: INavigationTransitionInfoOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__785987979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationTransitionInfoOverrides):
        Array<INavigationTransitionInfoOverrides?> = (elements as
        Array<INavigationTransitionInfoOverrides?>).castToImpl<INavigationTransitionInfoOverrides,INavigationTransitionInfoOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationTransitionInfoOverrides?> =
        arrayOfNulls<INavigationTransitionInfoOverrides_Impl>(size) as
        Array<INavigationTransitionInfoOverrides?>
  }
}
