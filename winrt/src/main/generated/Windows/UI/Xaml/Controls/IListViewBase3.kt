package Windows.UI.Xaml.Controls

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

@ABIMarker(IListViewBase3.ABI::class)
@Signature("{b364c035-0a13-406f-a3fb-f30e7ddca94c}")
@Guid("b364c0350a13406fa3fbf30e7ddca94c")
@WinRTInterface("b364c0350a13406fa3fbf30e7ddca94c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase3.ByReference::class)
public interface IListViewBase3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReorderMode(): ListViewReorderMode?

  @InterfaceMethod(1)
  public fun put_ReorderMode(value: ListViewReorderMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase3>
      {
    public override fun getValue() = ABI.makeIListViewBase3(pointer.getPointer(0))

    public fun setValue(value: IListViewBase3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase3 {
    public val __1194261059_Ptr: Pointer?

    public val _1194261059_VtblPtr: Pointer?
      get() = __1194261059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReorderMode(): ListViewReorderMode? {
      val fnPtr = _1194261059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewReorderMode>()
      val hr = fn.invokeHR(arrayOf(__1194261059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewReorderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ReorderMode(value: ListViewReorderMode?): Unit {
      val fnPtr = _1194261059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261059_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewBase3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194261059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b364c0350a13406fa3fbf30e7ddca94c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase3(ptr: Pointer?): WithDefault = IListViewBase3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase3 {
      val address = segment.toRawLongValue()
      return makeIListViewBase3(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194261059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase3): Array<IListViewBase3?> = (elements as
        Array<IListViewBase3?>).castToImpl<IListViewBase3,IListViewBase3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase3?> =
        arrayOfNulls<IListViewBase3_Impl>(size) as Array<IListViewBase3?>
  }
}
