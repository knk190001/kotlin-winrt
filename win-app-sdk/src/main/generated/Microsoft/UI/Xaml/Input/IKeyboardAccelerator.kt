package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.System.VirtualKey
import Windows.System.VirtualKeyModifiers
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

@ABIMarker(IKeyboardAccelerator.ABI::class)
@Signature("{6f8bf1e2-4e91-5cf9-a6be-4770caf3d770}")
@Guid("6f8bf1e24e915cf9a6be4770caf3d770")
@WinRTInterface("6f8bf1e24e915cf9a6be4770caf3d770")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAccelerator.ByReference::class)
public interface IKeyboardAccelerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Key(): VirtualKey?

  @InterfaceMethod(1)
  public fun put_Key(value: VirtualKey?): Unit

  @InterfaceMethod(2)
  public fun get_Modifiers(): VirtualKeyModifiers?

  @InterfaceMethod(3)
  public fun put_Modifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(4)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_ScopeOwner(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_ScopeOwner(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun add_Invoked(handler: TypedEventHandler<KeyboardAccelerator?,
      KeyboardAcceleratorInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Invoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAccelerator> {
    public override fun getValue() = ABI.makeIKeyboardAccelerator(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAccelerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAccelerator {
    public val __468220185_Ptr: Pointer?

    public val _468220185_VtblPtr: Pointer?
      get() = __468220185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Key(): VirtualKey? {
      val fnPtr = _468220185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Key(value: VirtualKey?): Unit {
      val fnPtr = _468220185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Modifiers(): VirtualKeyModifiers? {
      val fnPtr = _468220185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Modifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _468220185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _468220185_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _468220185_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ScopeOwner(): DependencyObject? {
      val fnPtr = _468220185_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ScopeOwner(value: DependencyObject?): Unit {
      val fnPtr = _468220185_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Invoked(handler: TypedEventHandler<KeyboardAccelerator?,
        KeyboardAcceleratorInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _468220185_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Invoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _468220185_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468220185_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyboardAccelerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __468220185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAccelerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f8bf1e24e915cf9a6be4770caf3d770")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAccelerator(ptr: Pointer?): WithDefault = IKeyboardAccelerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAccelerator {
      val address = segment.toRawLongValue()
      return makeIKeyboardAccelerator(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAccelerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__468220185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAccelerator): Array<IKeyboardAccelerator?> =
        (elements as
        Array<IKeyboardAccelerator?>).castToImpl<IKeyboardAccelerator,IKeyboardAccelerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAccelerator?> =
        arrayOfNulls<IKeyboardAccelerator_Impl>(size) as Array<IKeyboardAccelerator?>
  }
}
