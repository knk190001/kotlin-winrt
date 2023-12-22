package Windows.UI.Xaml.Navigation

import Windows.Foundation.HResult
import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(INavigationFailedEventArgs.ABI::class)
@Signature("{11c1dff7-36c2-4102-b2ef-0217a97289b3}")
@Guid("11c1dff736c24102b2ef0217a97289b3")
@WinRTInterface("11c1dff736c24102b2ef0217a97289b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationFailedEventArgs.ByReference::class)
public interface INavigationFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exception(): HResult?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_SourcePageType(): TypeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationFailedEventArgs> {
    public override fun getValue() = ABI.makeINavigationFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationFailedEventArgs {
    public val __310984280_Ptr: Pointer?

    public val _310984280_VtblPtr: Pointer?
      get() = __310984280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exception(): HResult? {
      val fnPtr = _310984280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__310984280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _310984280_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__310984280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _310984280_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__310984280_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SourcePageType(): TypeName? {
      val fnPtr = _310984280_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__310984280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }
  }

  public class INavigationFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __310984280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11c1dff736c24102b2ef0217a97289b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationFailedEventArgs(ptr: Pointer?): WithDefault =
        INavigationFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__310984280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationFailedEventArgs):
        Array<INavigationFailedEventArgs?> = (elements as
        Array<INavigationFailedEventArgs?>).castToImpl<INavigationFailedEventArgs,INavigationFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationFailedEventArgs?> =
        arrayOfNulls<INavigationFailedEventArgs_Impl>(size) as Array<INavigationFailedEventArgs?>
  }
}
