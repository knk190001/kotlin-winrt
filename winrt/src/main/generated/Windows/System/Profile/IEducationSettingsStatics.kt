package Windows.System.Profile

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEducationSettingsStatics.ABI::class)
@Signature("{fc53f0ef-4d3e-4e13-9b23-505f4d091e92}")
@Guid("fc53f0ef4d3e4e139b23505f4d091e92")
@WinRTInterface("fc53f0ef4d3e4e139b23505f4d091e92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEducationSettingsStatics.ByReference::class)
public interface IEducationSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEducationEnvironment(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEducationSettingsStatics> {
    public override fun getValue() = ABI.makeIEducationSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IEducationSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEducationSettingsStatics {
    public val __79499122_Ptr: Pointer?

    public val _79499122_VtblPtr: Pointer?
      get() = __79499122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEducationEnvironment(): Boolean {
      val fnPtr = _79499122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__79499122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEducationSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __79499122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEducationSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc53f0ef4d3e4e139b23505f4d091e92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEducationSettingsStatics(ptr: Pointer?): WithDefault =
        IEducationSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEducationSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIEducationSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IEducationSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__79499122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEducationSettingsStatics):
        Array<IEducationSettingsStatics?> = (elements as
        Array<IEducationSettingsStatics?>).castToImpl<IEducationSettingsStatics,IEducationSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEducationSettingsStatics?> =
        arrayOfNulls<IEducationSettingsStatics_Impl>(size) as Array<IEducationSettingsStatics?>
  }
}
