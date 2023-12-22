package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISymbolIconFactory.ABI::class)
@Signature("{d4430447-567c-5aad-996a-a547774e2c3c}")
@Guid("d4430447567c5aad996aa547774e2c3c")
@WinRTInterface("d4430447567c5aad996aa547774e2c3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIconFactory.ByReference::class)
public interface ISymbolIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithSymbol(symbol: Symbol?): SymbolIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymbolIconFactory> {
    public override fun getValue() = ABI.makeISymbolIconFactory(pointer.getPointer(0))

    public fun setValue(value: ISymbolIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIconFactory {
    public val __1486298802_Ptr: Pointer?

    public val _1486298802_VtblPtr: Pointer?
      get() = __1486298802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithSymbol(symbol: Symbol?): SymbolIcon? {
      val fnPtr = _1486298802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SymbolIcon>()
      val hr = fn.invokeHR(arrayOf(__1486298802_Ptr, marshalToNative(symbol), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SymbolIcon>(result.getValue())
      return resultValue
    }
  }

  public class ISymbolIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1486298802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4430447567c5aad996aa547774e2c3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIconFactory(ptr: Pointer?): WithDefault = ISymbolIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIconFactory {
      val address = segment.toRawLongValue()
      return makeISymbolIconFactory(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486298802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIconFactory): Array<ISymbolIconFactory?> =
        (elements as
        Array<ISymbolIconFactory?>).castToImpl<ISymbolIconFactory,ISymbolIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIconFactory?> =
        arrayOfNulls<ISymbolIconFactory_Impl>(size) as Array<ISymbolIconFactory?>
  }
}
