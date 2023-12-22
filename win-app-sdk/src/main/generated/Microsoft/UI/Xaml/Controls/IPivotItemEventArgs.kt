package Microsoft.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPivotItemEventArgs.ABI::class)
@Signature("{e42c62c2-0cb9-5e5b-8148-8d80a3838de9}")
@Guid("e42c62c20cb95e5b81488d80a3838de9")
@WinRTInterface("e42c62c20cb95e5b81488d80a3838de9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemEventArgs.ByReference::class)
public interface IPivotItemEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): PivotItem?

  @InterfaceMethod(1)
  public fun put_Item(value: PivotItem?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemEventArgs> {
    public override fun getValue() = ABI.makeIPivotItemEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPivotItemEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemEventArgs {
    public val __616387159_Ptr: Pointer?

    public val _616387159_VtblPtr: Pointer?
      get() = __616387159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): PivotItem? {
      val fnPtr = _616387159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotItem>()
      val hr = fn.invokeHR(arrayOf(__616387159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Item(value: PivotItem?): Unit {
      val fnPtr = _616387159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__616387159_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPivotItemEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __616387159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e42c62c20cb95e5b81488d80a3838de9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemEventArgs(ptr: Pointer?): WithDefault = IPivotItemEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemEventArgs {
      val address = segment.toRawLongValue()
      return makeIPivotItemEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__616387159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemEventArgs): Array<IPivotItemEventArgs?> =
        (elements as
        Array<IPivotItemEventArgs?>).castToImpl<IPivotItemEventArgs,IPivotItemEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemEventArgs?> =
        arrayOfNulls<IPivotItemEventArgs_Impl>(size) as Array<IPivotItemEventArgs?>
  }
}
