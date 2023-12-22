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

@ABIMarker(IKnownPerceptionFrameSourcePropertiesStatics2.ABI::class)
@Signature("{a9c86871-05dc-4a4d-8a5c-a4ecf26bbc46}")
@Guid("a9c8687105dc4a4d8a5ca4ecf26bbc46")
@WinRTInterface("a9c8687105dc4a4d8a5ca4ecf26bbc46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionFrameSourcePropertiesStatics2.ByReference::class)
public interface IKnownPerceptionFrameSourcePropertiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionFrameSourcePropertiesStatics2> {
    public override fun getValue() =
        ABI.makeIKnownPerceptionFrameSourcePropertiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionFrameSourcePropertiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionFrameSourcePropertiesStatics2 {
    public val __1788406408_Ptr: Pointer?

    public val _1788406408_VtblPtr: Pointer?
      get() = __1788406408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1788406408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1788406408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionFrameSourcePropertiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788406408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionFrameSourcePropertiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9c8687105dc4a4d8a5ca4ecf26bbc46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionFrameSourcePropertiesStatics2(ptr: Pointer?): WithDefault =
        IKnownPerceptionFrameSourcePropertiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownPerceptionFrameSourcePropertiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionFrameSourcePropertiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionFrameSourcePropertiesStatics2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1788406408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionFrameSourcePropertiesStatics2):
        Array<IKnownPerceptionFrameSourcePropertiesStatics2?> = (elements as
        Array<IKnownPerceptionFrameSourcePropertiesStatics2?>).castToImpl<IKnownPerceptionFrameSourcePropertiesStatics2,IKnownPerceptionFrameSourcePropertiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownPerceptionFrameSourcePropertiesStatics2?> =
        arrayOfNulls<IKnownPerceptionFrameSourcePropertiesStatics2_Impl>(size) as
        Array<IKnownPerceptionFrameSourcePropertiesStatics2?>
  }
}
