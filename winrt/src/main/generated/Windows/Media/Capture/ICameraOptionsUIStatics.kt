package Windows.Media.Capture

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

@ABIMarker(ICameraOptionsUIStatics.ABI::class)
@Signature("{3b0d5e34-3906-4b7d-946c-7bde844499ae}")
@Guid("3b0d5e3439064b7d946c7bde844499ae")
@WinRTInterface("3b0d5e3439064b7d946c7bde844499ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraOptionsUIStatics.ByReference::class)
public interface ICameraOptionsUIStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Show(mediaCapture: MediaCapture?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraOptionsUIStatics> {
    public override fun getValue() = ABI.makeICameraOptionsUIStatics(pointer.getPointer(0))

    public fun setValue(value: ICameraOptionsUIStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraOptionsUIStatics {
    public val __2042157264_Ptr: Pointer?

    public val _2042157264_VtblPtr: Pointer?
      get() = __2042157264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Show(mediaCapture: MediaCapture?): Unit {
      val fnPtr = _2042157264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2042157264_Ptr, marshalToNative(mediaCapture),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraOptionsUIStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042157264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraOptionsUIStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b0d5e3439064b7d946c7bde844499ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraOptionsUIStatics(ptr: Pointer?): WithDefault =
        ICameraOptionsUIStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraOptionsUIStatics {
      val address = segment.toRawLongValue()
      return makeICameraOptionsUIStatics(Pointer(address))
    }

    public override fun toNative(obj: ICameraOptionsUIStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042157264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraOptionsUIStatics): Array<ICameraOptionsUIStatics?>
        = (elements as
        Array<ICameraOptionsUIStatics?>).castToImpl<ICameraOptionsUIStatics,ICameraOptionsUIStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraOptionsUIStatics?> =
        arrayOfNulls<ICameraOptionsUIStatics_Impl>(size) as Array<ICameraOptionsUIStatics?>
  }
}
