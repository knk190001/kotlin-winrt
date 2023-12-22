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

@ABIMarker(ISharedModeSettingsStatics.ABI::class)
@Signature("{893df40e-cad6-4d50-8c49-6fcfc03edb29}")
@Guid("893df40ecad64d508c496fcfc03edb29")
@WinRTInterface("893df40ecad64d508c496fcfc03edb29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedModeSettingsStatics.ByReference::class)
public interface ISharedModeSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedModeSettingsStatics> {
    public override fun getValue() = ABI.makeISharedModeSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ISharedModeSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedModeSettingsStatics {
    public val __2140745562_Ptr: Pointer?

    public val _2140745562_VtblPtr: Pointer?
      get() = __2140745562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _2140745562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2140745562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISharedModeSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2140745562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedModeSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("893df40ecad64d508c496fcfc03edb29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedModeSettingsStatics(ptr: Pointer?): WithDefault =
        ISharedModeSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedModeSettingsStatics {
      val address = segment.toRawLongValue()
      return makeISharedModeSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ISharedModeSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2140745562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedModeSettingsStatics):
        Array<ISharedModeSettingsStatics?> = (elements as
        Array<ISharedModeSettingsStatics?>).castToImpl<ISharedModeSettingsStatics,ISharedModeSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedModeSettingsStatics?> =
        arrayOfNulls<ISharedModeSettingsStatics_Impl>(size) as Array<ISharedModeSettingsStatics?>
  }
}
