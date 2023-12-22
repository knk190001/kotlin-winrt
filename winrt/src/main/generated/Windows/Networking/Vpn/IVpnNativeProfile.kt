package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Networking.Vpn.IVpnProfile.ABI.IID
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

@ABIMarker(IVpnNativeProfile.ABI::class)
@Signature("{a4aee29e-6417-4333-9842-f0a66db69802}")
@Guid("a4aee29e641743339842f0a66db69802")
@WinRTInterface("a4aee29e641743339842f0a66db69802")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnNativeProfile.ByReference::class)
public interface IVpnNativeProfile : NativeMapped, IWinRTInterface, IVpnProfile {
  @InterfaceMethod(0)
  public fun get_Servers(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_RoutingPolicyType(): VpnRoutingPolicyType?

  @InterfaceMethod(2)
  public fun put_RoutingPolicyType(value: VpnRoutingPolicyType?): Unit

  @InterfaceMethod(3)
  public fun get_NativeProtocolType(): VpnNativeProtocolType?

  @InterfaceMethod(4)
  public fun put_NativeProtocolType(value: VpnNativeProtocolType?): Unit

  @InterfaceMethod(5)
  public fun get_UserAuthenticationMethod(): VpnAuthenticationMethod?

  @InterfaceMethod(6)
  public fun put_UserAuthenticationMethod(value: VpnAuthenticationMethod?): Unit

  @InterfaceMethod(7)
  public fun get_TunnelAuthenticationMethod(): VpnAuthenticationMethod?

  @InterfaceMethod(8)
  public fun put_TunnelAuthenticationMethod(value: VpnAuthenticationMethod?): Unit

  @InterfaceMethod(9)
  public fun get_EapConfiguration(): String?

  @InterfaceMethod(10)
  public fun put_EapConfiguration(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnNativeProfile> {
    public override fun getValue() = ABI.makeIVpnNativeProfile(pointer.getPointer(0))

    public fun setValue(value: IVpnNativeProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnNativeProfile, IVpnProfile.WithDefault {
    public val __1016604706_Ptr: Pointer?

    public val _1016604706_VtblPtr: Pointer?
      get() = __1016604706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Servers(): IVector<String?>? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RoutingPolicyType(): VpnRoutingPolicyType? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnRoutingPolicyType>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnRoutingPolicyType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_RoutingPolicyType(value: VpnRoutingPolicyType?): Unit {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_NativeProtocolType(): VpnNativeProtocolType? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnNativeProtocolType>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnNativeProtocolType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_NativeProtocolType(value: VpnNativeProtocolType?): Unit {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_UserAuthenticationMethod(): VpnAuthenticationMethod? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAuthenticationMethod>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAuthenticationMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_UserAuthenticationMethod(value: VpnAuthenticationMethod?): Unit {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_TunnelAuthenticationMethod(): VpnAuthenticationMethod? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAuthenticationMethod>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAuthenticationMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_TunnelAuthenticationMethod(value: VpnAuthenticationMethod?): Unit {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_EapConfiguration(): String? {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_EapConfiguration(value: String?): Unit {
      val fnPtr = _1016604706_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016604706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnNativeProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnProfile {
    public override val __1256391737_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1016604706_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1016604706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnNativeProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4aee29e641743339842f0a66db69802")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnNativeProfile(ptr: Pointer?): WithDefault = IVpnNativeProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnNativeProfile {
      val address = segment.toRawLongValue()
      return makeIVpnNativeProfile(Pointer(address))
    }

    public override fun toNative(obj: IVpnNativeProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016604706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnNativeProfile): Array<IVpnNativeProfile?> = (elements
        as Array<IVpnNativeProfile?>).castToImpl<IVpnNativeProfile,IVpnNativeProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnNativeProfile?> =
        arrayOfNulls<IVpnNativeProfile_Impl>(size) as Array<IVpnNativeProfile?>
  }
}
