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

@ABIMarker(ISymbolIconStatics.ABI::class)
@Signature("{8624fbdf-952c-4f76-b03f-30833be99572}")
@Guid("8624fbdf952c4f76b03f30833be99572")
@WinRTInterface("8624fbdf952c4f76b03f30833be99572")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIconStatics.ByReference::class)
public interface ISymbolIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SymbolProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymbolIconStatics> {
    public override fun getValue() = ABI.makeISymbolIconStatics(pointer.getPointer(0))

    public fun setValue(value: ISymbolIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIconStatics {
    public val __251710536_Ptr: Pointer?

    public val _251710536_VtblPtr: Pointer?
      get() = __251710536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SymbolProperty(): DependencyProperty? {
      val fnPtr = _251710536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__251710536_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISymbolIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __251710536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8624fbdf952c4f76b03f30833be99572")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIconStatics(ptr: Pointer?): WithDefault = ISymbolIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIconStatics {
      val address = segment.toRawLongValue()
      return makeISymbolIconStatics(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__251710536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIconStatics): Array<ISymbolIconStatics?> =
        (elements as
        Array<ISymbolIconStatics?>).castToImpl<ISymbolIconStatics,ISymbolIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIconStatics?> =
        arrayOfNulls<ISymbolIconStatics_Impl>(size) as Array<ISymbolIconStatics?>
  }
}
