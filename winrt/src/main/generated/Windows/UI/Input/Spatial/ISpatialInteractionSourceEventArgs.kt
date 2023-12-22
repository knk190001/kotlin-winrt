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

@ABIMarker(ISpatialInteractionSourceEventArgs.ABI::class)
@Signature("{23b786cf-ec23-3979-b27c-eb0e12feb7c7}")
@Guid("23b786cfec233979b27ceb0e12feb7c7")
@WinRTInterface("23b786cfec233979b27ceb0e12feb7c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceEventArgs.ByReference::class)
public interface ISpatialInteractionSourceEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): SpatialInteractionSourceState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceEventArgs {
    public val __541564458_Ptr: Pointer?

    public val _541564458_VtblPtr: Pointer?
      get() = __541564458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): SpatialInteractionSourceState? {
      val fnPtr = _541564458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceState>()
      val hr = fn.invokeHR(arrayOf(__541564458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceState>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __541564458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23b786cfec233979b27ceb0e12feb7c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceEventArgs(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__541564458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceEventArgs):
        Array<ISpatialInteractionSourceEventArgs?> = (elements as
        Array<ISpatialInteractionSourceEventArgs?>).castToImpl<ISpatialInteractionSourceEventArgs,ISpatialInteractionSourceEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceEventArgs?> =
        arrayOfNulls<ISpatialInteractionSourceEventArgs_Impl>(size) as
        Array<ISpatialInteractionSourceEventArgs?>
  }
}
