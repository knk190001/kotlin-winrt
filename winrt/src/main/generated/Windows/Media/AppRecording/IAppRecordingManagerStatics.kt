package Windows.Media.AppRecording

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

@ABIMarker(IAppRecordingManagerStatics.ABI::class)
@Signature("{50e709f7-38ce-4bd3-9db2-e72bbe9de11d}")
@Guid("50e709f738ce4bd39db2e72bbe9de11d")
@WinRTInterface("50e709f738ce4bd39db2e72bbe9de11d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppRecordingManagerStatics.ByReference::class)
public interface IAppRecordingManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AppRecordingManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppRecordingManagerStatics> {
    public override fun getValue() = ABI.makeIAppRecordingManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppRecordingManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppRecordingManagerStatics {
    public val __2059485196_Ptr: Pointer?

    public val _2059485196_VtblPtr: Pointer?
      get() = __2059485196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AppRecordingManager? {
      val fnPtr = _2059485196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppRecordingManager>()
      val hr = fn.invokeHR(arrayOf(__2059485196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppRecordingManager>(result.getValue())
      return resultValue
    }
  }

  public class IAppRecordingManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2059485196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppRecordingManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50e709f738ce4bd39db2e72bbe9de11d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppRecordingManagerStatics(ptr: Pointer?): WithDefault =
        IAppRecordingManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppRecordingManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppRecordingManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppRecordingManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059485196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppRecordingManagerStatics):
        Array<IAppRecordingManagerStatics?> = (elements as
        Array<IAppRecordingManagerStatics?>).castToImpl<IAppRecordingManagerStatics,IAppRecordingManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppRecordingManagerStatics?> =
        arrayOfNulls<IAppRecordingManagerStatics_Impl>(size) as Array<IAppRecordingManagerStatics?>
  }
}
