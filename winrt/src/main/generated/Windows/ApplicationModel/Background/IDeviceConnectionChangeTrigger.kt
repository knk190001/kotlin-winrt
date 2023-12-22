package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceConnectionChangeTrigger.ABI::class)
@Signature("{90875e64-3cdd-4efb-ab1c-5b3b6a60ce34}")
@Guid("90875e643cdd4efbab1c5b3b6a60ce34")
@WinRTInterface("90875e643cdd4efbab1c5b3b6a60ce34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceConnectionChangeTrigger.ByReference::class)
public interface IDeviceConnectionChangeTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger
    {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_CanMaintainConnection(): Boolean

  @InterfaceMethod(2)
  public fun get_MaintainConnection(): Boolean

  @InterfaceMethod(3)
  public fun put_MaintainConnection(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceConnectionChangeTrigger> {
    public override fun getValue() = ABI.makeIDeviceConnectionChangeTrigger(pointer.getPointer(0))

    public fun setValue(value: IDeviceConnectionChangeTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceConnectionChangeTrigger, IBackgroundTrigger.WithDefault {
    public val __1486454237_Ptr: Pointer?

    public val _1486454237_VtblPtr: Pointer?
      get() = __1486454237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1486454237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1486454237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanMaintainConnection(): Boolean {
      val fnPtr = _1486454237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1486454237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaintainConnection(): Boolean {
      val fnPtr = _1486454237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1486454237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaintainConnection(value: Boolean): Unit {
      val fnPtr = _1486454237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1486454237_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeviceConnectionChangeTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1486454237_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1486454237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceConnectionChangeTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90875e643cdd4efbab1c5b3b6a60ce34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceConnectionChangeTrigger(ptr: Pointer?): WithDefault =
        IDeviceConnectionChangeTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceConnectionChangeTrigger {
      val address = segment.toRawLongValue()
      return makeIDeviceConnectionChangeTrigger(Pointer(address))
    }

    public override fun toNative(obj: IDeviceConnectionChangeTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486454237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceConnectionChangeTrigger):
        Array<IDeviceConnectionChangeTrigger?> = (elements as
        Array<IDeviceConnectionChangeTrigger?>).castToImpl<IDeviceConnectionChangeTrigger,IDeviceConnectionChangeTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceConnectionChangeTrigger?> =
        arrayOfNulls<IDeviceConnectionChangeTrigger_Impl>(size) as
        Array<IDeviceConnectionChangeTrigger?>
  }
}
