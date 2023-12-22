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

@ABIMarker(ISpatialInteractionManagerStatics.ABI::class)
@Signature("{00e31fa6-8ca2-30bf-91fe-d9cb4a008990}")
@Guid("00e31fa68ca230bf91fed9cb4a008990")
@WinRTInterface("00e31fa68ca230bf91fed9cb4a008990")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionManagerStatics.ByReference::class)
public interface ISpatialInteractionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): SpatialInteractionManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionManagerStatics> {
    public override fun getValue() =
        ABI.makeISpatialInteractionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionManagerStatics {
    public val __57766146_Ptr: Pointer?

    public val _57766146_VtblPtr: Pointer?
      get() = __57766146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): SpatialInteractionManager? {
      val fnPtr = _57766146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionManager>()
      val hr = fn.invokeHR(arrayOf(__57766146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionManager>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __57766146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00e31fa68ca230bf91fed9cb4a008990")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionManagerStatics(ptr: Pointer?): WithDefault =
        ISpatialInteractionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionManagerStatics {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__57766146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionManagerStatics):
        Array<ISpatialInteractionManagerStatics?> = (elements as
        Array<ISpatialInteractionManagerStatics?>).castToImpl<ISpatialInteractionManagerStatics,ISpatialInteractionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionManagerStatics?> =
        arrayOfNulls<ISpatialInteractionManagerStatics_Impl>(size) as
        Array<ISpatialInteractionManagerStatics?>
  }
}
