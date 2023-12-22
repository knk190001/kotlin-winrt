package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IESim2.ABI::class)
@Signature("{bd4fd0a0-c68f-56eb-b99b-8f34b8100299}")
@Guid("bd4fd0a0c68f56ebb99b8f34b8100299")
@WinRTInterface("bd4fd0a0c68f56ebb99b8f34b8100299")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESim2.ByReference::class)
public interface IESim2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Discover(): ESimDiscoverResult?

  @InterfaceMethod(1)
  public fun Discover(serverAddress: String?, matchingId: String?): ESimDiscoverResult?

  @InterfaceMethod(2)
  public fun DiscoverAsync(): IAsyncOperation<ESimDiscoverResult?>?

  @InterfaceMethod(3)
  public fun DiscoverAsync(serverAddress: String?, matchingId: String?):
      IAsyncOperation<ESimDiscoverResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IESim2> {
    public override fun getValue() = ABI.makeIESim2(pointer.getPointer(0))

    public fun setValue(value: IESim2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESim2 {
    public val __653657625_Ptr: Pointer?

    public val _653657625_VtblPtr: Pointer?
      get() = __653657625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Discover(): ESimDiscoverResult? {
      val fnPtr = _653657625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimDiscoverResult>()
      val hr = fn.invokeHR(arrayOf(__653657625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimDiscoverResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Discover(serverAddress: String?, matchingId: String?): ESimDiscoverResult? {
      val fnPtr = _653657625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimDiscoverResult>()
      val hr = fn.invokeHR(arrayOf(__653657625_Ptr, marshalToNative(serverAddress),
          marshalToNative(matchingId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimDiscoverResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DiscoverAsync(): IAsyncOperation<ESimDiscoverResult?>? {
      val fnPtr = _653657625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimDiscoverResult?>>()
      val hr = fn.invokeHR(arrayOf(__653657625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimDiscoverResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DiscoverAsync(serverAddress: String?, matchingId: String?):
        IAsyncOperation<ESimDiscoverResult?>? {
      val fnPtr = _653657625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimDiscoverResult?>>()
      val hr = fn.invokeHR(arrayOf(__653657625_Ptr, marshalToNative(serverAddress),
          marshalToNative(matchingId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimDiscoverResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IESim2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653657625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESim2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd4fd0a0c68f56ebb99b8f34b8100299")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESim2(ptr: Pointer?): WithDefault = IESim2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESim2 {
      val address = segment.toRawLongValue()
      return makeIESim2(Pointer(address))
    }

    public override fun toNative(obj: IESim2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653657625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESim2): Array<IESim2?> = (elements as
        Array<IESim2?>).castToImpl<IESim2,IESim2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESim2?> = arrayOfNulls<IESim2_Impl>(size) as
        Array<IESim2?>
  }
}
