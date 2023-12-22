package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IBackgroundTransferGroupStatics.ABI::class)
@Signature("{02ec50b2-7d18-495b-aa22-32a97d45d3e2}")
@Guid("02ec50b27d18495baa2232a97d45d3e2")
@WinRTInterface("02ec50b27d18495baa2232a97d45d3e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferGroupStatics.ByReference::class)
public interface IBackgroundTransferGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateGroup(name: String?): BackgroundTransferGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferGroupStatics> {
    public override fun getValue() = ABI.makeIBackgroundTransferGroupStatics(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferGroupStatics {
    public val __711204448_Ptr: Pointer?

    public val _711204448_VtblPtr: Pointer?
      get() = __711204448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateGroup(name: String?): BackgroundTransferGroup? {
      val fnPtr = _711204448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferGroup>()
      val hr = fn.invokeHR(arrayOf(__711204448_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferGroup>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTransferGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __711204448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02ec50b27d18495baa2232a97d45d3e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferGroupStatics(ptr: Pointer?): WithDefault =
        IBackgroundTransferGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferGroupStatics {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__711204448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferGroupStatics):
        Array<IBackgroundTransferGroupStatics?> = (elements as
        Array<IBackgroundTransferGroupStatics?>).castToImpl<IBackgroundTransferGroupStatics,IBackgroundTransferGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferGroupStatics?> =
        arrayOfNulls<IBackgroundTransferGroupStatics_Impl>(size) as
        Array<IBackgroundTransferGroupStatics?>
  }
}
