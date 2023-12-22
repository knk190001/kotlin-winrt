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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDefaultAudioDeviceChangedEventArgs.ABI::class)
@Signature("{110f882f-1c05-4657-a18e-47c9b69f07ab}")
@Guid("110f882f1c054657a18e47c9b69f07ab")
@WinRTInterface("110f882f1c054657a18e47c9b69f07ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDefaultAudioDeviceChangedEventArgs.ByReference::class)
public interface IDefaultAudioDeviceChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Role(): AudioDeviceRole?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDefaultAudioDeviceChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIDefaultAudioDeviceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDefaultAudioDeviceChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDefaultAudioDeviceChangedEventArgs {
    public val __1536666097_Ptr: Pointer?

    public val _1536666097_VtblPtr: Pointer?
      get() = __1536666097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1536666097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1536666097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Role(): AudioDeviceRole? {
      val fnPtr = _1536666097_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceRole>()
      val hr = fn.invokeHR(arrayOf(__1536666097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceRole>(result.getValue())
      return resultValue
    }
  }

  public class IDefaultAudioDeviceChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1536666097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDefaultAudioDeviceChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("110f882f1c054657a18e47c9b69f07ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDefaultAudioDeviceChangedEventArgs(ptr: Pointer?): WithDefault =
        IDefaultAudioDeviceChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDefaultAudioDeviceChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDefaultAudioDeviceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDefaultAudioDeviceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1536666097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDefaultAudioDeviceChangedEventArgs):
        Array<IDefaultAudioDeviceChangedEventArgs?> = (elements as
        Array<IDefaultAudioDeviceChangedEventArgs?>).castToImpl<IDefaultAudioDeviceChangedEventArgs,IDefaultAudioDeviceChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDefaultAudioDeviceChangedEventArgs?> =
        arrayOfNulls<IDefaultAudioDeviceChangedEventArgs_Impl>(size) as
        Array<IDefaultAudioDeviceChangedEventArgs?>
  }
}
