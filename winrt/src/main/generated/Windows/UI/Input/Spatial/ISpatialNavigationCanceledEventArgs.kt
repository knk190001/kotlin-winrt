package Windows.UI.Input.Spatial

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

@ABIMarker(ISpatialNavigationCanceledEventArgs.ABI::class)
@Signature("{ce503edc-e8a5-46f0-92d4-3c122b35112a}")
@Guid("ce503edce8a546f092d43c122b35112a")
@WinRTInterface("ce503edce8a546f092d43c122b35112a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialNavigationCanceledEventArgs.ByReference::class)
public interface ISpatialNavigationCanceledEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialNavigationCanceledEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialNavigationCanceledEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialNavigationCanceledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialNavigationCanceledEventArgs {
    public val __1031911874_Ptr: Pointer?

    public val _1031911874_VtblPtr: Pointer?
      get() = __1031911874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1031911874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1031911874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialNavigationCanceledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1031911874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialNavigationCanceledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce503edce8a546f092d43c122b35112a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialNavigationCanceledEventArgs(ptr: Pointer?): WithDefault =
        ISpatialNavigationCanceledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialNavigationCanceledEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialNavigationCanceledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialNavigationCanceledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1031911874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialNavigationCanceledEventArgs):
        Array<ISpatialNavigationCanceledEventArgs?> = (elements as
        Array<ISpatialNavigationCanceledEventArgs?>).castToImpl<ISpatialNavigationCanceledEventArgs,ISpatialNavigationCanceledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialNavigationCanceledEventArgs?> =
        arrayOfNulls<ISpatialNavigationCanceledEventArgs_Impl>(size) as
        Array<ISpatialNavigationCanceledEventArgs?>
  }
}
