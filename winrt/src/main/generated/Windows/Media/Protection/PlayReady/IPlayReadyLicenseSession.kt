package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.MediaProtectionManager
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

@ABIMarker(IPlayReadyLicenseSession.ABI::class)
@Signature("{a1723a39-87fa-4fdd-abbb-a9720e845259}")
@Guid("a1723a3987fa4fddabbba9720e845259")
@WinRTInterface("a1723a3987fa4fddabbba9720e845259")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseSession.ByReference::class)
public interface IPlayReadyLicenseSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateLAServiceRequest(): IPlayReadyLicenseAcquisitionServiceRequest?

  @InterfaceMethod(1)
  public fun ConfigureMediaProtectionManager(mpm: MediaProtectionManager?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseSession> {
    public override fun getValue() = ABI.makeIPlayReadyLicenseSession(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseSession {
    public val __1756852086_Ptr: Pointer?

    public val _1756852086_VtblPtr: Pointer?
      get() = __1756852086_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLAServiceRequest(): IPlayReadyLicenseAcquisitionServiceRequest? {
      val fnPtr = _1756852086_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPlayReadyLicenseAcquisitionServiceRequest>()
      val hr = fn.invokeHR(arrayOf(__1756852086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IPlayReadyLicenseAcquisitionServiceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConfigureMediaProtectionManager(mpm: MediaProtectionManager?): Unit {
      val fnPtr = _1756852086_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1756852086_Ptr, marshalToNative(mpm),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyLicenseSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1756852086_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1723a3987fa4fddabbba9720e845259")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseSession(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicenseSession {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseSession(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1756852086_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseSession):
        Array<IPlayReadyLicenseSession?> = (elements as
        Array<IPlayReadyLicenseSession?>).castToImpl<IPlayReadyLicenseSession,IPlayReadyLicenseSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseSession?> =
        arrayOfNulls<IPlayReadyLicenseSession_Impl>(size) as Array<IPlayReadyLicenseSession?>
  }
}
