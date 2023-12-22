package Microsoft.UI.Xaml.Input

import Microsoft.UI.Input.ManipulationDelta
import Microsoft.UI.Input.ManipulationVelocities
import Microsoft.UI.Input.PointerDeviceType
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

@ABIMarker(IManipulationInertiaStartingRoutedEventArgs.ABI::class)
@Signature("{17d510be-5514-5952-9afd-959b60ab9394}")
@Guid("17d510be551459529afd959b60ab9394")
@WinRTInterface("17d510be551459529afd959b60ab9394")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationInertiaStartingRoutedEventArgs.ByReference::class)
public interface IManipulationInertiaStartingRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Container(): UIElement?

  @InterfaceMethod(1)
  public fun get_ExpansionBehavior(): InertiaExpansionBehavior?

  @InterfaceMethod(2)
  public fun put_ExpansionBehavior(value: InertiaExpansionBehavior?): Unit

  @InterfaceMethod(3)
  public fun get_RotationBehavior(): InertiaRotationBehavior?

  @InterfaceMethod(4)
  public fun put_RotationBehavior(value: InertiaRotationBehavior?): Unit

  @InterfaceMethod(5)
  public fun get_TranslationBehavior(): InertiaTranslationBehavior?

  @InterfaceMethod(6)
  public fun put_TranslationBehavior(value: InertiaTranslationBehavior?): Unit

  @InterfaceMethod(7)
  public fun get_Handled(): Boolean

  @InterfaceMethod(8)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(10)
  public fun get_Delta(): ManipulationDelta?

  @InterfaceMethod(11)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(12)
  public fun get_Velocities(): ManipulationVelocities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationInertiaStartingRoutedEventArgs> {
    public override fun getValue() =
        ABI.makeIManipulationInertiaStartingRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationInertiaStartingRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationInertiaStartingRoutedEventArgs {
    public val __1329207146_Ptr: Pointer?

    public val _1329207146_VtblPtr: Pointer?
      get() = __1329207146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Container(): UIElement? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExpansionBehavior(): InertiaExpansionBehavior? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InertiaExpansionBehavior>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InertiaExpansionBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ExpansionBehavior(value: InertiaExpansionBehavior?): Unit {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_RotationBehavior(): InertiaRotationBehavior? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InertiaRotationBehavior>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InertiaRotationBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_RotationBehavior(value: InertiaRotationBehavior?): Unit {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_TranslationBehavior(): InertiaTranslationBehavior? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InertiaTranslationBehavior>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InertiaTranslationBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_TranslationBehavior(value: InertiaTranslationBehavior?): Unit {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Delta(): ManipulationDelta? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Velocities(): ManipulationVelocities? {
      val fnPtr = _1329207146_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationVelocities>()
      val hr = fn.invokeHR(arrayOf(__1329207146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationVelocities>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationInertiaStartingRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1329207146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationInertiaStartingRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17d510be551459529afd959b60ab9394")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationInertiaStartingRoutedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationInertiaStartingRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IManipulationInertiaStartingRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationInertiaStartingRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationInertiaStartingRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1329207146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationInertiaStartingRoutedEventArgs):
        Array<IManipulationInertiaStartingRoutedEventArgs?> = (elements as
        Array<IManipulationInertiaStartingRoutedEventArgs?>).castToImpl<IManipulationInertiaStartingRoutedEventArgs,IManipulationInertiaStartingRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationInertiaStartingRoutedEventArgs?> =
        arrayOfNulls<IManipulationInertiaStartingRoutedEventArgs_Impl>(size) as
        Array<IManipulationInertiaStartingRoutedEventArgs?>
  }
}
