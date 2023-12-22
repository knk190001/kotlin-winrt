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

@ABIMarker(IIconElementStatics.ABI::class)
@Signature("{be19a623-77cf-472f-82ea-047801d12012}")
@Guid("be19a62377cf472f82ea047801d12012")
@WinRTInterface("be19a62377cf472f82ea047801d12012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconElementStatics.ByReference::class)
public interface IIconElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ForegroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconElementStatics> {
    public override fun getValue() = ABI.makeIIconElementStatics(pointer.getPointer(0))

    public fun setValue(value: IIconElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconElementStatics {
    public val __1289892638_Ptr: Pointer?

    public val _1289892638_VtblPtr: Pointer?
      get() = __1289892638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _1289892638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1289892638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IIconElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1289892638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be19a62377cf472f82ea047801d12012")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconElementStatics(ptr: Pointer?): WithDefault = IIconElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconElementStatics {
      val address = segment.toRawLongValue()
      return makeIIconElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IIconElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1289892638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconElementStatics): Array<IIconElementStatics?> =
        (elements as
        Array<IIconElementStatics?>).castToImpl<IIconElementStatics,IIconElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconElementStatics?> =
        arrayOfNulls<IIconElementStatics_Impl>(size) as Array<IIconElementStatics?>
  }
}
