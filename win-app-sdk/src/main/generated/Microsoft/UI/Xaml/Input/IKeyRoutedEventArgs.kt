package Microsoft.UI.Xaml.Input

import Windows.System.VirtualKey
import Windows.UI.Core.CorePhysicalKeyStatus
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyRoutedEventArgs.ABI::class)
@Signature("{ee357007-a2d6-5c75-9431-05fd66ec7915}")
@Guid("ee357007a2d65c75943105fd66ec7915")
@WinRTInterface("ee357007a2d65c75943105fd66ec7915")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyRoutedEventArgs.ByReference::class)
public interface IKeyRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Key(): VirtualKey?

  @InterfaceMethod(1)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_OriginalKey(): VirtualKey?

  @InterfaceMethod(5)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyRoutedEventArgs> {
    public override fun getValue() = ABI.makeIKeyRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeyRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyRoutedEventArgs {
    public val __1494418824_Ptr: Pointer?

    public val _1494418824_VtblPtr: Pointer?
      get() = __1494418824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Key(): VirtualKey? {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OriginalKey(): VirtualKey? {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1494418824_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1494418824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1494418824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee357007a2d65c75943105fd66ec7915")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyRoutedEventArgs(ptr: Pointer?): WithDefault = IKeyRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeyRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeyRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1494418824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyRoutedEventArgs): Array<IKeyRoutedEventArgs?> =
        (elements as
        Array<IKeyRoutedEventArgs?>).castToImpl<IKeyRoutedEventArgs,IKeyRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyRoutedEventArgs?> =
        arrayOfNulls<IKeyRoutedEventArgs_Impl>(size) as Array<IKeyRoutedEventArgs?>
  }
}
