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

@ABIMarker(IPathIconStatics.ABI::class)
@Signature("{77b75db8-fb15-491a-b6e3-7dbba911bafe}")
@Guid("77b75db8fb15491ab6e37dbba911bafe")
@WinRTInterface("77b75db8fb15491ab6e37dbba911bafe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIconStatics.ByReference::class)
public interface IPathIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathIconStatics> {
    public override fun getValue() = ABI.makeIPathIconStatics(pointer.getPointer(0))

    public fun setValue(value: IPathIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIconStatics {
    public val __1623972853_Ptr: Pointer?

    public val _1623972853_VtblPtr: Pointer?
      get() = __1623972853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataProperty(): DependencyProperty? {
      val fnPtr = _1623972853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1623972853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPathIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1623972853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77b75db8fb15491ab6e37dbba911bafe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIconStatics(ptr: Pointer?): WithDefault = IPathIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIconStatics {
      val address = segment.toRawLongValue()
      return makeIPathIconStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1623972853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIconStatics): Array<IPathIconStatics?> = (elements as
        Array<IPathIconStatics?>).castToImpl<IPathIconStatics,IPathIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIconStatics?> =
        arrayOfNulls<IPathIconStatics_Impl>(size) as Array<IPathIconStatics?>
  }
}
