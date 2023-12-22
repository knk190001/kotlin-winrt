package Windows.Media

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVideoEffectsStatics.ABI::class)
@Signature("{1fcda5e8-baf1-4521-980c-3bcebb44cf38}")
@Guid("1fcda5e8baf14521980c3bcebb44cf38")
@WinRTInterface("1fcda5e8baf14521980c3bcebb44cf38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEffectsStatics.ByReference::class)
public interface IVideoEffectsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoStabilization(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEffectsStatics> {
    public override fun getValue() = ABI.makeIVideoEffectsStatics(pointer.getPointer(0))

    public fun setValue(value: IVideoEffectsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEffectsStatics {
    public val __589514926_Ptr: Pointer?

    public val _589514926_VtblPtr: Pointer?
      get() = __589514926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoStabilization(): String? {
      val fnPtr = _589514926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__589514926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEffectsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589514926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEffectsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1fcda5e8baf14521980c3bcebb44cf38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEffectsStatics(ptr: Pointer?): WithDefault = IVideoEffectsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEffectsStatics {
      val address = segment.toRawLongValue()
      return makeIVideoEffectsStatics(Pointer(address))
    }

    public override fun toNative(obj: IVideoEffectsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589514926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEffectsStatics): Array<IVideoEffectsStatics?> =
        (elements as
        Array<IVideoEffectsStatics?>).castToImpl<IVideoEffectsStatics,IVideoEffectsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEffectsStatics?> =
        arrayOfNulls<IVideoEffectsStatics_Impl>(size) as Array<IVideoEffectsStatics?>
  }
}
