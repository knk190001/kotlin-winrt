package Windows.Devices.Sms

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmsReceivedEventDetails.ABI::class)
@Signature("{5bb50f15-e46d-4c82-847d-5a0304c1d53d}")
@Guid("5bb50f15e46d4c82847d5a0304c1d53d")
@WinRTInterface("5bb50f15e46d4c82847d5a0304c1d53d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsReceivedEventDetails.ByReference::class)
public interface ISmsReceivedEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_MessageIndex(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsReceivedEventDetails> {
    public override fun getValue() = ABI.makeISmsReceivedEventDetails(pointer.getPointer(0))

    public fun setValue(value: ISmsReceivedEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsReceivedEventDetails {
    public val __1704950346_Ptr: Pointer?

    public val _1704950346_VtblPtr: Pointer?
      get() = __1704950346_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1704950346_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1704950346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MessageIndex(): WinDef.UINT {
      val fnPtr = _1704950346_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1704950346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmsReceivedEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1704950346_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsReceivedEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bb50f15e46d4c82847d5a0304c1d53d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsReceivedEventDetails(ptr: Pointer?): WithDefault =
        ISmsReceivedEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsReceivedEventDetails {
      val address = segment.toRawLongValue()
      return makeISmsReceivedEventDetails(Pointer(address))
    }

    public override fun toNative(obj: ISmsReceivedEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1704950346_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsReceivedEventDetails):
        Array<ISmsReceivedEventDetails?> = (elements as
        Array<ISmsReceivedEventDetails?>).castToImpl<ISmsReceivedEventDetails,ISmsReceivedEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsReceivedEventDetails?> =
        arrayOfNulls<ISmsReceivedEventDetails_Impl>(size) as Array<ISmsReceivedEventDetails?>
  }
}
