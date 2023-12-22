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

@ABIMarker(IDragStartedEventArgs.ABI::class)
@Signature("{9f915dd0-a124-4366-bd85-2408214aeed4}")
@Guid("9f915dd0a1244366bd852408214aeed4")
@WinRTInterface("9f915dd0a1244366bd852408214aeed4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragStartedEventArgs.ByReference::class)
public interface IDragStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun get_VerticalOffset(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragStartedEventArgs> {
    public override fun getValue() = ABI.makeIDragStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragStartedEventArgs {
    public val __2110650042_Ptr: Pointer?

    public val _2110650042_VtblPtr: Pointer?
      get() = __2110650042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _2110650042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2110650042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _2110650042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2110650042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IDragStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2110650042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f915dd0a1244366bd852408214aeed4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragStartedEventArgs(ptr: Pointer?): WithDefault =
        IDragStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2110650042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragStartedEventArgs): Array<IDragStartedEventArgs?> =
        (elements as
        Array<IDragStartedEventArgs?>).castToImpl<IDragStartedEventArgs,IDragStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragStartedEventArgs?> =
        arrayOfNulls<IDragStartedEventArgs_Impl>(size) as Array<IDragStartedEventArgs?>
  }
}
