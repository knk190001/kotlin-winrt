package Windows.System.Power

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

@ABIMarker(IForegroundEnergyManagerStatics.ABI::class)
@Signature("{9ff86872-e677-4814-9a20-5337ca732b98}")
@Guid("9ff86872e67748149a205337ca732b98")
@WinRTInterface("9ff86872e67748149a205337ca732b98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IForegroundEnergyManagerStatics.ByReference::class)
public interface IForegroundEnergyManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LowUsageLevel(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_NearMaxAcceptableUsageLevel(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxAcceptableUsageLevel(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_ExcessiveUsageLevel(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_RecentEnergyUsage(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_RecentEnergyUsageLevel(): WinDef.UINT

  @InterfaceMethod(6)
  public fun add_RecentEnergyUsageIncreased(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RecentEnergyUsageIncreased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_RecentEnergyUsageReturnedToLow(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_RecentEnergyUsageReturnedToLow(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IForegroundEnergyManagerStatics> {
    public override fun getValue() = ABI.makeIForegroundEnergyManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IForegroundEnergyManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IForegroundEnergyManagerStatics {
    public val __1749783611_Ptr: Pointer?

    public val _1749783611_VtblPtr: Pointer?
      get() = __1749783611_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LowUsageLevel(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NearMaxAcceptableUsageLevel(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxAcceptableUsageLevel(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExcessiveUsageLevel(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_RecentEnergyUsage(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_RecentEnergyUsageLevel(): WinDef.UINT {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun add_RecentEnergyUsageIncreased(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RecentEnergyUsageIncreased(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_RecentEnergyUsageReturnedToLow(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_RecentEnergyUsageReturnedToLow(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1749783611_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749783611_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IForegroundEnergyManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1749783611_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IForegroundEnergyManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ff86872e67748149a205337ca732b98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIForegroundEnergyManagerStatics(ptr: Pointer?): WithDefault =
        IForegroundEnergyManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IForegroundEnergyManagerStatics {
      val address = segment.toRawLongValue()
      return makeIForegroundEnergyManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IForegroundEnergyManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1749783611_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IForegroundEnergyManagerStatics):
        Array<IForegroundEnergyManagerStatics?> = (elements as
        Array<IForegroundEnergyManagerStatics?>).castToImpl<IForegroundEnergyManagerStatics,IForegroundEnergyManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IForegroundEnergyManagerStatics?> =
        arrayOfNulls<IForegroundEnergyManagerStatics_Impl>(size) as
        Array<IForegroundEnergyManagerStatics?>
  }
}
