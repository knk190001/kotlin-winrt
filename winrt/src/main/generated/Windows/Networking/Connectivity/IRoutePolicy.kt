package Windows.Networking.Connectivity

import Windows.Networking.DomainNameType
import Windows.Networking.HostName
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

@ABIMarker(IRoutePolicy.ABI::class)
@Signature("{11abc4ac-0fc7-42e4-8742-569923b1ca11}")
@Guid("11abc4ac0fc742e48742569923b1ca11")
@WinRTInterface("11abc4ac0fc742e48742569923b1ca11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRoutePolicy.ByReference::class)
public interface IRoutePolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConnectionProfile(): ConnectionProfile?

  @InterfaceMethod(1)
  public fun get_HostName(): HostName?

  @InterfaceMethod(2)
  public fun get_HostNameType(): DomainNameType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRoutePolicy> {
    public override fun getValue() = ABI.makeIRoutePolicy(pointer.getPointer(0))

    public fun setValue(value: IRoutePolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRoutePolicy {
    public val __930956216_Ptr: Pointer?

    public val _930956216_VtblPtr: Pointer?
      get() = __930956216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionProfile(): ConnectionProfile? {
      val fnPtr = _930956216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectionProfile>()
      val hr = fn.invokeHR(arrayOf(__930956216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectionProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HostName(): HostName? {
      val fnPtr = _930956216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__930956216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HostNameType(): DomainNameType? {
      val fnPtr = _930956216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DomainNameType>()
      val hr = fn.invokeHR(arrayOf(__930956216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DomainNameType>(result.getValue())
      return resultValue
    }
  }

  public class IRoutePolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __930956216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRoutePolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11abc4ac0fc742e48742569923b1ca11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRoutePolicy(ptr: Pointer?): WithDefault = IRoutePolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRoutePolicy {
      val address = segment.toRawLongValue()
      return makeIRoutePolicy(Pointer(address))
    }

    public override fun toNative(obj: IRoutePolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__930956216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRoutePolicy): Array<IRoutePolicy?> = (elements as
        Array<IRoutePolicy?>).castToImpl<IRoutePolicy,IRoutePolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRoutePolicy?> =
        arrayOfNulls<IRoutePolicy_Impl>(size) as Array<IRoutePolicy?>
  }
}
