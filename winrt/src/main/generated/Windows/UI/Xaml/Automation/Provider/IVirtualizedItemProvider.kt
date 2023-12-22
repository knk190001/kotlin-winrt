package Windows.UI.Xaml.Automation.Provider

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

@ABIMarker(IVirtualizedItemProvider.ABI::class)
@Signature("{17d4a04b-d658-48e0-a574-5a516c58dfa7}")
@Guid("17d4a04bd65848e0a5745a516c58dfa7")
@WinRTInterface("17d4a04bd65848e0a5745a516c58dfa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizedItemProvider.ByReference::class)
public interface IVirtualizedItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Realize(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizedItemProvider> {
    public override fun getValue() = ABI.makeIVirtualizedItemProvider(pointer.getPointer(0))

    public fun setValue(value: IVirtualizedItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizedItemProvider {
    public val __550239033_Ptr: Pointer?

    public val _550239033_VtblPtr: Pointer?
      get() = __550239033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Realize(): Unit {
      val fnPtr = _550239033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__550239033_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizedItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __550239033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizedItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17d4a04bd65848e0a5745a516c58dfa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizedItemProvider(ptr: Pointer?): WithDefault =
        IVirtualizedItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizedItemProvider {
      val address = segment.toRawLongValue()
      return makeIVirtualizedItemProvider(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizedItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__550239033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizedItemProvider):
        Array<IVirtualizedItemProvider?> = (elements as
        Array<IVirtualizedItemProvider?>).castToImpl<IVirtualizedItemProvider,IVirtualizedItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizedItemProvider?> =
        arrayOfNulls<IVirtualizedItemProvider_Impl>(size) as Array<IVirtualizedItemProvider?>
  }
}
