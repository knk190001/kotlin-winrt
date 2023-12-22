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

@ABIMarker(ICommandBarStatics2.ABI::class)
@Signature("{3d9ec8e3-51a9-4e34-956c-7081d06f26f8}")
@Guid("3d9ec8e351a94e34956c7081d06f26f8")
@WinRTInterface("3d9ec8e351a94e34956c7081d06f26f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarStatics2.ByReference::class)
public interface ICommandBarStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandBarOverflowPresenterStyleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarStatics2> {
    public override fun getValue() = ABI.makeICommandBarStatics2(pointer.getPointer(0))

    public fun setValue(value: ICommandBarStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarStatics2 {
    public val __1312293103_Ptr: Pointer?

    public val _1312293103_VtblPtr: Pointer?
      get() = __1312293103_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandBarOverflowPresenterStyleProperty(): DependencyProperty? {
      val fnPtr = _1312293103_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1312293103_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1312293103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d9ec8e351a94e34956c7081d06f26f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarStatics2(ptr: Pointer?): WithDefault = ICommandBarStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarStatics2 {
      val address = segment.toRawLongValue()
      return makeICommandBarStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1312293103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarStatics2): Array<ICommandBarStatics2?> =
        (elements as
        Array<ICommandBarStatics2?>).castToImpl<ICommandBarStatics2,ICommandBarStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarStatics2?> =
        arrayOfNulls<ICommandBarStatics2_Impl>(size) as Array<ICommandBarStatics2?>
  }
}
