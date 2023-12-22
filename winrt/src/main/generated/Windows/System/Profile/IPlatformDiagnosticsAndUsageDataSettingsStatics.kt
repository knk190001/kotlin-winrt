package Windows.System.Profile

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPlatformDiagnosticsAndUsageDataSettingsStatics.ABI::class)
@Signature("{b6e24c1b-7b1c-4b32-8c62-a66597ce723a}")
@Guid("b6e24c1b7b1c4b328c62a66597ce723a")
@WinRTInterface("b6e24c1b7b1c4b328c62a66597ce723a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformDiagnosticsAndUsageDataSettingsStatics.ByReference::class)
public interface IPlatformDiagnosticsAndUsageDataSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollectionLevel(): PlatformDataCollectionLevel?

  @InterfaceMethod(1)
  public fun add_CollectionLevelChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_CollectionLevelChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun CanCollectDiagnostics(level: PlatformDataCollectionLevel?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformDiagnosticsAndUsageDataSettingsStatics> {
    public override fun getValue() =
        ABI.makeIPlatformDiagnosticsAndUsageDataSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IPlatformDiagnosticsAndUsageDataSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformDiagnosticsAndUsageDataSettingsStatics {
    public val __914936809_Ptr: Pointer?

    public val _914936809_VtblPtr: Pointer?
      get() = __914936809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollectionLevel(): PlatformDataCollectionLevel? {
      val fnPtr = _914936809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDataCollectionLevel>()
      val hr = fn.invokeHR(arrayOf(__914936809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDataCollectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_CollectionLevelChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _914936809_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__914936809_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_CollectionLevelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _914936809_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__914936809_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun CanCollectDiagnostics(level: PlatformDataCollectionLevel?): Boolean {
      val fnPtr = _914936809_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__914936809_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlatformDiagnosticsAndUsageDataSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __914936809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformDiagnosticsAndUsageDataSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6e24c1b7b1c4b328c62a66597ce723a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformDiagnosticsAndUsageDataSettingsStatics(ptr: Pointer?): WithDefault =
        IPlatformDiagnosticsAndUsageDataSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlatformDiagnosticsAndUsageDataSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIPlatformDiagnosticsAndUsageDataSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlatformDiagnosticsAndUsageDataSettingsStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__914936809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformDiagnosticsAndUsageDataSettingsStatics):
        Array<IPlatformDiagnosticsAndUsageDataSettingsStatics?> = (elements as
        Array<IPlatformDiagnosticsAndUsageDataSettingsStatics?>).castToImpl<IPlatformDiagnosticsAndUsageDataSettingsStatics,IPlatformDiagnosticsAndUsageDataSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformDiagnosticsAndUsageDataSettingsStatics?>
        = arrayOfNulls<IPlatformDiagnosticsAndUsageDataSettingsStatics_Impl>(size) as
        Array<IPlatformDiagnosticsAndUsageDataSettingsStatics?>
  }
}
