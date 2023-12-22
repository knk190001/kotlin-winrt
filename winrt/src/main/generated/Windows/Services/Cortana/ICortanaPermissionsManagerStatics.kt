package Windows.Services.Cortana

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

@ABIMarker(ICortanaPermissionsManagerStatics.ABI::class)
@Signature("{76b1e67a-b045-4414-9d6d-2ad3a5fe3a7e}")
@Guid("76b1e67ab04544149d6d2ad3a5fe3a7e")
@WinRTInterface("76b1e67ab04544149d6d2ad3a5fe3a7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaPermissionsManagerStatics.ByReference::class)
public interface ICortanaPermissionsManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): CortanaPermissionsManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaPermissionsManagerStatics> {
    public override fun getValue() =
        ABI.makeICortanaPermissionsManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICortanaPermissionsManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaPermissionsManagerStatics {
    public val __816670398_Ptr: Pointer?

    public val _816670398_VtblPtr: Pointer?
      get() = __816670398_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): CortanaPermissionsManager? {
      val fnPtr = _816670398_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CortanaPermissionsManager>()
      val hr = fn.invokeHR(arrayOf(__816670398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CortanaPermissionsManager>(result.getValue())
      return resultValue
    }
  }

  public class ICortanaPermissionsManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __816670398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaPermissionsManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76b1e67ab04544149d6d2ad3a5fe3a7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaPermissionsManagerStatics(ptr: Pointer?): WithDefault =
        ICortanaPermissionsManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaPermissionsManagerStatics {
      val address = segment.toRawLongValue()
      return makeICortanaPermissionsManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICortanaPermissionsManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__816670398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaPermissionsManagerStatics):
        Array<ICortanaPermissionsManagerStatics?> = (elements as
        Array<ICortanaPermissionsManagerStatics?>).castToImpl<ICortanaPermissionsManagerStatics,ICortanaPermissionsManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaPermissionsManagerStatics?> =
        arrayOfNulls<ICortanaPermissionsManagerStatics_Impl>(size) as
        Array<ICortanaPermissionsManagerStatics?>
  }
}
