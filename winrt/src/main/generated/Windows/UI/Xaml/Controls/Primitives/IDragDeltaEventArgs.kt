package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IDragDeltaEventArgs.ABI::class)
@Signature("{2c2dd73c-2806-49fc-aae9-6d792b572b6a}")
@Guid("2c2dd73c280649fcaae96d792b572b6a")
@WinRTInterface("2c2dd73c280649fcaae96d792b572b6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragDeltaEventArgs.ByReference::class)
public interface IDragDeltaEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalChange(): Double

  @InterfaceMethod(1)
  public fun get_VerticalChange(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragDeltaEventArgs> {
    public override fun getValue() = ABI.makeIDragDeltaEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragDeltaEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragDeltaEventArgs {
    public val __1875642351_Ptr: Pointer?

    public val _1875642351_VtblPtr: Pointer?
      get() = __1875642351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalChange(): Double {
      val fnPtr = _1875642351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1875642351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_VerticalChange(): Double {
      val fnPtr = _1875642351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1875642351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IDragDeltaEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1875642351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragDeltaEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c2dd73c280649fcaae96d792b572b6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragDeltaEventArgs(ptr: Pointer?): WithDefault = IDragDeltaEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragDeltaEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragDeltaEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragDeltaEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1875642351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragDeltaEventArgs): Array<IDragDeltaEventArgs?> =
        (elements as
        Array<IDragDeltaEventArgs?>).castToImpl<IDragDeltaEventArgs,IDragDeltaEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragDeltaEventArgs?> =
        arrayOfNulls<IDragDeltaEventArgs_Impl>(size) as Array<IDragDeltaEventArgs?>
  }
}
