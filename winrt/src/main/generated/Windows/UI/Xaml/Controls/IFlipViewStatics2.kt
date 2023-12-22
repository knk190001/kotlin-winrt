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

@ABIMarker(IFlipViewStatics2.ABI::class)
@Signature("{70e3d93f-4308-4ba2-bbce-e2cb0ed34476}")
@Guid("70e3d93f43084ba2bbcee2cb0ed34476")
@WinRTInterface("70e3d93f43084ba2bbcee2cb0ed34476")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewStatics2.ByReference::class)
public interface IFlipViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseTouchAnimationsForAllNavigationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewStatics2> {
    public override fun getValue() = ABI.makeIFlipViewStatics2(pointer.getPointer(0))

    public fun setValue(value: IFlipViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewStatics2 {
    public val __1601773573_Ptr: Pointer?

    public val _1601773573_VtblPtr: Pointer?
      get() = __1601773573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseTouchAnimationsForAllNavigationProperty(): DependencyProperty? {
      val fnPtr = _1601773573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1601773573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1601773573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70e3d93f43084ba2bbcee2cb0ed34476")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewStatics2(ptr: Pointer?): WithDefault = IFlipViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewStatics2 {
      val address = segment.toRawLongValue()
      return makeIFlipViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1601773573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewStatics2): Array<IFlipViewStatics2?> = (elements
        as Array<IFlipViewStatics2?>).castToImpl<IFlipViewStatics2,IFlipViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewStatics2?> =
        arrayOfNulls<IFlipViewStatics2_Impl>(size) as Array<IFlipViewStatics2?>
  }
}
