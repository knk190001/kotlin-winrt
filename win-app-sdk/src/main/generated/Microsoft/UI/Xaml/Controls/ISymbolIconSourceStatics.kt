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

@ABIMarker(ISymbolIconSourceStatics.ABI::class)
@Signature("{fdb6b1c7-33d9-56d0-98e5-8776aa1bb79a}")
@Guid("fdb6b1c733d956d098e58776aa1bb79a")
@WinRTInterface("fdb6b1c733d956d098e58776aa1bb79a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIconSourceStatics.ByReference::class)
public interface ISymbolIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SymbolProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymbolIconSourceStatics> {
    public override fun getValue() = ABI.makeISymbolIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ISymbolIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIconSourceStatics {
    public val __571737390_Ptr: Pointer?

    public val _571737390_VtblPtr: Pointer?
      get() = __571737390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SymbolProperty(): DependencyProperty? {
      val fnPtr = _571737390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__571737390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISymbolIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __571737390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdb6b1c733d956d098e58776aa1bb79a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIconSourceStatics(ptr: Pointer?): WithDefault =
        ISymbolIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeISymbolIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__571737390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIconSourceStatics):
        Array<ISymbolIconSourceStatics?> = (elements as
        Array<ISymbolIconSourceStatics?>).castToImpl<ISymbolIconSourceStatics,ISymbolIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIconSourceStatics?> =
        arrayOfNulls<ISymbolIconSourceStatics_Impl>(size) as Array<ISymbolIconSourceStatics?>
  }
}
