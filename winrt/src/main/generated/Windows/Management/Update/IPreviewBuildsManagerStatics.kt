package Windows.Management.Update

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

@ABIMarker(IPreviewBuildsManagerStatics.ABI::class)
@Signature("{3e422887-b112-5a70-7da1-97d78d32aa29}")
@Guid("3e422887b1125a707da197d78d32aa29")
@WinRTInterface("3e422887b1125a707da197d78d32aa29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPreviewBuildsManagerStatics.ByReference::class)
public interface IPreviewBuildsManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): PreviewBuildsManager?

  @InterfaceMethod(1)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPreviewBuildsManagerStatics> {
    public override fun getValue() = ABI.makeIPreviewBuildsManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPreviewBuildsManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPreviewBuildsManagerStatics {
    public val __919157477_Ptr: Pointer?

    public val _919157477_VtblPtr: Pointer?
      get() = __919157477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): PreviewBuildsManager? {
      val fnPtr = _919157477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PreviewBuildsManager>()
      val hr = fn.invokeHR(arrayOf(__919157477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PreviewBuildsManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsSupported(): Boolean {
      val fnPtr = _919157477_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__919157477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPreviewBuildsManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __919157477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPreviewBuildsManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e422887b1125a707da197d78d32aa29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPreviewBuildsManagerStatics(ptr: Pointer?): WithDefault =
        IPreviewBuildsManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPreviewBuildsManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPreviewBuildsManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPreviewBuildsManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__919157477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPreviewBuildsManagerStatics):
        Array<IPreviewBuildsManagerStatics?> = (elements as
        Array<IPreviewBuildsManagerStatics?>).castToImpl<IPreviewBuildsManagerStatics,IPreviewBuildsManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPreviewBuildsManagerStatics?> =
        arrayOfNulls<IPreviewBuildsManagerStatics_Impl>(size) as
        Array<IPreviewBuildsManagerStatics?>
  }
}
