package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IESimDiscoverResult.ABI::class)
@Signature("{56b4bb5e-ab2f-5ac6-b359-dd5a8e237926}")
@Guid("56b4bb5eab2f5ac6b359dd5a8e237926")
@WinRTInterface("56b4bb5eab2f5ac6b359dd5a8e237926")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimDiscoverResult.ByReference::class)
public interface IESimDiscoverResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Events(): IVectorView<ESimDiscoverEvent?>?

  @InterfaceMethod(1)
  public fun get_Kind(): ESimDiscoverResultKind?

  @InterfaceMethod(2)
  public fun get_ProfileMetadata(): ESimProfileMetadata?

  @InterfaceMethod(3)
  public fun get_Result(): ESimOperationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimDiscoverResult> {
    public override fun getValue() = ABI.makeIESimDiscoverResult(pointer.getPointer(0))

    public fun setValue(value: IESimDiscoverResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimDiscoverResult {
    public val __2082809359_Ptr: Pointer?

    public val _2082809359_VtblPtr: Pointer?
      get() = __2082809359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Events(): IVectorView<ESimDiscoverEvent?>? {
      val fnPtr = _2082809359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ESimDiscoverEvent?>>()
      val hr = fn.invokeHR(arrayOf(__2082809359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ESimDiscoverEvent?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): ESimDiscoverResultKind? {
      val fnPtr = _2082809359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimDiscoverResultKind>()
      val hr = fn.invokeHR(arrayOf(__2082809359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimDiscoverResultKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProfileMetadata(): ESimProfileMetadata? {
      val fnPtr = _2082809359_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfileMetadata>()
      val hr = fn.invokeHR(arrayOf(__2082809359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfileMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Result(): ESimOperationResult? {
      val fnPtr = _2082809359_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimOperationResult>()
      val hr = fn.invokeHR(arrayOf(__2082809359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimOperationResult>(result.getValue())
      return resultValue
    }
  }

  public class IESimDiscoverResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2082809359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimDiscoverResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56b4bb5eab2f5ac6b359dd5a8e237926")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimDiscoverResult(ptr: Pointer?): WithDefault = IESimDiscoverResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimDiscoverResult {
      val address = segment.toRawLongValue()
      return makeIESimDiscoverResult(Pointer(address))
    }

    public override fun toNative(obj: IESimDiscoverResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2082809359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimDiscoverResult): Array<IESimDiscoverResult?> =
        (elements as
        Array<IESimDiscoverResult?>).castToImpl<IESimDiscoverResult,IESimDiscoverResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimDiscoverResult?> =
        arrayOfNulls<IESimDiscoverResult_Impl>(size) as Array<IESimDiscoverResult?>
  }
}
