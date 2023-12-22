package Windows.ApplicationModel.Calls.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallOriginManagerStatics.ABI::class)
@Signature("{ccfc5a0a-9af7-6149-39d0-e076fcce1395}")
@Guid("ccfc5a0a9af7614939d0e076fcce1395")
@WinRTInterface("ccfc5a0a9af7614939d0e076fcce1395")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOriginManagerStatics.ByReference::class)
public interface IPhoneCallOriginManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCurrentAppActiveCallOriginApp(): Boolean

  @InterfaceMethod(1)
  public fun ShowPhoneCallOriginSettingsUI(): Unit

  @InterfaceMethod(2)
  public fun SetCallOrigin(requestId: com.sun.jna.platform.win32.Guid.GUID?,
      callOrigin: PhoneCallOrigin?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOriginManagerStatics> {
    public override fun getValue() = ABI.makeIPhoneCallOriginManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOriginManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOriginManagerStatics {
    public val __228439627_Ptr: Pointer?

    public val _228439627_VtblPtr: Pointer?
      get() = __228439627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCurrentAppActiveCallOriginApp(): Boolean {
      val fnPtr = _228439627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__228439627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ShowPhoneCallOriginSettingsUI(): Unit {
      val fnPtr = _228439627_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228439627_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetCallOrigin(requestId: com.sun.jna.platform.win32.Guid.GUID?,
        callOrigin: PhoneCallOrigin?): Unit {
      val fnPtr = _228439627_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228439627_Ptr, marshalToNative(requestId),
          marshalToNative(callOrigin),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallOriginManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __228439627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOriginManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccfc5a0a9af7614939d0e076fcce1395")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOriginManagerStatics(ptr: Pointer?): WithDefault =
        IPhoneCallOriginManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOriginManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOriginManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOriginManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__228439627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOriginManagerStatics):
        Array<IPhoneCallOriginManagerStatics?> = (elements as
        Array<IPhoneCallOriginManagerStatics?>).castToImpl<IPhoneCallOriginManagerStatics,IPhoneCallOriginManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOriginManagerStatics?> =
        arrayOfNulls<IPhoneCallOriginManagerStatics_Impl>(size) as
        Array<IPhoneCallOriginManagerStatics?>
  }
}
