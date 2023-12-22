package Windows.UI.Xaml.Input

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.FocusState
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

@ABIMarker(ILosingFocusEventArgs.ABI::class)
@Signature("{f9f683c7-d789-472b-aa93-6d4105e6dabe}")
@Guid("f9f683c7d789472baa936d4105e6dabe")
@WinRTInterface("f9f683c7d789472baa936d4105e6dabe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILosingFocusEventArgs.ByReference::class)
public interface ILosingFocusEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldFocusedElement(): DependencyObject?

  @InterfaceMethod(1)
  public fun get_NewFocusedElement(): DependencyObject?

  @InterfaceMethod(2)
  public fun put_NewFocusedElement(value: DependencyObject?): Unit

  @InterfaceMethod(3)
  public fun get_FocusState(): FocusState?

  @InterfaceMethod(4)
  public fun get_Direction(): FocusNavigationDirection?

  @InterfaceMethod(5)
  public fun get_Handled(): Boolean

  @InterfaceMethod(6)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_InputDevice(): FocusInputDeviceKind?

  @InterfaceMethod(8)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(9)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILosingFocusEventArgs> {
    public override fun getValue() = ABI.makeILosingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILosingFocusEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILosingFocusEventArgs {
    public val __1664528473_Ptr: Pointer?

    public val _1664528473_VtblPtr: Pointer?
      get() = __1664528473_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldFocusedElement(): DependencyObject? {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewFocusedElement(): DependencyObject? {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_NewFocusedElement(value: DependencyObject?): Unit {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Direction(): FocusNavigationDirection? {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusNavigationDirection>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusNavigationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_InputDevice(): FocusInputDeviceKind? {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusInputDeviceKind>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusInputDeviceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1664528473_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1664528473_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILosingFocusEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1664528473_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILosingFocusEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9f683c7d789472baa936d4105e6dabe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILosingFocusEventArgs(ptr: Pointer?): WithDefault =
        ILosingFocusEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILosingFocusEventArgs {
      val address = segment.toRawLongValue()
      return makeILosingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILosingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1664528473_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILosingFocusEventArgs): Array<ILosingFocusEventArgs?> =
        (elements as
        Array<ILosingFocusEventArgs?>).castToImpl<ILosingFocusEventArgs,ILosingFocusEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILosingFocusEventArgs?> =
        arrayOfNulls<ILosingFocusEventArgs_Impl>(size) as Array<ILosingFocusEventArgs?>
  }
}
