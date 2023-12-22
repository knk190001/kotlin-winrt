package Microsoft.UI.Composition.Diagnostics

import Microsoft.UI.Composition.Visual
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

@ABIMarker(ICompositionDebugHeatMaps.ABI::class)
@Signature("{815016b8-f645-5c55-87b5-fe2167282b6f}")
@Guid("815016b8f6455c5587b5fe2167282b6f")
@WinRTInterface("815016b8f6455c5587b5fe2167282b6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionDebugHeatMaps.ByReference::class)
public interface ICompositionDebugHeatMaps : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Hide(subtree: Visual?): Unit

  @InterfaceMethod(1)
  public fun ShowMemoryUsage(subtree: Visual?): Unit

  @InterfaceMethod(2)
  public fun ShowOverdraw(subtree: Visual?, contentKinds: CompositionDebugOverdrawContentKinds?):
      Unit

  @InterfaceMethod(3)
  public fun ShowRedraw(subtree: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionDebugHeatMaps> {
    public override fun getValue() = ABI.makeICompositionDebugHeatMaps(pointer.getPointer(0))

    public fun setValue(value: ICompositionDebugHeatMaps_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionDebugHeatMaps {
    public val __1745947851_Ptr: Pointer?

    public val _1745947851_VtblPtr: Pointer?
      get() = __1745947851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Hide(subtree: Visual?): Unit {
      val fnPtr = _1745947851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1745947851_Ptr, marshalToNative(subtree),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ShowMemoryUsage(subtree: Visual?): Unit {
      val fnPtr = _1745947851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1745947851_Ptr, marshalToNative(subtree),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ShowOverdraw(subtree: Visual?,
        contentKinds: CompositionDebugOverdrawContentKinds?): Unit {
      val fnPtr = _1745947851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1745947851_Ptr, marshalToNative(subtree),
          marshalToNative(contentKinds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ShowRedraw(subtree: Visual?): Unit {
      val fnPtr = _1745947851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1745947851_Ptr, marshalToNative(subtree),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionDebugHeatMaps_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1745947851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionDebugHeatMaps, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("815016b8f6455c5587b5fe2167282b6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionDebugHeatMaps(ptr: Pointer?): WithDefault =
        ICompositionDebugHeatMaps_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionDebugHeatMaps {
      val address = segment.toRawLongValue()
      return makeICompositionDebugHeatMaps(Pointer(address))
    }

    public override fun toNative(obj: ICompositionDebugHeatMaps): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1745947851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionDebugHeatMaps):
        Array<ICompositionDebugHeatMaps?> = (elements as
        Array<ICompositionDebugHeatMaps?>).castToImpl<ICompositionDebugHeatMaps,ICompositionDebugHeatMaps_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionDebugHeatMaps?> =
        arrayOfNulls<ICompositionDebugHeatMaps_Impl>(size) as Array<ICompositionDebugHeatMaps?>
  }
}
