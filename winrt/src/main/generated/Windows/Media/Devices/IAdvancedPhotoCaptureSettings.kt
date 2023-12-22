package Windows.Media.Devices

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

@ABIMarker(IAdvancedPhotoCaptureSettings.ABI::class)
@Signature("{08f3863a-0018-445b-93d2-646d1c5ed05c}")
@Guid("08f3863a0018445b93d2646d1c5ed05c")
@WinRTInterface("08f3863a0018445b93d2646d1c5ed05c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedPhotoCaptureSettings.ByReference::class)
public interface IAdvancedPhotoCaptureSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): AdvancedPhotoMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: AdvancedPhotoMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedPhotoCaptureSettings> {
    public override fun getValue() = ABI.makeIAdvancedPhotoCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: IAdvancedPhotoCaptureSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedPhotoCaptureSettings {
    public val __529706458_Ptr: Pointer?

    public val _529706458_VtblPtr: Pointer?
      get() = __529706458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): AdvancedPhotoMode? {
      val fnPtr = _529706458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdvancedPhotoMode>()
      val hr = fn.invokeHR(arrayOf(__529706458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdvancedPhotoMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: AdvancedPhotoMode?): Unit {
      val fnPtr = _529706458_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__529706458_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdvancedPhotoCaptureSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __529706458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedPhotoCaptureSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08f3863a0018445b93d2646d1c5ed05c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedPhotoCaptureSettings(ptr: Pointer?): WithDefault =
        IAdvancedPhotoCaptureSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedPhotoCaptureSettings {
      val address = segment.toRawLongValue()
      return makeIAdvancedPhotoCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedPhotoCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__529706458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedPhotoCaptureSettings):
        Array<IAdvancedPhotoCaptureSettings?> = (elements as
        Array<IAdvancedPhotoCaptureSettings?>).castToImpl<IAdvancedPhotoCaptureSettings,IAdvancedPhotoCaptureSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedPhotoCaptureSettings?> =
        arrayOfNulls<IAdvancedPhotoCaptureSettings_Impl>(size) as
        Array<IAdvancedPhotoCaptureSettings?>
  }
}
