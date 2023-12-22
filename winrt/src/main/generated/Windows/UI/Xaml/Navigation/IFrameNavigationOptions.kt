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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameNavigationOptions.ABI::class)
@Signature("{b539ad2a-9fb7-520a-8f41-57a50c59cf92}")
@Guid("b539ad2a9fb7520a8f4157a50c59cf92")
@WinRTInterface("b539ad2a9fb7520a8f4157a50c59cf92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameNavigationOptions.ByReference::class)
public interface IFrameNavigationOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsNavigationStackEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsNavigationStackEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TransitionInfoOverride(): NavigationTransitionInfo?

  @InterfaceMethod(3)
  public fun put_TransitionInfoOverride(value: NavigationTransitionInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameNavigationOptions> {
    public override fun getValue() = ABI.makeIFrameNavigationOptions(pointer.getPointer(0))

    public fun setValue(value: IFrameNavigationOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameNavigationOptions {
    public val __125480891_Ptr: Pointer?

    public val _125480891_VtblPtr: Pointer?
      get() = __125480891_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsNavigationStackEnabled(): Boolean {
      val fnPtr = _125480891_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__125480891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsNavigationStackEnabled(value: Boolean): Unit {
      val fnPtr = _125480891_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__125480891_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TransitionInfoOverride(): NavigationTransitionInfo? {
      val fnPtr = _125480891_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__125480891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TransitionInfoOverride(value: NavigationTransitionInfo?): Unit {
      val fnPtr = _125480891_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__125480891_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameNavigationOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __125480891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameNavigationOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b539ad2a9fb7520a8f4157a50c59cf92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameNavigationOptions(ptr: Pointer?): WithDefault =
        IFrameNavigationOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameNavigationOptions {
      val address = segment.toRawLongValue()
      return makeIFrameNavigationOptions(Pointer(address))
    }

    public override fun toNative(obj: IFrameNavigationOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__125480891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameNavigationOptions): Array<IFrameNavigationOptions?>
        = (elements as
        Array<IFrameNavigationOptions?>).castToImpl<IFrameNavigationOptions,IFrameNavigationOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameNavigationOptions?> =
        arrayOfNulls<IFrameNavigationOptions_Impl>(size) as Array<IFrameNavigationOptions?>
  }
}
