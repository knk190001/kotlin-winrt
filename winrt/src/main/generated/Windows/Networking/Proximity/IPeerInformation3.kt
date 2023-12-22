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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPeerInformation3.ABI::class)
@Signature("{b20f612a-dbd0-40f8-95bd-2d4209c7836f}")
@Guid("b20f612adbd040f895bd2d4209c7836f")
@WinRTInterface("b20f612adbd040f895bd2d4209c7836f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerInformation3.ByReference::class)
public interface IPeerInformation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DiscoveryData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeerInformation3> {
    public override fun getValue() = ABI.makeIPeerInformation3(pointer.getPointer(0))

    public fun setValue(value: IPeerInformation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerInformation3 {
    public val __710463806_Ptr: Pointer?

    public val _710463806_VtblPtr: Pointer?
      get() = __710463806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _710463806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__710463806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DiscoveryData(): IBuffer? {
      val fnPtr = _710463806_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__710463806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IPeerInformation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __710463806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerInformation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b20f612adbd040f895bd2d4209c7836f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerInformation3(ptr: Pointer?): WithDefault = IPeerInformation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerInformation3 {
      val address = segment.toRawLongValue()
      return makeIPeerInformation3(Pointer(address))
    }

    public override fun toNative(obj: IPeerInformation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__710463806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerInformation3): Array<IPeerInformation3?> = (elements
        as Array<IPeerInformation3?>).castToImpl<IPeerInformation3,IPeerInformation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerInformation3?> =
        arrayOfNulls<IPeerInformation3_Impl>(size) as Array<IPeerInformation3?>
  }
}
