package Windows.Networking.NetworkOperators

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

@ABIMarker(INetworkOperatorTetheringOperationResult.ABI::class)
@Signature("{ebd203a1-01ba-476d-b4b3-bf3d12c8f80c}")
@Guid("ebd203a101ba476db4b3bf3d12c8f80c")
@WinRTInterface("ebd203a101ba476db4b3bf3d12c8f80c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringOperationResult.ByReference::class)
public interface INetworkOperatorTetheringOperationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): TetheringOperationStatus?

  @InterfaceMethod(1)
  public fun get_AdditionalErrorMessage(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringOperationResult> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringOperationResult(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringOperationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringOperationResult {
    public val __1336649043_Ptr: Pointer?

    public val _1336649043_VtblPtr: Pointer?
      get() = __1336649043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): TetheringOperationStatus? {
      val fnPtr = _1336649043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TetheringOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1336649043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TetheringOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AdditionalErrorMessage(): String? {
      val fnPtr = _1336649043_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1336649043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringOperationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1336649043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringOperationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebd203a101ba476db4b3bf3d12c8f80c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringOperationResult(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringOperationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringOperationResult {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringOperationResult(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1336649043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringOperationResult):
        Array<INetworkOperatorTetheringOperationResult?> = (elements as
        Array<INetworkOperatorTetheringOperationResult?>).castToImpl<INetworkOperatorTetheringOperationResult,INetworkOperatorTetheringOperationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringOperationResult?> =
        arrayOfNulls<INetworkOperatorTetheringOperationResult_Impl>(size) as
        Array<INetworkOperatorTetheringOperationResult?>
  }
}
