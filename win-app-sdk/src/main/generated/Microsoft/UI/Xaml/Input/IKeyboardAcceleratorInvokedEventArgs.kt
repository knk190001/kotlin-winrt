package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(IKeyboardAcceleratorInvokedEventArgs.ABI::class)
@Signature("{62c9fdb0-b574-527d-97eb-5c7f674441e0}")
@Guid("62c9fdb0b574527d97eb5c7f674441e0")
@WinRTInterface("62c9fdb0b574527d97eb5c7f674441e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAcceleratorInvokedEventArgs.ByReference::class)
public interface IKeyboardAcceleratorInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Element(): DependencyObject?

  @InterfaceMethod(3)
  public fun get_KeyboardAccelerator(): KeyboardAccelerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAcceleratorInvokedEventArgs> {
    public override fun getValue() =
        ABI.makeIKeyboardAcceleratorInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAcceleratorInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAcceleratorInvokedEventArgs {
    public val __942955452_Ptr: Pointer?

    public val _942955452_VtblPtr: Pointer?
      get() = __942955452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _942955452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__942955452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _942955452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__942955452_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Element(): DependencyObject? {
      val fnPtr = _942955452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__942955452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyboardAccelerator(): KeyboardAccelerator? {
      val fnPtr = _942955452_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardAccelerator>()
      val hr = fn.invokeHR(arrayOf(__942955452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardAccelerator>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardAcceleratorInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942955452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAcceleratorInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62c9fdb0b574527d97eb5c7f674441e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAcceleratorInvokedEventArgs(ptr: Pointer?): WithDefault =
        IKeyboardAcceleratorInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAcceleratorInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeyboardAcceleratorInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAcceleratorInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942955452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAcceleratorInvokedEventArgs):
        Array<IKeyboardAcceleratorInvokedEventArgs?> = (elements as
        Array<IKeyboardAcceleratorInvokedEventArgs?>).castToImpl<IKeyboardAcceleratorInvokedEventArgs,IKeyboardAcceleratorInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAcceleratorInvokedEventArgs?> =
        arrayOfNulls<IKeyboardAcceleratorInvokedEventArgs_Impl>(size) as
        Array<IKeyboardAcceleratorInvokedEventArgs?>
  }
}
