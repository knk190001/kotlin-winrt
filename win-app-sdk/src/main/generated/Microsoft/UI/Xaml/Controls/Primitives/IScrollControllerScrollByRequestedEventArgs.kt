package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ScrollingScrollOptions
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollControllerScrollByRequestedEventArgs.ABI::class)
@Signature("{e7f305fa-4073-5d88-8bf1-ae4ecb9208bf}")
@Guid("e7f305fa40735d888bf1ae4ecb9208bf")
@WinRTInterface("e7f305fa40735d888bf1ae4ecb9208bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerScrollByRequestedEventArgs.ByReference::class)
public interface IScrollControllerScrollByRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OffsetDelta(): Double

  @InterfaceMethod(1)
  public fun get_Options(): ScrollingScrollOptions?

  @InterfaceMethod(2)
  public fun get_CorrelationId(): Int

  @InterfaceMethod(3)
  public fun put_CorrelationId(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerScrollByRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollControllerScrollByRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerScrollByRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerScrollByRequestedEventArgs {
    public val __1597539801_Ptr: Pointer?

    public val _1597539801_VtblPtr: Pointer?
      get() = __1597539801_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OffsetDelta(): Double {
      val fnPtr = _1597539801_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1597539801_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Options(): ScrollingScrollOptions? {
      val fnPtr = _1597539801_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollOptions>()
      val hr = fn.invokeHR(arrayOf(__1597539801_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _1597539801_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1597539801_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CorrelationId(value: Int): Unit {
      val fnPtr = _1597539801_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1597539801_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollControllerScrollByRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1597539801_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerScrollByRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7f305fa40735d888bf1ae4ecb9208bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerScrollByRequestedEventArgs(ptr: Pointer?): WithDefault =
        IScrollControllerScrollByRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerScrollByRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollControllerScrollByRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerScrollByRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1597539801_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerScrollByRequestedEventArgs):
        Array<IScrollControllerScrollByRequestedEventArgs?> = (elements as
        Array<IScrollControllerScrollByRequestedEventArgs?>).castToImpl<IScrollControllerScrollByRequestedEventArgs,IScrollControllerScrollByRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollControllerScrollByRequestedEventArgs?> =
        arrayOfNulls<IScrollControllerScrollByRequestedEventArgs_Impl>(size) as
        Array<IScrollControllerScrollByRequestedEventArgs?>
  }
}
