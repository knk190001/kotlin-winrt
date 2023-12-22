package Windows.Devices.Input

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPointerDeviceStatics.ABI::class)
@Signature("{d8b89aa1-d1c6-416e-bd8d-5790914dc563}")
@Guid("d8b89aa1d1c6416ebd8d5790914dc563")
@WinRTInterface("d8b89aa1d1c6416ebd8d5790914dc563")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerDeviceStatics.ByReference::class)
public interface IPointerDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPointerDevice(pointerId: WinDef.UINT): PointerDevice?

  @InterfaceMethod(1)
  public fun GetPointerDevices(): IVectorView<PointerDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerDeviceStatics> {
    public override fun getValue() = ABI.makeIPointerDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IPointerDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerDeviceStatics {
    public val __258481421_Ptr: Pointer?

    public val _258481421_VtblPtr: Pointer?
      get() = __258481421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPointerDevice(pointerId: WinDef.UINT): PointerDevice? {
      val fnPtr = _258481421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDevice>()
      val hr = fn.invokeHR(arrayOf(__258481421_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPointerDevices(): IVectorView<PointerDevice?>? {
      val fnPtr = _258481421_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PointerDevice?>>()
      val hr = fn.invokeHR(arrayOf(__258481421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PointerDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __258481421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8b89aa1d1c6416ebd8d5790914dc563")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerDeviceStatics(ptr: Pointer?): WithDefault =
        IPointerDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIPointerDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointerDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__258481421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerDeviceStatics): Array<IPointerDeviceStatics?> =
        (elements as
        Array<IPointerDeviceStatics?>).castToImpl<IPointerDeviceStatics,IPointerDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerDeviceStatics?> =
        arrayOfNulls<IPointerDeviceStatics_Impl>(size) as Array<IPointerDeviceStatics?>
  }
}
