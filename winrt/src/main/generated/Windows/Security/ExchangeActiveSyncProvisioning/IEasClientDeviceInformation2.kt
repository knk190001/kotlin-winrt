package Windows.Security.ExchangeActiveSyncProvisioning

import Windows.Security.ExchangeActiveSyncProvisioning.IEasClientDeviceInformation.ABI.IID
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEasClientDeviceInformation2.ABI::class)
@Signature("{ffb35923-bb26-4d6a-81bc-165aee0ad754}")
@Guid("ffb35923bb264d6a81bc165aee0ad754")
@WinRTInterface("ffb35923bb264d6a81bc165aee0ad754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasClientDeviceInformation2.ByReference::class)
public interface IEasClientDeviceInformation2 : NativeMapped, IWinRTInterface,
    IEasClientDeviceInformation {
  @InterfaceMethod(0)
  public fun get_SystemHardwareVersion(): String?

  @InterfaceMethod(1)
  public fun get_SystemFirmwareVersion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasClientDeviceInformation2> {
    public override fun getValue() = ABI.makeIEasClientDeviceInformation2(pointer.getPointer(0))

    public fun setValue(value: IEasClientDeviceInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasClientDeviceInformation2,
      IEasClientDeviceInformation.WithDefault {
    public val __260521527_Ptr: Pointer?

    public val _260521527_VtblPtr: Pointer?
      get() = __260521527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemHardwareVersion(): String? {
      val fnPtr = _260521527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__260521527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SystemFirmwareVersion(): String? {
      val fnPtr = _260521527_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__260521527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IEasClientDeviceInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IEasClientDeviceInformation {
    public override val __1255329911_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_260521527_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __260521527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasClientDeviceInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffb35923bb264d6a81bc165aee0ad754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasClientDeviceInformation2(ptr: Pointer?): WithDefault =
        IEasClientDeviceInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasClientDeviceInformation2 {
      val address = segment.toRawLongValue()
      return makeIEasClientDeviceInformation2(Pointer(address))
    }

    public override fun toNative(obj: IEasClientDeviceInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__260521527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasClientDeviceInformation2):
        Array<IEasClientDeviceInformation2?> = (elements as
        Array<IEasClientDeviceInformation2?>).castToImpl<IEasClientDeviceInformation2,IEasClientDeviceInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasClientDeviceInformation2?> =
        arrayOfNulls<IEasClientDeviceInformation2_Impl>(size) as
        Array<IEasClientDeviceInformation2?>
  }
}
