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

@ABIMarker(ISpatialManipulationCanceledEventArgs.ABI::class)
@Signature("{2d40d1cb-e7da-4220-b0bf-819301674780}")
@Guid("2d40d1cbe7da4220b0bf819301674780")
@WinRTInterface("2d40d1cbe7da4220b0bf819301674780")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialManipulationCanceledEventArgs.ByReference::class)
public interface ISpatialManipulationCanceledEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialManipulationCanceledEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialManipulationCanceledEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialManipulationCanceledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialManipulationCanceledEventArgs {
    public val __2066437419_Ptr: Pointer?

    public val _2066437419_VtblPtr: Pointer?
      get() = __2066437419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _2066437419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__2066437419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialManipulationCanceledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2066437419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialManipulationCanceledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d40d1cbe7da4220b0bf819301674780")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialManipulationCanceledEventArgs(ptr: Pointer?): WithDefault =
        ISpatialManipulationCanceledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialManipulationCanceledEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialManipulationCanceledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialManipulationCanceledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2066437419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialManipulationCanceledEventArgs):
        Array<ISpatialManipulationCanceledEventArgs?> = (elements as
        Array<ISpatialManipulationCanceledEventArgs?>).castToImpl<ISpatialManipulationCanceledEventArgs,ISpatialManipulationCanceledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialManipulationCanceledEventArgs?> =
        arrayOfNulls<ISpatialManipulationCanceledEventArgs_Impl>(size) as
        Array<ISpatialManipulationCanceledEventArgs?>
  }
}
