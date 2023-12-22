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

@ABIMarker(ITimePickerStatics3.ABI::class)
@Signature("{cfef1763-ba87-54d8-82d4-7c6b9734dc9d}")
@Guid("cfef1763ba8754d882d47c6b9734dc9d")
@WinRTInterface("cfef1763ba8754d882d47c6b9734dc9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerStatics3.ByReference::class)
public interface ITimePickerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedTimeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerStatics3> {
    public override fun getValue() = ABI.makeITimePickerStatics3(pointer.getPointer(0))

    public fun setValue(value: ITimePickerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerStatics3 {
    public val __107788549_Ptr: Pointer?

    public val _107788549_VtblPtr: Pointer?
      get() = __107788549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedTimeProperty(): DependencyProperty? {
      val fnPtr = _107788549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107788549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107788549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfef1763ba8754d882d47c6b9734dc9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerStatics3(ptr: Pointer?): WithDefault = ITimePickerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerStatics3 {
      val address = segment.toRawLongValue()
      return makeITimePickerStatics3(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107788549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerStatics3): Array<ITimePickerStatics3?> =
        (elements as
        Array<ITimePickerStatics3?>).castToImpl<ITimePickerStatics3,ITimePickerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerStatics3?> =
        arrayOfNulls<ITimePickerStatics3_Impl>(size) as Array<ITimePickerStatics3?>
  }
}
