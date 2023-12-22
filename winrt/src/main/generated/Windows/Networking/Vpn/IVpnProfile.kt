package Windows.Networking.Vpn

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnProfile.ABI::class)
@Signature("{7875b751-b0d7-43db-8a93-d3fe2479e56a}")
@Guid("7875b751b0d743db8a93d3fe2479e56a")
@WinRTInterface("7875b751b0d743db8a93d3fe2479e56a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnProfile.ByReference::class)
public interface IVpnProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun put_ProfileName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AppTriggers(): IVector<VpnAppId?>?

  @InterfaceMethod(3)
  public fun get_Routes(): IVector<VpnRoute?>?

  @InterfaceMethod(4)
  public fun get_DomainNameInfoList(): IVector<VpnDomainNameInfo?>?

  @InterfaceMethod(5)
  public fun get_TrafficFilters(): IVector<VpnTrafficFilter?>?

  @InterfaceMethod(6)
  public fun get_RememberCredentials(): Boolean

  @InterfaceMethod(7)
  public fun put_RememberCredentials(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_AlwaysOn(): Boolean

  @InterfaceMethod(9)
  public fun put_AlwaysOn(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnProfile> {
    public override fun getValue() = ABI.makeIVpnProfile(pointer.getPointer(0))

    public fun setValue(value: IVpnProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnProfile {
    public val __1256391737_Ptr: Pointer?

    public val _1256391737_VtblPtr: Pointer?
      get() = __1256391737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProfileName(value: String?): Unit {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppTriggers(): IVector<VpnAppId?>? {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnAppId?>>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnAppId?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Routes(): IVector<VpnRoute?>? {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnRoute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DomainNameInfoList(): IVector<VpnDomainNameInfo?>? {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnDomainNameInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnDomainNameInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TrafficFilters(): IVector<VpnTrafficFilter?>? {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnTrafficFilter?>>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnTrafficFilter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RememberCredentials(): Boolean {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RememberCredentials(value: Boolean): Unit {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AlwaysOn(): Boolean {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AlwaysOn(value: Boolean): Unit {
      val fnPtr = _1256391737_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1256391737_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1256391737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7875b751b0d743db8a93d3fe2479e56a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnProfile(ptr: Pointer?): WithDefault = IVpnProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnProfile {
      val address = segment.toRawLongValue()
      return makeIVpnProfile(Pointer(address))
    }

    public override fun toNative(obj: IVpnProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1256391737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnProfile): Array<IVpnProfile?> = (elements as
        Array<IVpnProfile?>).castToImpl<IVpnProfile,IVpnProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnProfile?> =
        arrayOfNulls<IVpnProfile_Impl>(size) as Array<IVpnProfile?>
  }
}
