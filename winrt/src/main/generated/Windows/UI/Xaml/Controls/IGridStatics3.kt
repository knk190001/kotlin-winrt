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

@ABIMarker(IGridStatics3.ABI::class)
@Signature("{c3fba437-5a0c-407a-9621-79545386d811}")
@Guid("c3fba4375a0c407a962179545386d811")
@WinRTInterface("c3fba4375a0c407a962179545386d811")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridStatics3.ByReference::class)
public interface IGridStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RowSpacingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ColumnSpacingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridStatics3>
      {
    public override fun getValue() = ABI.makeIGridStatics3(pointer.getPointer(0))

    public fun setValue(value: IGridStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridStatics3 {
    public val __650335376_Ptr: Pointer?

    public val _650335376_VtblPtr: Pointer?
      get() = __650335376_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RowSpacingProperty(): DependencyProperty? {
      val fnPtr = _650335376_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335376_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ColumnSpacingProperty(): DependencyProperty? {
      val fnPtr = _650335376_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335376_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGridStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __650335376_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3fba4375a0c407a962179545386d811")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridStatics3(ptr: Pointer?): WithDefault = IGridStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridStatics3 {
      val address = segment.toRawLongValue()
      return makeIGridStatics3(Pointer(address))
    }

    public override fun toNative(obj: IGridStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__650335376_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridStatics3): Array<IGridStatics3?> = (elements as
        Array<IGridStatics3?>).castToImpl<IGridStatics3,IGridStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridStatics3?> =
        arrayOfNulls<IGridStatics3_Impl>(size) as Array<IGridStatics3?>
  }
}
