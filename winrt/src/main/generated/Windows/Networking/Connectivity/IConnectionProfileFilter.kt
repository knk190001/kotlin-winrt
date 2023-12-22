package Windows.Networking.Connectivity

import Windows.Foundation.IReference
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

@ABIMarker(IConnectionProfileFilter.ABI::class)
@Signature("{204c7cc8-bd2d-4e8d-a4b3-455ec337388a}")
@Guid("204c7cc8bd2d4e8da4b3455ec337388a")
@WinRTInterface("204c7cc8bd2d4e8da4b3455ec337388a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfileFilter.ByReference::class)
public interface IConnectionProfileFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsConnected(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(2)
  public fun put_IsWwanConnectionProfile(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsWwanConnectionProfile(): Boolean

  @InterfaceMethod(4)
  public fun put_IsWlanConnectionProfile(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsWlanConnectionProfile(): Boolean

  @InterfaceMethod(6)
  public fun put_NetworkCostType(value: NetworkCostType?): Unit

  @InterfaceMethod(7)
  public fun get_NetworkCostType(): NetworkCostType?

  @InterfaceMethod(8)
  public fun put_ServiceProviderGuid(value: IReference<com.sun.jna.platform.win32.Guid.GUID?>?):
      Unit

  @InterfaceMethod(9)
  public fun get_ServiceProviderGuid(): IReference<com.sun.jna.platform.win32.Guid.GUID?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfileFilter> {
    public override fun getValue() = ABI.makeIConnectionProfileFilter(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfileFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfileFilter {
    public val __252239968_Ptr: Pointer?

    public val _252239968_VtblPtr: Pointer?
      get() = __252239968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsConnected(value: Boolean): Unit {
      val fnPtr = _252239968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _252239968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsWwanConnectionProfile(value: Boolean): Unit {
      val fnPtr = _252239968_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsWwanConnectionProfile(): Boolean {
      val fnPtr = _252239968_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsWlanConnectionProfile(value: Boolean): Unit {
      val fnPtr = _252239968_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsWlanConnectionProfile(): Boolean {
      val fnPtr = _252239968_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_NetworkCostType(value: NetworkCostType?): Unit {
      val fnPtr = _252239968_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_NetworkCostType(): NetworkCostType? {
      val fnPtr = _252239968_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkCostType>()
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkCostType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun put_ServiceProviderGuid(value: IReference<com.sun.jna.platform.win32.Guid.GUID?>?):
        Unit {
      val fnPtr = _252239968_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ServiceProviderGuid():
        IReference<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _252239968_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__252239968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfileFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __252239968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfileFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("204c7cc8bd2d4e8da4b3455ec337388a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfileFilter(ptr: Pointer?): WithDefault =
        IConnectionProfileFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfileFilter {
      val address = segment.toRawLongValue()
      return makeIConnectionProfileFilter(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfileFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__252239968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfileFilter):
        Array<IConnectionProfileFilter?> = (elements as
        Array<IConnectionProfileFilter?>).castToImpl<IConnectionProfileFilter,IConnectionProfileFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfileFilter?> =
        arrayOfNulls<IConnectionProfileFilter_Impl>(size) as Array<IConnectionProfileFilter?>
  }
}
