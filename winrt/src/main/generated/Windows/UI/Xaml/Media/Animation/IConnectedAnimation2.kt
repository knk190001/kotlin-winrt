package Windows.UI.Xaml.Media.Animation

import Windows.Foundation.Collections.IIterable
import Windows.UI.Composition.ICompositionAnimationBase
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IConnectedAnimation2.ABI::class)
@Signature("{5d2f8e5c-584b-4ddd-b668-973891431459}")
@Guid("5d2f8e5c584b4dddb668973891431459")
@WinRTInterface("5d2f8e5c584b4dddb668973891431459")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimation2.ByReference::class)
public interface IConnectedAnimation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScaleAnimationEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsScaleAnimationEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun TryStart(destination: UIElement?, coordinatedElements: IIterable<UIElement?>?): Boolean

  @InterfaceMethod(3)
  public fun SetAnimationComponent(component: ConnectedAnimationComponent?,
      animation: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimation2> {
    public override fun getValue() = ABI.makeIConnectedAnimation2(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimation2 {
    public val __1862675793_Ptr: Pointer?

    public val _1862675793_VtblPtr: Pointer?
      get() = __1862675793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScaleAnimationEnabled(): Boolean {
      val fnPtr = _1862675793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1862675793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsScaleAnimationEnabled(value: Boolean): Unit {
      val fnPtr = _1862675793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1862675793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TryStart(destination: UIElement?,
        coordinatedElements: IIterable<UIElement?>?): Boolean {
      val fnPtr = _1862675793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1862675793_Ptr, marshalToNative(destination),
          marshalToNative(coordinatedElements), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetAnimationComponent(component: ConnectedAnimationComponent?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _1862675793_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1862675793_Ptr, marshalToNative(component),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConnectedAnimation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1862675793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d2f8e5c584b4dddb668973891431459")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimation2(ptr: Pointer?): WithDefault = IConnectedAnimation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimation2 {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimation2(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1862675793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimation2): Array<IConnectedAnimation2?> =
        (elements as
        Array<IConnectedAnimation2?>).castToImpl<IConnectedAnimation2,IConnectedAnimation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimation2?> =
        arrayOfNulls<IConnectedAnimation2_Impl>(size) as Array<IConnectedAnimation2?>
  }
}
