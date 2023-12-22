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

@ABIMarker(IRelativePanelStatics2.ABI::class)
@Signature("{8d6b3444-5fbc-5d8b-8b46-22176f21fa8e}")
@Guid("8d6b34445fbc5d8b8b4622176f21fa8e")
@WinRTInterface("8d6b34445fbc5d8b8b4622176f21fa8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativePanelStatics2.ByReference::class)
public interface IRelativePanelStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativePanelStatics2> {
    public override fun getValue() = ABI.makeIRelativePanelStatics2(pointer.getPointer(0))

    public fun setValue(value: IRelativePanelStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativePanelStatics2 {
    public val __1414517033_Ptr: Pointer?

    public val _1414517033_VtblPtr: Pointer?
      get() = __1414517033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _1414517033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1414517033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRelativePanelStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414517033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativePanelStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d6b34445fbc5d8b8b4622176f21fa8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativePanelStatics2(ptr: Pointer?): WithDefault =
        IRelativePanelStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativePanelStatics2 {
      val address = segment.toRawLongValue()
      return makeIRelativePanelStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRelativePanelStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414517033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativePanelStatics2): Array<IRelativePanelStatics2?> =
        (elements as
        Array<IRelativePanelStatics2?>).castToImpl<IRelativePanelStatics2,IRelativePanelStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativePanelStatics2?> =
        arrayOfNulls<IRelativePanelStatics2_Impl>(size) as Array<IRelativePanelStatics2?>
  }
}
