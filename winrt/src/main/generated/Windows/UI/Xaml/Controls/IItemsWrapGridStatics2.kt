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

@ABIMarker(IItemsWrapGridStatics2.ABI::class)
@Signature("{2e27d3f7-feaa-478d-bfd1-29338adc5a03}")
@Guid("2e27d3f7feaa478dbfd129338adc5a03")
@WinRTInterface("2e27d3f7feaa478dbfd129338adc5a03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsWrapGridStatics2.ByReference::class)
public interface IItemsWrapGridStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreStickyGroupHeadersEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsWrapGridStatics2> {
    public override fun getValue() = ABI.makeIItemsWrapGridStatics2(pointer.getPointer(0))

    public fun setValue(value: IItemsWrapGridStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsWrapGridStatics2 {
    public val __2075361569_Ptr: Pointer?

    public val _2075361569_VtblPtr: Pointer?
      get() = __2075361569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreStickyGroupHeadersEnabledProperty(): DependencyProperty? {
      val fnPtr = _2075361569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2075361569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsWrapGridStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2075361569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsWrapGridStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e27d3f7feaa478dbfd129338adc5a03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsWrapGridStatics2(ptr: Pointer?): WithDefault =
        IItemsWrapGridStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsWrapGridStatics2 {
      val address = segment.toRawLongValue()
      return makeIItemsWrapGridStatics2(Pointer(address))
    }

    public override fun toNative(obj: IItemsWrapGridStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2075361569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsWrapGridStatics2): Array<IItemsWrapGridStatics2?> =
        (elements as
        Array<IItemsWrapGridStatics2?>).castToImpl<IItemsWrapGridStatics2,IItemsWrapGridStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsWrapGridStatics2?> =
        arrayOfNulls<IItemsWrapGridStatics2_Impl>(size) as Array<IItemsWrapGridStatics2?>
  }
}
