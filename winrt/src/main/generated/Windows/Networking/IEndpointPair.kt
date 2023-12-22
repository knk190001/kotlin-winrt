package Windows.Networking

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEndpointPair.ABI::class)
@Signature("{33a0aa36-f8fa-4b30-b856-76517c3bd06d}")
@Guid("33a0aa36f8fa4b30b85676517c3bd06d")
@WinRTInterface("33a0aa36f8fa4b30b85676517c3bd06d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEndpointPair.ByReference::class)
public interface IEndpointPair : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalHostName(): HostName?

  @InterfaceMethod(1)
  public fun put_LocalHostName(value: HostName?): Unit

  @InterfaceMethod(2)
  public fun get_LocalServiceName(): String?

  @InterfaceMethod(3)
  public fun put_LocalServiceName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_RemoteHostName(): HostName?

  @InterfaceMethod(5)
  public fun put_RemoteHostName(value: HostName?): Unit

  @InterfaceMethod(6)
  public fun get_RemoteServiceName(): String?

  @InterfaceMethod(7)
  public fun put_RemoteServiceName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEndpointPair>
      {
    public override fun getValue() = ABI.makeIEndpointPair(pointer.getPointer(0))

    public fun setValue(value: IEndpointPair_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEndpointPair {
    public val __333849639_Ptr: Pointer?

    public val _333849639_VtblPtr: Pointer?
      get() = __333849639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalHostName(): HostName? {
      val fnPtr = _333849639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LocalHostName(value: HostName?): Unit {
      val fnPtr = _333849639_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LocalServiceName(): String? {
      val fnPtr = _333849639_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LocalServiceName(value: String?): Unit {
      val fnPtr = _333849639_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RemoteHostName(): HostName? {
      val fnPtr = _333849639_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RemoteHostName(value: HostName?): Unit {
      val fnPtr = _333849639_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RemoteServiceName(): String? {
      val fnPtr = _333849639_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RemoteServiceName(value: String?): Unit {
      val fnPtr = _333849639_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__333849639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEndpointPair_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __333849639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEndpointPair, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33a0aa36f8fa4b30b85676517c3bd06d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEndpointPair(ptr: Pointer?): WithDefault = IEndpointPair_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEndpointPair {
      val address = segment.toRawLongValue()
      return makeIEndpointPair(Pointer(address))
    }

    public override fun toNative(obj: IEndpointPair): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__333849639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEndpointPair): Array<IEndpointPair?> = (elements as
        Array<IEndpointPair?>).castToImpl<IEndpointPair,IEndpointPair_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEndpointPair?> =
        arrayOfNulls<IEndpointPair_Impl>(size) as Array<IEndpointPair?>
  }
}
