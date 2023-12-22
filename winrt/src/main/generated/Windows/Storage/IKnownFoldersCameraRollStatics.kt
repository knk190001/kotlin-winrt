package Windows.Storage

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

@ABIMarker(IKnownFoldersCameraRollStatics.ABI::class)
@Signature("{5d115e66-27e8-492f-b8e5-2f90896cd4cd}")
@Guid("5d115e6627e8492fb8e52f90896cd4cd")
@WinRTInterface("5d115e6627e8492fb8e52f90896cd4cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersCameraRollStatics.ByReference::class)
public interface IKnownFoldersCameraRollStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CameraRoll(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersCameraRollStatics> {
    public override fun getValue() = ABI.makeIKnownFoldersCameraRollStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersCameraRollStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersCameraRollStatics {
    public val __238817608_Ptr: Pointer?

    public val _238817608_VtblPtr: Pointer?
      get() = __238817608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CameraRoll(): StorageFolder? {
      val fnPtr = _238817608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__238817608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersCameraRollStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238817608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersCameraRollStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d115e6627e8492fb8e52f90896cd4cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersCameraRollStatics(ptr: Pointer?): WithDefault =
        IKnownFoldersCameraRollStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersCameraRollStatics {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersCameraRollStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersCameraRollStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238817608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersCameraRollStatics):
        Array<IKnownFoldersCameraRollStatics?> = (elements as
        Array<IKnownFoldersCameraRollStatics?>).castToImpl<IKnownFoldersCameraRollStatics,IKnownFoldersCameraRollStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersCameraRollStatics?> =
        arrayOfNulls<IKnownFoldersCameraRollStatics_Impl>(size) as
        Array<IKnownFoldersCameraRollStatics?>
  }
}
