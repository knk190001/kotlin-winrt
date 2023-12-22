package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Controls.ListViewBase
import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContinuumNavigationTransitionInfoStatics.ABI::class)
@Signature("{ca9006fd-f513-5f34-ad7f-49f9d7a99432}")
@Guid("ca9006fdf5135f34ad7f49f9d7a99432")
@WinRTInterface("ca9006fdf5135f34ad7f49f9d7a99432")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContinuumNavigationTransitionInfoStatics.ByReference::class)
public interface IContinuumNavigationTransitionInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExitElementProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsEntranceElementProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun GetIsEntranceElement(element: UIElement?): Boolean

  @InterfaceMethod(3)
  public fun SetIsEntranceElement(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsExitElementProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun GetIsExitElement(element: UIElement?): Boolean

  @InterfaceMethod(6)
  public fun SetIsExitElement(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_ExitElementContainerProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun GetExitElementContainer(element: ListViewBase?): Boolean

  @InterfaceMethod(9)
  public fun SetExitElementContainer(element: ListViewBase?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContinuumNavigationTransitionInfoStatics> {
    public override fun getValue() =
        ABI.makeIContinuumNavigationTransitionInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IContinuumNavigationTransitionInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContinuumNavigationTransitionInfoStatics {
    public val __7561843_Ptr: Pointer?

    public val _7561843_VtblPtr: Pointer?
      get() = __7561843_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExitElementProperty(): DependencyProperty? {
      val fnPtr = _7561843_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEntranceElementProperty(): DependencyProperty? {
      val fnPtr = _7561843_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsEntranceElement(element: UIElement?): Boolean {
      val fnPtr = _7561843_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetIsEntranceElement(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _7561843_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsExitElementProperty(): DependencyProperty? {
      val fnPtr = _7561843_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetIsExitElement(element: UIElement?): Boolean {
      val fnPtr = _7561843_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun SetIsExitElement(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _7561843_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ExitElementContainerProperty(): DependencyProperty? {
      val fnPtr = _7561843_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetExitElementContainer(element: ListViewBase?): Boolean {
      val fnPtr = _7561843_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun SetExitElementContainer(element: ListViewBase?, value: Boolean): Unit {
      val fnPtr = _7561843_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7561843_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContinuumNavigationTransitionInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7561843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContinuumNavigationTransitionInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca9006fdf5135f34ad7f49f9d7a99432")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContinuumNavigationTransitionInfoStatics(ptr: Pointer?): WithDefault =
        IContinuumNavigationTransitionInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContinuumNavigationTransitionInfoStatics {
      val address = segment.toRawLongValue()
      return makeIContinuumNavigationTransitionInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IContinuumNavigationTransitionInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7561843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContinuumNavigationTransitionInfoStatics):
        Array<IContinuumNavigationTransitionInfoStatics?> = (elements as
        Array<IContinuumNavigationTransitionInfoStatics?>).castToImpl<IContinuumNavigationTransitionInfoStatics,IContinuumNavigationTransitionInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContinuumNavigationTransitionInfoStatics?> =
        arrayOfNulls<IContinuumNavigationTransitionInfoStatics_Impl>(size) as
        Array<IContinuumNavigationTransitionInfoStatics?>
  }
}
