package Windows.Embedded.DeviceLockdown

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IDeviceLockdownProfileStatics.ABI::class)
@Signature("{622f6965-f9a8-41a1-a691-88cd80c7a069}")
@Guid("622f6965f9a841a1a69188cd80c7a069")
@WinRTInterface("622f6965f9a841a1a69188cd80c7a069")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceLockdownProfileStatics.ByReference::class)
public interface IDeviceLockdownProfileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSupportedLockdownProfiles(): IVectorView<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(1)
  public fun GetCurrentLockdownProfile(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun ApplyLockdownProfileAsync(profileID: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncAction?

  @InterfaceMethod(3)
  public fun GetLockdownProfileInformation(profileID: com.sun.jna.platform.win32.Guid.GUID?):
      DeviceLockdownProfileInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceLockdownProfileStatics> {
    public override fun getValue() = ABI.makeIDeviceLockdownProfileStatics(pointer.getPointer(0))

    public fun setValue(value: IDeviceLockdownProfileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceLockdownProfileStatics {
    public val __879944140_Ptr: Pointer?

    public val _879944140_VtblPtr: Pointer?
      get() = __879944140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSupportedLockdownProfiles():
        IVectorView<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _879944140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__879944140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentLockdownProfile(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _879944140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__879944140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ApplyLockdownProfileAsync(profileID: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncAction? {
      val fnPtr = _879944140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__879944140_Ptr, marshalToNative(profileID), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun GetLockdownProfileInformation(profileID: com.sun.jna.platform.win32.Guid.GUID?):
        DeviceLockdownProfileInformation? {
      val fnPtr = _879944140_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceLockdownProfileInformation>()
      val hr = fn.invokeHR(arrayOf(__879944140_Ptr, marshalToNative(profileID), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceLockdownProfileInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceLockdownProfileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __879944140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceLockdownProfileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("622f6965f9a841a1a69188cd80c7a069")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceLockdownProfileStatics(ptr: Pointer?): WithDefault =
        IDeviceLockdownProfileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceLockdownProfileStatics {
      val address = segment.toRawLongValue()
      return makeIDeviceLockdownProfileStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeviceLockdownProfileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__879944140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceLockdownProfileStatics):
        Array<IDeviceLockdownProfileStatics?> = (elements as
        Array<IDeviceLockdownProfileStatics?>).castToImpl<IDeviceLockdownProfileStatics,IDeviceLockdownProfileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceLockdownProfileStatics?> =
        arrayOfNulls<IDeviceLockdownProfileStatics_Impl>(size) as
        Array<IDeviceLockdownProfileStatics?>
  }
}
