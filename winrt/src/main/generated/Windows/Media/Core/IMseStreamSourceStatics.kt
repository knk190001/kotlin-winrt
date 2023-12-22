package Windows.Media.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMseStreamSourceStatics.ABI::class)
@Signature("{465c679d-d570-43ce-ba21-0bff5f3fbd0a}")
@Guid("465c679dd57043ceba210bff5f3fbd0a")
@WinRTInterface("465c679dd57043ceba210bff5f3fbd0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMseStreamSourceStatics.ByReference::class)
public interface IMseStreamSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsContentTypeSupported(contentType: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMseStreamSourceStatics> {
    public override fun getValue() = ABI.makeIMseStreamSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IMseStreamSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMseStreamSourceStatics {
    public val __32304800_Ptr: Pointer?

    public val _32304800_VtblPtr: Pointer?
      get() = __32304800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsContentTypeSupported(contentType: String?): Boolean {
      val fnPtr = _32304800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__32304800_Ptr, marshalToNative(contentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMseStreamSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __32304800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMseStreamSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("465c679dd57043ceba210bff5f3fbd0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMseStreamSourceStatics(ptr: Pointer?): WithDefault =
        IMseStreamSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMseStreamSourceStatics {
      val address = segment.toRawLongValue()
      return makeIMseStreamSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IMseStreamSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__32304800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMseStreamSourceStatics): Array<IMseStreamSourceStatics?>
        = (elements as
        Array<IMseStreamSourceStatics?>).castToImpl<IMseStreamSourceStatics,IMseStreamSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMseStreamSourceStatics?> =
        arrayOfNulls<IMseStreamSourceStatics_Impl>(size) as Array<IMseStreamSourceStatics?>
  }
}
