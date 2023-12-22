package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
@Signature("{4ccfdc81-9d9d-5a02-b95b-ad1add921750}")
@Guid("4ccfdc819d9d5a02b95bad1add921750")
@WinRTInterface("4ccfdc819d9d5a02b95bad1add921750")
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
    public val __140554249_Ptr: Pointer?

    public val _140554249_VtblPtr: Pointer?
      get() = __140554249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _140554249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__140554249_Ptr,  result))
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
    public override val __140554249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ccfdc819d9d5a02b95bad1add921750")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconElementStatics(ptr: Pointer?): WithDefault = IIconElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconElementStatics {
      val address = segment.toRawLongValue()
      return makeIIconElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IIconElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__140554249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconElementStatics): Array<IIconElementStatics?> =
        (elements as
        Array<IIconElementStatics?>).castToImpl<IIconElementStatics,IIconElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconElementStatics?> =
        arrayOfNulls<IIconElementStatics_Impl>(size) as Array<IIconElementStatics?>
  }
}
