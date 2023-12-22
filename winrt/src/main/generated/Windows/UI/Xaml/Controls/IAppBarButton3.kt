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

@ABIMarker(IAppBarButton3.ABI::class)
@Signature("{0b282150-198b-4e84-8f1c-9f6a8ba267a7}")
@Guid("0b282150198b4e848f1c9f6a8ba267a7")
@WinRTInterface("0b282150198b4e848f1c9f6a8ba267a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButton3.ByReference::class)
public interface IAppBarButton3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelPosition(): CommandBarLabelPosition?

  @InterfaceMethod(1)
  public fun put_LabelPosition(value: CommandBarLabelPosition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarButton3>
      {
    public override fun getValue() = ABI.makeIAppBarButton3(pointer.getPointer(0))

    public fun setValue(value: IAppBarButton3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButton3 {
    public val __1843150317_Ptr: Pointer?

    public val _1843150317_VtblPtr: Pointer?
      get() = __1843150317_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelPosition(): CommandBarLabelPosition? {
      val fnPtr = _1843150317_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__1843150317_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LabelPosition(value: CommandBarLabelPosition?): Unit {
      val fnPtr = _1843150317_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1843150317_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBarButton3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1843150317_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButton3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b282150198b4e848f1c9f6a8ba267a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButton3(ptr: Pointer?): WithDefault = IAppBarButton3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButton3 {
      val address = segment.toRawLongValue()
      return makeIAppBarButton3(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButton3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1843150317_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButton3): Array<IAppBarButton3?> = (elements as
        Array<IAppBarButton3?>).castToImpl<IAppBarButton3,IAppBarButton3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButton3?> =
        arrayOfNulls<IAppBarButton3_Impl>(size) as Array<IAppBarButton3?>
  }
}
