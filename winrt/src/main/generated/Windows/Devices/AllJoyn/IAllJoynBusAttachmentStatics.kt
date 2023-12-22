package Windows.Devices.AllJoyn

import Windows.Devices.Enumeration.DeviceWatcher
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IAllJoynBusAttachmentStatics.ABI::class)
@Signature("{839d4d3d-1051-40d7-872a-8d0141115b1f}")
@Guid("839d4d3d105140d7872a8d0141115b1f")
@WinRTInterface("839d4d3d105140d7872a8d0141115b1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusAttachmentStatics.ByReference::class)
public interface IAllJoynBusAttachmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AllJoynBusAttachment?

  @InterfaceMethod(1)
  public fun GetWatcher(requiredInterfaces: IIterable<String?>?): DeviceWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusAttachmentStatics> {
    public override fun getValue() = ABI.makeIAllJoynBusAttachmentStatics(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusAttachmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusAttachmentStatics {
    public val __1904190323_Ptr: Pointer?

    public val _1904190323_VtblPtr: Pointer?
      get() = __1904190323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AllJoynBusAttachment? {
      val fnPtr = _1904190323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusAttachment>()
      val hr = fn.invokeHR(arrayOf(__1904190323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusAttachment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetWatcher(requiredInterfaces: IIterable<String?>?): DeviceWatcher? {
      val fnPtr = _1904190323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1904190323_Ptr, marshalToNative(requiredInterfaces), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynBusAttachmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1904190323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusAttachmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("839d4d3d105140d7872a8d0141115b1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusAttachmentStatics(ptr: Pointer?): WithDefault =
        IAllJoynBusAttachmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusAttachmentStatics {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusAttachmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusAttachmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1904190323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusAttachmentStatics):
        Array<IAllJoynBusAttachmentStatics?> = (elements as
        Array<IAllJoynBusAttachmentStatics?>).castToImpl<IAllJoynBusAttachmentStatics,IAllJoynBusAttachmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusAttachmentStatics?> =
        arrayOfNulls<IAllJoynBusAttachmentStatics_Impl>(size) as
        Array<IAllJoynBusAttachmentStatics?>
  }
}
