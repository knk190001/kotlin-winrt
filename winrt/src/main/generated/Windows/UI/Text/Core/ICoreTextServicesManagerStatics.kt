package Windows.UI.Text.Core

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

@ABIMarker(ICoreTextServicesManagerStatics.ABI::class)
@Signature("{1520a388-e2cf-4d65-aeb9-b32d86fe39b9}")
@Guid("1520a388e2cf4d65aeb9b32d86fe39b9")
@WinRTInterface("1520a388e2cf4d65aeb9b32d86fe39b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextServicesManagerStatics.ByReference::class)
public interface ICoreTextServicesManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): CoreTextServicesManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextServicesManagerStatics> {
    public override fun getValue() = ABI.makeICoreTextServicesManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreTextServicesManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextServicesManagerStatics {
    public val __935901658_Ptr: Pointer?

    public val _935901658_VtblPtr: Pointer?
      get() = __935901658_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): CoreTextServicesManager? {
      val fnPtr = _935901658_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextServicesManager>()
      val hr = fn.invokeHR(arrayOf(__935901658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextServicesManager>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextServicesManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __935901658_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextServicesManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1520a388e2cf4d65aeb9b32d86fe39b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextServicesManagerStatics(ptr: Pointer?): WithDefault =
        ICoreTextServicesManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextServicesManagerStatics {
      val address = segment.toRawLongValue()
      return makeICoreTextServicesManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextServicesManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935901658_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextServicesManagerStatics):
        Array<ICoreTextServicesManagerStatics?> = (elements as
        Array<ICoreTextServicesManagerStatics?>).castToImpl<ICoreTextServicesManagerStatics,ICoreTextServicesManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextServicesManagerStatics?> =
        arrayOfNulls<ICoreTextServicesManagerStatics_Impl>(size) as
        Array<ICoreTextServicesManagerStatics?>
  }
}
