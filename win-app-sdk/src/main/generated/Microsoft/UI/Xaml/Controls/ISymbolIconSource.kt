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

@ABIMarker(ISymbolIconSource.ABI::class)
@Signature("{45120d6b-e868-59f2-a30a-b1915ce374bd}")
@Guid("45120d6be86859f2a30ab1915ce374bd")
@WinRTInterface("45120d6be86859f2a30ab1915ce374bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIconSource.ByReference::class)
public interface ISymbolIconSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbol(): Symbol?

  @InterfaceMethod(1)
  public fun put_Symbol(value: Symbol?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymbolIconSource> {
    public override fun getValue() = ABI.makeISymbolIconSource(pointer.getPointer(0))

    public fun setValue(value: ISymbolIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIconSource {
    public val __710681971_Ptr: Pointer?

    public val _710681971_VtblPtr: Pointer?
      get() = __710681971_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbol(): Symbol? {
      val fnPtr = _710681971_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Symbol>()
      val hr = fn.invokeHR(arrayOf(__710681971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Symbol>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Symbol(value: Symbol?): Unit {
      val fnPtr = _710681971_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__710681971_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISymbolIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __710681971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45120d6be86859f2a30ab1915ce374bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIconSource(ptr: Pointer?): WithDefault = ISymbolIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIconSource {
      val address = segment.toRawLongValue()
      return makeISymbolIconSource(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__710681971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIconSource): Array<ISymbolIconSource?> = (elements
        as Array<ISymbolIconSource?>).castToImpl<ISymbolIconSource,ISymbolIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIconSource?> =
        arrayOfNulls<ISymbolIconSource_Impl>(size) as Array<ISymbolIconSource?>
  }
}
