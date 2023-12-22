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

@ABIMarker(IPerceptionColorFrameSource2.ABI::class)
@Signature("{f88008e5-5631-45ed-ad98-8c6aa04cfb91}")
@Guid("f88008e5563145edad988c6aa04cfb91")
@WinRTInterface("f88008e5563145edad988c6aa04cfb91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionColorFrameSource2.ByReference::class)
public interface IPerceptionColorFrameSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionColorFrameSource2> {
    public override fun getValue() = ABI.makeIPerceptionColorFrameSource2(pointer.getPointer(0))

    public fun setValue(value: IPerceptionColorFrameSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionColorFrameSource2 {
    public val __1920058208_Ptr: Pointer?

    public val _1920058208_VtblPtr: Pointer?
      get() = __1920058208_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1920058208_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1920058208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionColorFrameSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1920058208_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionColorFrameSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f88008e5563145edad988c6aa04cfb91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionColorFrameSource2(ptr: Pointer?): WithDefault =
        IPerceptionColorFrameSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionColorFrameSource2 {
      val address = segment.toRawLongValue()
      return makeIPerceptionColorFrameSource2(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionColorFrameSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1920058208_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionColorFrameSource2):
        Array<IPerceptionColorFrameSource2?> = (elements as
        Array<IPerceptionColorFrameSource2?>).castToImpl<IPerceptionColorFrameSource2,IPerceptionColorFrameSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionColorFrameSource2?> =
        arrayOfNulls<IPerceptionColorFrameSource2_Impl>(size) as
        Array<IPerceptionColorFrameSource2?>
  }
}
