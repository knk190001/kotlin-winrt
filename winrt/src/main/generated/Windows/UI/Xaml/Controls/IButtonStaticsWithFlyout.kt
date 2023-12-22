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

@ABIMarker(IButtonStaticsWithFlyout.ABI::class)
@Signature("{90143898-a16c-4759-b2f0-a5f7e625169e}")
@Guid("90143898a16c4759b2f0a5f7e625169e")
@WinRTInterface("90143898a16c4759b2f0a5f7e625169e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonStaticsWithFlyout.ByReference::class)
public interface IButtonStaticsWithFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlyoutProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IButtonStaticsWithFlyout> {
    public override fun getValue() = ABI.makeIButtonStaticsWithFlyout(pointer.getPointer(0))

    public fun setValue(value: IButtonStaticsWithFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonStaticsWithFlyout {
    public val __1690626904_Ptr: Pointer?

    public val _1690626904_VtblPtr: Pointer?
      get() = __1690626904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlyoutProperty(): DependencyProperty? {
      val fnPtr = _1690626904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1690626904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IButtonStaticsWithFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690626904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonStaticsWithFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90143898a16c4759b2f0a5f7e625169e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonStaticsWithFlyout(ptr: Pointer?): WithDefault =
        IButtonStaticsWithFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonStaticsWithFlyout {
      val address = segment.toRawLongValue()
      return makeIButtonStaticsWithFlyout(Pointer(address))
    }

    public override fun toNative(obj: IButtonStaticsWithFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690626904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonStaticsWithFlyout):
        Array<IButtonStaticsWithFlyout?> = (elements as
        Array<IButtonStaticsWithFlyout?>).castToImpl<IButtonStaticsWithFlyout,IButtonStaticsWithFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonStaticsWithFlyout?> =
        arrayOfNulls<IButtonStaticsWithFlyout_Impl>(size) as Array<IButtonStaticsWithFlyout?>
  }
}
