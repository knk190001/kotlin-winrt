package Windows.Networking.Proximity

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IPeerFinderStatics2.ABI::class)
@Signature("{d6e73c65-fdd0-4b0b-9312-866408935d82}")
@Guid("d6e73c65fdd04b0b9312866408935d82")
@WinRTInterface("d6e73c65fdd04b0b9312866408935d82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerFinderStatics2.ByReference::class)
public interface IPeerFinderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Role(): PeerRole?

  @InterfaceMethod(1)
  public fun put_Role(value: PeerRole?): Unit

  @InterfaceMethod(2)
  public fun get_DiscoveryData(): IBuffer?

  @InterfaceMethod(3)
  public fun put_DiscoveryData(value: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun CreateWatcher(): PeerWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeerFinderStatics2> {
    public override fun getValue() = ABI.makeIPeerFinderStatics2(pointer.getPointer(0))

    public fun setValue(value: IPeerFinderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerFinderStatics2 {
    public val __1410378446_Ptr: Pointer?

    public val _1410378446_VtblPtr: Pointer?
      get() = __1410378446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Role(): PeerRole? {
      val fnPtr = _1410378446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeerRole>()
      val hr = fn.invokeHR(arrayOf(__1410378446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeerRole>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Role(value: PeerRole?): Unit {
      val fnPtr = _1410378446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410378446_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DiscoveryData(): IBuffer? {
      val fnPtr = _1410378446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1410378446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DiscoveryData(value: IBuffer?): Unit {
      val fnPtr = _1410378446_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410378446_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun CreateWatcher(): PeerWatcher? {
      val fnPtr = _1410378446_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeerWatcher>()
      val hr = fn.invokeHR(arrayOf(__1410378446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeerWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IPeerFinderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410378446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerFinderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6e73c65fdd04b0b9312866408935d82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerFinderStatics2(ptr: Pointer?): WithDefault = IPeerFinderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerFinderStatics2 {
      val address = segment.toRawLongValue()
      return makeIPeerFinderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPeerFinderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410378446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerFinderStatics2): Array<IPeerFinderStatics2?> =
        (elements as
        Array<IPeerFinderStatics2?>).castToImpl<IPeerFinderStatics2,IPeerFinderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerFinderStatics2?> =
        arrayOfNulls<IPeerFinderStatics2_Impl>(size) as Array<IPeerFinderStatics2?>
  }
}
