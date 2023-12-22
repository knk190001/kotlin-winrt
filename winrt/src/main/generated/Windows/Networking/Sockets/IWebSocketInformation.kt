package Windows.Networking.Sockets

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebSocketInformation.ABI::class)
@Signature("{5e01e316-c92a-47a5-b25f-07847639d181}")
@Guid("5e01e316c92a47a5b25f07847639d181")
@WinRTInterface("5e01e316c92a47a5b25f07847639d181")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketInformation.ByReference::class)
public interface IWebSocketInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalAddress(): HostName?

  @InterfaceMethod(1)
  public fun get_BandwidthStatistics(): BandwidthStatistics?

  @InterfaceMethod(2)
  public fun get_Protocol(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketInformation> {
    public override fun getValue() = ABI.makeIWebSocketInformation(pointer.getPointer(0))

    public fun setValue(value: IWebSocketInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketInformation {
    public val __1690991997_Ptr: Pointer?

    public val _1690991997_VtblPtr: Pointer?
      get() = __1690991997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalAddress(): HostName? {
      val fnPtr = _1690991997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1690991997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BandwidthStatistics(): BandwidthStatistics? {
      val fnPtr = _1690991997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BandwidthStatistics>()
      val hr = fn.invokeHR(arrayOf(__1690991997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BandwidthStatistics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Protocol(): String? {
      val fnPtr = _1690991997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1690991997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690991997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e01e316c92a47a5b25f07847639d181")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketInformation(ptr: Pointer?): WithDefault =
        IWebSocketInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocketInformation {
      val address = segment.toRawLongValue()
      return makeIWebSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690991997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketInformation): Array<IWebSocketInformation?> =
        (elements as
        Array<IWebSocketInformation?>).castToImpl<IWebSocketInformation,IWebSocketInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocketInformation?> =
        arrayOfNulls<IWebSocketInformation_Impl>(size) as Array<IWebSocketInformation?>
  }
}
