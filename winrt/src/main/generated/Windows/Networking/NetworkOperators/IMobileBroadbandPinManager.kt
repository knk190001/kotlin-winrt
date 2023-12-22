package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandPinManager.ABI::class)
@Signature("{83567edd-6e1f-4b9b-a413-2b1f50cc36df}")
@Guid("83567edd6e1f4b9ba4132b1f50cc36df")
@WinRTInterface("83567edd6e1f4b9ba4132b1f50cc36df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandPinManager.ByReference::class)
public interface IMobileBroadbandPinManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedPins(): IVectorView<MobileBroadbandPinType?>?

  @InterfaceMethod(1)
  public fun GetPin(pinType: MobileBroadbandPinType?): MobileBroadbandPin?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandPinManager> {
    public override fun getValue() = ABI.makeIMobileBroadbandPinManager(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandPinManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandPinManager {
    public val __1264897132_Ptr: Pointer?

    public val _1264897132_VtblPtr: Pointer?
      get() = __1264897132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedPins(): IVectorView<MobileBroadbandPinType?>? {
      val fnPtr = _1264897132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandPinType?>>()
      val hr = fn.invokeHR(arrayOf(__1264897132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandPinType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPin(pinType: MobileBroadbandPinType?): MobileBroadbandPin? {
      val fnPtr = _1264897132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPin>()
      val hr = fn.invokeHR(arrayOf(__1264897132_Ptr, marshalToNative(pinType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPin>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandPinManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1264897132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandPinManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83567edd6e1f4b9ba4132b1f50cc36df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandPinManager(ptr: Pointer?): WithDefault =
        IMobileBroadbandPinManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandPinManager {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandPinManager(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandPinManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1264897132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandPinManager):
        Array<IMobileBroadbandPinManager?> = (elements as
        Array<IMobileBroadbandPinManager?>).castToImpl<IMobileBroadbandPinManager,IMobileBroadbandPinManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandPinManager?> =
        arrayOfNulls<IMobileBroadbandPinManager_Impl>(size) as Array<IMobileBroadbandPinManager?>
  }
}
