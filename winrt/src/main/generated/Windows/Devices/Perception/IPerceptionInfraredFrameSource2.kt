package Windows.Devices.Perception

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

@ABIMarker(IPerceptionInfraredFrameSource2.ABI::class)
@Signature("{dcd4d798-4b0b-4300-8d85-410817faa032}")
@Guid("dcd4d7984b0b43008d85410817faa032")
@WinRTInterface("dcd4d7984b0b43008d85410817faa032")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSource2.ByReference::class)
public interface IPerceptionInfraredFrameSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSource2> {
    public override fun getValue() = ABI.makeIPerceptionInfraredFrameSource2(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSource2 {
    public val __2100379784_Ptr: Pointer?

    public val _2100379784_VtblPtr: Pointer?
      get() = __2100379784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _2100379784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2100379784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2100379784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcd4d7984b0b43008d85410817faa032")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSource2(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionInfraredFrameSource2 {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSource2(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100379784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSource2):
        Array<IPerceptionInfraredFrameSource2?> = (elements as
        Array<IPerceptionInfraredFrameSource2?>).castToImpl<IPerceptionInfraredFrameSource2,IPerceptionInfraredFrameSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSource2?> =
        arrayOfNulls<IPerceptionInfraredFrameSource2_Impl>(size) as
        Array<IPerceptionInfraredFrameSource2?>
  }
}
