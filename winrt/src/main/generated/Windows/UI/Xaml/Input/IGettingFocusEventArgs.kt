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

@ABIMarker(IGettingFocusEventArgs.ABI::class)
@Signature("{fa05b9ce-c67c-4be8-8fd4-c44d67877e0d}")
@Guid("fa05b9cec67c4be88fd4c44d67877e0d")
@WinRTInterface("fa05b9cec67c4be88fd4c44d67877e0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGettingFocusEventArgs.ByReference::class)
public interface IGettingFocusEventArgs : NativeMapped, IWinRTInterface {
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
      IByReference<IGettingFocusEventArgs> {
    public override fun getValue() = ABI.makeIGettingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGettingFocusEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGettingFocusEventArgs {
    public val __1162887149_Ptr: Pointer?

    public val _1162887149_VtblPtr: Pointer?
      get() = __1162887149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldFocusedElement(): DependencyObject? {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewFocusedElement(): DependencyObject? {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_NewFocusedElement(value: DependencyObject?): Unit {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Direction(): FocusNavigationDirection? {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusNavigationDirection>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusNavigationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_InputDevice(): FocusInputDeviceKind? {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusInputDeviceKind>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusInputDeviceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1162887149_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162887149_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGettingFocusEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1162887149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGettingFocusEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa05b9cec67c4be88fd4c44d67877e0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGettingFocusEventArgs(ptr: Pointer?): WithDefault =
        IGettingFocusEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGettingFocusEventArgs {
      val address = segment.toRawLongValue()
      return makeIGettingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGettingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1162887149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGettingFocusEventArgs): Array<IGettingFocusEventArgs?> =
        (elements as
        Array<IGettingFocusEventArgs?>).castToImpl<IGettingFocusEventArgs,IGettingFocusEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGettingFocusEventArgs?> =
        arrayOfNulls<IGettingFocusEventArgs_Impl>(size) as Array<IGettingFocusEventArgs?>
  }
}
