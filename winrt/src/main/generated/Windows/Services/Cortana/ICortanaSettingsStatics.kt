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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICortanaSettingsStatics.ABI::class)
@Signature("{8b2ccd7e-2ec0-446d-9285-33f07ce8ac04}")
@Guid("8b2ccd7e2ec0446d928533f07ce8ac04")
@WinRTInterface("8b2ccd7e2ec0446d928533f07ce8ac04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaSettingsStatics.ByReference::class)
public interface ICortanaSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun GetDefault(): CortanaSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaSettingsStatics> {
    public override fun getValue() = ABI.makeICortanaSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ICortanaSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaSettingsStatics {
    public val __1180939676_Ptr: Pointer?

    public val _1180939676_VtblPtr: Pointer?
      get() = __1180939676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1180939676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1180939676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetDefault(): CortanaSettings? {
      val fnPtr = _1180939676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CortanaSettings>()
      val hr = fn.invokeHR(arrayOf(__1180939676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CortanaSettings>(result.getValue())
      return resultValue
    }
  }

  public class ICortanaSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1180939676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b2ccd7e2ec0446d928533f07ce8ac04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaSettingsStatics(ptr: Pointer?): WithDefault =
        ICortanaSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaSettingsStatics {
      val address = segment.toRawLongValue()
      return makeICortanaSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ICortanaSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1180939676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaSettingsStatics): Array<ICortanaSettingsStatics?>
        = (elements as
        Array<ICortanaSettingsStatics?>).castToImpl<ICortanaSettingsStatics,ICortanaSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaSettingsStatics?> =
        arrayOfNulls<ICortanaSettingsStatics_Impl>(size) as Array<ICortanaSettingsStatics?>
  }
}
