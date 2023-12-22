package Microsoft.UI.Input.Interop

import Microsoft.UI.Input.PointerPoint
import Windows.Devices.Input.PenDevice
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

@ABIMarker(IPenDeviceInteropStatics.ABI::class)
@Signature("{c2a59f2a-e077-5d30-a1bd-cf84dd09ee39}")
@Guid("c2a59f2ae0775d30a1bdcf84dd09ee39")
@WinRTInterface("c2a59f2ae0775d30a1bdcf84dd09ee39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDeviceInteropStatics.ByReference::class)
public interface IPenDeviceInteropStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromPointerPoint(pointerPoint: PointerPoint?): PenDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenDeviceInteropStatics> {
    public override fun getValue() = ABI.makeIPenDeviceInteropStatics(pointer.getPointer(0))

    public fun setValue(value: IPenDeviceInteropStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDeviceInteropStatics {
    public val __1998471923_Ptr: Pointer?

    public val _1998471923_VtblPtr: Pointer?
      get() = __1998471923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromPointerPoint(pointerPoint: PointerPoint?): PenDevice? {
      val fnPtr = _1998471923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenDevice>()
      val hr = fn.invokeHR(arrayOf(__1998471923_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenDevice>(result.getValue())
      return resultValue
    }
  }

  public class IPenDeviceInteropStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998471923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDeviceInteropStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2a59f2ae0775d30a1bdcf84dd09ee39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDeviceInteropStatics(ptr: Pointer?): WithDefault =
        IPenDeviceInteropStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDeviceInteropStatics {
      val address = segment.toRawLongValue()
      return makeIPenDeviceInteropStatics(Pointer(address))
    }

    public override fun toNative(obj: IPenDeviceInteropStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998471923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDeviceInteropStatics):
        Array<IPenDeviceInteropStatics?> = (elements as
        Array<IPenDeviceInteropStatics?>).castToImpl<IPenDeviceInteropStatics,IPenDeviceInteropStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDeviceInteropStatics?> =
        arrayOfNulls<IPenDeviceInteropStatics_Impl>(size) as Array<IPenDeviceInteropStatics?>
  }
}
