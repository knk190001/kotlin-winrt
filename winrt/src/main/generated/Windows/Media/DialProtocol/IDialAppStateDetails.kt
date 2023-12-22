package Windows.Media.DialProtocol

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

@ABIMarker(IDialAppStateDetails.ABI::class)
@Signature("{ddc4a4a1-f5de-400d-bea4-8c8466bb2961}")
@Guid("ddc4a4a1f5de400dbea48c8466bb2961")
@WinRTInterface("ddc4a4a1f5de400dbea48c8466bb2961")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialAppStateDetails.ByReference::class)
public interface IDialAppStateDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): DialAppState?

  @InterfaceMethod(1)
  public fun get_FullXml(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialAppStateDetails> {
    public override fun getValue() = ABI.makeIDialAppStateDetails(pointer.getPointer(0))

    public fun setValue(value: IDialAppStateDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialAppStateDetails {
    public val __207424074_Ptr: Pointer?

    public val _207424074_VtblPtr: Pointer?
      get() = __207424074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): DialAppState? {
      val fnPtr = _207424074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DialAppState>()
      val hr = fn.invokeHR(arrayOf(__207424074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DialAppState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FullXml(): String? {
      val fnPtr = _207424074_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__207424074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDialAppStateDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __207424074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialAppStateDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddc4a4a1f5de400dbea48c8466bb2961")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialAppStateDetails(ptr: Pointer?): WithDefault = IDialAppStateDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialAppStateDetails {
      val address = segment.toRawLongValue()
      return makeIDialAppStateDetails(Pointer(address))
    }

    public override fun toNative(obj: IDialAppStateDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__207424074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialAppStateDetails): Array<IDialAppStateDetails?> =
        (elements as
        Array<IDialAppStateDetails?>).castToImpl<IDialAppStateDetails,IDialAppStateDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialAppStateDetails?> =
        arrayOfNulls<IDialAppStateDetails_Impl>(size) as Array<IDialAppStateDetails?>
  }
}
