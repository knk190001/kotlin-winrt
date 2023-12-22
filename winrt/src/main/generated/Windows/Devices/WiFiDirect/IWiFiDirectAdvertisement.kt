package Windows.Devices.WiFiDirect

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IWiFiDirectAdvertisement.ABI::class)
@Signature("{ab511a2d-2a06-49a1-a584-61435c7905a6}")
@Guid("ab511a2d2a0649a1a58461435c7905a6")
@WinRTInterface("ab511a2d2a0649a1a58461435c7905a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectAdvertisement.ByReference::class)
public interface IWiFiDirectAdvertisement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InformationElements(): IVector<WiFiDirectInformationElement?>?

  @InterfaceMethod(1)
  public fun put_InformationElements(value: IVector<WiFiDirectInformationElement?>?): Unit

  @InterfaceMethod(2)
  public fun get_ListenStateDiscoverability(): WiFiDirectAdvertisementListenStateDiscoverability?

  @InterfaceMethod(3)
  public
      fun put_ListenStateDiscoverability(value: WiFiDirectAdvertisementListenStateDiscoverability?):
      Unit

  @InterfaceMethod(4)
  public fun get_IsAutonomousGroupOwnerEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAutonomousGroupOwnerEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_LegacySettings(): WiFiDirectLegacySettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectAdvertisement> {
    public override fun getValue() = ABI.makeIWiFiDirectAdvertisement(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectAdvertisement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectAdvertisement {
    public val __1027862152_Ptr: Pointer?

    public val _1027862152_VtblPtr: Pointer?
      get() = __1027862152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InformationElements(): IVector<WiFiDirectInformationElement?>? {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectInformationElement?>>()
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WiFiDirectInformationElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InformationElements(value: IVector<WiFiDirectInformationElement?>?):
        Unit {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ListenStateDiscoverability():
        WiFiDirectAdvertisementListenStateDiscoverability? {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectAdvertisementListenStateDiscoverability>()
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<WiFiDirectAdvertisementListenStateDiscoverability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun put_ListenStateDiscoverability(value: WiFiDirectAdvertisementListenStateDiscoverability?):
        Unit {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAutonomousGroupOwnerEnabled(): Boolean {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAutonomousGroupOwnerEnabled(value: Boolean): Unit {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LegacySettings(): WiFiDirectLegacySettings? {
      val fnPtr = _1027862152_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectLegacySettings>()
      val hr = fn.invokeHR(arrayOf(__1027862152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectLegacySettings>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectAdvertisement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1027862152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectAdvertisement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab511a2d2a0649a1a58461435c7905a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectAdvertisement(ptr: Pointer?): WithDefault =
        IWiFiDirectAdvertisement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectAdvertisement {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectAdvertisement(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectAdvertisement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1027862152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectAdvertisement):
        Array<IWiFiDirectAdvertisement?> = (elements as
        Array<IWiFiDirectAdvertisement?>).castToImpl<IWiFiDirectAdvertisement,IWiFiDirectAdvertisement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectAdvertisement?> =
        arrayOfNulls<IWiFiDirectAdvertisement_Impl>(size) as Array<IWiFiDirectAdvertisement?>
  }
}
