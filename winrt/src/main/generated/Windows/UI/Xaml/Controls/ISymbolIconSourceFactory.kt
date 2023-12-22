package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISymbolIconSourceFactory.ABI::class)
@Signature("{a526aab0-4130-4907-b049-21f9240c7a40}")
@Guid("a526aab041304907b04921f9240c7a40")
@WinRTInterface("a526aab041304907b04921f9240c7a40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIconSourceFactory.ByReference::class)
public interface ISymbolIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SymbolIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymbolIconSourceFactory> {
    public override fun getValue() = ABI.makeISymbolIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: ISymbolIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIconSourceFactory {
    public val __549015074_Ptr: Pointer?

    public val _549015074_VtblPtr: Pointer?
      get() = __549015074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SymbolIconSource? {
      val fnPtr = _549015074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SymbolIconSource>()
      val hr = fn.invokeHR(arrayOf(__549015074_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SymbolIconSource>(result.getValue())
      return resultValue
    }
  }

  public class ISymbolIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __549015074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a526aab041304907b04921f9240c7a40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIconSourceFactory(ptr: Pointer?): WithDefault =
        ISymbolIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeISymbolIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__549015074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIconSourceFactory):
        Array<ISymbolIconSourceFactory?> = (elements as
        Array<ISymbolIconSourceFactory?>).castToImpl<ISymbolIconSourceFactory,ISymbolIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIconSourceFactory?> =
        arrayOfNulls<ISymbolIconSourceFactory_Impl>(size) as Array<ISymbolIconSourceFactory?>
  }
}
