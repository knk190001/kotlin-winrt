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

@ABIMarker(IListBoxStatics2.ABI::class)
@Signature("{0089adeb-b709-4c8d-b1ed-4a7d97ee7716}")
@Guid("0089adebb7094c8db1ed4a7d97ee7716")
@WinRTInterface("0089adebb7094c8db1ed4a7d97ee7716")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxStatics2.ByReference::class)
public interface IListBoxStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxStatics2> {
    public override fun getValue() = ABI.makeIListBoxStatics2(pointer.getPointer(0))

    public fun setValue(value: IListBoxStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxStatics2 {
    public val __161894622_Ptr: Pointer?

    public val _161894622_VtblPtr: Pointer?
      get() = __161894622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty? {
      val fnPtr = _161894622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__161894622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __161894622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0089adebb7094c8db1ed4a7d97ee7716")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxStatics2(ptr: Pointer?): WithDefault = IListBoxStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxStatics2 {
      val address = segment.toRawLongValue()
      return makeIListBoxStatics2(Pointer(address))
    }

    public override fun toNative(obj: IListBoxStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__161894622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxStatics2): Array<IListBoxStatics2?> = (elements as
        Array<IListBoxStatics2?>).castToImpl<IListBoxStatics2,IListBoxStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxStatics2?> =
        arrayOfNulls<IListBoxStatics2_Impl>(size) as Array<IListBoxStatics2?>
  }
}
