package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IGridStatics4.ABI::class)
@Signature("{691af349-1f63-57aa-8726-9cdcc1b14c02}")
@Guid("691af3491f6357aa87269cdcc1b14c02")
@WinRTInterface("691af3491f6357aa87269cdcc1b14c02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridStatics4.ByReference::class)
public interface IGridStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridStatics4>
      {
    public override fun getValue() = ABI.makeIGridStatics4(pointer.getPointer(0))

    public fun setValue(value: IGridStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridStatics4 {
    public val __650335377_Ptr: Pointer?

    public val _650335377_VtblPtr: Pointer?
      get() = __650335377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _650335377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGridStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __650335377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("691af3491f6357aa87269cdcc1b14c02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridStatics4(ptr: Pointer?): WithDefault = IGridStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridStatics4 {
      val address = segment.toRawLongValue()
      return makeIGridStatics4(Pointer(address))
    }

    public override fun toNative(obj: IGridStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__650335377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridStatics4): Array<IGridStatics4?> = (elements as
        Array<IGridStatics4?>).castToImpl<IGridStatics4,IGridStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridStatics4?> =
        arrayOfNulls<IGridStatics4_Impl>(size) as Array<IGridStatics4?>
  }
}
