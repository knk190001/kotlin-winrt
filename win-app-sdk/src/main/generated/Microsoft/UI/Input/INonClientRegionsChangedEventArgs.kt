package Microsoft.UI.Input

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

@ABIMarker(INonClientRegionsChangedEventArgs.ABI::class)
@Signature("{fe97ee95-1824-51b2-b8eb-10ff0665ce23}")
@Guid("fe97ee95182451b2b8eb10ff0665ce23")
@WinRTInterface("fe97ee95182451b2b8eb10ff0665ce23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonClientRegionsChangedEventArgs.ByReference::class)
public interface INonClientRegionsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangedRegions(): Array<NonClientRegionKind?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonClientRegionsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeINonClientRegionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INonClientRegionsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonClientRegionsChangedEventArgs {
    public val __328956355_Ptr: Pointer?

    public val _328956355_VtblPtr: Pointer?
      get() = __328956355_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangedRegions(): Array<NonClientRegionKind?>? {
      val fnPtr = _328956355_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<NonClientRegionKind>()
      val hr = fn.invokeHR(arrayOf(__328956355_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class INonClientRegionsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328956355_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonClientRegionsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe97ee95182451b2b8eb10ff0665ce23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonClientRegionsChangedEventArgs(ptr: Pointer?): WithDefault =
        INonClientRegionsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonClientRegionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeINonClientRegionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INonClientRegionsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328956355_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonClientRegionsChangedEventArgs):
        Array<INonClientRegionsChangedEventArgs?> = (elements as
        Array<INonClientRegionsChangedEventArgs?>).castToImpl<INonClientRegionsChangedEventArgs,INonClientRegionsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonClientRegionsChangedEventArgs?> =
        arrayOfNulls<INonClientRegionsChangedEventArgs_Impl>(size) as
        Array<INonClientRegionsChangedEventArgs?>
  }
}
