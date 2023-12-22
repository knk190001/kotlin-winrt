package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IOperationCompletedEventArgs2.ABI::class)
@Signature("{858fa073-1e19-4105-b2f7-c8478808d562}")
@Guid("858fa0731e194105b2f7c8478808d562")
@WinRTInterface("858fa0731e194105b2f7c8478808d562")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOperationCompletedEventArgs2.ByReference::class)
public interface IOperationCompletedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AcceptedFormatId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOperationCompletedEventArgs2> {
    public override fun getValue() = ABI.makeIOperationCompletedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IOperationCompletedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOperationCompletedEventArgs2 {
    public val __1549201911_Ptr: Pointer?

    public val _1549201911_VtblPtr: Pointer?
      get() = __1549201911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AcceptedFormatId(): String? {
      val fnPtr = _1549201911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1549201911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOperationCompletedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1549201911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOperationCompletedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("858fa0731e194105b2f7c8478808d562")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOperationCompletedEventArgs2(ptr: Pointer?): WithDefault =
        IOperationCompletedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOperationCompletedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIOperationCompletedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IOperationCompletedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1549201911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOperationCompletedEventArgs2):
        Array<IOperationCompletedEventArgs2?> = (elements as
        Array<IOperationCompletedEventArgs2?>).castToImpl<IOperationCompletedEventArgs2,IOperationCompletedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOperationCompletedEventArgs2?> =
        arrayOfNulls<IOperationCompletedEventArgs2_Impl>(size) as
        Array<IOperationCompletedEventArgs2?>
  }
}
